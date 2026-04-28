grammar hello;

/* =========================
   PARSER RULES
   ========================= */

file
    : sentence* EOF
    ;

sentence
    : clause (LINK_WORD clause)* (PUNCT | QUESTION_MARK)?
    ;

clause
    : subject? object? verbPhrase
    ;

subject
    : PRONOUN
    | nounPhrase
    ;

object
    : nounPhrase
    ;

verbPhrase
    : adverb* TAMIL_WORD TENSE_SUFFIX? NEG_SUFFIX?
    ;

nounPhrase
    : adjective* TAMIL_WORD POSTPOSITION?
    ;

adjective
    : ADJ
    ;

adverb
    : ADV
    ;


/* =========================
   LEXER RULES
   ========================= */

PRONOUN
    : 'நாZ'
    | 'ந['
    | 'ந[க]'
    | 'அவZ'
    | 'அவ]'
    | 'அவ[க]'
    ;

QUESTION_WORD
    : 'எ_த'
    | 'எ`'
    | 'எ[க]'
    | 'எaபb'
    | 'ஏZ'
    | 'எaேபா`'
    ;

LINK_WORD
    : 'ஆனாc'
    | 'ஆகேவ'
    | 'எனdef'
    | 'அதனாc'
    | 'பgZன[க]'
    ;

POSTPOSITION
    : 'உ[ேள]'
    | 'மh`'
    | 'iZ'
    | 'jk'
    | 'இc'
    ;

ADJ
    : 'அழகான'
    | 'lதிய'
    | 'பைழய'
    ;

ADV
    : 'ேவகமாக'
    | 'ெமcல'
    ;

NEG_SUFFIX
    : 'இcல'
    | 'வgcைல'
    | 'ெசmயாேத'
    ;

TENSE_SUFFIX
    : 'வ_தாZ'
    | 'வ_தா]'
    | 'வ_தா[க]'
    | 'பbnதாZ'
    | 'பbjகிறா[க]'
    ;

TAMIL_WORD
    : [\u0B80-\u0BFF]+
    ;

TAMIL_NUMBER
    : [\u0BE6-\u0BEF]+
    ;

NUMBER
    : [0-9]+
    ;

QUESTION_MARK
    : '?'
    ;

PUNCT
    : [!.,;:]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;