grammar Tamil;

@header {
import java.util.*;
}

@members {

    void semanticError(String sentence, String reason) {
        System.out.println("\nSemantic Error in sentence: " + sentence);
        System.out.println("Reason: " + reason);
    }

    // ── Pronoun helpers ──────────────────────────────────────────────
    boolean isFirstPerson(String s)       { return "நான்".equals(s); }
    boolean isFirstPersonPlural(String s)  { return "நாங்கள்".equals(s); }
    boolean isPluralPronoun(String s)      { return "அவர்கள்".equals(s); }
    boolean isMalePronoun(String s)        { return "அவன்".equals(s); }
    boolean isFemalePronoun(String s)      { return "அவள்".equals(s); }

    // Returns true for ALL recognised pronouns
    boolean isPronoun(String s) {
        return isFirstPerson(s) || isFirstPersonPlural(s) ||
               isPluralPronoun(s) || isMalePronoun(s) || isFemalePronoun(s);
    }

    // ── Noun gender helpers ──────────────────────────────────────────
    // Only plain nouns (not pronouns) carry gender by ending
    boolean isMaleNoun(String s)   { return !isPronoun(s) && s.endsWith("\u0BA9\u0BCD"); }   // ends ன்
    boolean isFemaleNoun(String s) { return !isPronoun(s) && s.endsWith("\u0BB3\u0BCD"); }   // ends ள்

    // ── Verb-ending helpers ──────────────────────────────────────────
    boolean isPluralVerb(String v)           { return v.endsWith("\u0BBE\u0BB0\u0BCD\u0B95\u0BB3\u0BCD") || v.endsWith("\u0BBF\u0BA9\u0BB0\u0BCD"); } // ார்கள் or ினர்
    boolean isFirstPersonVerb(String v)      { return v.endsWith("\u0BC7\u0BA9\u0BCD"); }     // ேன்
    boolean isFirstPersonPluralVerb(String v){ return v.endsWith("\u0BCB\u0BAE\u0BCD"); }     // ோம்
    boolean isMaleVerb(String v)             { return v.endsWith("\u0BBE\u0BA9\u0BCD"); }     // ான்
    boolean isFemaleVerb(String v)           { return v.endsWith("\u0BBE\u0BB3\u0BCD"); }     // ாள்

    // ── Main agreement checker ────────────────────────────────────────
    void checkAgreement(String subj, String verb, String sentence) {

        if (verb == null) {
            semanticError(sentence, "Sentence must contain a verb.");
            return;
        }

        if (subj == null) return;

        // ── Pronoun agreement ────────────────────────────────────────
        if (isFirstPerson(subj)) {
            if (!isFirstPersonVerb(verb))
                semanticError(sentence, "'\u0BA8\u0BBE\u0BA9\u0BCD' must use verb ending '\u0BC7\u0BA9\u0BCD'.");
            return;
        }

        if (isFirstPersonPlural(subj)) {
            if (!isFirstPersonPluralVerb(verb))
                semanticError(sentence, "'\u0BA8\u0BBE\u0B99\u0BCD\u0B95\u0BB3\u0BCD' must use verb ending '\u0BCB\u0BAE\u0BCD'.");
            return;
        }

        if (isPluralPronoun(subj)) {
            if (!isPluralVerb(verb))
                semanticError(sentence, "Plural subject must use plural verb.");
            return;
        }

        if (isMalePronoun(subj)) {
            if (!isMaleVerb(verb))
                semanticError(sentence, "'\u0B85\u0BB5\u0BA9\u0BCD' must use verb ending '\u0BBE\u0BA9\u0BCD'.");
            return;
        }

        if (isFemalePronoun(subj)) {
            if (!isFemaleVerb(verb))
                semanticError(sentence, "'\u0B85\u0BB5\u0BB3\u0BCD' must use verb ending '\u0BBE\u0BB3\u0BCD'.");
            return;
        }

        // ── Noun gender agreement ────────────────────────────────────
        if (isMaleNoun(subj)) {
            if (!isMaleVerb(verb))
                semanticError(sentence, "Masculine noun must use verb ending '\u0BBE\u0BA9\u0BCD'.");
            return;
        }

        if (isFemaleNoun(subj)) {
            if (!isFemaleVerb(verb))
                semanticError(sentence, "Feminine noun must use verb ending '\u0BBE\u0BB3\u0BCD'.");
            return;
        }
    }
}

/* =========================
   PARSER RULES
   ========================= */

file
    : sentence EOF
    ;

sentence
    : QUESTION_WORD? clause (LINK_WORD clause)* (PUNCT | QUESTION_MARK)?
    ;

/*
 * Two clause forms:
 *   1. clause WITH an explicit subject  (subject comes first, then objects/adverbs/verb)
 *   2. clause WITHOUT a subject         (only objects/adverbs/verb)
 *
 * subject can be:
 *   - a bare PRONOUN
 *   - ADJ* TAMIL_WORD   (covers "அழகான சிறுவன்", "நல்ல மாணவன்", "ராஜா", …)
 *
 * We put the subject-bearing alternative FIRST so ANTLR prefers it when a
 * TAMIL_WORD (or PRONOUN) appears before an object or verb.
 */

clause
    : subject object* adverb* verbPhrase
      {
          checkAgreement($subject.textVal, $verbPhrase.verbVal, $ctx.getParent().getText());
      }
    | object* adverb* verbPhrase
      {
          checkAgreement(null, $verbPhrase.verbVal, $ctx.getParent().getText());
      }
    ;

/* subject captures the head noun/pronoun (adjectives are consumed here too) */
subject returns [String textVal]
    : ADJ* PRONOUN    { $textVal = $PRONOUN.getText(); }
    | ADJ* TAMIL_WORD { $textVal = $TAMIL_WORD.getText(); }
    ;

object
    : nounPhrase
    | TAMIL_NUMBER
    | NUMBER
    ;

verbPhrase returns [String verbVal]
    : ts=TENSE_SUFFIX { $verbVal = $ts.getText(); }
    ;

nounPhrase
    : ADJ* TAMIL_WORD POSTPOSITION?
    ;

adverb
    : ADV
    ;

/* =========================
   LEXER RULES
   ========================= */

PRONOUN
    : 'நான்'
    | 'நாங்கள்'
    | 'அவன்'
    | 'அவள்'
    | 'அவர்கள்'
    ;

QUESTION_WORD
    : 'எது'
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
    | 'நல்ல'
    ;

ADV
    : 'வேகமாக'
    | 'மெல்ல'
    | 'மெதுவாக'
    ;

TENSE_SUFFIX
    : 'வந்தான்'
    | 'வந்தாள்'
    | 'வந்தார்கள்'
    | 'வந்தேன்'
    | 'படித்தான்'
    | 'படித்தார்'
    | 'படித்தார்கள்'
    | 'ஓடினார்'
    | 'உள்ளது'
    | 'சாப்பிட்டேன்'
    | 'வாங்கினார்'
    | 'சென்றார்'
    | 'சென்றார்கள்'
    | 'சென்றோம்'
    | 'நடந்தார்'
    | 'வந்தில்லை'
    | 'வேண்டும்'
    | 'தொடங்கும்'
    | 'கட்டினர்'
    | 'பாடினார்'
    | 'மலர்ந்தது'
    | 'வந்தார்'
    | 'இருந்தார்கள்'
    | 'ஏறினார்'
    | 'விழுந்தார்'
    | 'மகிழ்ந்தார்'
    | 'கட்டினார்கள்'
    ;

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

WS
    : [ \t\r\n]+ -> skip
    ;

ERROR_CHAR
    : .
    ;
