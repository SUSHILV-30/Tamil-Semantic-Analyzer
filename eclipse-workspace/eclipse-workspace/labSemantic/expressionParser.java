// Generated from expression.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class expressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, NUM=8, WS=9;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_exprP = 2, RULE_term = 3, RULE_termP = 4, 
		RULE_fact = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "exprP", "term", "termP", "fact"
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
			null, null, null, null, null, null, null, "ID", "NUM", "WS"
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
	public String getGrammarFileName() { return "expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public expressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(expressionParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((StartContext)_localctx).expr = expr();
			setState(13);
			match(EOF);
			 System.out.println(((StartContext)_localctx).expr.val); 
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
		public int val;
		public TermContext term;
		public ExprPContext exprP;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPContext exprP() {
			return getRuleContext(ExprPContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((ExprContext)_localctx).term = term();
			setState(17);
			((ExprContext)_localctx).exprP = exprP(((ExprContext)_localctx).term.val);
			 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).exprP.val; 
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
	public static class ExprPContext extends ParserRuleContext {
		public int i;
		public int val;
		public TermContext term;
		public ExprPContext e;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPContext exprP() {
			return getRuleContext(ExprPContext.class,0);
		}
		public ExprPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprPContext(ParserRuleContext parent, int invokingState, int i) {
			super(parent, invokingState);
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_exprP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterExprP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitExprP(this);
		}
	}

	public final ExprPContext exprP(int i) throws RecognitionException {
		ExprPContext _localctx = new ExprPContext(_ctx, getState(), i);
		enterRule(_localctx, 4, RULE_exprP);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				 ((ExprPContext)_localctx).val =  _localctx.i; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__0);
				setState(22);
				((ExprPContext)_localctx).term = term();
				setState(23);
				((ExprPContext)_localctx).e = exprP(_localctx.i + ((ExprPContext)_localctx).term.val);
				 ((ExprPContext)_localctx).val =  ((ExprPContext)_localctx).e.val; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(T__1);
				setState(27);
				((ExprPContext)_localctx).term = term();
				setState(28);
				((ExprPContext)_localctx).e = exprP(_localctx.i - ((ExprPContext)_localctx).term.val);
				 ((ExprPContext)_localctx).val =  ((ExprPContext)_localctx).e.val; 
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
	public static class TermContext extends ParserRuleContext {
		public int val;
		public FactContext fact;
		public TermPContext termP;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermPContext termP() {
			return getRuleContext(TermPContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((TermContext)_localctx).fact = fact();
			setState(34);
			((TermContext)_localctx).termP = termP(((TermContext)_localctx).fact.val);
			 ((TermContext)_localctx).val =  ((TermContext)_localctx).termP.val; 
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
	public static class TermPContext extends ParserRuleContext {
		public int i;
		public int val;
		public FactContext fact;
		public TermPContext e;
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermPContext termP() {
			return getRuleContext(TermPContext.class,0);
		}
		public TermPContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermPContext(ParserRuleContext parent, int invokingState, int i) {
			super(parent, invokingState);
			this.i = i;
		}
		@Override public int getRuleIndex() { return RULE_termP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterTermP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitTermP(this);
		}
	}

	public final TermPContext termP(int i) throws RecognitionException {
		TermPContext _localctx = new TermPContext(_ctx, getState(), i);
		enterRule(_localctx, 8, RULE_termP);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				 ((TermPContext)_localctx).val =  _localctx.i; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__2);
				setState(39);
				((TermPContext)_localctx).fact = fact();
				setState(40);
				((TermPContext)_localctx).e = termP(_localctx.i * ((TermPContext)_localctx).fact.val);
				 ((TermPContext)_localctx).val =  ((TermPContext)_localctx).e.val; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__3);
				setState(44);
				((TermPContext)_localctx).fact = fact();
				setState(45);
				((TermPContext)_localctx).e = termP(_localctx.i / ((TermPContext)_localctx).fact.val);
				 ((TermPContext)_localctx).val =  ((TermPContext)_localctx).e.val; 
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
	public static class FactContext extends ParserRuleContext {
		public int val;
		public ExprContext expr;
		public Token NUM;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(expressionParser.NUM, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fact);
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
				((FactContext)_localctx).expr = expr();
				setState(52);
				match(T__5);
				 ((FactContext)_localctx).val =  ((FactContext)_localctx).expr.val; 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((FactContext)_localctx).NUM = match(NUM);
				 ((FactContext)_localctx).val =  Integer.parseInt((((FactContext)_localctx).NUM!=null?((FactContext)_localctx).NUM.getText():null)); 
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

	public static final String _serializedATN =
		"\u0004\u0001\t<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u00041\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0000:\u0000\f\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000"+
		"\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000"+
		"\b0\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f\r\u0003\u0002"+
		"\u0001\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u000f\u0006\u0000\uffff"+
		"\uffff\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0006"+
		"\u0003\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0006\u0001"+
		"\uffff\uffff\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014 \u0006\u0002"+
		"\uffff\uffff\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0017\u0003"+
		"\u0006\u0003\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0006"+
		"\u0002\uffff\uffff\u0000\u0019 \u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0002\u0000\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c\u001d\u0003"+
		"\u0004\u0002\u0000\u001d\u001e\u0006\u0002\uffff\uffff\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f\u0014\u0001\u0000\u0000\u0000\u001f\u0015\u0001"+
		"\u0000\u0000\u0000\u001f\u001a\u0001\u0000\u0000\u0000 \u0005\u0001\u0000"+
		"\u0000\u0000!\"\u0003\n\u0005\u0000\"#\u0003\b\u0004\u0000#$\u0006\u0003"+
		"\uffff\uffff\u0000$\u0007\u0001\u0000\u0000\u0000%1\u0006\u0004\uffff"+
		"\uffff\u0000&\'\u0005\u0003\u0000\u0000\'(\u0003\n\u0005\u0000()\u0003"+
		"\b\u0004\u0000)*\u0006\u0004\uffff\uffff\u0000*1\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0004\u0000\u0000,-\u0003\n\u0005\u0000-.\u0003\b\u0004\u0000"+
		"./\u0006\u0004\uffff\uffff\u0000/1\u0001\u0000\u0000\u00000%\u0001\u0000"+
		"\u0000\u00000&\u0001\u0000\u0000\u00000+\u0001\u0000\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0003\u0002\u0001\u0000"+
		"45\u0005\u0006\u0000\u000056\u0006\u0005\uffff\uffff\u00006:\u0001\u0000"+
		"\u0000\u000078\u0005\b\u0000\u00008:\u0006\u0005\uffff\uffff\u000092\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000"+
		"\u0000\u0003\u001f09";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}