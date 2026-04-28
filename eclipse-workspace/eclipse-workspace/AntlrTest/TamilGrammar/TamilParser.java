// Generated from Tamil.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PRONOUN=12, PROPER_NOUN=13, LINK_WORD=14, POSTPOSITION=15, 
		ADJ=16, ADV=17, TAMIL_DAY=18, TAMIL_MONTH=19, TAMIL_WORD=20, TENSE_SUFFIX=21, 
		NEG_SUFFIX=22, VERB_FINITE=23, PUNCT=24, QUESTION_MARK=25, WS=26, INVALID_CHAR=27;
	public static final int
		RULE_file = 0, RULE_sent = 1, RULE_sentence = 2, RULE_clause = 3, RULE_subject = 4, 
		RULE_object = 5, RULE_verbPhrase = 6, RULE_nounPhrase = 7, RULE_day = 8, 
		RULE_month = 9, RULE_adjective = 10, RULE_adverb = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "sent", "sentence", "clause", "subject", "object", "verbPhrase", 
			"nounPhrase", "day", "month", "adjective", "adverb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u0BA8\\u0BB2\\u0BCD\\u0BB2'", "'\\u0BAA\\u0B9F\\u0BBF\\u0BAA\\u0BCD\\u0BAA\\u0BC1'", 
			"'\\u0BB5\\u0BC7\\u0BA3\\u0BCD\\u0B9F\\u0BC1\\u0BAE\\u0BCD'", "'\\u0BA8\\u0B9F\\u0BA4\\u0BCD\\u0BA4\\u0BC8'", 
			"'\\u0B85\\u0BB5\\u0B9A\\u0BBF\\u0BAF\\u0BAE\\u0BCD'", "'\\u0B87\\u0BB0\\u0BC1\\u0B95\\u0BCD\\u0B95\\u0BBF\\u0BB1\\u0BBE\\u0BB0\\u0BCD'", 
			"'\\u0BA8\\u0B9F\\u0BCD\\u0BAA\\u0BC1'", "'\\u0BA4\\u0BC7\\u0BB5\\u0BC8'", 
			"'\\u0BAA\\u0BC1\\u0B95\\u0BC8\\u0BAA\\u0BCD\\u0BAA\\u0BA4\\u0BC1'", 
			"'\\u0BAA\\u0BC1\\u0BB1\\u0BCD\\u0BB1\\u0BC1\\u0BA8\\u0BCB\\u0BAF\\u0BC8'", 
			"'\\u0B8F\\u0BB1\\u0BCD\\u0BAA\\u0B9F\\u0BC1\\u0BA4\\u0BCD\\u0BA4\\u0BC1\\u0BAE\\u0BCD'", 
			null, "'\\u0BA4\\u0BBF\\u0BB0\\u0BC1\\u0BB5\\u0BB3\\u0BCD\\u0BB3\\u0BC1\\u0BB5\\u0BB0\\u0BCD'", 
			null, null, null, null, null, null, null, null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PRONOUN", "PROPER_NOUN", "LINK_WORD", "POSTPOSITION", "ADJ", "ADV", 
			"TAMIL_DAY", "TAMIL_MONTH", "TAMIL_WORD", "TENSE_SUFFIX", "NEG_SUFFIX", 
			"VERB_FINITE", "PUNCT", "QUESTION_MARK", "WS", "INVALID_CHAR"
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

	public TamilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TamilParser.EOF, 0); }
		public List<SentContext> sent() {
			return getRuleContexts(SentContext.class);
		}
		public SentContext sent(int i) {
			return getRuleContext(SentContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(24);
					sent();
					}
					break;
				case 2:
					{
					setState(25);
					sentence();
					}
					break;
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10433026L) != 0) );
			setState(30);
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
	public static class SentContext extends ParserRuleContext {
		public TerminalNode PUNCT() { return getToken(TamilParser.PUNCT, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(TamilParser.QUESTION_MARK, 0); }
		public TerminalNode PROPER_NOUN() { return getToken(TamilParser.PROPER_NOUN, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sent);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(T__1);
				setState(34);
				match(T__2);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNCT || _la==QUESTION_MARK) {
					{
					setState(35);
					_la = _input.LA(1);
					if ( !(_la==PUNCT || _la==QUESTION_MARK) ) {
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__0);
				setState(39);
				match(T__3);
				setState(40);
				match(T__4);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNCT || _la==QUESTION_MARK) {
					{
					setState(41);
					_la = _input.LA(1);
					if ( !(_la==PUNCT || _la==QUESTION_MARK) ) {
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(PROPER_NOUN);
				setState(45);
				match(T__5);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNCT || _la==QUESTION_MARK) {
					{
					setState(46);
					_la = _input.LA(1);
					if ( !(_la==PUNCT || _la==QUESTION_MARK) ) {
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
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(T__0);
				setState(50);
				match(T__6);
				setState(51);
				match(T__7);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNCT || _la==QUESTION_MARK) {
					{
					setState(52);
					_la = _input.LA(1);
					if ( !(_la==PUNCT || _la==QUESTION_MARK) ) {
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
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(T__8);
				setState(56);
				match(T__9);
				setState(57);
				match(T__10);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUNCT || _la==QUESTION_MARK) {
					{
					setState(58);
					_la = _input.LA(1);
					if ( !(_la==PUNCT || _la==QUESTION_MARK) ) {
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
	public static class SentenceContext extends ParserRuleContext {
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			clause();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINK_WORD) {
				{
				{
				setState(64);
				match(LINK_WORD);
				setState(65);
				clause();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNCT || _la==QUESTION_MARK) {
				{
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==PUNCT || _la==QUESTION_MARK) ) {
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
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(74);
				subject();
				}
				break;
			}
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(77);
				object();
				}
				break;
			}
			setState(80);
			verbPhrase();
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
		public TerminalNode PRONOUN() { return getToken(TamilParser.PRONOUN, 0); }
		public TerminalNode PROPER_NOUN() { return getToken(TamilParser.PROPER_NOUN, 0); }
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subject);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(PRONOUN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(PROPER_NOUN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				nounPhrase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				day();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				month();
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
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				nounPhrase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				day();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				month();
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
	public static class VerbPhraseContext extends ParserRuleContext {
		public TerminalNode VERB_FINITE() { return getToken(TamilParser.VERB_FINITE, 0); }
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public TerminalNode NEG_SUFFIX() { return getToken(TamilParser.NEG_SUFFIX, 0); }
		public TerminalNode TENSE_SUFFIX() { return getToken(TamilParser.TENSE_SUFFIX, 0); }
		public VerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitVerbPhrase(this);
		}
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_verbPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADV) {
				{
				{
				setState(94);
				adverb();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERB_FINITE:
				{
				setState(100);
				match(VERB_FINITE);
				}
				break;
			case TAMIL_WORD:
				{
				setState(101);
				match(TAMIL_WORD);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TENSE_SUFFIX) {
					{
					setState(102);
					match(TENSE_SUFFIX);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG_SUFFIX) {
				{
				setState(107);
				match(NEG_SUFFIX);
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
	public static class NounPhraseContext extends ParserRuleContext {
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
		}
		public TerminalNode POSTPOSITION() { return getToken(TamilParser.POSTPOSITION, 0); }
		public List<TerminalNode> TAMIL_WORD() { return getTokens(TamilParser.TAMIL_WORD); }
		public TerminalNode TAMIL_WORD(int i) {
			return getToken(TamilParser.TAMIL_WORD, i);
		}
		public List<TerminalNode> TAMIL_DAY() { return getTokens(TamilParser.TAMIL_DAY); }
		public TerminalNode TAMIL_DAY(int i) {
			return getToken(TamilParser.TAMIL_DAY, i);
		}
		public List<TerminalNode> TAMIL_MONTH() { return getTokens(TamilParser.TAMIL_MONTH); }
		public TerminalNode TAMIL_MONTH(int i) {
			return getToken(TamilParser.TAMIL_MONTH, i);
		}
		public List<TerminalNode> PROPER_NOUN() { return getTokens(TamilParser.PROPER_NOUN); }
		public TerminalNode PROPER_NOUN(int i) {
			return getToken(TamilParser.PROPER_NOUN, i);
		}
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterNounPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitNounPhrase(this);
		}
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nounPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADJ) {
				{
				{
				setState(110);
				adjective();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(116);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1843200L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPOSITION) {
				{
				setState(121);
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
	public static class DayContext extends ParserRuleContext {
		public TerminalNode TAMIL_DAY() { return getToken(TamilParser.TAMIL_DAY, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(TAMIL_DAY);
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
	public static class MonthContext extends ParserRuleContext {
		public TerminalNode TAMIL_MONTH() { return getToken(TamilParser.TAMIL_MONTH, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitMonth(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TAMIL_MONTH);
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
	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode ADJ() { return getToken(TamilParser.ADJ, 0); }
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitAdjective(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_adjective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ADJ);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterAdverb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitAdverb(this);
		}
	}

	public final AdverbContext adverb() throws RecognitionException {
		AdverbContext _localctx = new AdverbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_adverb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		"\u0004\u0001\u001b\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00010\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001<\b\u0001\u0003\u0001>\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002C\b\u0002\n\u0002\f\u0002F\t\u0002\u0001\u0002\u0003\u0002"+
		"I\b\u0002\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0003\u0003O\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005]\b\u0005\u0001\u0006\u0005\u0006`\b\u0006\n\u0006\f"+
		"\u0006c\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006"+
		"\u0003\u0006j\b\u0006\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0007\u0005"+
		"\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007\u0001\u0007\u0004\u0007v\b\u0007"+
		"\u000b\u0007\f\u0007w\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0002\u0001\u0000\u0018\u0019\u0002\u0000\r\r\u0012\u0014\u0094\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004?\u0001"+
		"\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bW\u0001\u0000\u0000"+
		"\u0000\n\\\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000\u000eq\u0001"+
		"\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000"+
		"\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u0082\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0003\u0002\u0001\u0000\u0019\u001b\u0003\u0004\u0002"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u0002\u0000\u0000\"$\u0005\u0003"+
		"\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%>\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000"+
		"\'(\u0005\u0004\u0000\u0000(*\u0005\u0005\u0000\u0000)+\u0007\u0000\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+>\u0001\u0000"+
		"\u0000\u0000,-\u0005\r\u0000\u0000-/\u0005\u0006\u0000\u0000.0\u0007\u0000"+
		"\u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000>\u0001"+
		"\u0000\u0000\u000012\u0005\u0001\u0000\u000023\u0005\u0007\u0000\u0000"+
		"35\u0005\b\u0000\u000046\u0007\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006>\u0001\u0000\u0000\u000078\u0005\t\u0000\u0000"+
		"89\u0005\n\u0000\u00009;\u0005\u000b\u0000\u0000:<\u0007\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000= \u0001\u0000\u0000\u0000=&\u0001\u0000\u0000\u0000=,\u0001\u0000"+
		"\u0000\u0000=1\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000>\u0003"+
		"\u0001\u0000\u0000\u0000?D\u0003\u0006\u0003\u0000@A\u0005\u000e\u0000"+
		"\u0000AC\u0003\u0006\u0003\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0007\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0005\u0001\u0000"+
		"\u0000\u0000JL\u0003\b\u0004\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LN\u0001\u0000\u0000\u0000MO\u0003\n\u0005\u0000NM\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0003"+
		"\f\u0006\u0000Q\u0007\u0001\u0000\u0000\u0000RX\u0005\f\u0000\u0000SX"+
		"\u0005\r\u0000\u0000TX\u0003\u000e\u0007\u0000UX\u0003\u0010\b\u0000V"+
		"X\u0003\u0012\t\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\t\u0001\u0000\u0000\u0000Y]\u0003\u000e\u0007\u0000Z]\u0003\u0010"+
		"\b\u0000[]\u0003\u0012\t\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000"+
		"^`\u0003\u0016\u000b\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bi\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000dj\u0005\u0017\u0000\u0000eg\u0005"+
		"\u0014\u0000\u0000fh\u0005\u0015\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000id\u0001\u0000\u0000"+
		"\u0000ie\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000km\u0005\u0016"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\r\u0001"+
		"\u0000\u0000\u0000np\u0003\u0014\n\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0007\u0001\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000y{\u0005"+
		"\u000f\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u000f\u0001\u0000\u0000\u0000|}\u0005\u0012\u0000\u0000}\u0011\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005\u0013\u0000\u0000\u007f\u0013\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0015\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0011\u0000\u0000\u0083\u0017\u0001\u0000"+
		"\u0000\u0000\u0015\u001a\u001c$*/5;=DHKNW\\agilqwz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}