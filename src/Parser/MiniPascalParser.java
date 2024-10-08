// Generated from C:/Users/Lenovo I7/Documents/Compiladores 1/Proyecto_Compiladores1/src/MiniPascal.g4 by ANTLR 4.13.1
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
		IF=16, ELSE=17, DO=18, FOR=19, DOWNTO=20, REPEAT=21, THEN=22, UNTIL=23, 
		WHILE=24, PLUS=25, MINUS=26, MULTIPLY=27, DIVIDE=28, MOD=29, DIV=30, AND=31, 
		NOT=32, OR=33, TRUE=34, FALSE=35, EQUAL=36, NOTEQUAL=37, LESSTHEN=38, 
		LESSEQUAL=39, GREATEQUAL=40, GREATTHEN=41, ASSIGN=42, COMMA=43, SEMICOLON=44, 
		COLON=45, PARL=46, PARR=47, LBRACKET=48, LBRACKETP=49, RBRACKET=50, RBRACKETP=51, 
		DOT=52, DOT2=53, SPACE=54, COMMENT=55, LSTRING=56, NUM=57, IDENTIFIER=58;
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
			"'integer'", "'of'", "'string'", "'if'", "'else'", "'do'", "'for'", "'downto'", 
			"'repeat'", "'then'", "'until'", "'while'", "'+'", "'-'", "'*'", "'/'", 
			"'mod'", "'div'", "'and'", "'not'", "'or'", "'true'", "'false'", "'='", 
			"'<>'", "'<'", "'<='", "'>='", "'>'", "':='", "','", "';'", "':'", "'('", 
			"')'", "'['", "'(.'", "']'", "'.)'", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "FUNCTION", "LENGTH", "PROCEDURE", "BEGIN", "END", "CONST", 
			"VAR", "ARRAY", "TO", "CHAR", "BOOLEAN", "INTEGER", "OF", "STRING", "IF", 
			"ELSE", "DO", "FOR", "DOWNTO", "REPEAT", "THEN", "UNTIL", "WHILE", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MOD", "DIV", "AND", "NOT", "OR", "TRUE", 
			"FALSE", "EQUAL", "NOTEQUAL", "LESSTHEN", "LESSEQUAL", "GREATEQUAL", 
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
			switch (_input.LA(1)) {
			case END:
			case ELSE:
			case UNTIL:
			case SEMICOLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
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
				setState(149);
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
			setState(201);
			match(FOR);
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(ASSIGN);
			setState(204);
			listafor();
			setState(205);
			match(DO);
			setState(206);
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
			setState(208);
			expresion();
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
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
			setState(214);
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
				setState(212);
				tiposimple();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
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
			setState(216);
			tiposimple();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				tiposimple();
				}
				}
				setState(223);
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
			setState(224);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ARRAY);
				setState(227);
				match(LBRACKET);
				setState(228);
				tipolista();
				setState(229);
				match(RBRACKET);
				setState(230);
				match(OF);
				setState(231);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ARRAY);
				setState(234);
				match(LBRACKETP);
				setState(235);
				tipolista();
				setState(236);
				match(RBRACKETP);
				setState(237);
				match(OF);
				setState(238);
				tipo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(ARRAY);
				setState(241);
				match(OF);
				setState(242);
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
			setState(245);
			match(STRING);
			setState(246);
			match(LBRACKET);
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
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
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				tipoescalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				tiposubrango();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				tipoidentificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
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
			setState(256);
			match(PARL);
			setState(257);
			listaidentificadores();
			setState(258);
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
			setState(260);
			constante();
			setState(261);
			match(DOT2);
			setState(262);
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
			setState(264);
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
			setState(266);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				signo();
				setState(270);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				signo();
				setState(274);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(LSTRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
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
			setState(280);
			listaidentificadores();
			setState(281);
			match(COLON);
			setState(282);
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
			setState(284);
			match(VAR);
			setState(285);
			declaracionvariable();
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					match(SEMICOLON);
					setState(287);
					declaracionvariable();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(293);
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
			setState(295);
			match(IDENTIFIER);
			setState(296);
			match(EQUAL);
			setState(297);
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
			setState(299);
			match(CONST);
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300);
				definicionconstante();
				setState(301);
				match(SEMICOLON);
				}
				}
				setState(305); 
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
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
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
			setState(307);
			match(PROCEDURE);
			setState(308);
			match(IDENTIFIER);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(309);
				match(PARL);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151712020L) != 0)) {
					{
					setState(310);
					listaformalparametros();
					}
				}

				setState(313);
				match(PARR);
				}
			}

			setState(316);
			match(SEMICOLON);
			setState(317);
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				declaracionproceso();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
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
			setState(323);
			declaracionprocesoofuncion();
			setState(324);
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
			setState(326);
			parametroactual();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(327);
				match(COMMA);
				setState(328);
				parametroactual();
				}
				}
				setState(333);
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
		public TipoarregloContext tipoarreglo() {
			return getRuleContext(TipoarregloContext.class,0);
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
			setState(334);
			listaidentificadores();
			setState(335);
			match(COLON);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case BOOLEAN:
			case INTEGER:
			case STRING:
				{
				setState(336);
				tipoidentificador();
				}
				break;
			case ARRAY:
				{
				setState(337);
				tipoarreglo();
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
			setState(340);
			expresion();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(341);
				anchoparametro();
				}
				}
				setState(346);
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
			setState(347);
			match(COLON);
			setState(348);
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
			setState(350);
			seccionformalparametros();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(351);
				match(SEMICOLON);
				setState(352);
				seccionformalparametros();
				}
				}
				setState(357);
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
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				grupoparametros();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(VAR);
				setState(360);
				grupoparametros();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(FUNCTION);
				setState(362);
				grupoparametros();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(PROCEDURE);
				setState(364);
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
			setState(367);
			match(IDENTIFIER);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				match(IDENTIFIER);
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
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
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
			setState(375);
			match(FUNCTION);
			setState(376);
			match(IDENTIFIER);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(377);
				match(PARL);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376151712020L) != 0)) {
					{
					setState(378);
					listaformalparametros();
					}
				}

				setState(381);
				match(PARR);
				}
			}

			setState(384);
			match(COLON);
			setState(385);
			tipoidentificador();
			setState(386);
			match(SEMICOLON);
			setState(387);
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
			setState(389);
			match(IDENTIFIER);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(390);
				match(PARL);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504473582944911368L) != 0)) {
					{
					setState(391);
					listaparametros();
					}
				}

				setState(394);
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
	public static class InstruccionprocedimientoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode PARL() { return getToken(MiniPascalParser.PARL, 0); }
		public TerminalNode PARR() { return getToken(MiniPascalParser.PARR, 0); }
		public ListaparametrosContext listaparametros() {
			return getRuleContext(ListaparametrosContext.class,0);
		}
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
			setState(397);
			match(IDENTIFIER);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARL) {
				{
				setState(398);
				match(PARL);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504473582944911368L) != 0)) {
					{
					setState(399);
					listaparametros();
					}
				}

				setState(402);
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
			setState(405);
			match(IDENTIFIER);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5348024557502464L) != 0)) {
				{
				setState(430);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
					{
					setState(406);
					match(LBRACKET);
					setState(407);
					expresion();
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(408);
						match(COMMA);
						setState(409);
						expresion();
						}
						}
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(415);
					match(RBRACKET);
					}
					break;
				case LBRACKETP:
					{
					setState(417);
					match(LBRACKETP);
					setState(418);
					expresion();
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(419);
						match(COMMA);
						setState(420);
						expresion();
						}
						}
						setState(425);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(426);
					match(RBRACKETP);
					}
					break;
				case DOT:
					{
					setState(428);
					match(DOT);
					setState(429);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(434);
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
			setState(435);
			termino();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8690597888L) != 0)) {
				{
				setState(436);
				operadoraditivo();
				setState(437);
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
			setState(441);
			expresionsimple();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) {
				{
				setState(442);
				operadorrelacional();
				setState(443);
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
			setState(447);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) ) {
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
			setState(449);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
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
			setState(451);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8690597888L) != 0)) ) {
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
			setState(453);
			signofactor();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) {
				{
				setState(454);
				operadormultiplicativo();
				setState(455);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(459);
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
			setState(462);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(PARL);
				setState(466);
				expresion();
				setState(467);
				match(PARR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				designarfuncion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				constante();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				match(NOT);
				setState(472);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
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
		"\u0004\u0001:\u01e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u000e\u0001\u000e\u0003\u000e\u00c8\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d7"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00dc\b\u0012"+
		"\n\u0012\f\u0012\u00df\t\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f4\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00ff\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0117\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0121\b\u001d\n\u001d\f\u001d\u0124\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u0130\b\u001f\u000b\u001f"+
		"\f\u001f\u0131\u0001 \u0001 \u0001 \u0001 \u0003 \u0138\b \u0001 \u0003"+
		" \u013b\b \u0001 \u0001 \u0001 \u0001!\u0001!\u0003!\u0142\b!\u0001\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u014a\b#\n#\f#\u014d\t#\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0153\b$\u0001%\u0001%\u0005%\u0157\b%\n"+
		"%\f%\u015a\t%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u0162"+
		"\b\'\n\'\f\'\u0165\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u016e\b(\u0001)\u0001)\u0001)\u0005)\u0173\b)\n)\f)\u0176\t)"+
		"\u0001*\u0001*\u0001*\u0001*\u0003*\u017c\b*\u0001*\u0003*\u017f\b*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u0189\b+\u0001"+
		"+\u0003+\u018c\b+\u0001,\u0001,\u0001,\u0003,\u0191\b,\u0001,\u0003,\u0194"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u019b\b-\n-\f-\u019e\t-"+
		"\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u01a6\b-\n-\f-\u01a9"+
		"\t-\u0001-\u0001-\u0001-\u0001-\u0005-\u01af\b-\n-\f-\u01b2\t-\u0001."+
		"\u0001.\u0001.\u0001.\u0003.\u01b8\b.\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u01be\b/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00033\u01ca\b3\u00014\u00034\u01cd\b4\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u01db"+
		"\b5\u00016\u00016\u00017\u00017\u00017\u0000\u00008\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\b\u0002\u0000\n\n\u0014"+
		"\u0014\u0002\u0000\u000b\r\u000f\u000f\u0001\u00009:\u0001\u0000\u0019"+
		"\u001a\u0001\u0000\"#\u0001\u0000$)\u0001\u0000\u001b\u001f\u0002\u0000"+
		"\u0019\u001a!!\u01e3\u0000p\u0001\u0000\u0000\u0000\u0002u\u0001\u0000"+
		"\u0000\u0000\u0004\u0084\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000"+
		"\u0000\u0000\b\u0092\u0001\u0000\u0000\u0000\n\u0096\u0001\u0000\u0000"+
		"\u0000\f\u009b\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000\u0000"+
		"\u0010\u00a2\u0001\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000"+
		"\u0014\u00ad\u0001\u0000\u0000\u0000\u0016\u00af\u0001\u0000\u0000\u0000"+
		"\u0018\u00b7\u0001\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000"+
		"\u001c\u00c1\u0001\u0000\u0000\u0000\u001e\u00c9\u0001\u0000\u0000\u0000"+
		" \u00d0\u0001\u0000\u0000\u0000\"\u00d6\u0001\u0000\u0000\u0000$\u00d8"+
		"\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000"+
		"\u0000\u0000*\u00f5\u0001\u0000\u0000\u0000,\u00fe\u0001\u0000\u0000\u0000"+
		".\u0100\u0001\u0000\u0000\u00000\u0104\u0001\u0000\u0000\u00002\u0108"+
		"\u0001\u0000\u0000\u00004\u010a\u0001\u0000\u0000\u00006\u0116\u0001\u0000"+
		"\u0000\u00008\u0118\u0001\u0000\u0000\u0000:\u011c\u0001\u0000\u0000\u0000"+
		"<\u0127\u0001\u0000\u0000\u0000>\u012b\u0001\u0000\u0000\u0000@\u0133"+
		"\u0001\u0000\u0000\u0000B\u0141\u0001\u0000\u0000\u0000D\u0143\u0001\u0000"+
		"\u0000\u0000F\u0146\u0001\u0000\u0000\u0000H\u014e\u0001\u0000\u0000\u0000"+
		"J\u0154\u0001\u0000\u0000\u0000L\u015b\u0001\u0000\u0000\u0000N\u015e"+
		"\u0001\u0000\u0000\u0000P\u016d\u0001\u0000\u0000\u0000R\u016f\u0001\u0000"+
		"\u0000\u0000T\u0177\u0001\u0000\u0000\u0000V\u0185\u0001\u0000\u0000\u0000"+
		"X\u018d\u0001\u0000\u0000\u0000Z\u0195\u0001\u0000\u0000\u0000\\\u01b3"+
		"\u0001\u0000\u0000\u0000^\u01b9\u0001\u0000\u0000\u0000`\u01bf\u0001\u0000"+
		"\u0000\u0000b\u01c1\u0001\u0000\u0000\u0000d\u01c3\u0001\u0000\u0000\u0000"+
		"f\u01c5\u0001\u0000\u0000\u0000h\u01cc\u0001\u0000\u0000\u0000j\u01da"+
		"\u0001\u0000\u0000\u0000l\u01dc\u0001\u0000\u0000\u0000n\u01de\u0001\u0000"+
		"\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0003\u0004\u0002\u0000rs\u0005"+
		"4\u0000\u0000st\u0005\u0000\u0000\u0001t\u0001\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0001\u0000\u0000v{\u0005:\u0000\u0000wx\u0005.\u0000\u0000x"+
		"y\u0003R)\u0000yz\u0005/\u0000\u0000z|\u0001\u0000\u0000\u0000{w\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0005,\u0000\u0000~\u0003\u0001\u0000\u0000\u0000\u007f\u0083\u0003"+
		">\u001f\u0000\u0080\u0083\u0003:\u001d\u0000\u0081\u0083\u0003D\"\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0003\u0012\t\u0000\u0088\u0005\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0005.\u0000\u0000\u008b\u008c"+
		"\u0003Z-\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u0007\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u00059\u0000\u0000\u008f\u0090\u0005-\u0000\u0000"+
		"\u0090\u0093\u0003\n\u0005\u0000\u0091\u0093\u0003\n\u0005\u0000\u0092"+
		"\u008e\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\t\u0001\u0000\u0000\u0000\u0094\u0097\u0003\f\u0006\u0000\u0095\u0097"+
		"\u0003\u000e\u0007\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u000b\u0001\u0000\u0000\u0000\u0098\u009c"+
		"\u0003\u0010\b\u0000\u0099\u009c\u0003X,\u0000\u009a\u009c\u0003l6\u0000"+
		"\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\r\u0001\u0000\u0000\u0000\u009d"+
		"\u00a1\u0003\u0012\t\u0000\u009e\u00a1\u0003\u001c\u000e\u0000\u009f\u00a1"+
		"\u0003\u0014\n\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u000f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0003Z-\u0000\u00a3\u00a4\u0005*\u0000"+
		"\u0000\u00a4\u00a5\u0003^/\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000\u00a8"+
		"\u00a9\u0005\u0006\u0000\u0000\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ae\u0003\u001a\r\u0000\u00ab\u00ae\u0003\u0018\f\u0000\u00ac\u00ae"+
		"\u0003\u001e\u000f\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u0015"+
		"\u0001\u0000\u0000\u0000\u00af\u00b4\u0003\b\u0004\u0000\u00b0\u00b1\u0005"+
		",\u0000\u0000\u00b1\u00b3\u0003\b\u0004\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0017\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0015"+
		"\u0000\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9\u00ba\u0005\u0017"+
		"\u0000\u0000\u00ba\u00bb\u0003^/\u0000\u00bb\u0019\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0018\u0000\u0000\u00bd\u00be\u0003^/\u0000\u00be\u00bf"+
		"\u0005\u0012\u0000\u0000\u00bf\u00c0\u0003\b\u0004\u0000\u00c0\u001b\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2\u00c3\u0003"+
		"^/\u0000\u00c3\u00c4\u0005\u0016\u0000\u0000\u00c4\u00c7\u0003\b\u0004"+
		"\u0000\u00c5\u00c6\u0005\u0011\u0000\u0000\u00c6\u00c8\u0003\b\u0004\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0013\u0000\u0000"+
		"\u00ca\u00cb\u0005:\u0000\u0000\u00cb\u00cc\u0005*\u0000\u0000\u00cc\u00cd"+
		"\u0003 \u0010\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000\u00ce\u00cf\u0003"+
		"\b\u0004\u0000\u00cf\u001f\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003^"+
		"/\u0000\u00d1\u00d2\u0007\u0000\u0000\u0000\u00d2\u00d3\u0003^/\u0000"+
		"\u00d3!\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003,\u0016\u0000\u00d5\u00d7"+
		"\u0003(\u0014\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7#\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003,\u0016"+
		"\u0000\u00d9\u00da\u0005+\u0000\u0000\u00da\u00dc\u0003,\u0016\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"%\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0007\u0001\u0000\u0000\u00e1\'\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"\t\u0000\u0000\u00e3\u00e4\u00050\u0000\u0000\u00e4\u00e5\u0003$\u0012"+
		"\u0000\u00e5\u00e6\u00052\u0000\u0000\u00e6\u00e7\u0005\u000e\u0000\u0000"+
		"\u00e7\u00e8\u0003\"\u0011\u0000\u00e8\u00f4\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\t\u0000\u0000\u00ea\u00eb\u00051\u0000\u0000\u00eb\u00ec"+
		"\u0003$\u0012\u0000\u00ec\u00ed\u00053\u0000\u0000\u00ed\u00ee\u0005\u000e"+
		"\u0000\u0000\u00ee\u00ef\u0003\"\u0011\u0000\u00ef\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005\t\u0000\u0000\u00f1\u00f2\u0005\u000e\u0000\u0000"+
		"\u00f2\u00f4\u0003\"\u0011\u0000\u00f3\u00e2\u0001\u0000\u0000\u0000\u00f3"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000\u00f4"+
		")\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u000f\u0000\u0000\u00f6\u00f7"+
		"\u00050\u0000\u0000\u00f7\u00f8\u0007\u0002\u0000\u0000\u00f8\u00f9\u0005"+
		"2\u0000\u0000\u00f9+\u0001\u0000\u0000\u0000\u00fa\u00ff\u0003.\u0017"+
		"\u0000\u00fb\u00ff\u00030\u0018\u0000\u00fc\u00ff\u0003&\u0013\u0000\u00fd"+
		"\u00ff\u0003*\u0015\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff-\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		".\u0000\u0000\u0101\u0102\u0003R)\u0000\u0102\u0103\u0005/\u0000\u0000"+
		"\u0103/\u0001\u0000\u0000\u0000\u0104\u0105\u00036\u001b\u0000\u0105\u0106"+
		"\u00055\u0000\u0000\u0106\u0107\u00036\u001b\u0000\u01071\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0007\u0003\u0000\u0000\u01093\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0007\u0004\u0000\u0000\u010b5\u0001\u0000\u0000\u0000"+
		"\u010c\u0117\u00059\u0000\u0000\u010d\u010e\u00032\u0019\u0000\u010e\u010f"+
		"\u00059\u0000\u0000\u010f\u0117\u0001\u0000\u0000\u0000\u0110\u0117\u0005"+
		":\u0000\u0000\u0111\u0112\u00032\u0019\u0000\u0112\u0113\u0005:\u0000"+
		"\u0000\u0113\u0117\u0001\u0000\u0000\u0000\u0114\u0117\u00058\u0000\u0000"+
		"\u0115\u0117\u0003\u0006\u0003\u0000\u0116\u010c\u0001\u0000\u0000\u0000"+
		"\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000"+
		"\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0115\u0001\u0000\u0000\u0000\u01177\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0003R)\u0000\u0119\u011a\u0005-\u0000\u0000\u011a\u011b\u0003"+
		"\"\u0011\u0000\u011b9\u0001\u0000\u0000\u0000\u011c\u011d\u0005\b\u0000"+
		"\u0000\u011d\u0122\u00038\u001c\u0000\u011e\u011f\u0005,\u0000\u0000\u011f"+
		"\u0121\u00038\u001c\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0124"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0005,\u0000\u0000\u0126;\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005:\u0000\u0000\u0128\u0129\u0005$\u0000\u0000"+
		"\u0129\u012a\u00036\u001b\u0000\u012a=\u0001\u0000\u0000\u0000\u012b\u012f"+
		"\u0005\u0007\u0000\u0000\u012c\u012d\u0003<\u001e\u0000\u012d\u012e\u0005"+
		",\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132?\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\u0004\u0000\u0000\u0134\u013a\u0005:\u0000\u0000"+
		"\u0135\u0137\u0005.\u0000\u0000\u0136\u0138\u0003N\'\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013b\u0005/\u0000\u0000\u013a\u0135\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005,\u0000\u0000\u013d\u013e\u0003\u0004"+
		"\u0002\u0000\u013eA\u0001\u0000\u0000\u0000\u013f\u0142\u0003@ \u0000"+
		"\u0140\u0142\u0003T*\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142C\u0001\u0000\u0000\u0000\u0143\u0144\u0003"+
		"B!\u0000\u0144\u0145\u0005,\u0000\u0000\u0145E\u0001\u0000\u0000\u0000"+
		"\u0146\u014b\u0003J%\u0000\u0147\u0148\u0005+\u0000\u0000\u0148\u014a"+
		"\u0003J%\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014cG\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0003R)\u0000\u014f\u0152\u0005-\u0000\u0000\u0150"+
		"\u0153\u0003&\u0013\u0000\u0151\u0153\u0003(\u0014\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153I\u0001\u0000"+
		"\u0000\u0000\u0154\u0158\u0003^/\u0000\u0155\u0157\u0003L&\u0000\u0156"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"K\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005-\u0000\u0000\u015c\u015d\u0003^/\u0000\u015dM\u0001\u0000\u0000"+
		"\u0000\u015e\u0163\u0003P(\u0000\u015f\u0160\u0005,\u0000\u0000\u0160"+
		"\u0162\u0003P(\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164O\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000"+
		"\u0000\u0000\u0166\u016e\u0003H$\u0000\u0167\u0168\u0005\b\u0000\u0000"+
		"\u0168\u016e\u0003H$\u0000\u0169\u016a\u0005\u0002\u0000\u0000\u016a\u016e"+
		"\u0003H$\u0000\u016b\u016c\u0005\u0004\u0000\u0000\u016c\u016e\u0003H"+
		"$\u0000\u016d\u0166\u0001\u0000\u0000\u0000\u016d\u0167\u0001\u0000\u0000"+
		"\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016eQ\u0001\u0000\u0000\u0000\u016f\u0174\u0005:\u0000\u0000\u0170"+
		"\u0171\u0005+\u0000\u0000\u0171\u0173\u0005:\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175S\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0002"+
		"\u0000\u0000\u0178\u017e\u0005:\u0000\u0000\u0179\u017b\u0005.\u0000\u0000"+
		"\u017a\u017c\u0003N\'\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017f\u0005/\u0000\u0000\u017e\u0179\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005-\u0000\u0000\u0181\u0182\u0003&\u0013\u0000\u0182\u0183\u0005,"+
		"\u0000\u0000\u0183\u0184\u0003\u0004\u0002\u0000\u0184U\u0001\u0000\u0000"+
		"\u0000\u0185\u018b\u0005:\u0000\u0000\u0186\u0188\u0005.\u0000\u0000\u0187"+
		"\u0189\u0003F#\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0005"+
		"/\u0000\u0000\u018b\u0186\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018cW\u0001\u0000\u0000\u0000\u018d\u0193\u0005:\u0000\u0000"+
		"\u018e\u0190\u0005.\u0000\u0000\u018f\u0191\u0003F#\u0000\u0190\u018f"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192"+
		"\u0001\u0000\u0000\u0000\u0192\u0194\u0005/\u0000\u0000\u0193\u018e\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194Y\u0001\u0000"+
		"\u0000\u0000\u0195\u01b0\u0005:\u0000\u0000\u0196\u0197\u00050\u0000\u0000"+
		"\u0197\u019c\u0003^/\u0000\u0198\u0199\u0005+\u0000\u0000\u0199\u019b"+
		"\u0003^/\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u00052\u0000\u0000\u01a0\u01af\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u00051\u0000\u0000\u01a2\u01a7\u0003^/\u0000\u01a3"+
		"\u01a4\u0005+\u0000\u0000\u01a4\u01a6\u0003^/\u0000\u01a5\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005"+
		"3\u0000\u0000\u01ab\u01af\u0001\u0000\u0000\u0000\u01ac\u01ad\u00054\u0000"+
		"\u0000\u01ad\u01af\u0005:\u0000\u0000\u01ae\u0196\u0001\u0000\u0000\u0000"+
		"\u01ae\u01a1\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000"+
		"\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1[\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b7\u0003f3\u0000\u01b4\u01b5\u0003"+
		"d2\u0000\u01b5\u01b6\u0003\\.\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8]\u0001\u0000\u0000\u0000\u01b9\u01bd\u0003\\.\u0000\u01ba\u01bb"+
		"\u0003`0\u0000\u01bb\u01bc\u0003^/\u0000\u01bc\u01be\u0001\u0000\u0000"+
		"\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be_\u0001\u0000\u0000\u0000\u01bf\u01c0\u0007\u0005\u0000\u0000"+
		"\u01c0a\u0001\u0000\u0000\u0000\u01c1\u01c2\u0007\u0006\u0000\u0000\u01c2"+
		"c\u0001\u0000\u0000\u0000\u01c3\u01c4\u0007\u0007\u0000\u0000\u01c4e\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c9\u0003h4\u0000\u01c6\u01c7\u0003b1\u0000"+
		"\u01c7\u01c8\u0003f3\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01cag\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cd\u0007\u0003\u0000\u0000\u01cc\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0003j5\u0000\u01cfi\u0001\u0000\u0000"+
		"\u0000\u01d0\u01db\u0003Z-\u0000\u01d1\u01d2\u0005.\u0000\u0000\u01d2"+
		"\u01d3\u0003^/\u0000\u01d3\u01d4\u0005/\u0000\u0000\u01d4\u01db\u0001"+
		"\u0000\u0000\u0000\u01d5\u01db\u0003V+\u0000\u01d6\u01db\u00036\u001b"+
		"\u0000\u01d7\u01d8\u0005 \u0000\u0000\u01d8\u01db\u0003j5\u0000\u01d9"+
		"\u01db\u00034\u001a\u0000\u01da\u01d0\u0001\u0000\u0000\u0000\u01da\u01d1"+
		"\u0001\u0000\u0000\u0000\u01da\u01d5\u0001\u0000\u0000\u0000\u01da\u01d6"+
		"\u0001\u0000\u0000\u0000\u01da\u01d7\u0001\u0000\u0000\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01dbk\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01ddm\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01dfo\u0001\u0000\u0000\u0000){\u0082\u0084\u0092\u0096"+
		"\u009b\u00a0\u00ad\u00b4\u00c7\u00d6\u00dd\u00f3\u00fe\u0116\u0122\u0131"+
		"\u0137\u013a\u0141\u014b\u0152\u0158\u0163\u016d\u0174\u017b\u017e\u0188"+
		"\u018b\u0190\u0193\u019c\u01a7\u01ae\u01b0\u01b7\u01bd\u01c9\u01cc\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}