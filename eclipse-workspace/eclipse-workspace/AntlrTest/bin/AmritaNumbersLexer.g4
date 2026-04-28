lexer grammar AmritaNumbersLexer;


// Fragments (unicode ranges)
fragment TAMIL_INDVOWEL   : [\u0B85-\u0B94] ;
fragment TAMIL_CONSONANT  : [\u0B95-\u0BB9] ;
fragment TAMIL_VOWEL_SIGN : [\u0BBE-\u0BCC] ;
fragment TAMIL_PULLI      : '\u0BCD' ;
fragment TAMIL_DIGIT      : [\u0BE6-\u0BEF] ;

// Tokens
TAMIL_INDEPENDENT_VOWEL  : TAMIL_INDVOWEL ;
TAMIL_CONSONANT_ONLY     : TAMIL_CONSONANT ;
TAMIL_VOWEL_MARK         : TAMIL_VOWEL_SIGN ;
TAMIL_PULLI_MARK         : TAMIL_PULLI ;

TAMIL_SYLLABLE
  : TAMIL_INDVOWEL
  | TAMIL_CONSONANT ( TAMIL_VOWEL_SIGN | TAMIL_PULLI )? ;

TAMIL_NUMBER : TAMIL_DIGIT+ ;

// A convenient word token: one or more Tamil letters/marks (useful for words)
TAMIL_WORD   : ( TAMIL_INDVOWEL | TAMIL_CONSONANT | TAMIL_VOWEL_SIGN | TAMIL_PULLI )+ ;

WS           : [ \t\r\n]+ -> skip ;

// fallback for punctuation / other Tamil block symbols
TAMIL_PUNCT  : [\u0BF0-\u0BFF] ;

// any other character (ASCII digits, latin letters etc)
OTHER        : . ;
