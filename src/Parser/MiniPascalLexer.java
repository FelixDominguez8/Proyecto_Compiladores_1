// Generated from C:/Users/Alberth/OneDrive - Universidad Tecnologica Centroamericana/Documents/Unitec/2024/III Trimestre/Compiladores_1/proyecto/proyecto_compi/Proyecto_Compiladores_1/src/MiniPascal.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniPascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, FUNCTION=2, LENGTH=3, PROCEDURE=4, BEGIN=5, END=6, CONST=7, 
		VAR=8, ARRAY=9, TO=10, CHAR=11, BOOLEAN=12, INTEGER=13, OF=14, STRING=15, 
		IF=16, ELSE=17, ELIF=18, DO=19, FOR=20, DOWNTO=21, REPEAT=22, THEN=23, 
		UNTIL=24, WHILE=25, PLUS=26, MINUS=27, MULTIPLY=28, DIVIDE=29, MOD=30, 
		DIV=31, AND=32, NOT=33, OR=34, TRUE=35, FALSE=36, EQUAL=37, NOTEQUAL=38, 
		LESSTHEN=39, LESSEQUAL=40, GREATEQUAL=41, GREATTHEN=42, ASSIGN=43, COMMA=44, 
		SEMICOLON=45, COLON=46, PARL=47, PARR=48, LBRACKET=49, LBRACKETP=50, RBRACKET=51, 
		RBRACKETP=52, DOT=53, DOT2=54, SPACE=55, COMMENT=56, LSTRING=57, NUM=58, 
		IDENTIFIER=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "FUNCTION", "LENGTH", "PROCEDURE", "BEGIN", "END", "CONST", 
			"VAR", "ARRAY", "TO", "CHAR", "BOOLEAN", "INTEGER", "OF", "STRING", "IF", 
			"ELSE", "ELIF", "DO", "FOR", "DOWNTO", "REPEAT", "THEN", "UNTIL", "WHILE", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "DIV", "AND", "NOT", "OR", 
			"TRUE", "FALSE", "EQUAL", "NOTEQUAL", "LESSTHEN", "LESSEQUAL", "GREATEQUAL", 
			"GREATTHEN", "ASSIGN", "COMMA", "SEMICOLON", "COLON", "PARL", "PARR", 
			"LBRACKET", "LBRACKETP", "RBRACKET", "RBRACKETP", "DOT", "DOT2", "SPACE", 
			"COMMENT", "LSTRING", "NUM", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'function'", "'length'", "'procedure'", "'begin'", 
			"'end'", "'const'", "'var'", "'array'", "'to'", "'char'", "'boolean'", 
			"'integer'", "'of'", "'string'", "'if'", "'else'", "'else if'", "'do'", 
			"'for'", "'downto'", "'repeat'", "'then'", "'until'", "'while'", "'+'", 
			"'-'", "'*'", "'/'", "'mod'", "'div'", "'and'", "'not'", "'or'", "'true'", 
			"'false'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "':='", "','", 
			"';'", "':'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "FUNCTION", "LENGTH", "PROCEDURE", "BEGIN", "END", "CONST", 
			"VAR", "ARRAY", "TO", "CHAR", "BOOLEAN", "INTEGER", "OF", "STRING", "IF", 
			"ELSE", "ELIF", "DO", "FOR", "DOWNTO", "REPEAT", "THEN", "UNTIL", "WHILE", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "DIV", "AND", "NOT", "OR", 
			"TRUE", "FALSE", "EQUAL", "NOTEQUAL", "LESSTHEN", "LESSEQUAL", "GREATEQUAL", 
			"GREATTHEN", "ASSIGN", "COMMA", "SEMICOLON", "COLON", "PARL", "PARR", 
			"LBRACKET", "LBRACKETP", "RBRACKET", "RBRACKETP", "DOT", "DOT2", "SPACE", 
			"COMMENT", "LSTRING", "NUM", "IDENTIFIER"
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


	public MiniPascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

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
		"\u0004\u0000;\u0182\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00013\u00014\u00014\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00057\u0163\b7\n7\f7\u0166\t7\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00018\u00058\u0170\b8\n8\f8\u0173"+
		"\t8\u00018\u00018\u00019\u00049\u0178\b9\u000b9\f9\u0179\u0001:\u0001"+
		":\u0005:\u017e\b:\n:\f:\u0181\t:\u0001\u0164\u0000;\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/"+
		"_0a1c2e3g4i5k6m7o8q9s:u;\u0001\u0000\u0019\u0002\u0000PPpp\u0002\u0000"+
		"RRrr\u0002\u0000OOoo\u0002\u0000GGgg\u0002\u0000AAaa\u0002\u0000MMmm\u0002"+
		"\u0000FFff\u0002\u0000UUuu\u0002\u0000NNnn\u0002\u0000CCcc\u0002\u0000"+
		"TTtt\u0002\u0000IIii\u0002\u0000LLll\u0002\u0000EEee\u0002\u0000HHhh\u0002"+
		"\u0000DDdd\u0002\u0000BBbb\u0002\u0000SSss\u0002\u0000VVvv\u0002\u0000"+
		"YYyy\u0002\u0000WWww\u0003\u0000\t\n\r\r  \u0001\u0000\'\'\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u0186\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e"+
		"\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000"+
		"\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000"+
		"\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s"+
		"\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0001w\u0001\u0000"+
		"\u0000\u0000\u0003\u007f\u0001\u0000\u0000\u0000\u0005\u0088\u0001\u0000"+
		"\u0000\u0000\u0007\u008f\u0001\u0000\u0000\u0000\t\u0099\u0001\u0000\u0000"+
		"\u0000\u000b\u009f\u0001\u0000\u0000\u0000\r\u00a3\u0001\u0000\u0000\u0000"+
		"\u000f\u00a9\u0001\u0000\u0000\u0000\u0011\u00ad\u0001\u0000\u0000\u0000"+
		"\u0013\u00b3\u0001\u0000\u0000\u0000\u0015\u00b6\u0001\u0000\u0000\u0000"+
		"\u0017\u00bb\u0001\u0000\u0000\u0000\u0019\u00c3\u0001\u0000\u0000\u0000"+
		"\u001b\u00cb\u0001\u0000\u0000\u0000\u001d\u00ce\u0001\u0000\u0000\u0000"+
		"\u001f\u00d5\u0001\u0000\u0000\u0000!\u00d8\u0001\u0000\u0000\u0000#\u00dd"+
		"\u0001\u0000\u0000\u0000%\u00e5\u0001\u0000\u0000\u0000\'\u00e8\u0001"+
		"\u0000\u0000\u0000)\u00ec\u0001\u0000\u0000\u0000+\u00f3\u0001\u0000\u0000"+
		"\u0000-\u00fa\u0001\u0000\u0000\u0000/\u00ff\u0001\u0000\u0000\u00001"+
		"\u0105\u0001\u0000\u0000\u00003\u010b\u0001\u0000\u0000\u00005\u010d\u0001"+
		"\u0000\u0000\u00007\u010f\u0001\u0000\u0000\u00009\u0111\u0001\u0000\u0000"+
		"\u0000;\u0113\u0001\u0000\u0000\u0000=\u0117\u0001\u0000\u0000\u0000?"+
		"\u011b\u0001\u0000\u0000\u0000A\u011f\u0001\u0000\u0000\u0000C\u0123\u0001"+
		"\u0000\u0000\u0000E\u0126\u0001\u0000\u0000\u0000G\u012b\u0001\u0000\u0000"+
		"\u0000I\u0131\u0001\u0000\u0000\u0000K\u0133\u0001\u0000\u0000\u0000M"+
		"\u0136\u0001\u0000\u0000\u0000O\u0138\u0001\u0000\u0000\u0000Q\u013b\u0001"+
		"\u0000\u0000\u0000S\u013e\u0001\u0000\u0000\u0000U\u0140\u0001\u0000\u0000"+
		"\u0000W\u0143\u0001\u0000\u0000\u0000Y\u0145\u0001\u0000\u0000\u0000["+
		"\u0147\u0001\u0000\u0000\u0000]\u0149\u0001\u0000\u0000\u0000_\u014b\u0001"+
		"\u0000\u0000\u0000a\u014d\u0001\u0000\u0000\u0000c\u014f\u0001\u0000\u0000"+
		"\u0000e\u0152\u0001\u0000\u0000\u0000g\u0154\u0001\u0000\u0000\u0000i"+
		"\u0157\u0001\u0000\u0000\u0000k\u0159\u0001\u0000\u0000\u0000m\u015c\u0001"+
		"\u0000\u0000\u0000o\u0160\u0001\u0000\u0000\u0000q\u016b\u0001\u0000\u0000"+
		"\u0000s\u0177\u0001\u0000\u0000\u0000u\u017b\u0001\u0000\u0000\u0000w"+
		"x\u0007\u0000\u0000\u0000xy\u0007\u0001\u0000\u0000yz\u0007\u0002\u0000"+
		"\u0000z{\u0007\u0003\u0000\u0000{|\u0007\u0001\u0000\u0000|}\u0007\u0004"+
		"\u0000\u0000}~\u0007\u0005\u0000\u0000~\u0002\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0007\u0006\u0000\u0000\u0080\u0081\u0007\u0007\u0000\u0000"+
		"\u0081\u0082\u0007\b\u0000\u0000\u0082\u0083\u0007\t\u0000\u0000\u0083"+
		"\u0084\u0007\n\u0000\u0000\u0084\u0085\u0007\u000b\u0000\u0000\u0085\u0086"+
		"\u0007\u0002\u0000\u0000\u0086\u0087\u0007\b\u0000\u0000\u0087\u0004\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0007\f\u0000\u0000\u0089\u008a\u0007\r"+
		"\u0000\u0000\u008a\u008b\u0007\b\u0000\u0000\u008b\u008c\u0007\u0003\u0000"+
		"\u0000\u008c\u008d\u0007\n\u0000\u0000\u008d\u008e\u0007\u000e\u0000\u0000"+
		"\u008e\u0006\u0001\u0000\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000"+
		"\u0090\u0091\u0007\u0001\u0000\u0000\u0091\u0092\u0007\u0002\u0000\u0000"+
		"\u0092\u0093\u0007\t\u0000\u0000\u0093\u0094\u0007\r\u0000\u0000\u0094"+
		"\u0095\u0007\u000f\u0000\u0000\u0095\u0096\u0007\u0007\u0000\u0000\u0096"+
		"\u0097\u0007\u0001\u0000\u0000\u0097\u0098\u0007\r\u0000\u0000\u0098\b"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0010\u0000\u0000\u009a\u009b"+
		"\u0007\r\u0000\u0000\u009b\u009c\u0007\u0003\u0000\u0000\u009c\u009d\u0007"+
		"\u000b\u0000\u0000\u009d\u009e\u0007\b\u0000\u0000\u009e\n\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0007\r\u0000\u0000\u00a0\u00a1\u0007\b\u0000"+
		"\u0000\u00a1\u00a2\u0007\u000f\u0000\u0000\u00a2\f\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0007\t\u0000\u0000\u00a4\u00a5\u0007\u0002\u0000\u0000\u00a5"+
		"\u00a6\u0007\b\u0000\u0000\u00a6\u00a7\u0007\u0011\u0000\u0000\u00a7\u00a8"+
		"\u0007\n\u0000\u0000\u00a8\u000e\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007"+
		"\u0012\u0000\u0000\u00aa\u00ab\u0007\u0004\u0000\u0000\u00ab\u00ac\u0007"+
		"\u0001\u0000\u0000\u00ac\u0010\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007"+
		"\u0004\u0000\u0000\u00ae\u00af\u0007\u0001\u0000\u0000\u00af\u00b0\u0007"+
		"\u0001\u0000\u0000\u00b0\u00b1\u0007\u0004\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0013\u0000\u0000\u00b2\u0012\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007"+
		"\n\u0000\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5\u0014\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0007\t\u0000\u0000\u00b7\u00b8\u0007\u000e\u0000"+
		"\u0000\u00b8\u00b9\u0007\u0004\u0000\u0000\u00b9\u00ba\u0007\u0001\u0000"+
		"\u0000\u00ba\u0016\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007\u0010\u0000"+
		"\u0000\u00bc\u00bd\u0007\u0002\u0000\u0000\u00bd\u00be\u0007\u0002\u0000"+
		"\u0000\u00be\u00bf\u0007\f\u0000\u0000\u00bf\u00c0\u0007\r\u0000\u0000"+
		"\u00c0\u00c1\u0007\u0004\u0000\u0000\u00c1\u00c2\u0007\b\u0000\u0000\u00c2"+
		"\u0018\u0001\u0000\u0000\u0000\u00c3\u00c4\u0007\u000b\u0000\u0000\u00c4"+
		"\u00c5\u0007\b\u0000\u0000\u00c5\u00c6\u0007\n\u0000\u0000\u00c6\u00c7"+
		"\u0007\r\u0000\u0000\u00c7\u00c8\u0007\u0003\u0000\u0000\u00c8\u00c9\u0007"+
		"\r\u0000\u0000\u00c9\u00ca\u0007\u0001\u0000\u0000\u00ca\u001a\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0007\u0002\u0000\u0000\u00cc\u00cd\u0007\u0006"+
		"\u0000\u0000\u00cd\u001c\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0011"+
		"\u0000\u0000\u00cf\u00d0\u0007\n\u0000\u0000\u00d0\u00d1\u0007\u0001\u0000"+
		"\u0000\u00d1\u00d2\u0007\u000b\u0000\u0000\u00d2\u00d3\u0007\b\u0000\u0000"+
		"\u00d3\u00d4\u0007\u0003\u0000\u0000\u00d4\u001e\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0007\u000b\u0000\u0000\u00d6\u00d7\u0007\u0006\u0000\u0000"+
		"\u00d7 \u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\r\u0000\u0000\u00d9"+
		"\u00da\u0007\f\u0000\u0000\u00da\u00db\u0007\u0011\u0000\u0000\u00db\u00dc"+
		"\u0007\r\u0000\u0000\u00dc\"\u0001\u0000\u0000\u0000\u00dd\u00de\u0007"+
		"\r\u0000\u0000\u00de\u00df\u0007\f\u0000\u0000\u00df\u00e0\u0007\u0011"+
		"\u0000\u0000\u00e0\u00e1\u0007\r\u0000\u0000\u00e1\u00e2\u0005 \u0000"+
		"\u0000\u00e2\u00e3\u0007\u000b\u0000\u0000\u00e3\u00e4\u0007\u0006\u0000"+
		"\u0000\u00e4$\u0001\u0000\u0000\u0000\u00e5\u00e6\u0007\u000f\u0000\u0000"+
		"\u00e6\u00e7\u0007\u0002\u0000\u0000\u00e7&\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0007\u0006\u0000\u0000\u00e9\u00ea\u0007\u0002\u0000\u0000\u00ea"+
		"\u00eb\u0007\u0001\u0000\u0000\u00eb(\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0007\u000f\u0000\u0000\u00ed\u00ee\u0007\u0002\u0000\u0000\u00ee\u00ef"+
		"\u0007\u0014\u0000\u0000\u00ef\u00f0\u0007\b\u0000\u0000\u00f0\u00f1\u0007"+
		"\n\u0000\u0000\u00f1\u00f2\u0007\u0002\u0000\u0000\u00f2*\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0007\u0001\u0000\u0000\u00f4\u00f5\u0007\r\u0000"+
		"\u0000\u00f5\u00f6\u0007\u0000\u0000\u0000\u00f6\u00f7\u0007\r\u0000\u0000"+
		"\u00f7\u00f8\u0007\u0004\u0000\u0000\u00f8\u00f9\u0007\n\u0000\u0000\u00f9"+
		",\u0001\u0000\u0000\u0000\u00fa\u00fb\u0007\n\u0000\u0000\u00fb\u00fc"+
		"\u0007\u000e\u0000\u0000\u00fc\u00fd\u0007\r\u0000\u0000\u00fd\u00fe\u0007"+
		"\b\u0000\u0000\u00fe.\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0007"+
		"\u0000\u0000\u0100\u0101\u0007\b\u0000\u0000\u0101\u0102\u0007\n\u0000"+
		"\u0000\u0102\u0103\u0007\u000b\u0000\u0000\u0103\u0104\u0007\f\u0000\u0000"+
		"\u01040\u0001\u0000\u0000\u0000\u0105\u0106\u0007\u0014\u0000\u0000\u0106"+
		"\u0107\u0007\u000e\u0000\u0000\u0107\u0108\u0007\u000b\u0000\u0000\u0108"+
		"\u0109\u0007\f\u0000\u0000\u0109\u010a\u0007\r\u0000\u0000\u010a2\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005+\u0000\u0000\u010c4\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005-\u0000\u0000\u010e6\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005*\u0000\u0000\u01108\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"/\u0000\u0000\u0112:\u0001\u0000\u0000\u0000\u0113\u0114\u0007\u0005\u0000"+
		"\u0000\u0114\u0115\u0007\u0002\u0000\u0000\u0115\u0116\u0007\u000f\u0000"+
		"\u0000\u0116<\u0001\u0000\u0000\u0000\u0117\u0118\u0007\u000f\u0000\u0000"+
		"\u0118\u0119\u0007\u000b\u0000\u0000\u0119\u011a\u0007\u0012\u0000\u0000"+
		"\u011a>\u0001\u0000\u0000\u0000\u011b\u011c\u0007\u0004\u0000\u0000\u011c"+
		"\u011d\u0007\b\u0000\u0000\u011d\u011e\u0007\u000f\u0000\u0000\u011e@"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0007\b\u0000\u0000\u0120\u0121\u0007"+
		"\u0002\u0000\u0000\u0121\u0122\u0007\n\u0000\u0000\u0122B\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0007\u0002\u0000\u0000\u0124\u0125\u0007\u0001"+
		"\u0000\u0000\u0125D\u0001\u0000\u0000\u0000\u0126\u0127\u0007\n\u0000"+
		"\u0000\u0127\u0128\u0007\u0001\u0000\u0000\u0128\u0129\u0007\u0007\u0000"+
		"\u0000\u0129\u012a\u0007\r\u0000\u0000\u012aF\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0007\u0006\u0000\u0000\u012c\u012d\u0007\u0004\u0000\u0000"+
		"\u012d\u012e\u0007\f\u0000\u0000\u012e\u012f\u0007\u0011\u0000\u0000\u012f"+
		"\u0130\u0007\r\u0000\u0000\u0130H\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005=\u0000\u0000\u0132J\u0001\u0000\u0000\u0000\u0133\u0134\u0005<"+
		"\u0000\u0000\u0134\u0135\u0005>\u0000\u0000\u0135L\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005<\u0000\u0000\u0137N\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0005<\u0000\u0000\u0139\u013a\u0005=\u0000\u0000\u013aP\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005>\u0000\u0000\u013c\u013d\u0005=\u0000\u0000"+
		"\u013dR\u0001\u0000\u0000\u0000\u013e\u013f\u0005>\u0000\u0000\u013fT"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0005:\u0000\u0000\u0141\u0142\u0005"+
		"=\u0000\u0000\u0142V\u0001\u0000\u0000\u0000\u0143\u0144\u0005,\u0000"+
		"\u0000\u0144X\u0001\u0000\u0000\u0000\u0145\u0146\u0005;\u0000\u0000\u0146"+
		"Z\u0001\u0000\u0000\u0000\u0147\u0148\u0005:\u0000\u0000\u0148\\\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005(\u0000\u0000\u014a^\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0005)\u0000\u0000\u014c`\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0005[\u0000\u0000\u014eb\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"(\u0000\u0000\u0150\u0151\u0005.\u0000\u0000\u0151d\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005]\u0000\u0000\u0153f\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005.\u0000\u0000\u0155\u0156\u0005)\u0000\u0000\u0156h\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005.\u0000\u0000\u0158j\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005.\u0000\u0000\u015a\u015b\u0005.\u0000\u0000\u015b"+
		"l\u0001\u0000\u0000\u0000\u015c\u015d\u0007\u0015\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u00066\u0000\u0000\u015fn\u0001\u0000"+
		"\u0000\u0000\u0160\u0164\u0005{\u0000\u0000\u0161\u0163\t\u0000\u0000"+
		"\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005}\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u00067\u0000\u0000\u016ap\u0001\u0000\u0000\u0000\u016b\u0171"+
		"\u0005\'\u0000\u0000\u016c\u016d\u0005\'\u0000\u0000\u016d\u0170\u0005"+
		"\'\u0000\u0000\u016e\u0170\b\u0016\u0000\u0000\u016f\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0005\'\u0000\u0000\u0175r\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u000209\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017at\u0001\u0000\u0000\u0000\u017b\u017f"+
		"\u0007\u0017\u0000\u0000\u017c\u017e\u0007\u0018\u0000\u0000\u017d\u017c"+
		"\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180v\u0001"+
		"\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0006\u0000\u0164"+
		"\u016f\u0171\u0179\u017f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}