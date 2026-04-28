// Generated from hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class helloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, WS=8;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_term = 2, RULE_factor = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "term", "factor"
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
			null, null, null, null, null, null, null, "NUM", "WS"
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
	public String getGrammarFileName() { return "hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public helloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public int value;
		public ExprContext e;
		public TerminalNode EOF() { return getToken(helloParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((StartContext)_localctx).e = expr(0);
			setState(9);
			match(EOF);

			        System.out.println("Result = " + ((StartContext)_localctx).e.value);
			      
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
		public int value;
		public ExprContext e1;
		public TermContext t;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitExpr(this);
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
			setState(13);
			((ExprContext)_localctx).t = term(0);
			 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).t.value; 
			}
			_ctx.stop = _input.LT(-1);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(26);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(16);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(17);
						match(T__0);
						setState(18);
						((ExprContext)_localctx).t = term(0);
						 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).e1.value + ((ExprContext)_localctx).t.value; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(21);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(22);
						match(T__1);
						setState(23);
						((ExprContext)_localctx).t = term(0);
						 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).e1.value - ((ExprContext)_localctx).t.value; 
						}
						break;
					}
					} 
				}
				setState(30);
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
		public int value;
		public TermContext t1;
		public FactorContext f;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitTerm(this);
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
			setState(32);
			((TermContext)_localctx).f = factor();
			 ((TermContext)_localctx).value =  ((TermContext)_localctx).f.value; 
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						match(T__2);
						setState(37);
						((TermContext)_localctx).f = factor();
						 ((TermContext)_localctx).value =  ((TermContext)_localctx).t1.value * ((TermContext)_localctx).f.value; 
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.t1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41);
						match(T__3);
						setState(42);
						((TermContext)_localctx).f = factor();
						 ((TermContext)_localctx).value =  ((TermContext)_localctx).t1.value / ((TermContext)_localctx).f.value; 
						}
						break;
					}
					} 
				}
				setState(49);
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
		public int value;
		public ExprContext e;
		public Token NUM;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(helloParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof helloListener ) ((helloListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_factor);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__4);
				setState(51);
				((FactorContext)_localctx).e = expr(0);
				setState(52);
				match(T__5);
				 ((FactorContext)_localctx).value =  ((FactorContext)_localctx).e.value; 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((FactorContext)_localctx).NUM = match(NUM);
				 ((FactorContext)_localctx).value =  Integer.parseInt((((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null)); 
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
		"\u0004\u0001\b<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n"+
		"\u0001\f\u0001\u001e\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b"+
		"\u0002\n\u0002\f\u00021\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001"+
		"\u0003\u0000\u0002\u0002\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u0000"+
		"<\u0000\b\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004"+
		"\u001f\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b\t\u0003"+
		"\u0002\u0001\u0000\t\n\u0005\u0000\u0000\u0001\n\u000b\u0006\u0000\uffff"+
		"\uffff\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\r\u0006\u0001\uffff"+
		"\uffff\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u000f\u0006\u0001\uffff"+
		"\uffff\u0000\u000f\u001c\u0001\u0000\u0000\u0000\u0010\u0011\n\u0003\u0000"+
		"\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0013\u0003\u0004\u0002"+
		"\u0000\u0013\u0014\u0006\u0001\uffff\uffff\u0000\u0014\u001b\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\n\u0002\u0000\u0000\u0016\u0017\u0005\u0002\u0000"+
		"\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0006\u0001\uffff"+
		"\uffff\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0010\u0001\u0000"+
		"\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001f \u0006\u0002\uffff\uffff\u0000 !\u0003\u0006\u0003"+
		"\u0000!\"\u0006\u0002\uffff\uffff\u0000\"/\u0001\u0000\u0000\u0000#$\n"+
		"\u0003\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0003\u0006\u0003\u0000"+
		"&\'\u0006\u0002\uffff\uffff\u0000\'.\u0001\u0000\u0000\u0000()\n\u0002"+
		"\u0000\u0000)*\u0005\u0004\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0006"+
		"\u0002\uffff\uffff\u0000,.\u0001\u0000\u0000\u0000-#\u0001\u0000\u0000"+
		"\u0000-(\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0003\u0002\u0001"+
		"\u000045\u0005\u0006\u0000\u000056\u0006\u0003\uffff\uffff\u00006:\u0001"+
		"\u0000\u0000\u000078\u0005\u0007\u0000\u00008:\u0006\u0003\uffff\uffff"+
		"\u000092\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:\u0007\u0001"+
		"\u0000\u0000\u0000\u0005\u001a\u001c-/9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}