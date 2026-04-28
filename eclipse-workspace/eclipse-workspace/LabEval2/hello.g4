grammar Expr;

start returns [int value]
    : e=expr EOF 
      {
        System.out.println("Result = " + $e.value);
      }
    ;

expr returns [int value]
    : e1=expr '+' t=term
      { $value = $e1.value + $t.value; }
    | e1=expr '-' t=term
      { $value = $e1.value - $t.value; }
    | t=term
      { $value = $t.value; }
    ;

term returns [int value]
    : t1=term '*' f=factor
      { $value = $t1.value * $f.value; }
    | t1=term '/' f=factor
      { $value = $t1.value / $f.value; }
    | f=factor
      { $value = $f.value; }
    ;

factor returns [int value]
    : '(' e=expr ')'
      { $value = $e.value; }
    | NUM
      { $value = Integer.parseInt($NUM.text); }
    ;

NUM : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
