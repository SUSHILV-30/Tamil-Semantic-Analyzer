grammar BoolExpr;

expr
    : expr OR term      # OrExpr
    | term              # ToTerm
    ;

term
    : term AND factor   # AndExpr
    | factor            # ToFactor
    ;

factor
    : NOT factor        # NotExpr
    | '(' expr ')'      # ParenExpr
    | TRUE              # TrueExpr
    | FALSE             # FalseExpr
    ;

NOT : 'NOT';
AND : 'AND';
OR : 'OR';
TRUE : 'true';
FALSE : 'false';
WS : [ \t\r\n]+ -> skip;