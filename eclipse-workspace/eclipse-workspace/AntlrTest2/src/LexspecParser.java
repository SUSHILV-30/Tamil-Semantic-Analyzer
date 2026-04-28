// Generated from Lexspec.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LexspecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, DIV=4, LPAREN=5, RPAREN=6, STRING=7, ID=8, NUM=9, 
		WS=10;
	public static final int
		RULE_goal = 0, RULE_expr = 1, RULE_term = 2, RULE_factor = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"goal", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "TIMES", "DIV", "LPAREN", "RPAREN", "STRING", 
			"ID", "NUM", "WS"
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
	public String getGrammarFileName() { return "Lexspec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexspecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GoalContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expr(0);
			 System.out.println("g->e");
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LexspecParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LexspecParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).exitExpr(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(12);
			term(0);
			 System.out.println("e->t");
			}
			_ctx.stop = _input.LT(-1);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(25);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(15);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(16);
						match(PLUS);
						setState(17);
						term(0);
						 System.out.println("e->e+t");
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(20);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(21);
						match(MINUS);
						setState(22);
						term(0);
						 System.out.println("e->e-t");
						}
						break;
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(LexspecParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(LexspecParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(31);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(34);
						match(TIMES);
						setState(35);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(36);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(37);
						match(DIV);
						setState(38);
						factor();
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LexspecParser.ID, 0); }
		public TerminalNode NUM() { return getToken(LexspecParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(LexspecParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(LexspecParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LexspecParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexspecListener ) ((LexspecListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(NUM);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(LPAREN);
				setState(48);
				expr(0);
				setState(49);
				match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 2:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001"+
		"\u001d\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002"+
		"\n\u0002\f\u0002+\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0003"+
		"\u0000\u0002\u0002\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u00008\u0000"+
		"\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000\u0004\u001e"+
		"\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b\t\u0003\u0002"+
		"\u0001\u0000\t\n\u0006\u0000\uffff\uffff\u0000\n\u0001\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0006\u0001\uffff\uffff\u0000\f\r\u0003\u0004\u0002\u0000"+
		"\r\u000e\u0006\u0001\uffff\uffff\u0000\u000e\u001b\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\n\u0003\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011"+
		"\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0006\u0001\uffff\uffff\u0000"+
		"\u0013\u001a\u0001\u0000\u0000\u0000\u0014\u0015\n\u0002\u0000\u0000\u0015"+
		"\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017"+
		"\u0018\u0006\u0001\uffff\uffff\u0000\u0018\u001a\u0001\u0000\u0000\u0000"+
		"\u0019\u000f\u0001\u0000\u0000\u0000\u0019\u0014\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0002\uffff\uffff"+
		"\u0000\u001f \u0003\u0006\u0003\u0000 )\u0001\u0000\u0000\u0000!\"\n\u0003"+
		"\u0000\u0000\"#\u0005\u0003\u0000\u0000#(\u0003\u0006\u0003\u0000$%\n"+
		"\u0002\u0000\u0000%&\u0005\u0004\u0000\u0000&(\u0003\u0006\u0003\u0000"+
		"\'!\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0005\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,4\u0005\b\u0000\u0000-4\u0005"+
		"\t\u0000\u0000.4\u0005\u0007\u0000\u0000/0\u0005\u0005\u0000\u000001\u0003"+
		"\u0002\u0001\u000012\u0005\u0006\u0000\u000024\u0001\u0000\u0000\u0000"+
		"3,\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000\u0000"+
		"\u00003/\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u0000\u0005"+
		"\u0019\u001b\')3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}