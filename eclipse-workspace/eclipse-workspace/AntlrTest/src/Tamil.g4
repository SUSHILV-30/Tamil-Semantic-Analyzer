// Tamil.g4
// Minimal, safe combined ANTLR4 grammar for Tamil tokenization + basic parsing.
// This version avoids any Java initializers or '=' assignments in @parser::members
// so it should parse cleanly with ANTLR.

grammar Tamil;

/* No @header package to keep this simple and avoid parsing surprises. */

@parser::members {
  // Minimal helper method stub for POS lookup.
  // Keep this trivial (no '=' assignments) so ANTLR doesn't choke.
  public String posLookup(String surface) {
    // Return null by default (no lexicon in this minimal example).
    return null;
  }
}

/* -------------------------
   Parser rules (higher-level)
   ------------------------- */

text
  : element* EOF
  ;

element
  : poeticLine
  | proseParagraph
  | blankLine
  ;

blankLine
  : NEWLINE
  ;

poeticLine
  : (TAMIL_WORD | TAMIL_SYLLABLE)+ NEWLINE
  ;

proseParagraph
  : sentence (SENT_END sentence)* (NEWLINE)+
  ;

sentence
  : nominalClause? verbPhrase (objectPhrase)? (SENT_END | NEWLINE)
  ;

nominalClause
  : nounPhrase
  ;

nounPhrase
  : (Determiner? Modifier* Noun (CaseSuffix)?)    #SimpleNounPhrase
  ;

verbPhrase
  : Verb (TenseSuffix)? (MoodSuffix)? (HonorificSuffix)?
  ;

objectPhrase
  : nounPhrase
  ;

/* POS rules: they accept any TAMIL_WORD when posLookup returns null
   (this keeps parsing permissive in the absence of a lexicon). */

Noun
  : TAMIL_WORD
  ;

Verb
  : TAMIL_WORD
  ;

Determiner
  : TAMIL_WORD
  ;

Modifier
  : TAMIL_WORD
  ;

CaseSuffix
  : TAMIL_SUFFIX
  ;

TenseSuffix
  : TAMIL_SUFFIX
  ;

MoodSuffix
  : TAMIL_SUFFIX
  ;

HonorificSuffix
  : TAMIL_SUFFIX
  ;

SENT_END
  : '.' | '!' | '?'
  ;

/* -------------------------
   Lexer rules (Tamil characters)
   ------------------------- */

/* Fragments: Tamil Unicode ranges (basic Tamil block U+0B80..U+0BFF) */
fragment TAMIL_INDVOWEL   : [\u0B85-\u0B94] ;
fragment TAMIL_CONSONANT  : [\u0B95-\u0BB9] ;
fragment TAMIL_VOWEL_SIGN : [\u0BBE-\u0BCC] ;
fragment TAMIL_PULLI      : '\u0BCD' ;        // virama (pulli)
fragment TAMIL_DIGIT      : [\u0BE6-\u0BEF] ;
fragment TAMIL_EXTENDED   : [\u0BF0-\u0BFF] ;

/* Tamil syllable token (common structure) */
TAMIL_SYLLABLE
  : TAMIL_INDVOWEL
  | TAMIL_CONSONANT ( TAMIL_VOWEL_SIGN | TAMIL_PULLI )?
  ;

/* Word token: one or more Tamil letters/marks */
TAMIL_WORD
  : ( TAMIL_INDVOWEL | TAMIL_CONSONANT | TAMIL_VOWEL_SIGN | TAMIL_PULLI )+
  ;

/* Generic suffix token (permissive). Replace with exact suffix tokens later. */
TAMIL_SUFFIX
  : ( TAMIL_VOWEL_SIGN | TAMIL_PULLI | TAMIL_EXTENDED ){1,6}
  ;

TAMIL_NUMBER
  : TAMIL_DIGIT+
  ;

PUNCT
  : [\u0BFA\u002C\u003A\u003B] ;

NEWLINE
  : ('\r'? '\n')
  ;

WS
  : [ \t\u00A0]+ -> skip
  ;

/* Catch-all to avoid lexing failure */
OTHER
  : .
  ;
