grammar Expr;

s : e EOF ;

e : e op=('*'|'/') e   # MulDiv
  | e op=('+'|'-') e   # AddSub
  | INT                # Int
  ;

INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
