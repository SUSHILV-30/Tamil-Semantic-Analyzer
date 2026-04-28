// Generated from Tamil.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TamilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOUN=1, QUESTION_WORD=2, LINK_WORD=3, POSTPOSITION=4, ADJ=5, ADV=6, 
		NEG_SUFFIX=7, TENSE_SUFFIX=8, TAMIL_WORD=9, TAMIL_NUMBER=10, NUMBER=11, 
		QUESTION_MARK=12, PUNCT=13, WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "PRONOUN", "QUESTION_WORD", "LINK_WORD", "POSTPOSITION", 
		"ADJ", "ADV", "NEG_SUFFIX", "TENSE_SUFFIX", "TAMIL_WORD", "TAMIL_NUMBER", 
		"NUMBER", "'?'", "PUNCT", "WS"
	};
	public static final int
		RULE_file = 0, RULE_sentence = 1, RULE_clause = 2, RULE_subject = 3, RULE_object = 4, 
		RULE_verbPhrase = 5, RULE_nounPhrase = 6, RULE_adjective = 7, RULE_adverb = 8;
	public static final String[] ruleNames = {
		"file", "sentence", "clause", "subject", "object", "verbPhrase", "nounPhrase", 
		"adjective", "adverb"
	};

	@Override
	public String getGrammarFileName() { return "Tamil.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TamilParser.EOF, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRONOUN) | (1L << ADJ) | (1L << ADV) | (1L << TAMIL_WORD))) != 0)) {
				{
				{
				setState(18); sentence();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); match(EOF);
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

	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode LINK_WORD(int i) {
			return getToken(TamilParser.LINK_WORD, i);
		}
		public TerminalNode PUNCT() { return getToken(TamilParser.PUNCT, 0); }
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(TamilParser.QUESTION_MARK, 0); }
		public List<TerminalNode> LINK_WORD() { return getTokens(TamilParser.LINK_WORD); }
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
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
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); clause();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINK_WORD) {
				{
				{
				setState(27); match(LINK_WORD);
				setState(28); clause();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_la = _input.LA(1);
			if (_la==QUESTION_MARK || _la==PUNCT) {
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==QUESTION_MARK || _la==PUNCT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ClauseContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
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
		enterRule(_localctx, 4, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(37); subject();
				}
				break;
			}
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(40); object();
				}
				break;
			}
			setState(43); verbPhrase();
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

	public static class SubjectContext extends ParserRuleContext {
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public TerminalNode PRONOUN() { return getToken(TamilParser.PRONOUN, 0); }
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
		enterRule(_localctx, 6, RULE_subject);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case PRONOUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(PRONOUN);
				}
				break;
			case ADJ:
			case TAMIL_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); nounPhrase();
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

	public static class ObjectContext extends ParserRuleContext {
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
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
		enterRule(_localctx, 8, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); nounPhrase();
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

	public static class VerbPhraseContext extends ParserRuleContext {
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public TerminalNode TENSE_SUFFIX() { return getToken(TamilParser.TENSE_SUFFIX, 0); }
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
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
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verbPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADV) {
				{
				{
				setState(51); adverb();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(TAMIL_WORD);
			setState(59);
			_la = _input.LA(1);
			if (_la==TENSE_SUFFIX) {
				{
				setState(58); match(TENSE_SUFFIX);
				}
			}

			setState(62);
			_la = _input.LA(1);
			if (_la==NEG_SUFFIX) {
				{
				setState(61); match(NEG_SUFFIX);
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

	public static class NounPhraseContext extends ParserRuleContext {
		public TerminalNode POSTPOSITION() { return getToken(TamilParser.POSTPOSITION, 0); }
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public TerminalNode TAMIL_WORD() { return getToken(TamilParser.TAMIL_WORD, 0); }
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
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
		enterRule(_localctx, 12, RULE_nounPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADJ) {
				{
				{
				setState(64); adjective();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(TAMIL_WORD);
			setState(72);
			_la = _input.LA(1);
			if (_la==POSTPOSITION) {
				{
				setState(71); match(POSTPOSITION);
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
		enterRule(_localctx, 14, RULE_adjective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(ADJ);
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
		enterRule(_localctx, 16, RULE_adverb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(ADV);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3"+
		"\5\3&\n\3\3\4\5\4)\n\4\3\4\5\4,\n\4\3\4\3\4\3\5\3\5\5\5\62\n\5\3\6\3\6"+
		"\3\7\7\7\67\n\7\f\7\16\7:\13\7\3\7\3\7\5\7>\n\7\3\7\5\7A\n\7\3\b\7\bD"+
		"\n\b\f\b\16\bG\13\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\3\3\2\16\17R\2\27\3\2\2\2\4\34\3\2\2\2\6(\3\2\2\2\b"+
		"\61\3\2\2\2\n\63\3\2\2\2\f8\3\2\2\2\16E\3\2\2\2\20L\3\2\2\2\22N\3\2\2"+
		"\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34!\5\6\4\2"+
		"\35\36\7\5\2\2\36 \5\6\4\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2"+
		"\2\2\"%\3\2\2\2#!\3\2\2\2$&\t\2\2\2%$\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\')"+
		"\5\b\5\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\n\6\2+*\3\2\2\2+,\3\2\2\2"+
		",-\3\2\2\2-.\5\f\7\2.\7\3\2\2\2/\62\7\3\2\2\60\62\5\16\b\2\61/\3\2\2\2"+
		"\61\60\3\2\2\2\62\t\3\2\2\2\63\64\5\16\b\2\64\13\3\2\2\2\65\67\5\22\n"+
		"\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2"+
		";=\7\13\2\2<>\7\n\2\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\7\t\2\2@?\3\2\2"+
		"\2@A\3\2\2\2A\r\3\2\2\2BD\5\20\t\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FH\3\2\2\2GE\3\2\2\2HJ\7\13\2\2IK\7\6\2\2JI\3\2\2\2JK\3\2\2\2K\17"+
		"\3\2\2\2LM\7\7\2\2M\21\3\2\2\2NO\7\b\2\2O\23\3\2\2\2\r\27!%(+\618=@EJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}