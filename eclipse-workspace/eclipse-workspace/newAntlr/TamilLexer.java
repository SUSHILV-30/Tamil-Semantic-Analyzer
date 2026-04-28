// Generated from Hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TamilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Noun=1, Verb=2, Determiner=3, Modifier=4, CaseSuffix=5, TenseSuffix=6, 
		MoodSuffix=7, HonorificSuffix=8, SENT_END=9, TAMIL_SYLLABLE=10, TAMIL_WORD=11, 
		TAMIL_SUFFIX=12, TAMIL_NUMBER=13, PUNCT=14, NEWLINE=15, WS=16, OTHER=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Noun", "Verb", "Determiner", "Modifier", "CaseSuffix", "TenseSuffix", 
			"MoodSuffix", "HonorificSuffix", "SENT_END", "TAMIL_INDVOWEL", "TAMIL_CONSONANT", 
			"TAMIL_VOWEL_SIGN", "TAMIL_PULLI", "TAMIL_DIGIT", "TAMIL_EXTENDED", "TAMIL_SYLLABLE", 
			"TAMIL_WORD", "TAMIL_SUFFIX", "TAMIL_NUMBER", "PUNCT", "NEWLINE", "WS", 
			"OTHER"
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


	public TamilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17:
			TAMIL_SUFFIX_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TAMIL_SUFFIX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			1,6
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000fR\b\u000f"+
		"\u0003\u000fT\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0004\u0010Z\b\u0010\u000b\u0010\f\u0010[\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004"+
		"\u0012f\b\u0012\u000b\u0012\f\u0012g\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0003\u0014m\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015"+
		"r\b\u0015\u000b\u0015\f\u0015s\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000\u0017"+
		"\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\n!\u000b#\f%\r\'\u000e"+
		")\u000f+\u0010-\u0011\u0001\u0000\b\u0003\u0000!!..??\u0001\u0000\u0b85"+
		"\u0b94\u0001\u0000\u0b95\u0bb9\u0001\u0000\u0bbe\u0bcc\u0001\u0000\u0be6"+
		"\u0bef\u0001\u0000\u0bf0\u0bff\u0003\u0000,,:;\u0bfa\u0bfa\u0003\u0000"+
		"\t\t  \u00a0\u00a0~\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005"+
		"3\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000"+
		"\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A"+
		"\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017E\u0001\u0000"+
		"\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bI\u0001\u0000\u0000\u0000"+
		"\u001dK\u0001\u0000\u0000\u0000\u001fS\u0001\u0000\u0000\u0000!Y\u0001"+
		"\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000\u0000"+
		"\'i\u0001\u0000\u0000\u0000)l\u0001\u0000\u0000\u0000+q\u0001\u0000\u0000"+
		"\u0000-w\u0001\u0000\u0000\u0000/0\u0003!\u0010\u00000\u0002\u0001\u0000"+
		"\u0000\u000012\u0003!\u0010\u00002\u0004\u0001\u0000\u0000\u000034\u0003"+
		"!\u0010\u00004\u0006\u0001\u0000\u0000\u000056\u0003!\u0010\u00006\b\u0001"+
		"\u0000\u0000\u000078\u0003#\u0011\u00008\n\u0001\u0000\u0000\u00009:\u0003"+
		"#\u0011\u0000:\f\u0001\u0000\u0000\u0000;<\u0003#\u0011\u0000<\u000e\u0001"+
		"\u0000\u0000\u0000=>\u0003#\u0011\u0000>\u0010\u0001\u0000\u0000\u0000"+
		"?@\u0007\u0000\u0000\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0007\u0001"+
		"\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0007\u0002\u0000\u0000"+
		"D\u0016\u0001\u0000\u0000\u0000EF\u0007\u0003\u0000\u0000F\u0018\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0bcd\u0000\u0000H\u001a\u0001\u0000\u0000"+
		"\u0000IJ\u0007\u0004\u0000\u0000J\u001c\u0001\u0000\u0000\u0000KL\u0007"+
		"\u0005\u0000\u0000L\u001e\u0001\u0000\u0000\u0000MT\u0003\u0013\t\u0000"+
		"NQ\u0003\u0015\n\u0000OR\u0003\u0017\u000b\u0000PR\u0003\u0019\f\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000SN\u0001\u0000"+
		"\u0000\u0000T \u0001\u0000\u0000\u0000UZ\u0003\u0013\t\u0000VZ\u0003\u0015"+
		"\n\u0000WZ\u0003\u0017\u000b\u0000XZ\u0003\u0019\f\u0000YU\u0001\u0000"+
		"\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\"\u0001\u0000\u0000\u0000]a\u0003\u0017"+
		"\u000b\u0000^a\u0003\u0019\f\u0000_a\u0003\u001d\u000e\u0000`]\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0006\u0011\u0000\u0000c$\u0001\u0000\u0000\u0000"+
		"df\u0003\u001b\r\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h&\u0001\u0000\u0000"+
		"\u0000ij\u0007\u0006\u0000\u0000j(\u0001\u0000\u0000\u0000km\u0005\r\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0005\n\u0000\u0000o*\u0001\u0000\u0000\u0000pr\u0007\u0007"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0006\u0015\u0001\u0000v,\u0001\u0000\u0000\u0000wx\t\u0000\u0000\u0000"+
		"x.\u0001\u0000\u0000\u0000\t\u0000QSY[`gls\u0002\u0001\u0011\u0000\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}