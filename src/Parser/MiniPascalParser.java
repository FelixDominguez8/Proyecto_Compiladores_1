// Generated from C:/Users/Alberth/OneDrive - Universidad Tecnologica Centroamericana/Documents/Unitec/2024/III Trimestre/Compiladores_1/proyecto/proyecto_compi/Proyecto_Compiladores_1/src/MiniPascal.g4 by ANTLR 4.13.1
package Parser;
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
		IF=16, ELSE=17, ELIF=18, DO=19, FOR=20, DOWNTO=21, REPEAT=22, THEN=23, 
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
		RULE_tipo = 17, RULE_tipolista = 18, RULE_tipoidentificador = 19, RULE_tipoarreglo = 20, 
		RULE_tipocadena = 21, RULE_tiposimple = 22, RULE_tipoescalar = 23, RULE_tiposubrango = 24, 
		RULE_signo = 25, RULE_valorbooleano = 26, RULE_constante = 27, RULE_declaracionvariable = 28, 
		RULE_secciondeclaracionvariable = 29, RULE_definicionconstante = 30, RULE_secciondeclaracionconstante = 31, 
		RULE_declaracionproceso = 32, RULE_declaracionprocesoofuncion = 33, RULE_secciondeclaracionprocesoofuncion = 34, 
		RULE_listaparametros = 35, RULE_grupoparametros = 36, RULE_parametroactual = 37, 
		RULE_anchoparametro = 38, RULE_listaformalparametros = 39, RULE_seccionformalparametros = 40, 
		RULE_listaidentificadores = 41, RULE_declaracionfuncion = 42, RULE_designarfuncion = 43, 
		RULE_instruccionprocedimiento = 44, RULE_variable = 45, RULE_expresionsimple = 46, 
		RULE_expresion = 47, RULE_operadorrelacional = 48, RULE_operadormultiplicativo = 49, 
		RULE_operadoraditivo = 50, RULE_termino = 51, RULE_signofactor = 52, RULE_factor = 53, 
		RULE_instruccionvacia = 54, RULE_vacio = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "encabezado", "bloque", "length", "instruccion", "tipoinstruccion", 
			"instruccionsimple", "instruccionestructurada", "instruccionasignacion", 
			"bloqueinstruccion", "estructurarepetitiva", "instrucciones", "buclerepeat", 
			"buclewhile", "estructuraif", "buclefor", "listafor", "tipo", "tipolista", 
			"tipoidentificador", "tipoarreglo", "tipocadena", "tiposimple", "tipoescalar", 
			"tiposubrango", "signo", "valorbooleano", "constante", "declaracionvariable", 
			"secciondeclaracionvariable", "definicionconstante", "secciondeclaracionconstante", 
			"declaracionproceso", "declaracionprocesoofuncion", "secciondeclaracionprocesoofuncion", 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			encabezado();
			setState(113);
			bloque();
			setState(114);
			match(DOT);
			setState(115);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitEncabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_encabezado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PROGRAM);
			setState(118);
			match(IDENTIFIER);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(119);
				match(PARL);
				setState(120);
				listaidentificadores();
				setState(121);
				match(PARR);
				}
			}

			setState(125);
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
		public List<SecciondeclaracionconstanteContext> secciondeclaracionconstante() {
			return getRuleContexts(SecciondeclaracionconstanteContext.class);
		}
		public SecciondeclaracionconstanteContext secciondeclaracionconstante(int i) {
			return getRuleContext(SecciondeclaracionconstanteContext.class,i);
		}
		public List<SecciondeclaracionvariableContext> secciondeclaracionvariable() {
			return getRuleContexts(SecciondeclaracionvariableContext.class);
		}
		public SecciondeclaracionvariableContext secciondeclaracionvariable(int i) {
			return getRuleContext(SecciondeclaracionvariableContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 404L) != 0)) {
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(127);
					secciondeclaracionconstante();
					}
					break;
				case VAR:
					{
					setState(128);
					secciondeclaracionvariable();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(129);
					secciondeclaracionprocesoofuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(LENGTH);
			setState(138);
			match(PARL);
			setState(139);
			variable();
			setState(140);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruccion);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(NUM);
				setState(143);
				match(COLON);
				setState(144);
				tipoinstruccion();
				}
				break;
			case BEGIN:
			case END:
			case IF:
			case ELSE:
			case ELIF:
			case FOR:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case SEMICOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipoinstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoinstruccionContext tipoinstruccion() throws RecognitionException {
		TipoinstruccionContext _localctx = new TipoinstruccionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoinstruccion);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				instruccionsimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				instruccionestructurada();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstruccionsimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionsimpleContext instruccionsimple() throws RecognitionException {
		InstruccionsimpleContext _localctx = new InstruccionsimpleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccionsimple);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				instruccionasignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				instruccionprocedimiento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstruccionestructurada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionestructuradaContext instruccionestructurada() throws RecognitionException {
		InstruccionestructuradaContext _localctx = new InstruccionestructuradaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruccionestructurada);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				bloqueinstruccion();
				}
				break;
			case IF:
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				estructuraif();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstruccionasignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionasignacionContext instruccionasignacion() throws RecognitionException {
		InstruccionasignacionContext _localctx = new InstruccionasignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccionasignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			variable();
			setState(163);
			match(ASSIGN);
			setState(164);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBloqueinstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueinstruccionContext bloqueinstruccion() throws RecognitionException {
		BloqueinstruccionContext _localctx = new BloqueinstruccionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloqueinstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(BEGIN);
			setState(167);
			instrucciones();
			setState(168);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitEstructurarepetitiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructurarepetitivaContext estructurarepetitiva() throws RecognitionException {
		EstructurarepetitivaContext _localctx = new EstructurarepetitivaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_estructurarepetitiva);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				buclewhile();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				buclerepeat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			instruccion();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(176);
				match(SEMICOLON);
				setState(177);
				instruccion();
				}
				}
				setState(182);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBuclerepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclerepeatContext buclerepeat() throws RecognitionException {
		BuclerepeatContext _localctx = new BuclerepeatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_buclerepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(REPEAT);
			setState(184);
			instrucciones();
			setState(185);
			match(UNTIL);
			setState(186);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBuclewhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_buclewhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WHILE);
			setState(189);
			expresion();
			setState(190);
			match(DO);
			setState(191);
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
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(MiniPascalParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(MiniPascalParser.THEN, i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public TerminalNode ELIF() { return getToken(MiniPascalParser.ELIF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitEstructuraif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraifContext estructuraif() throws RecognitionException {
		EstructuraifContext _localctx = new EstructuraifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_estructuraif);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(IF);
				setState(194);
				expresion();
				setState(195);
				match(THEN);
				setState(196);
				instruccion();
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(197);
					match(ELSE);
					setState(198);
					instruccion();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(IF);
				setState(202);
				expresion();
				setState(203);
				match(THEN);
				setState(204);
				instruccion();
				{
				setState(205);
				match(ELIF);
				setState(206);
				expresion();
				setState(207);
				match(THEN);
				setState(208);
				instruccion();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(ELSE);
				setState(211);
				instruccion();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBuclefor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleforContext buclefor() throws RecognitionException {
		BucleforContext _localctx = new BucleforContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_buclefor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(FOR);
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(ASSIGN);
			setState(217);
			listafor();
			setState(218);
			match(DO);
			setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitListafor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaforContext listafor() throws RecognitionException {
		ListaforContext _localctx = new ListaforContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listafor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expresion();
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo);
		try {
			setState(227);
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
				setState(225);
				tiposimple();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipolista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipolistaContext tipolista() throws RecognitionException {
		TipolistaContext _localctx = new TipolistaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipolista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			tiposimple();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				tiposimple();
				}
				}
				setState(236);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipoidentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoidentificadorContext tipoidentificador() throws RecognitionException {
		TipoidentificadorContext _localctx = new TipoidentificadorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipoidentificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipoarreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoarregloContext tipoarreglo() throws RecognitionException {
		TipoarregloContext _localctx = new TipoarregloContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tipoarreglo);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ARRAY);
				setState(240);
				match(LBRACKET);
				setState(241);
				tipolista();
				setState(242);
				match(RBRACKET);
				setState(243);
				match(OF);
				setState(244);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(ARRAY);
				setState(247);
				match(LBRACKETP);
				setState(248);
				tipolista();
				setState(249);
				match(RBRACKETP);
				setState(250);
				match(OF);
				setState(251);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipocadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipocadenaContext tipocadena() throws RecognitionException {
		TipocadenaContext _localctx = new TipocadenaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tipocadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(STRING);
			setState(256);
			match(LBRACKET);
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTiposimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposimpleContext tiposimple() throws RecognitionException {
		TiposimpleContext _localctx = new TiposimpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tiposimple);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				tipoescalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				tiposubrango();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				tipoidentificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTipoescalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoescalarContext tipoescalar() throws RecognitionException {
		TipoescalarContext _localctx = new TipoescalarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipoescalar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(PARL);
			setState(267);
			listaidentificadores();
			setState(268);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTiposubrango(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposubrangoContext tiposubrango() throws RecognitionException {
		TiposubrangoContext _localctx = new TiposubrangoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tiposubrango);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			constante();
			setState(271);
			match(DOT2);
			setState(272);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSigno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_signo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitValorbooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorbooleanoContext valorbooleano() throws RecognitionException {
		ValorbooleanoContext _localctx = new ValorbooleanoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valorbooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constante);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				signo();
				setState(280);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				signo();
				setState(284);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(LSTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitDeclaracionvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionvariableContext declaracionvariable() throws RecognitionException {
		DeclaracionvariableContext _localctx = new DeclaracionvariableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaracionvariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			listaidentificadores();
			setState(291);
			match(COLON);
			setState(292);
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
	public static class SecciondeclaracionvariableContext extends ParserRuleContext {
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
		public SecciondeclaracionvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secciondeclaracionvariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSecciondeclaracionvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSecciondeclaracionvariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSecciondeclaracionvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecciondeclaracionvariableContext secciondeclaracionvariable() throws RecognitionException {
		SecciondeclaracionvariableContext _localctx = new SecciondeclaracionvariableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_secciondeclaracionvariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(VAR);
			setState(295);
			declaracionvariable();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(SEMICOLON);
					setState(297);
					declaracionvariable();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(303);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitDefinicionconstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionconstanteContext definicionconstante() throws RecognitionException {
		DefinicionconstanteContext _localctx = new DefinicionconstanteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_definicionconstante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(EQUAL);
			setState(307);
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
	public static class SecciondeclaracionconstanteContext extends ParserRuleContext {
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
		public SecciondeclaracionconstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secciondeclaracionconstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSecciondeclaracionconstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSecciondeclaracionconstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSecciondeclaracionconstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecciondeclaracionconstanteContext secciondeclaracionconstante() throws RecognitionException {
		SecciondeclaracionconstanteContext _localctx = new SecciondeclaracionconstanteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_secciondeclaracionconstante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(CONST);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				definicionconstante();
				setState(311);
				match(SEMICOLON);
				}
				}
				setState(315); 
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
	public static class DeclaracionprocesoContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(MiniPascalParser.PROCEDURE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaformalparametrosContext listaformalparametros() {
			return getRuleContext(ListaformalparametrosContext.class,0);
		}
		public DeclaracionprocesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionproceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracionproceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracionproceso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitDeclaracionproceso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionprocesoContext declaracionproceso() throws RecognitionException {
		DeclaracionprocesoContext _localctx = new DeclaracionprocesoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaracionproceso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(PROCEDURE);
			setState(318);
			match(IDENTIFIER);
			setState(319);
			match(PARL);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460752303423764L) != 0)) {
				{
				setState(320);
				listaformalparametros();
				}
			}

			setState(323);
			match(PARR);
			setState(324);
			match(SEMICOLON);
			setState(325);
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
		public DeclaracionprocesoContext declaracionproceso() {
			return getRuleContext(DeclaracionprocesoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitDeclaracionprocesoofuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionprocesoofuncionContext declaracionprocesoofuncion() throws RecognitionException {
		DeclaracionprocesoofuncionContext _localctx = new DeclaracionprocesoofuncionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declaracionprocesoofuncion);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				declaracionproceso();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSecciondeclaracionprocesoofuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecciondeclaracionprocesoofuncionContext secciondeclaracionprocesoofuncion() throws RecognitionException {
		SecciondeclaracionprocesoofuncionContext _localctx = new SecciondeclaracionprocesoofuncionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_secciondeclaracionprocesoofuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			declaracionprocesoofuncion();
			setState(332);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitListaparametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaparametrosContext listaparametros() throws RecognitionException {
		ListaparametrosContext _localctx = new ListaparametrosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_listaparametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			parametroactual();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(336);
				parametroactual();
				}
				}
				setState(341);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitGrupoparametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrupoparametrosContext grupoparametros() throws RecognitionException {
		GrupoparametrosContext _localctx = new GrupoparametrosContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_grupoparametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			listaidentificadores();
			setState(343);
			match(COLON);
			setState(344);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitParametroactual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroactualContext parametroactual() throws RecognitionException {
		ParametroactualContext _localctx = new ParametroactualContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parametroactual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			expresion();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(347);
				anchoparametro();
				}
				}
				setState(352);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAnchoparametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchoparametroContext anchoparametro() throws RecognitionException {
		AnchoparametroContext _localctx = new AnchoparametroContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_anchoparametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(COLON);
			setState(354);
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
		public List<SeccionformalparametrosContext> seccionformalparametros() {
			return getRuleContexts(SeccionformalparametrosContext.class);
		}
		public SeccionformalparametrosContext seccionformalparametros(int i) {
			return getRuleContext(SeccionformalparametrosContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitListaformalparametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaformalparametrosContext listaformalparametros() throws RecognitionException {
		ListaformalparametrosContext _localctx = new ListaformalparametrosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listaformalparametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			seccionformalparametros();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(357);
				match(SEMICOLON);
				setState(358);
				seccionformalparametros();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSeccionformalparametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionformalparametrosContext seccionformalparametros() throws RecognitionException {
		SeccionformalparametrosContext _localctx = new SeccionformalparametrosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_seccionformalparametros);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				grupoparametros();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(VAR);
				setState(366);
				grupoparametros();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(FUNCTION);
				setState(368);
				grupoparametros();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(PROCEDURE);
				setState(370);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitListaidentificadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaidentificadoresContext listaidentificadores() throws RecognitionException {
		ListaidentificadoresContext _localctx = new ListaidentificadoresContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_listaidentificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IDENTIFIER);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(374);
				match(COMMA);
				setState(375);
				match(IDENTIFIER);
				}
				}
				setState(380);
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
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitDeclaracionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionfuncionContext declaracionfuncion() throws RecognitionException {
		DeclaracionfuncionContext _localctx = new DeclaracionfuncionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declaracionfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(FUNCTION);
			setState(382);
			match(IDENTIFIER);
			setState(383);
			match(PARL);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460752303423764L) != 0)) {
				{
				setState(384);
				listaformalparametros();
				}
			}

			setState(387);
			match(PARR);
			setState(388);
			match(COLON);
			setState(389);
			tipoidentificador();
			setState(390);
			match(SEMICOLON);
			setState(391);
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
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitDesignarfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignarfuncionContext designarfuncion() throws RecognitionException {
		DesignarfuncionContext _localctx = new DesignarfuncionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_designarfuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(IDENTIFIER);
			setState(394);
			match(PARL);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1008947165889822728L) != 0)) {
				{
				setState(395);
				listaparametros();
				}
			}

			setState(398);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstruccionprocedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionprocedimientoContext instruccionprocedimiento() throws RecognitionException {
		InstruccionprocedimientoContext _localctx = new InstruccionprocedimientoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_instruccionprocedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(IDENTIFIER);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(401);
				match(PARL);
				setState(402);
				listaparametros();
				setState(403);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IDENTIFIER);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10696049115004928L) != 0)) {
				{
				setState(432);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(408);
					match(LBRACKET);
					setState(409);
					expresion();
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(410);
						match(COMMA);
						setState(411);
						expresion();
						}
						}
						setState(416);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(417);
					match(RBRACKET);
					}
					break;
				case LBRACKETP:
					{
					setState(419);
					match(LBRACKETP);
					setState(420);
					expresion();
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(421);
						match(COMMA);
						setState(422);
						expresion();
						}
						}
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(428);
					match(RBRACKETP);
					}
					break;
				case DOT:
					{
					setState(430);
					match(DOT);
					setState(431);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(436);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExpresionsimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionsimpleContext expresionsimple() throws RecognitionException {
		ExpresionsimpleContext _localctx = new ExpresionsimpleContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expresionsimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			termino();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17381195776L) != 0)) {
				{
				setState(438);
				operadoraditivo();
				setState(439);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			expresionsimple();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8658654068736L) != 0)) {
				{
				setState(444);
				operadorrelacional();
				setState(445);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitOperadorrelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorrelacionalContext operadorrelacional() throws RecognitionException {
		OperadorrelacionalContext _localctx = new OperadorrelacionalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_operadorrelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitOperadormultiplicativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadormultiplicativoContext operadormultiplicativo() throws RecognitionException {
		OperadormultiplicativoContext _localctx = new OperadormultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_operadormultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitOperadoraditivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoraditivoContext operadoraditivo() throws RecognitionException {
		OperadoraditivoContext _localctx = new OperadoraditivoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_operadoraditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			signofactor();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) {
				{
				setState(456);
				operadormultiplicativo();
				setState(457);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSignofactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignofactorContext signofactor() throws RecognitionException {
		SignofactorContext _localctx = new SignofactorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_signofactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(461);
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
			setState(464);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_factor);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(PARL);
				setState(468);
				expresion();
				setState(469);
				match(PARR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				designarfuncion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				constante();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				match(NOT);
				setState(474);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(475);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstruccionvacia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionvaciaContext instruccionvacia() throws RecognitionException {
		InstruccionvaciaContext _localctx = new InstruccionvaciaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_instruccionvacia);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VacioContext vacio() throws RecognitionException {
		VacioContext _localctx = new VacioContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_vacio);
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
		"\u0004\u0001;\u01e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001|\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0083\b\u0002\n\u0002\f\u0002\u0086\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0093\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0097\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u009c\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a1\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00ae\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00b3\b\u000b\n\u000b\f\u000b\u00b6"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d5\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00e4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e9"+
		"\b\u0012\n\u0012\f\u0012\u00ec\t\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00fe\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0109\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0121\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u012b\b\u001d"+
		"\n\u001d\f\u001d\u012e\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0004\u001f\u013a\b\u001f\u000b\u001f\f\u001f\u013b\u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0142\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0003!\u014a\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#"+
		"\u0152\b#\n#\f#\u0155\t#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0005"+
		"%\u015d\b%\n%\f%\u0160\t%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u0168\b\'\n\'\f\'\u016b\t\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u0174\b(\u0001)\u0001)\u0001)\u0005)\u0179\b)\n"+
		")\f)\u017c\t)\u0001*\u0001*\u0001*\u0001*\u0003*\u0182\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u018d\b+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0196\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u019d\b-\n-\f-\u01a0\t-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u01a8\b-\n-\f-\u01ab\t-\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u01b1\b-\n-\f-\u01b4\t-\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u01ba\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u01c0\b/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00013\u00013\u00033\u01cc\b3\u0001"+
		"4\u00034\u01cf\b4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00035\u01dd\b5\u00016\u00016\u00017\u0001"+
		"7\u00017\u0000\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjln\u0000\b\u0002\u0000\n\n\u0015\u0015\u0002\u0000\u000b\r\u000f"+
		"\u000f\u0001\u0000:;\u0001\u0000\u001a\u001b\u0001\u0000#$\u0001\u0000"+
		"%*\u0001\u0000\u001c \u0002\u0000\u001a\u001b\"\"\u01e1\u0000p\u0001\u0000"+
		"\u0000\u0000\u0002u\u0001\u0000\u0000\u0000\u0004\u0084\u0001\u0000\u0000"+
		"\u0000\u0006\u0089\u0001\u0000\u0000\u0000\b\u0092\u0001\u0000\u0000\u0000"+
		"\n\u0096\u0001\u0000\u0000\u0000\f\u009b\u0001\u0000\u0000\u0000\u000e"+
		"\u00a0\u0001\u0000\u0000\u0000\u0010\u00a2\u0001\u0000\u0000\u0000\u0012"+
		"\u00a6\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000\u0000\u0000\u0016"+
		"\u00af\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000\u0000\u001a"+
		"\u00bc\u0001\u0000\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e"+
		"\u00d6\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\"\u00e3"+
		"\u0001\u0000\u0000\u0000$\u00e5\u0001\u0000\u0000\u0000&\u00ed\u0001\u0000"+
		"\u0000\u0000(\u00fd\u0001\u0000\u0000\u0000*\u00ff\u0001\u0000\u0000\u0000"+
		",\u0108\u0001\u0000\u0000\u0000.\u010a\u0001\u0000\u0000\u00000\u010e"+
		"\u0001\u0000\u0000\u00002\u0112\u0001\u0000\u0000\u00004\u0114\u0001\u0000"+
		"\u0000\u00006\u0120\u0001\u0000\u0000\u00008\u0122\u0001\u0000\u0000\u0000"+
		":\u0126\u0001\u0000\u0000\u0000<\u0131\u0001\u0000\u0000\u0000>\u0135"+
		"\u0001\u0000\u0000\u0000@\u013d\u0001\u0000\u0000\u0000B\u0149\u0001\u0000"+
		"\u0000\u0000D\u014b\u0001\u0000\u0000\u0000F\u014e\u0001\u0000\u0000\u0000"+
		"H\u0156\u0001\u0000\u0000\u0000J\u015a\u0001\u0000\u0000\u0000L\u0161"+
		"\u0001\u0000\u0000\u0000N\u0164\u0001\u0000\u0000\u0000P\u0173\u0001\u0000"+
		"\u0000\u0000R\u0175\u0001\u0000\u0000\u0000T\u017d\u0001\u0000\u0000\u0000"+
		"V\u0189\u0001\u0000\u0000\u0000X\u0190\u0001\u0000\u0000\u0000Z\u0197"+
		"\u0001\u0000\u0000\u0000\\\u01b5\u0001\u0000\u0000\u0000^\u01bb\u0001"+
		"\u0000\u0000\u0000`\u01c1\u0001\u0000\u0000\u0000b\u01c3\u0001\u0000\u0000"+
		"\u0000d\u01c5\u0001\u0000\u0000\u0000f\u01c7\u0001\u0000\u0000\u0000h"+
		"\u01ce\u0001\u0000\u0000\u0000j\u01dc\u0001\u0000\u0000\u0000l\u01de\u0001"+
		"\u0000\u0000\u0000n\u01e0\u0001\u0000\u0000\u0000pq\u0003\u0002\u0001"+
		"\u0000qr\u0003\u0004\u0002\u0000rs\u00055\u0000\u0000st\u0005\u0000\u0000"+
		"\u0001t\u0001\u0001\u0000\u0000\u0000uv\u0005\u0001\u0000\u0000v{\u0005"+
		";\u0000\u0000wx\u0005/\u0000\u0000xy\u0003R)\u0000yz\u00050\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}~\u0005-\u0000\u0000~\u0003\u0001\u0000"+
		"\u0000\u0000\u007f\u0083\u0003>\u001f\u0000\u0080\u0083\u0003:\u001d\u0000"+
		"\u0081\u0083\u0003D\"\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u0005"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b"+
		"\u0005/\u0000\u0000\u008b\u008c\u0003Z-\u0000\u008c\u008d\u00050\u0000"+
		"\u0000\u008d\u0007\u0001\u0000\u0000\u0000\u008e\u008f\u0005:\u0000\u0000"+
		"\u008f\u0090\u0005.\u0000\u0000\u0090\u0093\u0003\n\u0005\u0000\u0091"+
		"\u0093\u0003\n\u0005\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0097\u0003"+
		"\f\u0006\u0000\u0095\u0097\u0003\u000e\u0007\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u000b\u0001\u0000"+
		"\u0000\u0000\u0098\u009c\u0003\u0010\b\u0000\u0099\u009c\u0003X,\u0000"+
		"\u009a\u009c\u0003l6\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\r\u0001"+
		"\u0000\u0000\u0000\u009d\u00a1\u0003\u0012\t\u0000\u009e\u00a1\u0003\u001c"+
		"\u000e\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003Z-\u0000\u00a3"+
		"\u00a4\u0005+\u0000\u0000\u00a4\u00a5\u0003^/\u0000\u00a5\u0011\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0016\u000b\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9\u0013\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ae\u0003\u001a\r\u0000\u00ab\u00ae\u0003\u0018"+
		"\f\u0000\u00ac\u00ae\u0003\u001e\u000f\u0000\u00ad\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u0015\u0001\u0000\u0000\u0000\u00af\u00b4\u0003\b\u0004\u0000"+
		"\u00b0\u00b1\u0005-\u0000\u0000\u00b1\u00b3\u0003\b\u0004\u0000\u00b2"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u0017\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0016\u0000\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9"+
		"\u00ba\u0005\u0018\u0000\u0000\u00ba\u00bb\u0003^/\u0000\u00bb\u0019\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0019\u0000\u0000\u00bd\u00be\u0003"+
		"^/\u0000\u00be\u00bf\u0005\u0013\u0000\u0000\u00bf\u00c0\u0003\b\u0004"+
		"\u0000\u00c0\u001b\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000"+
		"\u0000\u00c2\u00c3\u0003^/\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4"+
		"\u00c7\u0003\b\u0004\u0000\u00c5\u00c6\u0005\u0011\u0000\u0000\u00c6\u00c8"+
		"\u0003\b\u0004\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00d5\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"\u0010\u0000\u0000\u00ca\u00cb\u0003^/\u0000\u00cb\u00cc\u0005\u0017\u0000"+
		"\u0000\u00cc\u00cd\u0003\b\u0004\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000"+
		"\u00ce\u00cf\u0003^/\u0000\u00cf\u00d0\u0005\u0017\u0000\u0000\u00d0\u00d1"+
		"\u0003\b\u0004\u0000\u00d1\u00d5\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0011\u0000\u0000\u00d3\u00d5\u0003\b\u0004\u0000\u00d4\u00c1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00c9\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0014"+
		"\u0000\u0000\u00d7\u00d8\u0005;\u0000\u0000\u00d8\u00d9\u0005+\u0000\u0000"+
		"\u00d9\u00da\u0003 \u0010\u0000\u00da\u00db\u0005\u0013\u0000\u0000\u00db"+
		"\u00dc\u0003\b\u0004\u0000\u00dc\u001f\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0003^/\u0000\u00de\u00df\u0007\u0000\u0000\u0000\u00df\u00e0\u0003^"+
		"/\u0000\u00e0!\u0001\u0000\u0000\u0000\u00e1\u00e4\u0003,\u0016\u0000"+
		"\u00e2\u00e4\u0003(\u0014\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4#\u0001\u0000\u0000\u0000\u00e5\u00ea"+
		"\u0003,\u0016\u0000\u00e6\u00e7\u0005,\u0000\u0000\u00e7\u00e9\u0003,"+
		"\u0016\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb%\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0007\u0001\u0000\u0000\u00ee\'\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\t\u0000\u0000\u00f0\u00f1\u00051\u0000\u0000\u00f1"+
		"\u00f2\u0003$\u0012\u0000\u00f2\u00f3\u00053\u0000\u0000\u00f3\u00f4\u0005"+
		"\u000e\u0000\u0000\u00f4\u00f5\u0003\"\u0011\u0000\u00f5\u00fe\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\t\u0000\u0000\u00f7\u00f8\u00052\u0000"+
		"\u0000\u00f8\u00f9\u0003$\u0012\u0000\u00f9\u00fa\u00054\u0000\u0000\u00fa"+
		"\u00fb\u0005\u000e\u0000\u0000\u00fb\u00fc\u0003\"\u0011\u0000\u00fc\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fd\u00ef\u0001\u0000\u0000\u0000\u00fd\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\u000f\u0000\u0000\u0100\u0101\u00051\u0000\u0000\u0101\u0102\u0007\u0002"+
		"\u0000\u0000\u0102\u0103\u00053\u0000\u0000\u0103+\u0001\u0000\u0000\u0000"+
		"\u0104\u0109\u0003.\u0017\u0000\u0105\u0109\u00030\u0018\u0000\u0106\u0109"+
		"\u0003&\u0013\u0000\u0107\u0109\u0003*\u0015\u0000\u0108\u0104\u0001\u0000"+
		"\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109-\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005/\u0000\u0000\u010b\u010c\u0003R)\u0000\u010c"+
		"\u010d\u00050\u0000\u0000\u010d/\u0001\u0000\u0000\u0000\u010e\u010f\u0003"+
		"6\u001b\u0000\u010f\u0110\u00056\u0000\u0000\u0110\u0111\u00036\u001b"+
		"\u0000\u01111\u0001\u0000\u0000\u0000\u0112\u0113\u0007\u0003\u0000\u0000"+
		"\u01133\u0001\u0000\u0000\u0000\u0114\u0115\u0007\u0004\u0000\u0000\u0115"+
		"5\u0001\u0000\u0000\u0000\u0116\u0121\u0005:\u0000\u0000\u0117\u0118\u0003"+
		"2\u0019\u0000\u0118\u0119\u0005:\u0000\u0000\u0119\u0121\u0001\u0000\u0000"+
		"\u0000\u011a\u0121\u0005;\u0000\u0000\u011b\u011c\u00032\u0019\u0000\u011c"+
		"\u011d\u0005;\u0000\u0000\u011d\u0121\u0001\u0000\u0000\u0000\u011e\u0121"+
		"\u00059\u0000\u0000\u011f\u0121\u0003\u0006\u0003\u0000\u0120\u0116\u0001"+
		"\u0000\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120\u011a\u0001"+
		"\u0000\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u01217\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0003R)\u0000\u0123\u0124\u0005.\u0000\u0000"+
		"\u0124\u0125\u0003\"\u0011\u0000\u01259\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\b\u0000\u0000\u0127\u012c\u00038\u001c\u0000\u0128\u0129"+
		"\u0005-\u0000\u0000\u0129\u012b\u00038\u001c\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005-\u0000"+
		"\u0000\u0130;\u0001\u0000\u0000\u0000\u0131\u0132\u0005;\u0000\u0000\u0132"+
		"\u0133\u0005%\u0000\u0000\u0133\u0134\u00036\u001b\u0000\u0134=\u0001"+
		"\u0000\u0000\u0000\u0135\u0139\u0005\u0007\u0000\u0000\u0136\u0137\u0003"+
		"<\u001e\u0000\u0137\u0138\u0005-\u0000\u0000\u0138\u013a\u0001\u0000\u0000"+
		"\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c?\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0004\u0000\u0000"+
		"\u013e\u013f\u0005;\u0000\u0000\u013f\u0141\u0005/\u0000\u0000\u0140\u0142"+
		"\u0003N\'\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"0\u0000\u0000\u0144\u0145\u0005-\u0000\u0000\u0145\u0146\u0003\u0004\u0002"+
		"\u0000\u0146A\u0001\u0000\u0000\u0000\u0147\u014a\u0003@ \u0000\u0148"+
		"\u014a\u0003T*\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001"+
		"\u0000\u0000\u0000\u014aC\u0001\u0000\u0000\u0000\u014b\u014c\u0003B!"+
		"\u0000\u014c\u014d\u0005-\u0000\u0000\u014dE\u0001\u0000\u0000\u0000\u014e"+
		"\u0153\u0003J%\u0000\u014f\u0150\u0005,\u0000\u0000\u0150\u0152\u0003"+
		"J%\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154G\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0003R)\u0000\u0157\u0158\u0005.\u0000\u0000\u0158\u0159"+
		"\u0003&\u0013\u0000\u0159I\u0001\u0000\u0000\u0000\u015a\u015e\u0003^"+
		"/\u0000\u015b\u015d\u0003L&\u0000\u015c\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015fK\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u0162\u0005.\u0000\u0000\u0162\u0163"+
		"\u0003^/\u0000\u0163M\u0001\u0000\u0000\u0000\u0164\u0169\u0003P(\u0000"+
		"\u0165\u0166\u0005-\u0000\u0000\u0166\u0168\u0003P(\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016aO\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u0174\u0003"+
		"H$\u0000\u016d\u016e\u0005\b\u0000\u0000\u016e\u0174\u0003H$\u0000\u016f"+
		"\u0170\u0005\u0002\u0000\u0000\u0170\u0174\u0003H$\u0000\u0171\u0172\u0005"+
		"\u0004\u0000\u0000\u0172\u0174\u0003H$\u0000\u0173\u016c\u0001\u0000\u0000"+
		"\u0000\u0173\u016d\u0001\u0000\u0000\u0000\u0173\u016f\u0001\u0000\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174Q\u0001\u0000\u0000\u0000"+
		"\u0175\u017a\u0005;\u0000\u0000\u0176\u0177\u0005,\u0000\u0000\u0177\u0179"+
		"\u0005;\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017bS\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e\u017f\u0005;\u0000"+
		"\u0000\u017f\u0181\u0005/\u0000\u0000\u0180\u0182\u0003N\'\u0000\u0181"+
		"\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u00050\u0000\u0000\u0184\u0185"+
		"\u0005.\u0000\u0000\u0185\u0186\u0003&\u0013\u0000\u0186\u0187\u0005-"+
		"\u0000\u0000\u0187\u0188\u0003\u0004\u0002\u0000\u0188U\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0005;\u0000\u0000\u018a\u018c\u0005/\u0000\u0000\u018b"+
		"\u018d\u0003F#\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"0\u0000\u0000\u018fW\u0001\u0000\u0000\u0000\u0190\u0195\u0005;\u0000"+
		"\u0000\u0191\u0192\u0005/\u0000\u0000\u0192\u0193\u0003F#\u0000\u0193"+
		"\u0194\u00050\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u0191"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196Y\u0001"+
		"\u0000\u0000\u0000\u0197\u01b2\u0005;\u0000\u0000\u0198\u0199\u00051\u0000"+
		"\u0000\u0199\u019e\u0003^/\u0000\u019a\u019b\u0005,\u0000\u0000\u019b"+
		"\u019d\u0003^/\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a0\u0001"+
		"\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u00053\u0000\u0000\u01a2\u01b1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u00052\u0000\u0000\u01a4\u01a9\u0003^/\u0000"+
		"\u01a5\u01a6\u0005,\u0000\u0000\u01a6\u01a8\u0003^/\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u00054\u0000\u0000\u01ad\u01b1\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"5\u0000\u0000\u01af\u01b1\u0005;\u0000\u0000\u01b0\u0198\u0001\u0000\u0000"+
		"\u0000\u01b0\u01a3\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3[\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b9\u0003f3\u0000\u01b6\u01b7"+
		"\u0003d2\u0000\u01b7\u01b8\u0003\\.\u0000\u01b8\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba]\u0001\u0000\u0000\u0000\u01bb\u01bf\u0003\\.\u0000\u01bc"+
		"\u01bd\u0003`0\u0000\u01bd\u01be\u0003^/\u0000\u01be\u01c0\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0_\u0001\u0000\u0000\u0000\u01c1\u01c2\u0007\u0005\u0000"+
		"\u0000\u01c2a\u0001\u0000\u0000\u0000\u01c3\u01c4\u0007\u0006\u0000\u0000"+
		"\u01c4c\u0001\u0000\u0000\u0000\u01c5\u01c6\u0007\u0007\u0000\u0000\u01c6"+
		"e\u0001\u0000\u0000\u0000\u01c7\u01cb\u0003h4\u0000\u01c8\u01c9\u0003"+
		"b1\u0000\u01c9\u01ca\u0003f3\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ccg\u0001\u0000\u0000\u0000\u01cd\u01cf\u0007\u0003\u0000\u0000\u01ce"+
		"\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003j5\u0000\u01d1i\u0001"+
		"\u0000\u0000\u0000\u01d2\u01dd\u0003Z-\u0000\u01d3\u01d4\u0005/\u0000"+
		"\u0000\u01d4\u01d5\u0003^/\u0000\u01d5\u01d6\u00050\u0000\u0000\u01d6"+
		"\u01dd\u0001\u0000\u0000\u0000\u01d7\u01dd\u0003V+\u0000\u01d8\u01dd\u0003"+
		"6\u001b\u0000\u01d9\u01da\u0005!\u0000\u0000\u01da\u01dd\u0003j5\u0000"+
		"\u01db\u01dd\u00034\u001a\u0000\u01dc\u01d2\u0001\u0000\u0000\u0000\u01dc"+
		"\u01d3\u0001\u0000\u0000\u0000\u01dc\u01d7\u0001\u0000\u0000\u0000\u01dc"+
		"\u01d8\u0001\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000\u0000\u01dc"+
		"\u01db\u0001\u0000\u0000\u0000\u01ddk\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01dfm\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1o\u0001\u0000\u0000\u0000%{\u0082\u0084\u0092"+
		"\u0096\u009b\u00a0\u00ad\u00b4\u00c7\u00d4\u00e3\u00ea\u00fd\u0108\u0120"+
		"\u012c\u013b\u0141\u0149\u0153\u015e\u0169\u0173\u017a\u0181\u018c\u0195"+
		"\u019e\u01a9\u01b0\u01b2\u01b9\u01bf\u01cb\u01ce\u01dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}