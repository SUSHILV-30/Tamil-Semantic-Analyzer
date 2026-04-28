grammar expression;
start : expr EOF { System.out.println($expr.val); };

expr returns [int val] : term exprP[$term.val]
{ $val = $exprP.val; };

exprP[int i] returns [int val]: { $val = $i; }
| '+' term e = exprP[$i + $term.val] { $val = $e.val; }
| '-' term e = exprP[$i - $term.val] { $val = $e.val; };

term returns [int val] : fact termP[$fact.val]
{ $val = $termP.val; };

termP[int i] returns [int val]: { $val = $i; }
| '*' fact e = termP[$i * $fact.val] { $val = $e.val; }
| '/' fact e = termP[$i / $fact.val] { $val = $e.val; }
;

fact returns [int val] : '(' expr ')' { $val = $expr.val; }
| NUM { $val = Integer.parseInt($NUM.text); };

ID : ('a'.. 'z'|'A'.. 'Z') ('a'.. 'z'|'A'.. 'Z'|'0'.. '9'|'_')* ;
NUM : '0'.. '9'+ ;
WS : [ \r\n\t] + -> skip ;