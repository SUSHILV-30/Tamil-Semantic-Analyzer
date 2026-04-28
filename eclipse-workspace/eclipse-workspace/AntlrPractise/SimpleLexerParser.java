// Generated from SimpleLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IF=10, ELIF=11, ELSE=12, PRINT=13, ASSIGN=14, GT=15, LT=16, GE=17, LE=18, 
		EQ=19, NE=20, DIV=21, NUMBER=22, ID=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assign = 2, RULE_print = 3, RULE_ifelse = 4, 
		RULE_block = 5, RULE_condition = 6, RULE_relop = 7, RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "assign", "print", "ifelse", "block", "condition", "relop", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "':'", "'{'", "'}'", "'*'", "'+'", "'-'", 
			"'if'", "'elif'", "'else'", "'print'", "'='", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IF", "ELIF", 
			"ELSE", "PRINT", "ASSIGN", "GT", "LT", "GE", "LE", "EQ", "NE", "DIV", 
			"NUMBER", "ID", "WS"
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
	public String getGrammarFileName() { return "SimpleLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLexerParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
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
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8397824L) != 0) );
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
	public static class StatContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				assign();
				setState(26);
				match(T__0);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				print();
				setState(29);
				match(T__0);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				ifelse();
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLexerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleLexerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(ASSIGN);
			setState(36);
			expr(0);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SimpleLexerParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PRINT);
			setState(39);
			match(T__1);
			setState(40);
			expr(0);
			setState(41);
			match(T__2);
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
	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimpleLexerParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(SimpleLexerParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(SimpleLexerParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(SimpleLexerParser.ELSE, 0); }
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IF);
			setState(44);
			match(T__1);
			setState(45);
			condition();
			setState(46);
			match(T__2);
			setState(47);
			match(T__3);
			setState(48);
			block();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(49);
				match(ELIF);
				setState(50);
				match(T__1);
				setState(51);
				condition();
				setState(52);
				match(T__2);
				setState(53);
				match(T__3);
				setState(54);
				block();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(61);
				match(ELSE);
				setState(62);
				match(T__3);
				setState(63);
				block();
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__4);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				stat();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8397824L) != 0) );
			setState(72);
			match(T__5);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			expr(0);
			setState(75);
			relop();
			setState(76);
			expr(0);
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
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(SimpleLexerParser.GT, 0); }
		public TerminalNode LT() { return getToken(SimpleLexerParser.LT, 0); }
		public TerminalNode GE() { return getToken(SimpleLexerParser.GE, 0); }
		public TerminalNode LE() { return getToken(SimpleLexerParser.LE, 0); }
		public TerminalNode EQ() { return getToken(SimpleLexerParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SimpleLexerParser.NE, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
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
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(SimpleLexerParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(SimpleLexerParser.ID, 0); }
		public TerminalNode DIV() { return getToken(SimpleLexerParser.DIV, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLexerListener ) ((SimpleLexerListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(81);
				match(T__1);
				setState(82);
				expr(0);
				setState(83);
				match(T__2);
				}
				break;
			case NUMBER:
				{
				setState(85);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(86);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00049\b\u0004\n\u0004\f\u0004"+
		"<\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0004\u0005E\b\u0005\u000b\u0005\f\u0005F\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bX\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b`\b\b\n"+
		"\b\f\bc\t\b\u0001\b\u0000\u0001\u0010\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0003\u0001\u0000\u000f\u0014\u0002\u0000\u0007\u0007"+
		"\u0015\u0015\u0001\u0000\b\te\u0000\u0013\u0001\u0000\u0000\u0000\u0002"+
		" \u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006&\u0001"+
		"\u0000\u0000\u0000\b+\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000"+
		"\fJ\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010W\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005"+
		"\u0001\u0000\u0000\u001b!\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0006"+
		"\u0003\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e!\u0001\u0000\u0000"+
		"\u0000\u001f!\u0003\b\u0004\u0000 \u0019\u0001\u0000\u0000\u0000 \u001c"+
		"\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0017\u0000\u0000#$\u0005\u000e\u0000\u0000$%\u0003"+
		"\u0010\b\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0005\r\u0000\u0000\'"+
		"(\u0005\u0002\u0000\u0000()\u0003\u0010\b\u0000)*\u0005\u0003\u0000\u0000"+
		"*\u0007\u0001\u0000\u0000\u0000+,\u0005\n\u0000\u0000,-\u0005\u0002\u0000"+
		"\u0000-.\u0003\f\u0006\u0000./\u0005\u0003\u0000\u0000/0\u0005\u0004\u0000"+
		"\u00000:\u0003\n\u0005\u000012\u0005\u000b\u0000\u000023\u0005\u0002\u0000"+
		"\u000034\u0003\f\u0006\u000045\u0005\u0003\u0000\u000056\u0005\u0004\u0000"+
		"\u000067\u0003\n\u0005\u000079\u0001\u0000\u0000\u000081\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;@\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005"+
		"\f\u0000\u0000>?\u0005\u0004\u0000\u0000?A\u0003\n\u0005\u0000@=\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000\u0000"+
		"BD\u0005\u0005\u0000\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000I\u000b"+
		"\u0001\u0000\u0000\u0000JK\u0003\u0010\b\u0000KL\u0003\u000e\u0007\u0000"+
		"LM\u0003\u0010\b\u0000M\r\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000"+
		"\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0006\b\uffff\uffff\u0000QR\u0005"+
		"\u0002\u0000\u0000RS\u0003\u0010\b\u0000ST\u0005\u0003\u0000\u0000TX\u0001"+
		"\u0000\u0000\u0000UX\u0005\u0016\u0000\u0000VX\u0005\u0017\u0000\u0000"+
		"WP\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000Xa\u0001\u0000\u0000\u0000YZ\n\u0005\u0000\u0000Z[\u0007\u0001\u0000"+
		"\u0000[`\u0003\u0010\b\u0006\\]\n\u0004\u0000\u0000]^\u0007\u0002\u0000"+
		"\u0000^`\u0003\u0010\b\u0005_Y\u0001\u0000\u0000\u0000_\\\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000\b\u0015 :@FW_a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}