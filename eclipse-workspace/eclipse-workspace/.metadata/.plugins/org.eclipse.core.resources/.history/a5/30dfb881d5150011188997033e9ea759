grammar Expr;

expr
    : expr op=('+'|'-') term     # AddSubExpr
    | term                       # ToTerm
    ;

term
    : term '*' factor            # MulExpr
    | factor                     # ToFactor
    ;

factor
    : '-' factor                 # UnaryMinusExpr
    | '(' expr ')'               # ParenExpr
    | NUMBER                     # NumberExpr
    ;

NUMBER : [0-9]+ ('.' [0-9]+)? ;
WS     : [ \t\r\n]+ -> skip ;