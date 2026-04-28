grammar SimpleLexer;

/* ---------------- Parser Rules ---------------- */

prog
    : stat+ EOF
    ;

stat
    : assign ';'
    | print ';'
    | ifelse
    ;

assign
    : ID ASSIGN expr
    ;

print
    : PRINT '(' expr ')'
    ;

ifelse
    : IF '(' condition ')' ':' block
      (ELIF '(' condition ')' ':' block)*
      (ELSE ':' block)?
    ;

block
    : '{' stat+ '}'
    ;

condition
    : expr relop expr
    ;

relop
    : GT | LT | GE | LE | EQ | NE
    ;

/* Expression with precedence */

expr
    : expr ('*' | DIV) expr
    | expr ('+' | '-') expr
    | '(' expr ')'
    | NUMBER
    | ID
    ;

/* ---------------- Lexer Rules ---------------- */

IF     : 'if';
ELIF   : 'elif';
ELSE   : 'else';
PRINT  : 'print';

ASSIGN : '=';

GT : '>';
LT : '<';
GE : '>=';
LE : '<=';
EQ : '==';
NE : '!=';

DIV : '//';

NUMBER : [0-9]+;
ID     : [a-zA-Z_][a-zA-Z_]*;
WS     : [ \n\t\r]+ -> skip;
