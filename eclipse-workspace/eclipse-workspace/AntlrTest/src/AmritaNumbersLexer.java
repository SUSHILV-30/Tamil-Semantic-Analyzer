// Generated from AmritaNumbersLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AmritaNumbersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAMIL_INDEPENDENT_VOWEL=1, TAMIL_CONSONANT_ONLY=2, TAMIL_VOWEL_MARK=3, 
		TAMIL_PULLI_MARK=4, TAMIL_SYLLABLE=5, TAMIL_NUMBER=6, TAMIL_WORD=7, WS=8, 
		TAMIL_PUNCT=9, OTHER=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAMIL_INDVOWEL", "TAMIL_CONSONANT", "TAMIL_VOWEL_SIGN", "TAMIL_PULLI", 
			"TAMIL_DIGIT", "TAMIL_INDEPENDENT_VOWEL", "TAMIL_CONSONANT_ONLY", "TAMIL_VOWEL_MARK", 
			"TAMIL_PULLI_MARK", "TAMIL_SYLLABLE", "TAMIL_NUMBER", "TAMIL_WORD", "WS", 
			"TAMIL_PUNCT", "OTHER"
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
			null, "TAMIL_INDEPENDENT_VOWEL", "TAMIL_CONSONANT_ONLY", "TAMIL_VOWEL_MARK", 
			"TAMIL_PULLI_MARK", "TAMIL_SYLLABLE", "TAMIL_NUMBER", "TAMIL_WORD", "WS", 
			"TAMIL_PUNCT", "OTHER"
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


	public AmritaNumbersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AmritaNumbersLexer.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\nQ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t6\b\t\u0003\t8\b\t\u0001\n\u0004\n;\b\n\u000b"+
		"\n\f\n<\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000bC\b"+
		"\u000b\u000b\u000b\f\u000bD\u0001\f\u0004\fH\b\f\u000b\f\f\fI\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0000\u0003\u0000\u0005\u0000\u0007\u0000\t\u0000\u000b\u0001\r\u0002"+
		"\u000f\u0003\u0011\u0004\u0013\u0005\u0015\u0006\u0017\u0007\u0019\b\u001b"+
		"\t\u001d\n\u0001\u0000\u0006\u0001\u0000\u0b85\u0b94\u0001\u0000\u0b95"+
		"\u0bb9\u0001\u0000\u0bbe\u0bcc\u0001\u0000\u0be6\u0bef\u0003\u0000\t\n"+
		"\r\r  \u0001\u0000\u0bf0\u0bffT\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001"+
		"\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007%\u0001\u0000\u0000"+
		"\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000\r+\u0001"+
		"\u0000\u0000\u0000\u000f-\u0001\u0000\u0000\u0000\u0011/\u0001\u0000\u0000"+
		"\u0000\u00137\u0001\u0000\u0000\u0000\u0015:\u0001\u0000\u0000\u0000\u0017"+
		"B\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bM\u0001"+
		"\u0000\u0000\u0000\u001dO\u0001\u0000\u0000\u0000\u001f \u0007\u0000\u0000"+
		"\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0007\u0001\u0000\u0000\"\u0004"+
		"\u0001\u0000\u0000\u0000#$\u0007\u0002\u0000\u0000$\u0006\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0bcd\u0000\u0000&\b\u0001\u0000\u0000\u0000\'(\u0007"+
		"\u0003\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0003\u0001\u0000\u0000"+
		"*\f\u0001\u0000\u0000\u0000+,\u0003\u0003\u0001\u0000,\u000e\u0001\u0000"+
		"\u0000\u0000-.\u0003\u0005\u0002\u0000.\u0010\u0001\u0000\u0000\u0000"+
		"/0\u0003\u0007\u0003\u00000\u0012\u0001\u0000\u0000\u000018\u0003\u0001"+
		"\u0000\u000025\u0003\u0003\u0001\u000036\u0003\u0005\u0002\u000046\u0003"+
		"\u0007\u0003\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000071\u0001\u0000\u0000"+
		"\u000072\u0001\u0000\u0000\u00008\u0014\u0001\u0000\u0000\u00009;\u0003"+
		"\t\u0004\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0016\u0001\u0000\u0000"+
		"\u0000>C\u0003\u0001\u0000\u0000?C\u0003\u0003\u0001\u0000@C\u0003\u0005"+
		"\u0002\u0000AC\u0003\u0007\u0003\u0000B>\u0001\u0000\u0000\u0000B?\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0018\u0001\u0000\u0000\u0000FH\u0007\u0004\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0006\f\u0000\u0000"+
		"L\u001a\u0001\u0000\u0000\u0000MN\u0007\u0005\u0000\u0000N\u001c\u0001"+
		"\u0000\u0000\u0000OP\t\u0000\u0000\u0000P\u001e\u0001\u0000\u0000\u0000"+
		"\u0007\u000057<BDI\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}