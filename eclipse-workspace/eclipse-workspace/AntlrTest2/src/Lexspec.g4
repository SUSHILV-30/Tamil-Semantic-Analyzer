grammar Lexspec;
goal: expr { System.out.println("g->e");};
expr: expr PLUS term { System.out.println("e->e+t");}
      | expr MINUS term { System.out.println("e->e-t");}
      | term { System.out.println("e->t");};
term: term TIMES factor
      | term DIV factor
      | factor;
factor: ID
       | NUM
       | STRING
       | LPAREN expr RPAREN;      

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
LPAREN: '(';
RPAREN: ')';
STRING: '"'~[\\]*'"';
ID: [a-z][a-zA-Z0-9]*;
NUM: [0-9][1-9]*;
WS: [ \n\t\r]+->skip;
