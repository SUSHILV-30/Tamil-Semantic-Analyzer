// Generated from Tamil.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TamilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOUN=1, QUESTION_WORD=2, LINK_WORD=3, POSTPOSITION=4, ADJ=5, ADV=6, 
		NEG_SUFFIX=7, TENSE_SUFFIX=8, TAMIL_WORD=9, TAMIL_NUMBER=10, NUMBER=11, 
		QUESTION_MARK=12, PUNCT=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"PRONOUN", "QUESTION_WORD", "LINK_WORD", "POSTPOSITION", "ADJ", "ADV", 
		"NEG_SUFFIX", "TENSE_SUFFIX", "TAMIL_WORD", "TAMIL_NUMBER", "NUMBER", 
		"QUESTION_MARK", "PUNCT", "WS"
	};


	public TamilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tamil.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00e0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\64\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4f\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5v\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0085\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\3\n\6\n\u00c8\n\n\r\n\16"+
		"\n\u00c9\3\13\6\13\u00cd\n\13\r\13\16\13\u00ce\3\f\6\f\u00d2\n\f\r\f\16"+
		"\f\u00d3\3\r\3\r\3\16\3\16\3\17\6\17\u00db\n\17\r\17\16\17\u00dc\3\17"+
		"\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\3\2\7\3\2\u0b82\u0c01\3\2\u0be8\u0bf1\3\2\62;\6\2##..\60"+
		"\60<=\5\2\13\f\17\17\"\"\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3"+
		"\63\3\2\2\2\5J\3\2\2\2\7e\3\2\2\2\tu\3\2\2\2\13\u0084\3\2\2\2\r\u0090"+
		"\3\2\2\2\17\u00a1\3\2\2\2\21\u00c4\3\2\2\2\23\u00c7\3\2\2\2\25\u00cc\3"+
		"\2\2\2\27\u00d1\3\2\2\2\31\u00d5\3\2\2\2\33\u00d7\3\2\2\2\35\u00da\3\2"+
		"\2\2\37 \7\u0baa\2\2 !\7\u0bc0\2\2!\64\7\\\2\2\"#\7\u0baa\2\2#\64\7]\2"+
		"\2$%\7\u0baa\2\2%&\7]\2\2&\'\7\u0b97\2\2\'\64\7_\2\2()\7\u0b87\2\2)*\7"+
		"\u0bb7\2\2*\64\7\\\2\2+,\7\u0b87\2\2,-\7\u0bb7\2\2-\64\7_\2\2./\7\u0b87"+
		"\2\2/\60\7\u0bb7\2\2\60\61\7]\2\2\61\62\7\u0b97\2\2\62\64\7_\2\2\63\37"+
		"\3\2\2\2\63\"\3\2\2\2\63$\3\2\2\2\63(\3\2\2\2\63+\3\2\2\2\63.\3\2\2\2"+
		"\64\4\3\2\2\2\65\66\7\u0b90\2\2\66\67\7a\2\2\67K\7\u0ba6\2\289\7\u0b90"+
		"\2\29K\7b\2\2:;\7\u0b90\2\2;<\7]\2\2<=\7\u0b97\2\2=K\7_\2\2>?\7\u0b90"+
		"\2\2?@\7c\2\2@A\7\u0bac\2\2AK\7d\2\2BC\7\u0b91\2\2CK\7\\\2\2DE\7\u0b90"+
		"\2\2EF\7c\2\2FG\7\u0bc9\2\2GH\7\u0bac\2\2HI\7\u0bc0\2\2IK\7b\2\2J\65\3"+
		"\2\2\2J8\3\2\2\2J:\3\2\2\2J>\3\2\2\2JB\3\2\2\2JD\3\2\2\2K\6\3\2\2\2LM"+
		"\7\u0b88\2\2MN\7\u0bab\2\2NO\7\u0bc0\2\2Of\7e\2\2PQ\7\u0b88\2\2QR\7\u0b97"+
		"\2\2RS\7\u0bc9\2\2Sf\7\u0bb7\2\2TU\7\u0b90\2\2UV\7\u0bab\2\2VW\7f\2\2"+
		"WX\7g\2\2Xf\7h\2\2YZ\7\u0b87\2\2Z[\7\u0ba6\2\2[\\\7\u0bab\2\2\\]\7\u0bc0"+
		"\2\2]f\7e\2\2^_\7\u0bac\2\2_`\7i\2\2`a\7\\\2\2ab\7\u0bab\2\2bc\7]\2\2"+
		"cd\7\u0b97\2\2df\7_\2\2eL\3\2\2\2eP\3\2\2\2eT\3\2\2\2eY\3\2\2\2e^\3\2"+
		"\2\2f\b\3\2\2\2gh\7\u0b8b\2\2hi\7]\2\2ij\7\u0bc9\2\2jk\7\u0bb5\2\2kv\7"+
		"_\2\2lm\7\u0bb0\2\2mn\7j\2\2nv\7b\2\2op\7k\2\2pv\7\\\2\2qr\7l\2\2rv\7"+
		"m\2\2st\7\u0b89\2\2tv\7e\2\2ug\3\2\2\2ul\3\2\2\2uo\3\2\2\2uq\3\2\2\2u"+
		"s\3\2\2\2v\n\3\2\2\2wx\7\u0b87\2\2xy\7\u0bb6\2\2yz\7\u0b97\2\2z{\7\u0bc0"+
		"\2\2{\u0085\7\u0bab\2\2|}\7n\2\2}~\7\u0ba6\2\2~\177\7\u0bc1\2\2\177\u0085"+
		"\7\u0bb1\2\2\u0080\u0081\7\u0bac\2\2\u0081\u0082\7\u0bca\2\2\u0082\u0083"+
		"\7\u0bb6\2\2\u0083\u0085\7\u0bb1\2\2\u0084w\3\2\2\2\u0084|\3\2\2\2\u0084"+
		"\u0080\3\2\2\2\u0085\f\3\2\2\2\u0086\u0087\7\u0bc9\2\2\u0087\u0088\7\u0bb7"+
		"\2\2\u0088\u0089\7\u0b97\2\2\u0089\u008a\7\u0bb0\2\2\u008a\u008b\7\u0bc0"+
		"\2\2\u008b\u0091\7\u0b97\2\2\u008c\u008d\7\u0bc8\2\2\u008d\u008e\7\u0bb0"+
		"\2\2\u008e\u008f\7e\2\2\u008f\u0091\7\u0bb4\2\2\u0090\u0086\3\2\2\2\u0090"+
		"\u008c\3\2\2\2\u0091\16\3\2\2\2\u0092\u0093\7\u0b89\2\2\u0093\u0094\7"+
		"e\2\2\u0094\u00a2\7\u0bb4\2\2\u0095\u0096\7\u0bb7\2\2\u0096\u0097\7i\2"+
		"\2\u0097\u0098\7e\2\2\u0098\u0099\7\u0bca\2\2\u0099\u00a2\7\u0bb4\2\2"+
		"\u009a\u009b\7\u0bc8\2\2\u009b\u009c\7\u0b9c\2\2\u009c\u009d\7o\2\2\u009d"+
		"\u009e\7\u0bb1\2\2\u009e\u009f\7\u0bc0\2\2\u009f\u00a0\7\u0bc9\2\2\u00a0"+
		"\u00a2\7\u0ba6\2\2\u00a1\u0092\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u009a"+
		"\3\2\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7\u0bb7\2\2\u00a4\u00a5\7a\2\2\u00a5"+
		"\u00a6\7\u0ba6\2\2\u00a6\u00a7\7\u0bc0\2\2\u00a7\u00c5\7\\\2\2\u00a8\u00a9"+
		"\7\u0bb7\2\2\u00a9\u00aa\7a\2\2\u00aa\u00ab\7\u0ba6\2\2\u00ab\u00ac\7"+
		"\u0bc0\2\2\u00ac\u00c5\7_\2\2\u00ad\u00ae\7\u0bb7\2\2\u00ae\u00af\7a\2"+
		"\2\u00af\u00b0\7\u0ba6\2\2\u00b0\u00b1\7\u0bc0\2\2\u00b1\u00b2\7]\2\2"+
		"\u00b2\u00b3\7\u0b97\2\2\u00b3\u00c5\7_\2\2\u00b4\u00b5\7\u0bac\2\2\u00b5"+
		"\u00b6\7d\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7\u0ba6\2\2\u00b8\u00b9\7"+
		"\u0bc0\2\2\u00b9\u00c5\7\\\2\2\u00ba\u00bb\7\u0bac\2\2\u00bb\u00bc\7d"+
		"\2\2\u00bc\u00bd\7l\2\2\u00bd\u00be\7\u0b97\2\2\u00be\u00bf\7\u0bc1\2"+
		"\2\u00bf\u00c0\7\u0bb3\2\2\u00c0\u00c1\7\u0bc0\2\2\u00c1\u00c2\7]\2\2"+
		"\u00c2\u00c3\7\u0b97\2\2\u00c3\u00c5\7_\2\2\u00c4\u00a3\3\2\2\2\u00c4"+
		"\u00a8\3\2\2\2\u00c4\u00ad\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00ba\3\2"+
		"\2\2\u00c5\22\3\2\2\2\u00c6\u00c8\t\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\24\3\2\2\2\u00cb"+
		"\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\26\3\2\2\2\u00d0\u00d2\t\4\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\30\3\2\2\2\u00d5\u00d6\7A\2\2\u00d6\32\3\2\2\2\u00d7\u00d8\t\5\2\2\u00d8"+
		"\34\3\2\2\2\u00d9\u00db\t\6\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\b\17\2\2\u00df\36\3\2\2\2\17\2\63Jeu\u0084\u0090\u00a1\u00c4\u00c9\u00ce"+
		"\u00d3\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}