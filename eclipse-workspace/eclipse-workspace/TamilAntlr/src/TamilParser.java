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
		PRONOUN=1, QUESTION_WORD=2, LINK_WORD=3, POSTPOSITION=4, ADJ=5, ADV=6, 
		NEG_SUFFIX=7, TENSE_SUFFIX=8, TAMIL_WORD=9, TAMIL_NUMBER=10, NUMBER=11, 
		QUESTION_MARK=12, PUNCT=13, ERROR_CHAR=14, WS=15;
	public static final int
		RULE_file = 0, RULE_sentence = 1, RULE_clause = 2, RULE_subject = 3, RULE_object = 4, 
		RULE_verbPhrase = 5, RULE_nounPhrase = 6, RULE_adjective = 7, RULE_adverb = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "sentence", "clause", "subject", "object", "verbPhrase", "nounPhrase", 
			"adjective", "adverb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRONOUN", "QUESTION_WORD", "LINK_WORD", "POSTPOSITION", "ADJ", 
			"ADV", "NEG_SUFFIX", "TENSE_SUFFIX", "TAMIL_WORD", "TAMIL_NUMBER", "NUMBER", 
			"QUESTION_MARK", "PUNCT", "ERROR_CHAR", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				sentence();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3942L) != 0) );
			setState(23);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_WORD) {
				{
				setState(25);
				match(QUESTION_WORD);
				}
			}

			setState(28);
			clause();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINK_WORD) {
				{
				{
				setState(29);
				match(LINK_WORD);
				setState(30);
				clause();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK || _la==PUNCT) {
				{
				setState(36);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(39);
				subject();
				}
				break;
			}
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(42);
				object();
				}
				break;
			}
			setState(45);
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
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subject);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRONOUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(PRONOUN);
				}
				break;
			case ADJ:
			case TAMIL_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				nounPhrase();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamilListener ) ((TamilListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJ:
			case TAMIL_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				nounPhrase();
				}
				break;
			case TAMIL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(TAMIL_NUMBER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
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
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
		public TerminalNode TENSE_SUFFIX() { return getToken(TamilParser.TENSE_SUFFIX, 0); }
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public TerminalNode NEG_SUFFIX() { return getToken(TamilParser.NEG_SUFFIX, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitVerbPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verbPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADV) {
				{
				{
				setState(56);
				adverb();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==TENSE_SUFFIX || _la==TAMIL_WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEG_SUFFIX) {
				{
				setState(63);
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
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
		}
		public TerminalNode POSTPOSITION() { return getToken(TamilParser.POSTPOSITION, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitNounPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nounPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADJ) {
				{
				{
				setState(66);
				adjective();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(TAMIL_WORD);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POSTPOSITION) {
				{
				setState(73);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitAdjective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_adjective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamilVisitor ) return ((TamilVisitor<? extends T>)visitor).visitAdverb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdverbContext adverb() throws RecognitionException {
		AdverbContext _localctx = new AdverbContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_adverb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		"\u0004\u0001\u000fQ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0002\u0003\u0002)\b\u0002\u0001"+
		"\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00047\b\u0004\u0001\u0005\u0005\u0005:\b\u0005\n\u0005\f\u0005=\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006\u0005\u0006"+
		"D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"K\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002\u0001\u0000\f"+
		"\r\u0001\u0000\b\tT\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000"+
		"\u0000\b6\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\fE\u0001"+
		"\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\u0005\u0002\u0000\u0000\u001a\u0019\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c!\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0003\u0000\u0000"+
		"\u001e \u0003\u0004\u0002\u0000\u001f\u001d\u0001\u0000\u0000\u0000 #"+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0007"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\')\u0003\u0006\u0003\u0000(\'\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*,\u0003"+
		"\b\u0004\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0003\n\u0005\u0000.\u0005\u0001\u0000\u0000\u0000"+
		"/2\u0005\u0001\u0000\u000002\u0003\f\u0006\u00001/\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\u0007\u0001\u0000\u0000\u000037\u0003\f\u0006"+
		"\u000047\u0005\n\u0000\u000057\u0005\u000b\u0000\u000063\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\t\u0001\u0000"+
		"\u0000\u00008:\u0003\u0010\b\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>@\u0007\u0001\u0000\u0000"+
		"?A\u0005\u0007\u0000\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\u000b\u0001\u0000\u0000\u0000BD\u0003\u000e\u0007\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HJ\u0005\t\u0000\u0000IK\u0005\u0004\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LM\u0005\u0005"+
		"\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000"+
		"O\u0011\u0001\u0000\u0000\u0000\f\u0015\u001a!%(+16;@EJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}