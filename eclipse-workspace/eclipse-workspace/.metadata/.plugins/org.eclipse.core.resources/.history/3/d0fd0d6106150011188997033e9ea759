grammar LabeledExpr;

/* ---------------- Parser rules ---------------- */

prog
    : stat+ 
    ;

stat
    : expr NEWLINE              # PrintExpr
    | ID '=' expr NEWLINE       # Assign
    | NEWLINE                   # Blank
    ;

expr
    : expr op=('*'|'/') expr    # MulDiv
    | expr op=('+'|'-') expr    # AddSub
    | INT                       # Int
    | ID                        # Id
    | '(' expr ')'              # Parens
    ;

/* ---------------- Lexer rules ---------------- */

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

ID  : [a-zA-Z]+ ;
INT : [0-9]+ ;

NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;
