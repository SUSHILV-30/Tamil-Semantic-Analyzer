// Generated from Tamil.g4 by ANTLR 4.13.2

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TamilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOUN=1, QUESTION_WORD=2, LINK_WORD=3, POSTPOSITION=4, ADJ=5, ADV=6, 
		TENSE_SUFFIX=7, TAMIL_WORD=8, TAMIL_NUMBER=9, NUMBER=10, QUESTION_MARK=11, 
		PUNCT=12, WS=13, ERROR_CHAR=14;
	public static final int
		RULE_file = 0, RULE_sentence = 1, RULE_clause = 2, RULE_subject = 3, RULE_object = 4, 
		RULE_verbPhrase = 5, RULE_nounPhrase = 6, RULE_adverb = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "sentence", "clause", "subject", "object", "verbPhrase", "nounPhrase", 
			"adverb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRONOUN", "QUESTION_WORD", "LINK_WORD", "POSTPOSITION", "ADJ", 
			"ADV", "TENSE_SUFFIX", "TAMIL_WORD", "TAMIL_NUMBER", "NUMBER", "QUESTION_MARK", 
			"PUNCT", "WS", "ERROR_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tamil.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public TamilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TamilParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			sentence();
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public TerminalNode QUESTION_WORD() { return getToken(TamilParser.QUESTION_WORD, 0); }
		public List<TerminalNode> LINK_WORD() { return getTokens(TamilParser.LINK_WORD); }
		public TerminalNode LINK_WORD(int i) {
			return getToken(TamilParser.LINK_WORD, i);
		}
		public TerminalNode PUNCT() { return getToken(TamilParser.PUNCT, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TamilParser.QUESTION_MARK, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_WORD) {
				{
				setState(19);
				match(QUESTION_WORD);
				}
			}

			setState(22);
			clause();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINK_WORD) {
				{
				{
				setState(23);
				match(LINK_WORD);
				setState(24);
				clause();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK || _la==PUNCT) {
				{
				setState(30);
				_la = _input.LA(1);
				if ( !(_la==QUESTION_MARK || _la==PUNCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClauseContext extends ParserRuleContext {
		public SubjectContext subject;
		public VerbPhraseContext verbPhrase;
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clause);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((ClauseContext)_localctx).subject = subject();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1824L) != 0)) {
					{
					{
					setState(34);
					object();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADV) {
					{
					{
					setState(40);
					adverb();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				((ClauseContext)_localctx).verbPhrase = verbPhrase();

				          checkAgreement(((ClauseContext)_localctx).subject.textVal, ((ClauseContext)_localctx).verbPhrase.verbVal, _localctx.getParent().getText());
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1824L) != 0)) {
					{
					{
					setState(49);
					object();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADV) {
					{
					{
					setState(55);
					adverb();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				((ClauseContext)_localctx).verbPhrase = verbPhrase();

				          checkAgreement(null, ((ClauseContext)_localctx).verbPhrase.verbVal, _localctx.getParent().getText());
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubjectContext extends ParserRuleContext {
		public String textVal;
		public Token PRONOUN;
		public Token TAMIL_WORD;
		public TerminalNode PRONOUN() { return getToken(TamilParser.PRONOUN, 0); }
		public List<TerminalNode> ADJ() { return getTokens(TamilParser.ADJ); }
		public TerminalNode ADJ(int i) {
			return getToken(TamilParser.ADJ, i);
		}
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subject);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADJ) {
					{
					{
					setState(66);
					match(ADJ);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				((SubjectContext)_localctx).PRONOUN = match(PRONOUN);
				 ((SubjectContext)_localctx).textVal =  ((SubjectContext)_localctx).PRONOUN.getText(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADJ) {
					{
					{
					setState(74);
					match(ADJ);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				((SubjectContext)_localctx).TAMIL_WORD = match(TAMIL_WORD);
				 ((SubjectContext)_localctx).textVal =  ((SubjectContext)_localctx).TAMIL_WORD.getText(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public TerminalNode TAMIL_NUMBER() { return getToken(TamilParser.TAMIL_NUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(TamilParser.NUMBER, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJ:
			case TAMIL_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				nounPhrase();
				}
				break;
			case TAMIL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(TAMIL_NUMBER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbPhraseContext extends ParserRuleContext {
		public String verbVal;
		public Token ts;
		public TerminalNode TENSE_SUFFIX() { return getToken(TamilParser.TENSE_SUFFIX, 0); }
		public VerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrase; }
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verbPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((VerbPhraseContext)_localctx).ts = match(TENSE_SUFFIX);
			 ((VerbPhraseContext)_localctx).verbVal =  ((VerbPhraseContext)_localctx).ts.getText(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NounPhraseContext extends ParserRuleContext {
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
		public List<TerminalNode> ADJ() { return getTokens(TamilParser.ADJ); }
		public TerminalNode ADJ(int i) {
			return getToken(TamilParser.ADJ, i);
		}
		public TerminalNode POSTPOSITION() { return getToken(TamilParser.POSTPOSITION, 0); }
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nounPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADJ) {
				{
				{
				setState(92);
				match(ADJ);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(TAMIL_WORD);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPOSITION) {
				{
				setState(99);
				match(POSTPOSITION);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdverbContext extends ParserRuleContext {
		public TerminalNode ADV() { return getToken(TamilParser.ADV, 0); }
		public AdverbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverb; }
	}

	public final AdverbContext adverb() throws RecognitionException {
		AdverbContext _localctx = new AdverbContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_adverb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ADV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000ei\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001"+
		"\u001d\t\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0005\u0002"+
		"*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0002"+
		"\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0005\u0003D\b\u0003\n\u0003"+
		"\f\u0003G\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003L\b\u0003"+
		"\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003S\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0005\u0006^\b\u0006\n\u0006\f\u0006"+
		"a\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006e\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000"+
		"\u0001\u0001\u0000\u000b\fo\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		"\u0014\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006R\u0001"+
		"\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000"+
		"\f_\u0001\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001"+
		"\u0001\u0000\u0000\u0000\u0013\u0015\u0005\u0002\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u001b\u0003\u0004\u0002\u0000\u0017\u0018"+
		"\u0005\u0003\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001f"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e \u0007"+
		"\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!%\u0003\u0006\u0003\u0000"+
		"\"$\u0003\b\u0004\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&+\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0003\u000e\u0007\u0000)(\u0001"+
		"\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000./\u0003\n\u0005\u0000/0\u0006\u0002\uffff\uffff\u00000A\u0001\u0000"+
		"\u0000\u000013\u0003\b\u0004\u000021\u0001\u0000\u0000\u000036\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005:\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000079\u0003\u000e\u0007\u0000"+
		"87\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000=>\u0003\n\u0005\u0000>?\u0006\u0002\uffff\uffff\u0000?A\u0001"+
		"\u0000\u0000\u0000@!\u0001\u0000\u0000\u0000@4\u0001\u0000\u0000\u0000"+
		"A\u0005\u0001\u0000\u0000\u0000BD\u0005\u0005\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0001\u0000\u0000IS\u0006\u0003\uffff\uffff\u0000JL\u0005\u0005"+
		"\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PQ\u0005\b\u0000\u0000QS\u0006\u0003\uffff\uffff"+
		"\u0000RE\u0001\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000S\u0007\u0001"+
		"\u0000\u0000\u0000TX\u0003\f\u0006\u0000UX\u0005\t\u0000\u0000VX\u0005"+
		"\n\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000"+
		"Z[\u0006\u0005\uffff\uffff\u0000[\u000b\u0001\u0000\u0000\u0000\\^\u0005"+
		"\u0005\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bd\u0005\b\u0000\u0000ce\u0005\u0004\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\r\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0006\u0000\u0000g\u000f\u0001\u0000\u0000\u0000"+
		"\u000e\u0014\u001b\u001f%+4:@EMRW_d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}