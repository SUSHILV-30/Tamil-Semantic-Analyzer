grammar Tamil;

/* =========================
   PARSER RULES
   ========================= */

file
    : sentence+ EOF
    ;

sentence
    : QUESTION_WORD? clause (LINK_WORD clause)* (PUNCT | QUESTION_MARK)?
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
    | TAMIL_NUMBER
    | NUMBER
    ;

verbPhrase
    : adverb* (TAMIL_WORD | TENSE_SUFFIX) NEG_SUFFIX?
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
    : 'நான்'
    | 'நீ'
    | 'நாங்கள்'
    | 'அவன்'
    | 'அவள்'
    | 'அவர்கள்'
    ;

QUESTION_WORD
    : 'எது'
    | 'என்'
    | 'எங்கு'
    | 'எப்படி'
    | 'ஏன்'
    | 'எப்போது'
    ;

LINK_WORD
    : 'ஆனால்'
    | 'ஆகவே'
    | 'எனவே'
    | 'அதனால்'
    | 'பின்னர்'
    ;

POSTPOSITION
    : 'உள்ள'
    | 'மேல்'
    | 'இல்'
    | 'க்கு'
    | 'இன்'
    ;

ADJ
    : 'அழகான'
    | 'புதிய'
    | 'பழைய'
    ;

ADV
    : 'வேகமாக'
    | 'மெல்ல'
    ;

NEG_SUFFIX
    : 'இல்லை'
    | 'வில்லைய'
    | 'செய்யாதே'
    ;

TENSE_SUFFIX
    : 'வந்தான்'
    | 'வந்தாள்'
    | 'வந்தார்கள்'
    | 'படித்தான்'
    | 'படிக்கிறார்கள்'
    ;

/* Tamil word handling */

TAMIL_WORD
    : (TAMIL_CLUSTER)+
    ;

fragment TAMIL_CLUSTER
    : TAMIL_BASE TAMIL_MARK*
    ;

fragment TAMIL_BASE
    : [\u0B85-\u0BB9]
    ;

fragment TAMIL_MARK
    : [\u0BBE-\u0BCD\u0BD7]
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

/* Strict Tamil-only mode */

ERROR_CHAR
    : ~[\u0B80-\u0BFF0-9?.,;: \t\r\n]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;