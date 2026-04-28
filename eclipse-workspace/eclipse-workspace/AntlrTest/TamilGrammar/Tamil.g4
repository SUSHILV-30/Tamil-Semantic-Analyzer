grammar Tamil;

// -------------------- Parser Rules --------------------

file
    : (sent | sentence)+ EOF
    ;

sent
    : 'நல்ல' 'படிப்பு' 'வேண்டும்' (PUNCT | QUESTION_MARK)?
    | 'நல்ல' 'நடத்தை' 'அவசியம்' (PUNCT | QUESTION_MARK)?
    | 'திருவள்ளுவர்' 'இருக்கிறார்' (PUNCT | QUESTION_MARK)?
    | 'நல்ல' 'நட்பு' 'தேவை' (PUNCT | QUESTION_MARK)?
    | 'புகைப்பது' 'புற்றுநோயை' 'ஏற்படுத்தும்' (PUNCT | QUESTION_MARK)?
    ;

sentence
    : clause (LINK_WORD clause)* (PUNCT | QUESTION_MARK)?
    ;

// Enforce: subject? object? verbPhrase (verbPhrase MUST be last)
clause
    : subject? object? verbPhrase
    ;

subject
    : PRONOUN
    | PROPER_NOUN
    | nounPhrase
    | day
    | month
    ;

object
    : nounPhrase
    | day
    | month
    ;

verbPhrase
    : adverb* (VERB_FINITE | TAMIL_WORD TENSE_SUFFIX?) NEG_SUFFIX?
    ;

nounPhrase
    : adjective* (TAMIL_WORD | TAMIL_DAY | TAMIL_MONTH | PROPER_NOUN)+ POSTPOSITION?
    ;

day
    : TAMIL_DAY
    ;

month
    : TAMIL_MONTH
    ;

adjective
    : ADJ
    ;

adverb
    : ADV
    ;

// -------------------- Lexer Rules --------------------

// Pronouns
PRONOUN
    : 'நான்'
    | 'நீ'
    | 'நீங்கள்'
    | 'அவன்'
    | 'அவள்'
    | 'அவர்கள்'
    ;

// Proper nouns
PROPER_NOUN
    : 'திருவள்ளுவர்'
    ;

// Link words
LINK_WORD
    : 'ஆனால்'
    | 'ஆகவே'
    | 'எனினும்'
    | 'அதனால்'
    | 'பின்னர்'
    ;

// Postpositions
POSTPOSITION
    : 'உள்ளே'
    | 'மீது'
    | 'முன்'
    | 'க்கு'
    | 'இல்'
    ;

// Adjectives
ADJ
    : 'அழகான'
    | 'புதிய'
    | 'பழைய'
    | 'நல்ல'
    ;

// Adverbs
ADV
    : 'வேகமாக'
    | 'மெல்ல'
    ;

// Days
TAMIL_DAY
    : 'ஞாயிறு'
    | 'திங்கள்'
    | 'செவ்வாய்'
    | 'புதன்'
    | 'வியாழன்'
    | 'வெள்ளி'
    | 'சனி'
    ;

// Months
TAMIL_MONTH
    : 'சித்திரை'
    | 'வைகாசி'
    | 'ஆனி'
    | 'ஆடி'
    | 'ஆவணி'
    | 'புரட்டாசி'
    | 'ஐப்பசி'
    | 'கார்த்திகை'
    | 'மார்கழி'
    | 'தை'
    | 'மாசி'
    | 'பங்குனி'
    ;

// Generic Tamil word
TAMIL_WORD
    : [\u0B80-\u0BFF]+
    ;

// Verb suffixes
TENSE_SUFFIX
    : 'வந்தான்'
    | 'வந்தாள்'
    | 'வந்தார்கள்'
    | 'படித்தான்'
    | 'படிக்கிறார்'
    ;

// Negation
NEG_SUFFIX
    : 'இல்ல'
    | 'வில்லை'
    | 'செய்யாதே'
    ;

// Finite verbs
VERB_FINITE
    : 'இருக்கிறார்'
    | 'வருகிறார்'
    | 'படிக்கிறார்'
    ;

// Punctuation
PUNCT
    : [!.,;:\-–—…]+
    ;

QUESTION_MARK
    : '?'
    ;

// Whitespace
WS
    : [ \t\r\n]+ -> skip
    ;

// Catch invalid characters
INVALID_CHAR
    : .
    ;
