grammar Expr;

start
    : e=expr EOF
      {
        if ($e.val == -1) {
            System.out.println("Type Mismatch");
        } else {
            System.out.println("Answer is " + $e.val);
        }
      }
    ;

// Expression
expr returns [int val, String type]
    : t=term
      {
        $val = $t.val;
        $type = $t.type;
      }
      ( '+' t2=term
        {
            if ($val == -1 || $t2.val == -1) {
                $val = -1;
            }
            else if ($type.equals($t2.type)) {
                $val = $val + $t2.val;
                $type = $t2.type;
            }
            else {
                $val = -1;   // type mismatch
            }
        }
      )*
    ;

// Term
term returns [int val, String type]
    : INT
      {
        $val = Integer.parseInt($INT.text);
        $type = "int";
      }
    | FLOAT
      {
        $val = (int)Float.parseFloat($FLOAT.text);
        $type = "float";
      }
    ;

INT   : [0-9]+ ;
FLOAT : [0-9]+ '.' [0-9]+ ;
WS    : [ \r\n\t]+ -> skip ;

/* 

start returns [int depth]:
	para EOF
	{$depth=$para.depth;
	System.out.println("Number of zeros : " + $depth);
	}
	;
para returns [int depth]:
	'(' p1=para ')' p2=para
	{$depth=Math.max(1+$p1.depth,$p2.depth);}
	|{$depth=0;}
	;


WS  : [ \r\n\t]+ -> skip ;
/* 
start returns [int count]
    : b=bits EOF
      {
        $count = $b.count;
        System.out.println("Number of zeros : " + $count);
      }
    ;

bits returns [int count]
    : bi=bit bp=bitsP[$bi.count]
      { $count = $bp.count; }
    ;

bitsP[int inh] returns [int count]
    : bi=bit bp=bitsP[$inh + $bi.count]
        { $count = $bp.count; }
    |   { $count = $inh; }
    ;

bit returns [int count]
    : NUM
      {
        if ($NUM.text.equals("0")) {
            $count = 1;
        } else {
            $count = 0;
        }
      }
    ;

NUM : [0-1] ;
WS  : [ \r\n\t]+ -> skip ;

/* 
start returns [int val]
    : b=bit EOF
      {
        $val = $b.val;
        System.out.println("The number is : " + $val);
      }
    ;


bit returns [int val]
    : b=bits bp=bitP[$b.val]
      { $val = $bp.val; }
    ;

bitP[int inh] returns [int val]
    : b=bits bp=bitP[$inh * 2 + $b.val]
        { $val = $bp.val; }
    |   { $val = $inh; }
    ;

bits returns [int val]
    : NUM
      { $val = Integer.parseInt($NUM.text); }
    ;



/*start
    : expr EOF { System.out.println("Evaluated value = " + $expr.val); }
    ;

expr returns [int val]
    : t=term ep=exprP[$t.val]
      { $val = $ep.val; }
    ;

exprP[int inh] returns [int val]
    : '+' t=term ep=exprP[$inh + $t.val]
        { $val = $ep.val; }
    | '-' t=term ep=exprP[$inh - $t.val]
        { $val = $ep.val; }
    |   { $val = $inh; }
    ;

term returns [int val]
    : f=fact tp=termP[$f.val]
      { $val = $tp.val; }
    ;

termP[int inh] returns [int val]
    : '*' f=fact tp=termP[$inh * $f.val]
        { $val = $tp.val; }
    | '/' f=fact tp=termP[$inh / $f.val]
        { $val = $tp.val; }
    |   { $val = $inh; }
    ;

fact returns [int val]
    : '(' e=expr ')'
        { $val = $e.val; }
    | NUM
        { $val = Integer.parseInt($NUM.text); }
    ;
*/

/* ---------------- START RULE ---------------- */

//start
//    : e=expr EOF
//      {
//        System.out.println("Result = " + $e.val);
//      }
//    ;
//
///* ---------------- EXPR (OR level) ---------------- */
//
//expr returns [boolean val]
//    : e1=expr OR t=term
//      {
//        $val = $e1.val || $t.val;
//      }
//    | t=term
//      {
//        $val = $t.val;
//      }
//    ;
//
///* ---------------- TERM (AND level) ---------------- */
//
//term returns [boolean val]
//    : t1=term AND f=factor
//      {
//        $val = $t1.val && $f.val;
//      }
//    | f=factor
//      {
//        $val = $f.val;
//      }
//    ;
//
///* ---------------- FACTOR (Highest precedence) ---------------- */
//
//factor returns [boolean val]
//    : NOT f=factor
//      {
//        $val = !$f.val;
//      }
//    | '(' e=expr ')'
//      {
//        $val = $e.val;
//      }
//    | TRUE
//      {
//        $val = true;
//      }
//    | FALSE
//      {
//        $val = false;
//      }
//    ;
//
///* ---------------- LEXER RULES ---------------- */
//
//TRUE  : 'true';
//FALSE : 'false';
//AND   : 'AND';
//OR    : 'OR';
//NOT   : 'NOT';
//
//WS : [ \r\n\t]+ -> skip;

//start
//	: e=expr EOF
//	{
//		System.out.println("Result = " + $e.val);
//	}
//	;
//
//expr returns [int val]
//	: e1=expr '+' e2=term
//	{
//		$val = $e1.val + $e2.val;
//	}
//	| e1=expr '-' e2=term
//	{
//		$val = $e1.val - $e2.val;
//	}
//	| t1=term
//	{
//		$val = $t1.val;
//	}
//	;
//
//term returns [int val]
//	: t1=term '*' f1=factor
//	{
//		$val = $t1.val * $f1.val;
//	}
//	| f1=factor
//	{
//		$val = $f1.val;
//	}
//	;
//
//factor returns [int val]
//	: '(' e1=expr ')'
//	{
//		$val = $e1.val;
//	}
//	| '-' f1=factor
//	{
//		$val = - $f1.val;
//	}
//	| n=NUMBER
//	{
//		$val = Integer.parseInt($n.text);
//	}
//	;
//	
//NUMBER : [0-9]+;
//WS : [ \n\t\r] -> skip;

