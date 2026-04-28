// Generated from Hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Noun=1, Verb=2, Determiner=3, Modifier=4, CaseSuffix=5, TenseSuffix=6, 
		MoodSuffix=7, HonorificSuffix=8, SENT_END=9, TAMIL_SYLLABLE=10, TAMIL_WORD=11, 
		TAMIL_SUFFIX=12, TAMIL_NUMBER=13, PUNCT=14, NEWLINE=15, WS=16, OTHER=17;
	public static final int
		RULE_text = 0, RULE_element = 1, RULE_blankLine = 2, RULE_poeticLine = 3, 
		RULE_proseParagraph = 4, RULE_sentence = 5, RULE_nominalClause = 6, RULE_nounPhrase = 7, 
		RULE_verbPhrase = 8, RULE_objectPhrase = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"text", "element", "blankLine", "poeticLine", "proseParagraph", "sentence", 
			"nominalClause", "nounPhrase", "verbPhrase", "objectPhrase"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Noun", "Verb", "Determiner", "Modifier", "CaseSuffix", "TenseSuffix", 
			"MoodSuffix", "HonorificSuffix", "SENT_END", "TAMIL_SYLLABLE", "TAMIL_WORD", 
			"TAMIL_SUFFIX", "TAMIL_NUMBER", "PUNCT", "NEWLINE", "WS", "OTHER"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  // Minimal helper method stub for POS lookup.
	  // Keep this trivial (no '=' assignments) so ANTLR doesn't choke.
	  public String posLookup(String surface) {
	    // Return null by default (no lexicon in this minimal example).
	    return null;
	  }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35870L) != 0)) {
				{
				{
				setState(20);
				element();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
	public static class ElementContext extends ParserRuleContext {
		public PoeticLineContext poeticLine() {
			return getRuleContext(PoeticLineContext.class,0);
		}
		public ProseParagraphContext proseParagraph() {
			return getRuleContext(ProseParagraphContext.class,0);
		}
		public BlankLineContext blankLine() {
			return getRuleContext(BlankLineContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAMIL_SYLLABLE:
			case TAMIL_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				poeticLine();
				}
				break;
			case Noun:
			case Verb:
			case Determiner:
			case Modifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				proseParagraph();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				blankLine();
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
	public static class BlankLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(HelloParser.NEWLINE, 0); }
		public BlankLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlankLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlankLine(this);
		}
	}

	public final BlankLineContext blankLine() throws RecognitionException {
		BlankLineContext _localctx = new BlankLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blankLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(NEWLINE);
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
	public static class PoeticLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(HelloParser.NEWLINE, 0); }
		public List<TerminalNode> TAMIL_WORD() { return getTokens(HelloParser.TAMIL_WORD); }
		public TerminalNode TAMIL_WORD(int i) {
			return getToken(HelloParser.TAMIL_WORD, i);
		}
		public List<TerminalNode> TAMIL_SYLLABLE() { return getTokens(HelloParser.TAMIL_SYLLABLE); }
		public TerminalNode TAMIL_SYLLABLE(int i) {
			return getToken(HelloParser.TAMIL_SYLLABLE, i);
		}
		public PoeticLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poeticLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPoeticLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPoeticLine(this);
		}
	}

	public final PoeticLineContext poeticLine() throws RecognitionException {
		PoeticLineContext _localctx = new PoeticLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_poeticLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==TAMIL_SYLLABLE || _la==TAMIL_WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAMIL_SYLLABLE || _la==TAMIL_WORD );
			setState(40);
			match(NEWLINE);
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
	public static class ProseParagraphContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> SENT_END() { return getTokens(HelloParser.SENT_END); }
		public TerminalNode SENT_END(int i) {
			return getToken(HelloParser.SENT_END, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HelloParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HelloParser.NEWLINE, i);
		}
		public ProseParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proseParagraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProseParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProseParagraph(this);
		}
	}

	public final ProseParagraphContext proseParagraph() throws RecognitionException {
		ProseParagraphContext _localctx = new ProseParagraphContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_proseParagraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			sentence();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SENT_END) {
				{
				{
				setState(43);
				match(SENT_END);
				setState(44);
				sentence();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public TerminalNode SENT_END() { return getToken(HelloParser.SENT_END, 0); }
		public TerminalNode NEWLINE() { return getToken(HelloParser.NEWLINE, 0); }
		public NominalClauseContext nominalClause() {
			return getRuleContext(NominalClauseContext.class,0);
		}
		public ObjectPhraseContext objectPhrase() {
			return getRuleContext(ObjectPhraseContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				setState(55);
				nominalClause();
				}
			}

			setState(58);
			verbPhrase();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26L) != 0)) {
				{
				setState(59);
				objectPhrase();
				}
			}

			setState(62);
			_la = _input.LA(1);
			if ( !(_la==SENT_END || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class NominalClauseContext extends ParserRuleContext {
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public NominalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNominalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNominalClause(this);
		}
	}

	public final NominalClauseContext nominalClause() throws RecognitionException {
		NominalClauseContext _localctx = new NominalClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nominalClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			nounPhrase();
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
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
	 
		public NounPhraseContext() { }
		public void copyFrom(NounPhraseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleNounPhraseContext extends NounPhraseContext {
		public TerminalNode Noun() { return getToken(HelloParser.Noun, 0); }
		public TerminalNode Determiner() { return getToken(HelloParser.Determiner, 0); }
		public List<TerminalNode> Modifier() { return getTokens(HelloParser.Modifier); }
		public TerminalNode Modifier(int i) {
			return getToken(HelloParser.Modifier, i);
		}
		public TerminalNode CaseSuffix() { return getToken(HelloParser.CaseSuffix, 0); }
		public SimpleNounPhraseContext(NounPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSimpleNounPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSimpleNounPhrase(this);
		}
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nounPhrase);
		int _la;
		try {
			_localctx = new SimpleNounPhraseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Determiner) {
				{
				setState(66);
				match(Determiner);
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Modifier) {
				{
				{
				setState(69);
				match(Modifier);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(Noun);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CaseSuffix) {
				{
				setState(76);
				match(CaseSuffix);
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
	public static class VerbPhraseContext extends ParserRuleContext {
		public TerminalNode Verb() { return getToken(HelloParser.Verb, 0); }
		public TerminalNode TenseSuffix() { return getToken(HelloParser.TenseSuffix, 0); }
		public TerminalNode MoodSuffix() { return getToken(HelloParser.MoodSuffix, 0); }
		public TerminalNode HonorificSuffix() { return getToken(HelloParser.HonorificSuffix, 0); }
		public VerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVerbPhrase(this);
		}
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verbPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Verb);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TenseSuffix) {
				{
				setState(80);
				match(TenseSuffix);
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MoodSuffix) {
				{
				setState(83);
				match(MoodSuffix);
				}
			}

			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HonorificSuffix) {
				{
				setState(86);
				match(HonorificSuffix);
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
	public static class ObjectPhraseContext extends ParserRuleContext {
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public ObjectPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterObjectPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitObjectPhrase(this);
		}
	}

	public final ObjectPhraseContext objectPhrase() throws RecognitionException {
		ObjectPhraseContext _localctx = new ObjectPhraseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectPhrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			nounPhrase();
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
		"\u0004\u0001\u0011\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u0003%\b\u0003\u000b\u0003\f\u0003&\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004.\b\u0004\n\u0004\f\u00041\t"+
		"\u0004\u0001\u0004\u0004\u00044\b\u0004\u000b\u0004\f\u00045\u0001\u0005"+
		"\u0003\u00059\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005=\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007D\b"+
		"\u0007\u0001\u0007\u0005\u0007G\b\u0007\n\u0007\f\u0007J\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001\b\u0001\b\u0003\bR\b\b\u0001"+
		"\b\u0003\bU\b\b\u0001\b\u0003\bX\b\b\u0001\t\u0001\t\u0001\t\u0000\u0000"+
		"\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000"+
		"\n\u000b\u0002\u0000\t\t\u000f\u000f_\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002\u001f\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006"+
		"$\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000"+
		"\u0000\f@\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010"+
		"O\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c \u0003\u0006\u0003\u0000\u001d \u0003\b\u0004"+
		"\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\"\u0005\u000f\u0000\u0000\"\u0005\u0001"+
		"\u0000\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u000f\u0000\u0000)\u0007\u0001"+
		"\u0000\u0000\u0000*/\u0003\n\u0005\u0000+,\u0005\t\u0000\u0000,.\u0003"+
		"\n\u0005\u0000-+\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000024\u0005\u000f\u0000\u000032\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\t\u0001\u0000\u0000\u000079\u0003\f\u0006\u000087\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0003\u0010\b\u0000;=\u0003\u0012\t\u0000<;\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0007\u0001\u0000"+
		"\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0003\u000e\u0007\u0000A\r\u0001"+
		"\u0000\u0000\u0000BD\u0005\u0003\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DH\u0001\u0000\u0000\u0000EG\u0005\u0004\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KM\u0005\u0001\u0000\u0000LN\u0005\u0005\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000f\u0001\u0000"+
		"\u0000\u0000OQ\u0005\u0002\u0000\u0000PR\u0005\u0006\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SU\u0005\u0007\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VX\u0005\b\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X\u0011\u0001\u0000\u0000\u0000YZ\u0003"+
		"\u000e\u0007\u0000Z\u0013\u0001\u0000\u0000\u0000\r\u0017\u001f&/58<C"+
		"HMQTW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}