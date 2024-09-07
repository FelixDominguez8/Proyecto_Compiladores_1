// Generated from MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, FUNCTION=2, LENGTH=3, PROCEDURE=4, BEGIN=5, END=6, CONST=7, 
		VAR=8, ARRAY=9, TO=10, CHAR=11, BOOLEAN=12, INTEGER=13, OF=14, STRING=15, 
		TYPE=16, IF=17, ELSE=18, DO=19, FOR=20, DOWNTO=21, REPEAT=22, THEN=23, 
		UNTIL=24, WHILE=25, PLUS=26, MINUS=27, MULTIPLY=28, DIVIDE=29, MOD=30, 
		DIV=31, AND=32, NOT=33, OR=34, TRUE=35, FALSE=36, EQUAL=37, NOTEQUAL=38, 
		LESSTHEN=39, LESSEQUAL=40, GREATEQUAL=41, GREATTHEN=42, ASSIGN=43, COMMA=44, 
		SEMICOLON=45, COLON=46, PARL=47, PARR=48, LBRACKET=49, LBRACKETP=50, RBRACKET=51, 
		RBRACKETP=52, DOT=53, DOT2=54, SPACE=55, COMMENT=56, LSTRING=57, NUM=58, 
		IDENTIFIER=59;
	public static final int
		RULE_programa = 0, RULE_encabezado = 1, RULE_bloque = 2, RULE_length = 3, 
		RULE_instruccion = 4, RULE_tipoinstruccion = 5, RULE_instruccionsimple = 6, 
		RULE_instruccionestructurada = 7, RULE_instruccionasignacion = 8, RULE_bloqueinstruccion = 9, 
		RULE_estructurarepetitiva = 10, RULE_instrucciones = 11, RULE_buclerepeat = 12, 
		RULE_buclewhile = 13, RULE_estructuraif = 14, RULE_buclefor = 15, RULE_listafor = 16, 
		RULE_tipo = 17, RULE_tipolista = 18, RULE_tipoidentificador = 19, RULE_definiciontipo = 20, 
		RULE_secciondefiniciontipo = 21, RULE_tipofuncion = 22, RULE_tipoproceso = 23, 
		RULE_tipoarreglo = 24, RULE_tipocadena = 25, RULE_tiposimple = 26, RULE_tipoescalar = 27, 
		RULE_tiposubrango = 28, RULE_signo = 29, RULE_valorbooleano = 30, RULE_constante = 31, 
		RULE_declaracionvariable = 32, RULE_variableDeclarationPart = 33, RULE_definicionconstante = 34, 
		RULE_constantDefinitionPart = 35, RULE_procedureDeclaration = 36, RULE_declaracionprocesoofuncion = 37, 
		RULE_secciondeclaracionprocesoofuncion = 38, RULE_listaparametros = 39, 
		RULE_grupoparametros = 40, RULE_parametroactual = 41, RULE_anchoparametro = 42, 
		RULE_listaformalparametros = 43, RULE_seccionformalparametros = 44, RULE_listaidentificadores = 45, 
		RULE_declaracionfuncion = 46, RULE_designarfuncion = 47, RULE_instruccionprocedimiento = 48, 
		RULE_variable = 49, RULE_expresionsimple = 50, RULE_expresion = 51, RULE_operadorrelacional = 52, 
		RULE_operadormultiplicativo = 53, RULE_operadoraditivo = 54, RULE_termino = 55, 
		RULE_signofactor = 56, RULE_factor = 57, RULE_instruccionvacia = 58, RULE_vacio = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "encabezado", "bloque", "length", "instruccion", "tipoinstruccion", 
			"instruccionsimple", "instruccionestructurada", "instruccionasignacion", 
			"bloqueinstruccion", "estructurarepetitiva", "instrucciones", "buclerepeat", 
			"buclewhile", "estructuraif", "buclefor", "listafor", "tipo", "tipolista", 
			"tipoidentificador", "definiciontipo", "secciondefiniciontipo", "tipofuncion", 
			"tipoproceso", "tipoarreglo", "tipocadena", "tiposimple", "tipoescalar", 
			"tiposubrango", "signo", "valorbooleano", "constante", "declaracionvariable", 
			"variableDeclarationPart", "definicionconstante", "constantDefinitionPart", 
			"procedureDeclaration", "declaracionprocesoofuncion", "secciondeclaracionprocesoofuncion", 
			"listaparametros", "grupoparametros", "parametroactual", "anchoparametro", 
			"listaformalparametros", "seccionformalparametros", "listaidentificadores", 
			"declaracionfuncion", "designarfuncion", "instruccionprocedimiento", 
			"variable", "expresionsimple", "expresion", "operadorrelacional", "operadormultiplicativo", 
			"operadoraditivo", "termino", "signofactor", "factor", "instruccionvacia", 
			"vacio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'function'", "'length'", "'procedure'", "'begin'", 
			"'end'", "'const'", "'var'", "'array'", "'to'", "'char'", "'boolean'", 
			"'integer'", "'of'", "'string'", "'type'", "'if'", "'else'", "'do'", 
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
			"VAR", "ARRAY", "TO", "CHAR", "BOOLEAN", "INTEGER", "OF", "STRING", "TYPE", 
			"IF", "ELSE", "DO", "FOR", "DOWNTO", "REPEAT", "THEN", "UNTIL", "WHILE", 
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

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniPascalParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(MiniPascalParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			encabezado();
			setState(121);
			bloque();
			setState(122);
			match(DOT);
			setState(123);
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
	public static class EncabezadoContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public ListaidentificadoresContext listaidentificadores() {
			return getRuleContext(ListaidentificadoresContext.class,0);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterEncabezado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitEncabezado(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_encabezado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PROGRAM);
			setState(126);
			match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(127);
				match(PARL);
				setState(128);
				listaidentificadores();
				setState(129);
				match(PARR);
				}
			}

			setState(133);
			match(SEMICOLON);
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
	public static class BloqueContext extends ParserRuleContext {
		public BloqueinstruccionContext bloqueinstruccion() {
			return getRuleContext(BloqueinstruccionContext.class,0);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<SecciondefiniciontipoContext> secciondefiniciontipo() {
			return getRuleContexts(SecciondefiniciontipoContext.class);
		}
		public SecciondefiniciontipoContext secciondefiniciontipo(int i) {
			return getRuleContext(SecciondefiniciontipoContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<SecciondeclaracionprocesoofuncionContext> secciondeclaracionprocesoofuncion() {
			return getRuleContexts(SecciondeclaracionprocesoofuncionContext.class);
		}
		public SecciondeclaracionprocesoofuncionContext secciondeclaracionprocesoofuncion(int i) {
			return getRuleContext(SecciondeclaracionprocesoofuncionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65940L) != 0)) {
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(135);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(136);
					secciondefiniciontipo();
					}
					break;
				case VAR:
					{
					setState(137);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(138);
					secciondeclaracionprocesoofuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			bloqueinstruccion();
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
	public static class LengthContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(MiniPascalParser.LENGTH, 0); }
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(LENGTH);
			setState(147);
			match(PARL);
			setState(148);
			variable();
			setState(149);
			match(PARR);
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
	public static class InstruccionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MiniPascalParser.NUM, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TipoinstruccionContext tipoinstruccion() {
			return getRuleContext(TipoinstruccionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruccion);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(NUM);
				setState(152);
				match(COLON);
				setState(153);
				tipoinstruccion();
				}
				break;
			case BEGIN:
			case END:
			case IF:
			case ELSE:
			case FOR:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case SEMICOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				tipoinstruccion();
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
	public static class TipoinstruccionContext extends ParserRuleContext {
		public InstruccionsimpleContext instruccionsimple() {
			return getRuleContext(InstruccionsimpleContext.class,0);
		}
		public InstruccionestructuradaContext instruccionestructurada() {
			return getRuleContext(InstruccionestructuradaContext.class,0);
		}
		public TipoinstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoinstruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoinstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoinstruccion(this);
		}
	}

	public final TipoinstruccionContext tipoinstruccion() throws RecognitionException {
		TipoinstruccionContext _localctx = new TipoinstruccionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoinstruccion);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
			case ELSE:
			case UNTIL:
			case SEMICOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				instruccionsimple();
				}
				break;
			case BEGIN:
			case IF:
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				instruccionestructurada();
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
	public static class InstruccionsimpleContext extends ParserRuleContext {
		public InstruccionasignacionContext instruccionasignacion() {
			return getRuleContext(InstruccionasignacionContext.class,0);
		}
		public InstruccionprocedimientoContext instruccionprocedimiento() {
			return getRuleContext(InstruccionprocedimientoContext.class,0);
		}
		public InstruccionvaciaContext instruccionvacia() {
			return getRuleContext(InstruccionvaciaContext.class,0);
		}
		public InstruccionsimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionsimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstruccionsimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstruccionsimple(this);
		}
	}

	public final InstruccionsimpleContext instruccionsimple() throws RecognitionException {
		InstruccionsimpleContext _localctx = new InstruccionsimpleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccionsimple);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				instruccionasignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				instruccionprocedimiento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				instruccionvacia();
				}
				break;
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
	public static class InstruccionestructuradaContext extends ParserRuleContext {
		public BloqueinstruccionContext bloqueinstruccion() {
			return getRuleContext(BloqueinstruccionContext.class,0);
		}
		public EstructuraifContext estructuraif() {
			return getRuleContext(EstructuraifContext.class,0);
		}
		public EstructurarepetitivaContext estructurarepetitiva() {
			return getRuleContext(EstructurarepetitivaContext.class,0);
		}
		public InstruccionestructuradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionestructurada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstruccionestructurada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstruccionestructurada(this);
		}
	}

	public final InstruccionestructuradaContext instruccionestructurada() throws RecognitionException {
		InstruccionestructuradaContext _localctx = new InstruccionestructuradaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruccionestructurada);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				bloqueinstruccion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				estructuraif();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				estructurarepetitiva();
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
	public static class InstruccionasignacionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionasignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionasignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstruccionasignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstruccionasignacion(this);
		}
	}

	public final InstruccionasignacionContext instruccionasignacion() throws RecognitionException {
		InstruccionasignacionContext _localctx = new InstruccionasignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccionasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			variable();
			setState(172);
			match(ASSIGN);
			setState(173);
			expresion();
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
	public static class BloqueinstruccionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public BloqueinstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueinstruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBloqueinstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBloqueinstruccion(this);
		}
	}

	public final BloqueinstruccionContext bloqueinstruccion() throws RecognitionException {
		BloqueinstruccionContext _localctx = new BloqueinstruccionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloqueinstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(BEGIN);
			setState(176);
			instrucciones();
			setState(177);
			match(END);
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
	public static class EstructurarepetitivaContext extends ParserRuleContext {
		public BuclewhileContext buclewhile() {
			return getRuleContext(BuclewhileContext.class,0);
		}
		public BuclerepeatContext buclerepeat() {
			return getRuleContext(BuclerepeatContext.class,0);
		}
		public BucleforContext buclefor() {
			return getRuleContext(BucleforContext.class,0);
		}
		public EstructurarepetitivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructurarepetitiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterEstructurarepetitiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitEstructurarepetitiva(this);
		}
	}

	public final EstructurarepetitivaContext estructurarepetitiva() throws RecognitionException {
		EstructurarepetitivaContext _localctx = new EstructurarepetitivaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_estructurarepetitiva);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				buclewhile();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				buclerepeat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				buclefor();
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
	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			instruccion();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(185);
				match(SEMICOLON);
				setState(186);
				instruccion();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class BuclerepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(MiniPascalParser.REPEAT, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(MiniPascalParser.UNTIL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BuclerepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclerepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBuclerepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBuclerepeat(this);
		}
	}

	public final BuclerepeatContext buclerepeat() throws RecognitionException {
		BuclerepeatContext _localctx = new BuclerepeatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_buclerepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(REPEAT);
			setState(193);
			instrucciones();
			setState(194);
			match(UNTIL);
			setState(195);
			expresion();
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
	public static class BuclewhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public BuclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclewhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBuclewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBuclewhile(this);
		}
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_buclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(WHILE);
			setState(198);
			expresion();
			setState(199);
			match(DO);
			setState(200);
			instruccion();
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
	public static class EstructuraifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public EstructuraifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterEstructuraif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitEstructuraif(this);
		}
	}

	public final EstructuraifContext estructuraif() throws RecognitionException {
		EstructuraifContext _localctx = new EstructuraifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_estructuraif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IF);
			setState(203);
			expresion();
			setState(204);
			match(THEN);
			setState(205);
			instruccion();
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(206);
				match(ELSE);
				setState(207);
				instruccion();
				}
				break;
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
	public static class BucleforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ListaforContext listafor() {
			return getRuleContext(ListaforContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public BucleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclefor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBuclefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBuclefor(this);
		}
	}

	public final BucleforContext buclefor() throws RecognitionException {
		BucleforContext _localctx = new BucleforContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_buclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(FOR);
			setState(211);
			match(IDENTIFIER);
			setState(212);
			match(ASSIGN);
			setState(213);
			listafor();
			setState(214);
			match(DO);
			setState(215);
			instruccion();
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
	public static class ListaforContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode TO() { return getToken(MiniPascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(MiniPascalParser.DOWNTO, 0); }
		public ListaforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listafor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterListafor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitListafor(this);
		}
	}

	public final ListaforContext listafor() throws RecognitionException {
		ListaforContext _localctx = new ListaforContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listafor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expresion();
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			expresion();
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
	public static class TipoContext extends ParserRuleContext {
		public TiposimpleContext tiposimple() {
			return getRuleContext(TiposimpleContext.class,0);
		}
		public TipoarregloContext tipoarreglo() {
			return getRuleContext(TipoarregloContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LENGTH:
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case STRING:
			case PLUS:
			case MINUS:
			case PARL:
			case LSTRING:
			case NUM:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				tiposimple();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				tipoarreglo();
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
	public static class TipolistaContext extends ParserRuleContext {
		public List<TiposimpleContext> tiposimple() {
			return getRuleContexts(TiposimpleContext.class);
		}
		public TiposimpleContext tiposimple(int i) {
			return getRuleContext(TiposimpleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public TipolistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipolista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipolista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipolista(this);
		}
	}

	public final TipolistaContext tipolista() throws RecognitionException {
		TipolistaContext _localctx = new TipolistaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipolista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			tiposimple();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				tiposimple();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TipoidentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public TipoidentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoidentificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoidentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoidentificador(this);
		}
	}

	public final TipoidentificadorContext tipoidentificador() throws RecognitionException {
		TipoidentificadorContext _localctx = new TipoidentificadorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipoidentificador);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENTIFIER);
				}
				break;
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 47104L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class DefiniciontipoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MiniPascalParser.EQUAL, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipofuncionContext tipofuncion() {
			return getRuleContext(TipofuncionContext.class,0);
		}
		public TipoprocesoContext tipoproceso() {
			return getRuleContext(TipoprocesoContext.class,0);
		}
		public DefiniciontipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciontipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDefiniciontipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDefiniciontipo(this);
		}
	}

	public final DefiniciontipoContext definiciontipo() throws RecognitionException {
		DefiniciontipoContext _localctx = new DefiniciontipoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_definiciontipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IDENTIFIER);
			setState(238);
			match(EQUAL);
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LENGTH:
			case ARRAY:
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case STRING:
			case PLUS:
			case MINUS:
			case PARL:
			case LSTRING:
			case NUM:
			case IDENTIFIER:
				{
				setState(239);
				tipo();
				}
				break;
			case FUNCTION:
				{
				setState(240);
				tipofuncion();
				}
				break;
			case PROCEDURE:
				{
				setState(241);
				tipoproceso();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SecciondefiniciontipoContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MiniPascalParser.TYPE, 0); }
		public List<DefiniciontipoContext> definiciontipo() {
			return getRuleContexts(DefiniciontipoContext.class);
		}
		public DefiniciontipoContext definiciontipo(int i) {
			return getRuleContext(DefiniciontipoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public SecciondefiniciontipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secciondefiniciontipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSecciondefiniciontipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSecciondefiniciontipo(this);
		}
	}

	public final SecciondefiniciontipoContext secciondefiniciontipo() throws RecognitionException {
		SecciondefiniciontipoContext _localctx = new SecciondefiniciontipoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_secciondefiniciontipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(TYPE);
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				definiciontipo();
				setState(246);
				match(SEMICOLON);
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class TipofuncionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MiniPascalParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TipoidentificadorContext tipoidentificador() {
			return getRuleContext(TipoidentificadorContext.class,0);
		}
		public ListaformalparametrosContext listaformalparametros() {
			return getRuleContext(ListaformalparametrosContext.class,0);
		}
		public TipofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipofuncion(this);
		}
	}

	public final TipofuncionContext tipofuncion() throws RecognitionException {
		TipofuncionContext _localctx = new TipofuncionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(FUNCTION);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(253);
				listaformalparametros();
				}
			}

			setState(256);
			match(COLON);
			setState(257);
			tipoidentificador();
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
	public static class TipoprocesoContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public ListaformalparametrosContext listaformalparametros() {
			return getRuleContext(ListaformalparametrosContext.class,0);
		}
		public TipoprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoproceso(this);
		}
	}

	public final TipoprocesoContext tipoproceso() throws RecognitionException {
		TipoprocesoContext _localctx = new TipoprocesoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipoproceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PROCEDURE);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(260);
				listaformalparametros();
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
	public static class TipoarregloContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(MiniPascalParser.LBRACKET, 0); }
		public TipolistaContext tipolista() {
			return getRuleContext(TipolistaContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MiniPascalParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LBRACKETP() { return getToken(MiniPascalParser.LBRACKETP, 0); }
		public TerminalNode RBRACKETP() { return getToken(MiniPascalParser.RBRACKETP, 0); }
		public TipoarregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoarreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoarreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoarreglo(this);
		}
	}

	public final TipoarregloContext tipoarreglo() throws RecognitionException {
		TipoarregloContext _localctx = new TipoarregloContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoarreglo);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(ARRAY);
				setState(264);
				match(LBRACKET);
				setState(265);
				tipolista();
				setState(266);
				match(RBRACKET);
				setState(267);
				match(OF);
				setState(268);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(ARRAY);
				setState(271);
				match(LBRACKETP);
				setState(272);
				tipolista();
				setState(273);
				match(RBRACKETP);
				setState(274);
				match(OF);
				setState(275);
				tipo();
				}
				break;
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
	public static class TipocadenaContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public TerminalNode LBRACKET() { return getToken(MiniPascalParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MiniPascalParser.RBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode NUM() { return getToken(MiniPascalParser.NUM, 0); }
		public TipocadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipocadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipocadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipocadena(this);
		}
	}

	public final TipocadenaContext tipocadena() throws RecognitionException {
		TipocadenaContext _localctx = new TipocadenaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipocadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(STRING);
			setState(280);
			match(LBRACKET);
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			match(RBRACKET);
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
	public static class TiposimpleContext extends ParserRuleContext {
		public TipoescalarContext tipoescalar() {
			return getRuleContext(TipoescalarContext.class,0);
		}
		public TiposubrangoContext tiposubrango() {
			return getRuleContext(TiposubrangoContext.class,0);
		}
		public TipoidentificadorContext tipoidentificador() {
			return getRuleContext(TipoidentificadorContext.class,0);
		}
		public TipocadenaContext tipocadena() {
			return getRuleContext(TipocadenaContext.class,0);
		}
		public TiposimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiposimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTiposimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTiposimple(this);
		}
	}

	public final TiposimpleContext tiposimple() throws RecognitionException {
		TiposimpleContext _localctx = new TiposimpleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tiposimple);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				tipoescalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				tiposubrango();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				tipoidentificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				tipocadena();
				}
				break;
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
	public static class TipoescalarContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public ListaidentificadoresContext listaidentificadores() {
			return getRuleContext(ListaidentificadoresContext.class,0);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public TipoescalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoescalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoescalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoescalar(this);
		}
	}

	public final TipoescalarContext tipoescalar() throws RecognitionException {
		TipoescalarContext _localctx = new TipoescalarContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipoescalar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PARL);
			setState(291);
			listaidentificadores();
			setState(292);
			match(PARR);
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
	public static class TiposubrangoContext extends ParserRuleContext {
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public TerminalNode DOT2() { return getToken(MiniPascalParser.DOT2, 0); }
		public TiposubrangoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiposubrango; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTiposubrango(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTiposubrango(this);
		}
	}

	public final TiposubrangoContext tiposubrango() throws RecognitionException {
		TiposubrangoContext _localctx = new TiposubrangoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tiposubrango);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			constante();
			setState(295);
			match(DOT2);
			setState(296);
			constante();
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
	public static class SignoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSigno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSigno(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
	public static class ValorbooleanoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiniPascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniPascalParser.FALSE, 0); }
		public ValorbooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorbooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterValorbooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitValorbooleano(this);
		}
	}

	public final ValorbooleanoContext valorbooleano() throws RecognitionException {
		ValorbooleanoContext _localctx = new ValorbooleanoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_valorbooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MiniPascalParser.NUM, 0); }
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode LSTRING() { return getToken(MiniPascalParser.LSTRING, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConstante(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constante);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				signo();
				setState(304);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				signo();
				setState(308);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(LSTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				length();
				}
				break;
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
	public static class DeclaracionvariableContext extends ParserRuleContext {
		public ListaidentificadoresContext listaidentificadores() {
			return getRuleContext(ListaidentificadoresContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracionvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracionvariable(this);
		}
	}

	public final DeclaracionvariableContext declaracionvariable() throws RecognitionException {
		DeclaracionvariableContext _localctx = new DeclaracionvariableContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaracionvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			listaidentificadores();
			setState(315);
			match(COLON);
			setState(316);
			tipo();
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
	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<DeclaracionvariableContext> declaracionvariable() {
			return getRuleContexts(DeclaracionvariableContext.class);
		}
		public DeclaracionvariableContext declaracionvariable(int i) {
			return getRuleContext(DeclaracionvariableContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariableDeclarationPart(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(VAR);
			setState(319);
			declaracionvariable();
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					match(SEMICOLON);
					setState(321);
					declaracionvariable();
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(327);
			match(SEMICOLON);
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
	public static class DefinicionconstanteContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(MiniPascalParser.EQUAL, 0); }
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public DefinicionconstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionconstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDefinicionconstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDefinicionconstante(this);
		}
	}

	public final DefinicionconstanteContext definicionconstante() throws RecognitionException {
		DefinicionconstanteContext _localctx = new DefinicionconstanteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_definicionconstante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IDENTIFIER);
			setState(330);
			match(EQUAL);
			setState(331);
			constante();
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
	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(MiniPascalParser.CONST, 0); }
		public List<DefinicionconstanteContext> definicionconstante() {
			return getRuleContexts(DefinicionconstanteContext.class);
		}
		public DefinicionconstanteContext definicionconstante(int i) {
			return getRuleContext(DefinicionconstanteContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConstantDefinitionPart(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(CONST);
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(334);
				definicionconstante();
				setState(335);
				match(SEMICOLON);
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaformalparametrosContext listaformalparametros() {
			return getRuleContext(ListaformalparametrosContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProcedureDeclaration(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(PROCEDURE);
			setState(342);
			match(IDENTIFIER);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(343);
				listaformalparametros();
				}
			}

			setState(346);
			match(SEMICOLON);
			setState(347);
			bloque();
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
	public static class DeclaracionprocesoofuncionContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public DeclaracionfuncionContext declaracionfuncion() {
			return getRuleContext(DeclaracionfuncionContext.class,0);
		}
		public DeclaracionprocesoofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionprocesoofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracionprocesoofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracionprocesoofuncion(this);
		}
	}

	public final DeclaracionprocesoofuncionContext declaracionprocesoofuncion() throws RecognitionException {
		DeclaracionprocesoofuncionContext _localctx = new DeclaracionprocesoofuncionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declaracionprocesoofuncion);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				declaracionfuncion();
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
	public static class SecciondeclaracionprocesoofuncionContext extends ParserRuleContext {
		public DeclaracionprocesoofuncionContext declaracionprocesoofuncion() {
			return getRuleContext(DeclaracionprocesoofuncionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public SecciondeclaracionprocesoofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secciondeclaracionprocesoofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSecciondeclaracionprocesoofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSecciondeclaracionprocesoofuncion(this);
		}
	}

	public final SecciondeclaracionprocesoofuncionContext secciondeclaracionprocesoofuncion() throws RecognitionException {
		SecciondeclaracionprocesoofuncionContext _localctx = new SecciondeclaracionprocesoofuncionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_secciondeclaracionprocesoofuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			declaracionprocesoofuncion();
			setState(354);
			match(SEMICOLON);
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
	public static class ListaparametrosContext extends ParserRuleContext {
		public List<ParametroactualContext> parametroactual() {
			return getRuleContexts(ParametroactualContext.class);
		}
		public ParametroactualContext parametroactual(int i) {
			return getRuleContext(ParametroactualContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public ListaparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterListaparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitListaparametros(this);
		}
	}

	public final ListaparametrosContext listaparametros() throws RecognitionException {
		ListaparametrosContext _localctx = new ListaparametrosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listaparametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			parametroactual();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(357);
				match(COMMA);
				setState(358);
				parametroactual();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class GrupoparametrosContext extends ParserRuleContext {
		public ListaidentificadoresContext listaidentificadores() {
			return getRuleContext(ListaidentificadoresContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TipoidentificadorContext tipoidentificador() {
			return getRuleContext(TipoidentificadorContext.class,0);
		}
		public GrupoparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grupoparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterGrupoparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitGrupoparametros(this);
		}
	}

	public final GrupoparametrosContext grupoparametros() throws RecognitionException {
		GrupoparametrosContext _localctx = new GrupoparametrosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_grupoparametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			listaidentificadores();
			setState(365);
			match(COLON);
			setState(366);
			tipoidentificador();
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
	public static class ParametroactualContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<AnchoparametroContext> anchoparametro() {
			return getRuleContexts(AnchoparametroContext.class);
		}
		public AnchoparametroContext anchoparametro(int i) {
			return getRuleContext(AnchoparametroContext.class,i);
		}
		public ParametroactualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroactual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterParametroactual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitParametroactual(this);
		}
	}

	public final ParametroactualContext parametroactual() throws RecognitionException {
		ParametroactualContext _localctx = new ParametroactualContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parametroactual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			expresion();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(369);
				anchoparametro();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AnchoparametroContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AnchoparametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchoparametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAnchoparametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAnchoparametro(this);
		}
	}

	public final AnchoparametroContext anchoparametro() throws RecognitionException {
		AnchoparametroContext _localctx = new AnchoparametroContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_anchoparametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(COLON);
			setState(376);
			expresion();
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
	public static class ListaformalparametrosContext extends ParserRuleContext {
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public List<SeccionformalparametrosContext> seccionformalparametros() {
			return getRuleContexts(SeccionformalparametrosContext.class);
		}
		public SeccionformalparametrosContext seccionformalparametros(int i) {
			return getRuleContext(SeccionformalparametrosContext.class,i);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public ListaformalparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaformalparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterListaformalparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitListaformalparametros(this);
		}
	}

	public final ListaformalparametrosContext listaformalparametros() throws RecognitionException {
		ListaformalparametrosContext _localctx = new ListaformalparametrosContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listaformalparametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(PARL);
			setState(379);
			seccionformalparametros();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(380);
				match(SEMICOLON);
				setState(381);
				seccionformalparametros();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(PARR);
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
	public static class SeccionformalparametrosContext extends ParserRuleContext {
		public GrupoparametrosContext grupoparametros() {
			return getRuleContext(GrupoparametrosContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(MiniPascalParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public SeccionformalparametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionformalparametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSeccionformalparametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSeccionformalparametros(this);
		}
	}

	public final SeccionformalparametrosContext seccionformalparametros() throws RecognitionException {
		SeccionformalparametrosContext _localctx = new SeccionformalparametrosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_seccionformalparametros);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				grupoparametros();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(VAR);
				setState(391);
				grupoparametros();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(FUNCTION);
				setState(393);
				grupoparametros();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				match(PROCEDURE);
				setState(395);
				grupoparametros();
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
	public static class ListaidentificadoresContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniPascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniPascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public ListaidentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaidentificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterListaidentificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitListaidentificadores(this);
		}
	}

	public final ListaidentificadoresContext listaidentificadores() throws RecognitionException {
		ListaidentificadoresContext _localctx = new ListaidentificadoresContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_listaidentificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(IDENTIFIER);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399);
				match(COMMA);
				setState(400);
				match(IDENTIFIER);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DeclaracionfuncionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MiniPascalParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TipoidentificadorContext tipoidentificador() {
			return getRuleContext(TipoidentificadorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaformalparametrosContext listaformalparametros() {
			return getRuleContext(ListaformalparametrosContext.class,0);
		}
		public DeclaracionfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracionfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracionfuncion(this);
		}
	}

	public final DeclaracionfuncionContext declaracionfuncion() throws RecognitionException {
		DeclaracionfuncionContext _localctx = new DeclaracionfuncionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declaracionfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(FUNCTION);
			setState(407);
			match(IDENTIFIER);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(408);
				listaformalparametros();
				}
			}

			setState(411);
			match(COLON);
			setState(412);
			tipoidentificador();
			setState(413);
			match(SEMICOLON);
			setState(414);
			bloque();
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
	public static class DesignarfuncionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public DesignarfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designarfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDesignarfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDesignarfuncion(this);
		}
	}

	public final DesignarfuncionContext designarfuncion() throws RecognitionException {
		DesignarfuncionContext _localctx = new DesignarfuncionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_designarfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(PARL);
			setState(418);
			listaparametros();
			setState(419);
			match(PARR);
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
	public static class InstruccionprocedimientoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public InstruccionprocedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionprocedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstruccionprocedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstruccionprocedimiento(this);
		}
	}

	public final InstruccionprocedimientoContext instruccionprocedimiento() throws RecognitionException {
		InstruccionprocedimientoContext _localctx = new InstruccionprocedimientoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_instruccionprocedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(IDENTIFIER);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(422);
				match(PARL);
				setState(423);
				listaparametros();
				setState(424);
				match(PARR);
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
	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MiniPascalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MiniPascalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(MiniPascalParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(MiniPascalParser.LBRACKET, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(MiniPascalParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(MiniPascalParser.RBRACKET, i);
		}
		public List<TerminalNode> LBRACKETP() { return getTokens(MiniPascalParser.LBRACKETP); }
		public TerminalNode LBRACKETP(int i) {
			return getToken(MiniPascalParser.LBRACKETP, i);
		}
		public List<TerminalNode> RBRACKETP() { return getTokens(MiniPascalParser.RBRACKETP); }
		public TerminalNode RBRACKETP(int i) {
			return getToken(MiniPascalParser.RBRACKETP, i);
		}
		public List<TerminalNode> DOT() { return getTokens(MiniPascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MiniPascalParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(IDENTIFIER);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049115004928L) != 0)) {
				{
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(429);
					match(LBRACKET);
					setState(430);
					expresion();
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(431);
						match(COMMA);
						setState(432);
						expresion();
						}
						}
						setState(437);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(438);
					match(RBRACKET);
					}
					break;
				case LBRACKETP:
					{
					setState(440);
					match(LBRACKETP);
					setState(441);
					expresion();
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(442);
						match(COMMA);
						setState(443);
						expresion();
						}
						}
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(449);
					match(RBRACKETP);
					}
					break;
				case DOT:
					{
					setState(451);
					match(DOT);
					setState(452);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ExpresionsimpleContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public OperadoraditivoContext operadoraditivo() {
			return getRuleContext(OperadoraditivoContext.class,0);
		}
		public ExpresionsimpleContext expresionsimple() {
			return getRuleContext(ExpresionsimpleContext.class,0);
		}
		public ExpresionsimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionsimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpresionsimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpresionsimple(this);
		}
	}

	public final ExpresionsimpleContext expresionsimple() throws RecognitionException {
		ExpresionsimpleContext _localctx = new ExpresionsimpleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expresionsimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			termino();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17381195776L) != 0)) {
				{
				setState(459);
				operadoraditivo();
				setState(460);
				expresionsimple();
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionsimpleContext expresionsimple() {
			return getRuleContext(ExpresionsimpleContext.class,0);
		}
		public OperadorrelacionalContext operadorrelacional() {
			return getRuleContext(OperadorrelacionalContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			expresionsimple();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) {
				{
				setState(465);
				operadorrelacional();
				setState(466);
				expresion();
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
	public static class OperadorrelacionalContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(MiniPascalParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(MiniPascalParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHEN() { return getToken(MiniPascalParser.LESSTHEN, 0); }
		public TerminalNode LESSEQUAL() { return getToken(MiniPascalParser.LESSEQUAL, 0); }
		public TerminalNode GREATEQUAL() { return getToken(MiniPascalParser.GREATEQUAL, 0); }
		public TerminalNode GREATTHEN() { return getToken(MiniPascalParser.GREATTHEN, 0); }
		public OperadorrelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorrelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterOperadorrelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitOperadorrelacional(this);
		}
	}

	public final OperadorrelacionalContext operadorrelacional() throws RecognitionException {
		OperadorrelacionalContext _localctx = new OperadorrelacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operadorrelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) ) {
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
	public static class OperadormultiplicativoContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(MiniPascalParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(MiniPascalParser.DIVIDE, 0); }
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniPascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public OperadormultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadormultiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterOperadormultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitOperadormultiplicativo(this);
		}
	}

	public final OperadormultiplicativoContext operadormultiplicativo() throws RecognitionException {
		OperadormultiplicativoContext _localctx = new OperadormultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_operadormultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) ) {
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
	public static class OperadoraditivoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public OperadoraditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoraditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterOperadoraditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitOperadoraditivo(this);
		}
	}

	public final OperadoraditivoContext operadoraditivo() throws RecognitionException {
		OperadoraditivoContext _localctx = new OperadoraditivoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_operadoraditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17381195776L) != 0)) ) {
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
	public static class TerminoContext extends ParserRuleContext {
		public SignofactorContext signofactor() {
			return getRuleContext(SignofactorContext.class,0);
		}
		public OperadormultiplicativoContext operadormultiplicativo() {
			return getRuleContext(OperadormultiplicativoContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			signofactor();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) {
				{
				setState(477);
				operadormultiplicativo();
				setState(478);
				termino();
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
	public static class SignofactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public SignofactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signofactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSignofactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSignofactor(this);
		}
	}

	public final SignofactorContext signofactor() throws RecognitionException {
		SignofactorContext _localctx = new SignofactorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_signofactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(485);
			factor();
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
	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public DesignarfuncionContext designarfuncion() {
			return getRuleContext(DesignarfuncionContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ValorbooleanoContext valorbooleano() {
			return getRuleContext(ValorbooleanoContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_factor);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(PARL);
				setState(489);
				expresion();
				setState(490);
				match(PARR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				designarfuncion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				constante();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				match(NOT);
				setState(495);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(496);
				valorbooleano();
				}
				break;
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
	public static class InstruccionvaciaContext extends ParserRuleContext {
		public InstruccionvaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionvacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstruccionvacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstruccionvacia(this);
		}
	}

	public final InstruccionvaciaContext instruccionvacia() throws RecognitionException {
		InstruccionvaciaContext _localctx = new InstruccionvaciaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_instruccionvacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class VacioContext extends ParserRuleContext {
		public VacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVacio(this);
		}
	}

	public final VacioContext vacio() throws RecognitionException {
		VacioContext _localctx = new VacioContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_vacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\u0004\u0001;\u01f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0084"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u008c\b\u0002\n\u0002\f\u0002\u008f\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00a5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00aa\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00b7\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00bc\b\u000b\n\u000b\f\u000b\u00bf"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00e0"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e5\b\u0012"+
		"\n\u0012\f\u0012\u00e8\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00ec"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00f3\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u00f9\b\u0015\u000b\u0015\f\u0015\u00fa\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00ff\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0106\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0116\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0121\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0139\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005!\u0143"+
		"\b!\n!\f!\u0146\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0004#\u0152\b#\u000b#\f#\u0153\u0001$\u0001$\u0001"+
		"$\u0003$\u0159\b$\u0001$\u0001$\u0001$\u0001%\u0001%\u0003%\u0160\b%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u0168\b\'\n\'\f\'\u016b"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0005)\u0173\b)\n)\f)\u0176"+
		"\t)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u017f\b+\n"+
		"+\f+\u0182\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,"+
		"\u0001,\u0003,\u018d\b,\u0001-\u0001-\u0001-\u0005-\u0192\b-\n-\f-\u0195"+
		"\t-\u0001.\u0001.\u0001.\u0003.\u019a\b.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u01ab\b0\u00011\u00011\u00011\u00011\u00011\u00051\u01b2\b1\n"+
		"1\f1\u01b5\t1\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u01bd\b"+
		"1\n1\f1\u01c0\t1\u00011\u00011\u00011\u00011\u00051\u01c6\b1\n1\f1\u01c9"+
		"\t1\u00012\u00012\u00012\u00012\u00032\u01cf\b2\u00013\u00013\u00013\u0001"+
		"3\u00033\u01d5\b3\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00037\u01e1\b7\u00018\u00038\u01e4\b8\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u01f2\b9\u0001:\u0001:\u0001;\u0001;\u0001;\u0000\u0000<\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\b\u0002\u0000\n\n"+
		"\u0015\u0015\u0002\u0000\u000b\r\u000f\u000f\u0001\u0000:;\u0001\u0000"+
		"\u001a\u001b\u0001\u0000#$\u0001\u0000%*\u0001\u0000\u001c \u0002\u0000"+
		"\u001a\u001b\"\"\u01f6\u0000x\u0001\u0000\u0000\u0000\u0002}\u0001\u0000"+
		"\u0000\u0000\u0004\u008d\u0001\u0000\u0000\u0000\u0006\u0092\u0001\u0000"+
		"\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000\n\u009f\u0001\u0000\u0000"+
		"\u0000\f\u00a4\u0001\u0000\u0000\u0000\u000e\u00a9\u0001\u0000\u0000\u0000"+
		"\u0010\u00ab\u0001\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000\u0000"+
		"\u0014\u00b6\u0001\u0000\u0000\u0000\u0016\u00b8\u0001\u0000\u0000\u0000"+
		"\u0018\u00c0\u0001\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000"+
		"\u001c\u00ca\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000"+
		" \u00d9\u0001\u0000\u0000\u0000\"\u00df\u0001\u0000\u0000\u0000$\u00e1"+
		"\u0001\u0000\u0000\u0000&\u00eb\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000"+
		"\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000,\u00fc\u0001\u0000\u0000\u0000"+
		".\u0103\u0001\u0000\u0000\u00000\u0115\u0001\u0000\u0000\u00002\u0117"+
		"\u0001\u0000\u0000\u00004\u0120\u0001\u0000\u0000\u00006\u0122\u0001\u0000"+
		"\u0000\u00008\u0126\u0001\u0000\u0000\u0000:\u012a\u0001\u0000\u0000\u0000"+
		"<\u012c\u0001\u0000\u0000\u0000>\u0138\u0001\u0000\u0000\u0000@\u013a"+
		"\u0001\u0000\u0000\u0000B\u013e\u0001\u0000\u0000\u0000D\u0149\u0001\u0000"+
		"\u0000\u0000F\u014d\u0001\u0000\u0000\u0000H\u0155\u0001\u0000\u0000\u0000"+
		"J\u015f\u0001\u0000\u0000\u0000L\u0161\u0001\u0000\u0000\u0000N\u0164"+
		"\u0001\u0000\u0000\u0000P\u016c\u0001\u0000\u0000\u0000R\u0170\u0001\u0000"+
		"\u0000\u0000T\u0177\u0001\u0000\u0000\u0000V\u017a\u0001\u0000\u0000\u0000"+
		"X\u018c\u0001\u0000\u0000\u0000Z\u018e\u0001\u0000\u0000\u0000\\\u0196"+
		"\u0001\u0000\u0000\u0000^\u01a0\u0001\u0000\u0000\u0000`\u01a5\u0001\u0000"+
		"\u0000\u0000b\u01ac\u0001\u0000\u0000\u0000d\u01ca\u0001\u0000\u0000\u0000"+
		"f\u01d0\u0001\u0000\u0000\u0000h\u01d6\u0001\u0000\u0000\u0000j\u01d8"+
		"\u0001\u0000\u0000\u0000l\u01da\u0001\u0000\u0000\u0000n\u01dc\u0001\u0000"+
		"\u0000\u0000p\u01e3\u0001\u0000\u0000\u0000r\u01f1\u0001\u0000\u0000\u0000"+
		"t\u01f3\u0001\u0000\u0000\u0000v\u01f5\u0001\u0000\u0000\u0000xy\u0003"+
		"\u0002\u0001\u0000yz\u0003\u0004\u0002\u0000z{\u00055\u0000\u0000{|\u0005"+
		"\u0000\u0000\u0001|\u0001\u0001\u0000\u0000\u0000}~\u0005\u0001\u0000"+
		"\u0000~\u0083\u0005;\u0000\u0000\u007f\u0080\u0005/\u0000\u0000\u0080"+
		"\u0081\u0003Z-\u0000\u0081\u0082\u00050\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"-\u0000\u0000\u0086\u0003\u0001\u0000\u0000\u0000\u0087\u008c\u0003F#"+
		"\u0000\u0088\u008c\u0003*\u0015\u0000\u0089\u008c\u0003B!\u0000\u008a"+
		"\u008c\u0003L&\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"\u0012\t\u0000\u0091\u0005\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0003"+
		"\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0003b1\u0000"+
		"\u0095\u0096\u00050\u0000\u0000\u0096\u0007\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005:\u0000\u0000\u0098\u0099\u0005.\u0000\u0000\u0099\u009c\u0003"+
		"\n\u0005\u0000\u009a\u009c\u0003\n\u0005\u0000\u009b\u0097\u0001\u0000"+
		"\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\t\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0003\f\u0006\u0000\u009e\u00a0\u0003\u000e\u0007\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u000b\u0001\u0000\u0000\u0000\u00a1\u00a5\u0003\u0010\b\u0000\u00a2"+
		"\u00a5\u0003`0\u0000\u00a3\u00a5\u0003t:\u0000\u00a4\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\r\u0001\u0000\u0000\u0000\u00a6\u00aa\u0003\u0012\t"+
		"\u0000\u00a7\u00aa\u0003\u001c\u000e\u0000\u00a8\u00aa\u0003\u0014\n\u0000"+
		"\u00a9\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u000f\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0003b1\u0000\u00ac\u00ad\u0005+\u0000\u0000\u00ad\u00ae"+
		"\u0003f3\u0000\u00ae\u0011\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0005"+
		"\u0000\u0000\u00b0\u00b1\u0003\u0016\u000b\u0000\u00b1\u00b2\u0005\u0006"+
		"\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3\u00b7\u0003\u001a"+
		"\r\u0000\u00b4\u00b7\u0003\u0018\f\u0000\u00b5\u00b7\u0003\u001e\u000f"+
		"\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0015\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bd\u0003\b\u0004\u0000\u00b9\u00ba\u0005-\u0000\u0000"+
		"\u00ba\u00bc\u0003\b\u0004\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u0017\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0016\u0000\u0000\u00c1"+
		"\u00c2\u0003\u0016\u000b\u0000\u00c2\u00c3\u0005\u0018\u0000\u0000\u00c3"+
		"\u00c4\u0003f3\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0019\u0000\u0000\u00c6\u00c7\u0003f3\u0000\u00c7\u00c8\u0005\u0013\u0000"+
		"\u0000\u00c8\u00c9\u0003\b\u0004\u0000\u00c9\u001b\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0011\u0000\u0000\u00cb\u00cc\u0003f3\u0000\u00cc\u00cd"+
		"\u0005\u0017\u0000\u0000\u00cd\u00d0\u0003\b\u0004\u0000\u00ce\u00cf\u0005"+
		"\u0012\u0000\u0000\u00cf\u00d1\u0003\b\u0004\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u001d\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0014\u0000\u0000\u00d3\u00d4\u0005;\u0000"+
		"\u0000\u00d4\u00d5\u0005+\u0000\u0000\u00d5\u00d6\u0003 \u0010\u0000\u00d6"+
		"\u00d7\u0005\u0013\u0000\u0000\u00d7\u00d8\u0003\b\u0004\u0000\u00d8\u001f"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0003f3\u0000\u00da\u00db\u0007\u0000"+
		"\u0000\u0000\u00db\u00dc\u0003f3\u0000\u00dc!\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e0\u00034\u001a\u0000\u00de\u00e0\u00030\u0018\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0#\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e6\u00034\u001a\u0000\u00e2\u00e3\u0005,\u0000"+
		"\u0000\u00e3\u00e5\u00034\u001a\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7%\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0005;\u0000\u0000\u00ea\u00ec"+
		"\u0007\u0001\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\'\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		";\u0000\u0000\u00ee\u00f2\u0005%\u0000\u0000\u00ef\u00f3\u0003\"\u0011"+
		"\u0000\u00f0\u00f3\u0003,\u0016\u0000\u00f1\u00f3\u0003.\u0017\u0000\u00f2"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f8"+
		"\u0005\u0010\u0000\u0000\u00f5\u00f6\u0003(\u0014\u0000\u00f6\u00f7\u0005"+
		"-\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb+\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0005\u0002\u0000\u0000\u00fd\u00ff\u0003V+\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005.\u0000\u0000\u0101\u0102"+
		"\u0003&\u0013\u0000\u0102-\u0001\u0000\u0000\u0000\u0103\u0105\u0005\u0004"+
		"\u0000\u0000\u0104\u0106\u0003V+\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106/\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005\t\u0000\u0000\u0108\u0109\u00051\u0000\u0000\u0109\u010a"+
		"\u0003$\u0012\u0000\u010a\u010b\u00053\u0000\u0000\u010b\u010c\u0005\u000e"+
		"\u0000\u0000\u010c\u010d\u0003\"\u0011\u0000\u010d\u0116\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0005\t\u0000\u0000\u010f\u0110\u00052\u0000\u0000"+
		"\u0110\u0111\u0003$\u0012\u0000\u0111\u0112\u00054\u0000\u0000\u0112\u0113"+
		"\u0005\u000e\u0000\u0000\u0113\u0114\u0003\"\u0011\u0000\u0114\u0116\u0001"+
		"\u0000\u0000\u0000\u0115\u0107\u0001\u0000\u0000\u0000\u0115\u010e\u0001"+
		"\u0000\u0000\u0000\u01161\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u000f"+
		"\u0000\u0000\u0118\u0119\u00051\u0000\u0000\u0119\u011a\u0007\u0002\u0000"+
		"\u0000\u011a\u011b\u00053\u0000\u0000\u011b3\u0001\u0000\u0000\u0000\u011c"+
		"\u0121\u00036\u001b\u0000\u011d\u0121\u00038\u001c\u0000\u011e\u0121\u0003"+
		"&\u0013\u0000\u011f\u0121\u00032\u0019\u0000\u0120\u011c\u0001\u0000\u0000"+
		"\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u01215\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005/\u0000\u0000\u0123\u0124\u0003Z-\u0000\u0124\u0125"+
		"\u00050\u0000\u0000\u01257\u0001\u0000\u0000\u0000\u0126\u0127\u0003>"+
		"\u001f\u0000\u0127\u0128\u00056\u0000\u0000\u0128\u0129\u0003>\u001f\u0000"+
		"\u01299\u0001\u0000\u0000\u0000\u012a\u012b\u0007\u0003\u0000\u0000\u012b"+
		";\u0001\u0000\u0000\u0000\u012c\u012d\u0007\u0004\u0000\u0000\u012d=\u0001"+
		"\u0000\u0000\u0000\u012e\u0139\u0005:\u0000\u0000\u012f\u0130\u0003:\u001d"+
		"\u0000\u0130\u0131\u0005:\u0000\u0000\u0131\u0139\u0001\u0000\u0000\u0000"+
		"\u0132\u0139\u0005;\u0000\u0000\u0133\u0134\u0003:\u001d\u0000\u0134\u0135"+
		"\u0005;\u0000\u0000\u0135\u0139\u0001\u0000\u0000\u0000\u0136\u0139\u0005"+
		"9\u0000\u0000\u0137\u0139\u0003\u0006\u0003\u0000\u0138\u012e\u0001\u0000"+
		"\u0000\u0000\u0138\u012f\u0001\u0000\u0000\u0000\u0138\u0132\u0001\u0000"+
		"\u0000\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139?\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0003Z-\u0000\u013b\u013c\u0005.\u0000\u0000\u013c"+
		"\u013d\u0003\"\u0011\u0000\u013dA\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0005\b\u0000\u0000\u013f\u0144\u0003@ \u0000\u0140\u0141\u0005-\u0000"+
		"\u0000\u0141\u0143\u0003@ \u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146"+
		"\u0144\u0001\u0000\u0000\u0000\u0147\u0148\u0005-\u0000\u0000\u0148C\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005;\u0000\u0000\u014a\u014b\u0005%\u0000"+
		"\u0000\u014b\u014c\u0003>\u001f\u0000\u014cE\u0001\u0000\u0000\u0000\u014d"+
		"\u0151\u0005\u0007\u0000\u0000\u014e\u014f\u0003D\"\u0000\u014f\u0150"+
		"\u0005-\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014e\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0151\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154G\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005\u0004\u0000\u0000\u0156\u0158\u0005;\u0000"+
		"\u0000\u0157\u0159\u0003V+\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0005-\u0000\u0000\u015b\u015c\u0003\u0004\u0002\u0000\u015cI\u0001"+
		"\u0000\u0000\u0000\u015d\u0160\u0003H$\u0000\u015e\u0160\u0003\\.\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u0160K\u0001\u0000\u0000\u0000\u0161\u0162\u0003J%\u0000\u0162\u0163"+
		"\u0005-\u0000\u0000\u0163M\u0001\u0000\u0000\u0000\u0164\u0169\u0003R"+
		")\u0000\u0165\u0166\u0005,\u0000\u0000\u0166\u0168\u0003R)\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"O\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0003Z-\u0000\u016d\u016e\u0005.\u0000\u0000\u016e\u016f\u0003&\u0013"+
		"\u0000\u016fQ\u0001\u0000\u0000\u0000\u0170\u0174\u0003f3\u0000\u0171"+
		"\u0173\u0003T*\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176\u0001"+
		"\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175S\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0005.\u0000\u0000\u0178\u0179\u0003f3\u0000"+
		"\u0179U\u0001\u0000\u0000\u0000\u017a\u017b\u0005/\u0000\u0000\u017b\u0180"+
		"\u0003X,\u0000\u017c\u017d\u0005-\u0000\u0000\u017d\u017f\u0003X,\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u00050\u0000\u0000\u0184W\u0001\u0000\u0000\u0000\u0185\u018d"+
		"\u0003P(\u0000\u0186\u0187\u0005\b\u0000\u0000\u0187\u018d\u0003P(\u0000"+
		"\u0188\u0189\u0005\u0002\u0000\u0000\u0189\u018d\u0003P(\u0000\u018a\u018b"+
		"\u0005\u0004\u0000\u0000\u018b\u018d\u0003P(\u0000\u018c\u0185\u0001\u0000"+
		"\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000\u018c\u0188\u0001\u0000"+
		"\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018dY\u0001\u0000\u0000"+
		"\u0000\u018e\u0193\u0005;\u0000\u0000\u018f\u0190\u0005,\u0000\u0000\u0190"+
		"\u0192\u0005;\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195"+
		"\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194[\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005\u0002\u0000\u0000\u0197\u0199\u0005"+
		";\u0000\u0000\u0198\u019a\u0003V+\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005.\u0000\u0000\u019c\u019d\u0003&\u0013\u0000\u019d"+
		"\u019e\u0005-\u0000\u0000\u019e\u019f\u0003\u0004\u0002\u0000\u019f]\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0005;\u0000\u0000\u01a1\u01a2\u0005/\u0000"+
		"\u0000\u01a2\u01a3\u0003N\'\u0000\u01a3\u01a4\u00050\u0000\u0000\u01a4"+
		"_\u0001\u0000\u0000\u0000\u01a5\u01aa\u0005;\u0000\u0000\u01a6\u01a7\u0005"+
		"/\u0000\u0000\u01a7\u01a8\u0003N\'\u0000\u01a8\u01a9\u00050\u0000\u0000"+
		"\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a6\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01aba\u0001\u0000\u0000\u0000\u01ac"+
		"\u01c7\u0005;\u0000\u0000\u01ad\u01ae\u00051\u0000\u0000\u01ae\u01b3\u0003"+
		"f3\u0000\u01af\u01b0\u0005,\u0000\u0000\u01b0\u01b2\u0003f3\u0000\u01b1"+
		"\u01af\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u00053\u0000\u0000\u01b7\u01c6\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u00052\u0000\u0000\u01b9\u01be\u0003f3\u0000\u01ba\u01bb\u0005,\u0000"+
		"\u0000\u01bb\u01bd\u0003f3\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd"+
		"\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2\u00054\u0000\u0000\u01c2\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u00055\u0000\u0000\u01c4\u01c6\u0005"+
		";\u0000\u0000\u01c5\u01ad\u0001\u0000\u0000\u0000\u01c5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8c\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000"+
		"\u0000\u01ca\u01ce\u0003n7\u0000\u01cb\u01cc\u0003l6\u0000\u01cc\u01cd"+
		"\u0003d2\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cfe\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d4\u0003d2\u0000\u01d1\u01d2\u0003h4\u0000\u01d2\u01d3"+
		"\u0003f3\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5g\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0007\u0005\u0000\u0000\u01d7i\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0007\u0006\u0000\u0000\u01d9k\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0007\u0007\u0000\u0000\u01dbm\u0001\u0000\u0000\u0000\u01dc\u01e0"+
		"\u0003p8\u0000\u01dd\u01de\u0003j5\u0000\u01de\u01df\u0003n7\u0000\u01df"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1o\u0001\u0000\u0000\u0000\u01e2\u01e4"+
		"\u0007\u0003\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0003r9\u0000\u01e6q\u0001\u0000\u0000\u0000\u01e7\u01f2\u0003b1\u0000"+
		"\u01e8\u01e9\u0005/\u0000\u0000\u01e9\u01ea\u0003f3\u0000\u01ea\u01eb"+
		"\u00050\u0000\u0000\u01eb\u01f2\u0001\u0000\u0000\u0000\u01ec\u01f2\u0003"+
		"^/\u0000\u01ed\u01f2\u0003>\u001f\u0000\u01ee\u01ef\u0005!\u0000\u0000"+
		"\u01ef\u01f2\u0003r9\u0000\u01f0\u01f2\u0003<\u001e\u0000\u01f1\u01e7"+
		"\u0001\u0000\u0000\u0000\u01f1\u01e8\u0001\u0000\u0000\u0000\u01f1\u01ec"+
		"\u0001\u0000\u0000\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f1\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2s\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4u\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6w\u0001\u0000\u0000"+
		"\u0000(\u0083\u008b\u008d\u009b\u009f\u00a4\u00a9\u00b6\u00bd\u00d0\u00df"+
		"\u00e6\u00eb\u00f2\u00fa\u00fe\u0105\u0115\u0120\u0138\u0144\u0153\u0158"+
		"\u015f\u0169\u0174\u0180\u018c\u0193\u0199\u01aa\u01b3\u01be\u01c5\u01c7"+
		"\u01ce\u01d4\u01e0\u01e3\u01f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}