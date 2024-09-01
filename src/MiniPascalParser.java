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
		T__0=1, COMMENT=2, WS=3, CONSTCHAR=4, CONSTSTR=5, VAR=6, BEGIN=7, END=8, 
		PROGRAM=9, WRITE=10, READ=11, IF=12, THEN=13, ELSE=14, WHILE=15, DO=16, 
		FOR=17, TO=18, DOWNTO=19, INTEGER=20, CHAR=21, STRING=22, BOOLEAN=23, 
		ARRAY=24, OF=25, TRUE=26, FALSE=27, NOT=28, AND=29, OR=30, PLUS=31, MINUS=32, 
		MULT=33, DIV=34, MOD=35, COLON=36, SEMICOLON=37, COMMA=38, ASSIGN=39, 
		LPAREN=40, RPAREN=41, LBRACKET=42, RBRACKET=43, LT=44, LE=45, GT=46, GE=47, 
		EQ=48, NEQ=49, IDENTIFIER=50, NUMBER=51;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_varDeclaration = 2, RULE_varDeclList = 3, 
		RULE_varDecl = 4, RULE_type = 5, RULE_arrayType = 6, RULE_statement = 7, 
		RULE_assignment = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, RULE_forStatement = 11, 
		RULE_writeStatement = 12, RULE_readStatement = 13, RULE_expr = 14, RULE_term = 15, 
		RULE_factor = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "varDeclaration", "varDeclList", "varDecl", "type", 
			"arrayType", "statement", "assignment", "ifStatement", "whileStatement", 
			"forStatement", "writeStatement", "readStatement", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, null, "'var'", "'begin'", "'end'", "'program'", 
			"'write'", "'read'", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"'to'", "'downto'", "'integer'", "'char'", "'string'", "'boolean'", "'array'", 
			"'of'", "'true'", "'false'", "'not'", "'and'", "'or'", "'+'", "'-'", 
			"'*'", "'/'", "'mod'", "':'", "';'", "','", "':='", "'('", "')'", "'['", 
			"']'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMMENT", "WS", "CONSTCHAR", "CONSTSTR", "VAR", "BEGIN", 
			"END", "PROGRAM", "WRITE", "READ", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"FOR", "TO", "DOWNTO", "INTEGER", "CHAR", "STRING", "BOOLEAN", "ARRAY", 
			"OF", "TRUE", "FALSE", "NOT", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "COLON", "SEMICOLON", "COMMA", "ASSIGN", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LT", "LE", "GT", "GE", "EQ", "NEQ", "IDENTIFIER", "NUMBER"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PROGRAM);
			setState(35);
			match(IDENTIFIER);
			setState(36);
			match(SEMICOLON);
			setState(37);
			block();
			setState(38);
			match(T__0);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(40);
				varDeclaration();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(BEGIN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899907013632L) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VAR);
			setState(56);
			varDeclList();
			setState(57);
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
	public static class VarDeclListContext extends ParserRuleContext {
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVarDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVarDeclList(this);
		}
	}

	public final VarDeclListContext varDeclList() throws RecognitionException {
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			varDecl();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				varDecl();
				}
				}
				setState(66);
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
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IDENTIFIER);
			setState(68);
			match(COLON);
			setState(69);
			type();
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(INTEGER);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(BOOLEAN);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				arrayType();
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode LBRACKET() { return getToken(MiniPascalParser.LBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(MiniPascalParser.NUMBER, 0); }
		public TerminalNode RBRACKET() { return getToken(MiniPascalParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ARRAY);
			setState(79);
			match(LBRACKET);
			setState(80);
			match(NUMBER);
			setState(81);
			match(RBRACKET);
			setState(82);
			match(OF);
			setState(83);
			type();
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				forStatement();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				writeStatement();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				readStatement();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(ASSIGN);
			setState(95);
			expr();
			setState(96);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IF);
			setState(99);
			expr();
			setState(100);
			match(THEN);
			setState(101);
			statement();
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(102);
				match(ELSE);
				setState(103);
				statement();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(WHILE);
			setState(107);
			expr();
			setState(108);
			match(DO);
			setState(109);
			statement();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TO() { return getToken(MiniPascalParser.TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FOR);
			setState(112);
			assignment();
			setState(113);
			match(TO);
			setState(114);
			expr();
			setState(115);
			match(DO);
			setState(116);
			statement();
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
	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode CONSTSTR() { return getToken(MiniPascalParser.CONSTSTR, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWriteStatement(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_writeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(WRITE);
			setState(119);
			match(LPAREN);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTSTR) {
				{
				setState(120);
				match(CONSTSTR);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(121);
					match(COMMA);
					setState(122);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(127);
			match(RPAREN);
			setState(128);
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
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitReadStatement(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(READ);
			setState(131);
			match(LPAREN);
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(RPAREN);
			setState(134);
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
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MiniPascalParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MiniPascalParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MiniPascalParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MiniPascalParser.MINUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			term();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(137);
					match(PLUS);
					setState(138);
					term();
					}
					break;
				case MINUS:
					{
					setState(139);
					match(MINUS);
					setState(140);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(MiniPascalParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(MiniPascalParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MiniPascalParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MiniPascalParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(MiniPascalParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(MiniPascalParser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			factor();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
				{
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(147);
					match(MULT);
					setState(148);
					factor();
					}
					break;
				case DIV:
					{
					setState(149);
					match(DIV);
					setState(150);
					factor();
					}
					break;
				case MOD:
					{
					setState(151);
					match(MOD);
					setState(152);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(157);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniPascalParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(MiniPascalParser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniPascalParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniPascalParser.RPAREN, 0); }
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(NUMBER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(LPAREN);
				setState(161);
				expr();
				setState(162);
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

	public static final String _serializedATN =
		"\u0004\u00013\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001\f\u0001"+
		"4\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003?\b\u0003"+
		"\n\u0003\f\u0003B\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"M\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\ti\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f|\b\f\u0003\f~\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u008e\b\u000e\n\u000e"+
		"\f\u000e\u0091\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u009a\b\u000f\n\u000f"+
		"\f\u000f\u009d\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00a5\b\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0000\u00ab\u0000\"\u0001\u0000\u0000\u0000"+
		"\u0002+\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006;"+
		"\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fN\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010"+
		"]\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014j\u0001"+
		"\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018v\u0001\u0000\u0000"+
		"\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0088\u0001\u0000\u0000"+
		"\u0000\u001e\u0092\u0001\u0000\u0000\u0000 \u00a4\u0001\u0000\u0000\u0000"+
		"\"#\u0005\t\u0000\u0000#$\u00052\u0000\u0000$%\u0005%\u0000\u0000%&\u0003"+
		"\u0002\u0001\u0000&\'\u0005\u0001\u0000\u0000\'\u0001\u0001\u0000\u0000"+
		"\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.2\u0005\u0007\u0000\u0000"+
		"/1\u0003\u000e\u0007\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0005\b\u0000\u00006\u0003\u0001"+
		"\u0000\u0000\u000078\u0005\u0006\u0000\u000089\u0003\u0006\u0003\u0000"+
		"9:\u0005%\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;@\u0003\b\u0004\u0000"+
		"<=\u0005&\u0000\u0000=?\u0003\b\u0004\u0000><\u0001\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\u0007\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"2\u0000\u0000DE\u0005$\u0000\u0000EF\u0003\n\u0005\u0000F\t\u0001\u0000"+
		"\u0000\u0000GM\u0005\u0014\u0000\u0000HM\u0005\u0015\u0000\u0000IM\u0005"+
		"\u0016\u0000\u0000JM\u0005\u0017\u0000\u0000KM\u0003\f\u0006\u0000LG\u0001"+
		"\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u000b\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0018\u0000\u0000OP\u0005*\u0000\u0000PQ\u00053\u0000"+
		"\u0000QR\u0005+\u0000\u0000RS\u0005\u0019\u0000\u0000ST\u0003\n\u0005"+
		"\u0000T\r\u0001\u0000\u0000\u0000U\\\u0003\u0010\b\u0000V\\\u0003\u0012"+
		"\t\u0000W\\\u0003\u0014\n\u0000X\\\u0003\u0016\u000b\u0000Y\\\u0003\u0018"+
		"\f\u0000Z\\\u0003\u001a\r\u0000[U\u0001\u0000\u0000\u0000[V\u0001\u0000"+
		"\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u000f\u0001\u0000\u0000"+
		"\u0000]^\u00052\u0000\u0000^_\u0005\'\u0000\u0000_`\u0003\u001c\u000e"+
		"\u0000`a\u0005%\u0000\u0000a\u0011\u0001\u0000\u0000\u0000bc\u0005\f\u0000"+
		"\u0000cd\u0003\u001c\u000e\u0000de\u0005\r\u0000\u0000eh\u0003\u000e\u0007"+
		"\u0000fg\u0005\u000e\u0000\u0000gi\u0003\u000e\u0007\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0013\u0001\u0000\u0000\u0000"+
		"jk\u0005\u000f\u0000\u0000kl\u0003\u001c\u000e\u0000lm\u0005\u0010\u0000"+
		"\u0000mn\u0003\u000e\u0007\u0000n\u0015\u0001\u0000\u0000\u0000op\u0005"+
		"\u0011\u0000\u0000pq\u0003\u0010\b\u0000qr\u0005\u0012\u0000\u0000rs\u0003"+
		"\u001c\u000e\u0000st\u0005\u0010\u0000\u0000tu\u0003\u000e\u0007\u0000"+
		"u\u0017\u0001\u0000\u0000\u0000vw\u0005\n\u0000\u0000w}\u0005(\u0000\u0000"+
		"x{\u0005\u0005\u0000\u0000yz\u0005&\u0000\u0000z|\u00052\u0000\u0000{"+
		"y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}x\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005)\u0000\u0000\u0080\u0081\u0005%\u0000"+
		"\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000b\u0000"+
		"\u0000\u0083\u0084\u0005(\u0000\u0000\u0084\u0085\u00052\u0000\u0000\u0085"+
		"\u0086\u0005)\u0000\u0000\u0086\u0087\u0005%\u0000\u0000\u0087\u001b\u0001"+
		"\u0000\u0000\u0000\u0088\u008f\u0003\u001e\u000f\u0000\u0089\u008a\u0005"+
		"\u001f\u0000\u0000\u008a\u008e\u0003\u001e\u000f\u0000\u008b\u008c\u0005"+
		" \u0000\u0000\u008c\u008e\u0003\u001e\u000f\u0000\u008d\u0089\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u009b\u0003 \u0010\u0000\u0093\u0094\u0005!\u0000\u0000"+
		"\u0094\u009a\u0003 \u0010\u0000\u0095\u0096\u0005\"\u0000\u0000\u0096"+
		"\u009a\u0003 \u0010\u0000\u0097\u0098\u0005#\u0000\u0000\u0098\u009a\u0003"+
		" \u0010\u0000\u0099\u0093\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u001f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u00a5\u00052\u0000\u0000\u009f\u00a5\u00053\u0000\u0000"+
		"\u00a0\u00a1\u0005(\u0000\u0000\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2"+
		"\u00a3\u0005)\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u009e"+
		"\u0001\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a5!\u0001\u0000\u0000\u0000\r+2@L[h{}\u008d"+
		"\u008f\u0099\u009b\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}