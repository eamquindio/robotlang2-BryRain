// Generated from edu/eam/ingesoft/tlf/RoboLang.g4 by ANTLR 4.13.1
package edu.eam.ingesoft.tlf;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RoboLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, UP=22, DOWN=23, PENUP=24, PENDOWN=25, 
		LEFT=26, RIGHT=27, REPEAT=28, IF=29, ELSE=30, WHILE=31, ENTERO=32, WS=33, 
		COMENTARIO=34, LINEA_COMENT=35;
	public static final int
		RULE_program = 0, RULE_lista_sentencia = 1, RULE_sentencia = 2, RULE_sentencia_comando = 3, 
		RULE_comando_simple = 4, RULE_sentencia_repeat = 5, RULE_sentencia_if = 6, 
		RULE_else_condicion = 7, RULE_sentencia_while = 8, RULE_expresion = 9, 
		RULE_expresion_or = 10, RULE_expresion_and = 11, RULE_expresion_not = 12, 
		RULE_expresion_comparador = 13, RULE_sensor_numerico = 14, RULE_sensor_booleano = 15, 
		RULE_comp_op = 16, RULE_valor = 17, RULE_booleano = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "lista_sentencia", "sentencia", "sentencia_comando", "comando_simple", 
			"sentencia_repeat", "sentencia_if", "else_condicion", "sentencia_while", 
			"expresion", "expresion_or", "expresion_and", "expresion_not", "expresion_comparador", 
			"sensor_numerico", "sensor_booleano", "comp_op", "valor", "booleano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "'OR'", "'AND'", "'NOT'", "'DIST'", 
			"'TEMP'", "'BATTERY'", "'LIGHT'", "'OBSTACLE'", "'='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'true'", "'false'", "'UP'", "'DOWN'", "'PENUP'", 
			"'PENDOWN'", "'LEFT'", "'RIGHT'", "'REPEAT'", "'IF'", "'ELSE'", "'WHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "UP", "DOWN", 
			"PENUP", "PENDOWN", "LEFT", "RIGHT", "REPEAT", "IF", "ELSE", "WHILE", 
			"ENTERO", "WS", "COMENTARIO", "LINEA_COMENT"
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
	public String getGrammarFileName() { return "RoboLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoboLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Lista_sentenciaContext lista_sentencia() {
			return getRuleContext(Lista_sentenciaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RoboLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			lista_sentencia();
			setState(39);
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
	public static class Lista_sentenciaContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Lista_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterLista_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitLista_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitLista_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_sentenciaContext lista_sentencia() throws RecognitionException {
		Lista_sentenciaContext _localctx = new Lista_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3217031168L) != 0)) {
				{
				{
				setState(41);
				sentencia();
				}
				}
				setState(46);
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
	public static class SentenciaContext extends ParserRuleContext {
		public Sentencia_comandoContext sentencia_comando() {
			return getRuleContext(Sentencia_comandoContext.class,0);
		}
		public Sentencia_repeatContext sentencia_repeat() {
			return getRuleContext(Sentencia_repeatContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP:
			case DOWN:
			case PENUP:
			case PENDOWN:
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				sentencia_comando();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				sentencia_repeat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				sentencia_if();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				sentencia_while();
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
	public static class Sentencia_comandoContext extends ParserRuleContext {
		public Comando_simpleContext comando_simple() {
			return getRuleContext(Comando_simpleContext.class,0);
		}
		public Sentencia_comandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSentencia_comando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSentencia_comando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSentencia_comando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_comandoContext sentencia_comando() throws RecognitionException {
		Sentencia_comandoContext _localctx = new Sentencia_comandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			comando_simple();
			setState(54);
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
	public static class Comando_simpleContext extends ParserRuleContext {
		public TerminalNode UP() { return getToken(RoboLangParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(RoboLangParser.DOWN, 0); }
		public TerminalNode PENUP() { return getToken(RoboLangParser.PENUP, 0); }
		public TerminalNode PENDOWN() { return getToken(RoboLangParser.PENDOWN, 0); }
		public TerminalNode LEFT() { return getToken(RoboLangParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(RoboLangParser.RIGHT, 0); }
		public Comando_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterComando_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitComando_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitComando_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_simpleContext comando_simple() throws RecognitionException {
		Comando_simpleContext _localctx = new Comando_simpleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
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
	public static class Sentencia_repeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(RoboLangParser.REPEAT, 0); }
		public TerminalNode ENTERO() { return getToken(RoboLangParser.ENTERO, 0); }
		public Lista_sentenciaContext lista_sentencia() {
			return getRuleContext(Lista_sentenciaContext.class,0);
		}
		public Sentencia_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSentencia_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSentencia_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSentencia_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_repeatContext sentencia_repeat() throws RecognitionException {
		Sentencia_repeatContext _localctx = new Sentencia_repeatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(REPEAT);
			setState(59);
			match(ENTERO);
			setState(60);
			match(T__1);
			setState(61);
			lista_sentencia();
			setState(62);
			match(T__2);
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
	public static class Sentencia_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RoboLangParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Lista_sentenciaContext lista_sentencia() {
			return getRuleContext(Lista_sentenciaContext.class,0);
		}
		public Else_condicionContext else_condicion() {
			return getRuleContext(Else_condicionContext.class,0);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSentencia_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			match(T__3);
			setState(66);
			expresion();
			setState(67);
			match(T__4);
			setState(68);
			match(T__1);
			setState(69);
			lista_sentencia();
			setState(70);
			match(T__2);
			setState(71);
			else_condicion();
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
	public static class Else_condicionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RoboLangParser.ELSE, 0); }
		public Lista_sentenciaContext lista_sentencia() {
			return getRuleContext(Lista_sentenciaContext.class,0);
		}
		public Else_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterElse_condicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitElse_condicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitElse_condicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_condicionContext else_condicion() throws RecognitionException {
		Else_condicionContext _localctx = new Else_condicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_condicion);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__2:
			case UP:
			case DOWN:
			case PENUP:
			case PENDOWN:
			case LEFT:
			case RIGHT:
			case REPEAT:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ELSE);
				setState(75);
				match(T__1);
				setState(76);
				lista_sentencia();
				setState(77);
				match(T__2);
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
	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RoboLangParser.WHILE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Lista_sentenciaContext lista_sentencia() {
			return getRuleContext(Lista_sentenciaContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSentencia_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSentencia_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSentencia_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WHILE);
			setState(82);
			match(T__3);
			setState(83);
			expresion();
			setState(84);
			match(T__4);
			setState(85);
			match(T__1);
			setState(86);
			lista_sentencia();
			setState(87);
			match(T__2);
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
		public Expresion_orContext expresion_or() {
			return getRuleContext(Expresion_orContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			expresion_or();
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
	public static class Expresion_orContext extends ParserRuleContext {
		public List<Expresion_andContext> expresion_and() {
			return getRuleContexts(Expresion_andContext.class);
		}
		public Expresion_andContext expresion_and(int i) {
			return getRuleContext(Expresion_andContext.class,i);
		}
		public Expresion_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterExpresion_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitExpresion_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitExpresion_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_orContext expresion_or() throws RecognitionException {
		Expresion_orContext _localctx = new Expresion_orContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresion_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			expresion_and();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(92);
				match(T__5);
				setState(93);
				expresion_and();
				}
				}
				setState(98);
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
	public static class Expresion_andContext extends ParserRuleContext {
		public List<Expresion_notContext> expresion_not() {
			return getRuleContexts(Expresion_notContext.class);
		}
		public Expresion_notContext expresion_not(int i) {
			return getRuleContext(Expresion_notContext.class,i);
		}
		public Expresion_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterExpresion_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitExpresion_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitExpresion_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_andContext expresion_and() throws RecognitionException {
		Expresion_andContext _localctx = new Expresion_andContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expresion_not();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(100);
				match(T__6);
				setState(101);
				expresion_not();
				}
				}
				setState(106);
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
	public static class Expresion_notContext extends ParserRuleContext {
		public Expresion_notContext expresion_not() {
			return getRuleContext(Expresion_notContext.class,0);
		}
		public Expresion_comparadorContext expresion_comparador() {
			return getRuleContext(Expresion_comparadorContext.class,0);
		}
		public Expresion_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterExpresion_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitExpresion_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitExpresion_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_notContext expresion_not() throws RecognitionException {
		Expresion_notContext _localctx = new Expresion_notContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion_not);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__7);
				setState(108);
				expresion_not();
				}
				break;
			case T__3:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				expresion_comparador();
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
	public static class Expresion_comparadorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sensor_numericoContext sensor_numerico() {
			return getRuleContext(Sensor_numericoContext.class,0);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(RoboLangParser.ENTERO, 0); }
		public Sensor_booleanoContext sensor_booleano() {
			return getRuleContext(Sensor_booleanoContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public Expresion_comparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterExpresion_comparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitExpresion_comparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitExpresion_comparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_comparadorContext expresion_comparador() throws RecognitionException {
		Expresion_comparadorContext _localctx = new Expresion_comparadorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion_comparador);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__3);
				setState(113);
				expresion();
				setState(114);
				match(T__4);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				sensor_numerico();
				setState(117);
				comp_op();
				setState(118);
				match(ENTERO);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				sensor_booleano();
				setState(121);
				comp_op();
				setState(122);
				booleano();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				booleano();
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
	public static class Sensor_numericoContext extends ParserRuleContext {
		public Sensor_numericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor_numerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSensor_numerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSensor_numerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSensor_numerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sensor_numericoContext sensor_numerico() throws RecognitionException {
		Sensor_numericoContext _localctx = new Sensor_numericoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sensor_numerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
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
	public static class Sensor_booleanoContext extends ParserRuleContext {
		public Sensor_booleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterSensor_booleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitSensor_booleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSensor_booleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sensor_booleanoContext sensor_booleano() throws RecognitionException {
		Sensor_booleanoContext _localctx = new Sensor_booleanoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sensor_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__12);
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
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
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
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(RoboLangParser.ENTERO, 0); }
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valor);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ENTERO);
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				booleano();
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
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoboLangListener ) ((RoboLangListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001#\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001+\b\u0001"+
		"\n\u0001\f\u0001.\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007P\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n_\b\n\n\n\f\nb\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bg\b\u000b\n\u000b\f\u000bj\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\fo\b\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r~\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0088\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000"+
		"\u0004\u0001\u0000\u0016\u001b\u0001\u0000\t\f\u0001\u0000\u000e\u0013"+
		"\u0001\u0000\u0014\u0015\u0084\u0000&\u0001\u0000\u0000\u0000\u0002,\u0001"+
		"\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\b8\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f@\u0001"+
		"\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000"+
		"\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014[\u0001\u0000\u0000\u0000\u0016"+
		"c\u0001\u0000\u0000\u0000\u0018n\u0001\u0000\u0000\u0000\u001a}\u0001"+
		"\u0000\u0000\u0000\u001c\u007f\u0001\u0000\u0000\u0000\u001e\u0081\u0001"+
		"\u0000\u0000\u0000 \u0083\u0001\u0000\u0000\u0000\"\u0087\u0001\u0000"+
		"\u0000\u0000$\u0089\u0001\u0000\u0000\u0000&\'\u0003\u0002\u0001\u0000"+
		"\'(\u0005\u0000\u0000\u0001(\u0001\u0001\u0000\u0000\u0000)+\u0003\u0004"+
		"\u0002\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/4\u0003\u0006\u0003\u000004\u0003\n\u0005"+
		"\u000014\u0003\f\u0006\u000024\u0003\u0010\b\u00003/\u0001\u0000\u0000"+
		"\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000"+
		"\u0000\u00004\u0005\u0001\u0000\u0000\u000056\u0003\b\u0004\u000067\u0005"+
		"\u0001\u0000\u00007\u0007\u0001\u0000\u0000\u000089\u0007\u0000\u0000"+
		"\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u001c\u0000\u0000;<\u0005 \u0000"+
		"\u0000<=\u0005\u0002\u0000\u0000=>\u0003\u0002\u0001\u0000>?\u0005\u0003"+
		"\u0000\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\u001d\u0000\u0000"+
		"AB\u0005\u0004\u0000\u0000BC\u0003\u0012\t\u0000CD\u0005\u0005\u0000\u0000"+
		"DE\u0005\u0002\u0000\u0000EF\u0003\u0002\u0001\u0000FG\u0005\u0003\u0000"+
		"\u0000GH\u0003\u000e\u0007\u0000H\r\u0001\u0000\u0000\u0000IP\u0001\u0000"+
		"\u0000\u0000JK\u0005\u001e\u0000\u0000KL\u0005\u0002\u0000\u0000LM\u0003"+
		"\u0002\u0001\u0000MN\u0005\u0003\u0000\u0000NP\u0001\u0000\u0000\u0000"+
		"OI\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000P\u000f\u0001\u0000"+
		"\u0000\u0000QR\u0005\u001f\u0000\u0000RS\u0005\u0004\u0000\u0000ST\u0003"+
		"\u0012\t\u0000TU\u0005\u0005\u0000\u0000UV\u0005\u0002\u0000\u0000VW\u0003"+
		"\u0002\u0001\u0000WX\u0005\u0003\u0000\u0000X\u0011\u0001\u0000\u0000"+
		"\u0000YZ\u0003\u0014\n\u0000Z\u0013\u0001\u0000\u0000\u0000[`\u0003\u0016"+
		"\u000b\u0000\\]\u0005\u0006\u0000\u0000]_\u0003\u0016\u000b\u0000^\\\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a\u0015\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000ch\u0003\u0018\f\u0000de\u0005\u0007\u0000\u0000eg\u0003\u0018"+
		"\f\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0017\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kl\u0005\b\u0000\u0000lo\u0003\u0018\f\u0000"+
		"mo\u0003\u001a\r\u0000nk\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"o\u0019\u0001\u0000\u0000\u0000pq\u0005\u0004\u0000\u0000qr\u0003\u0012"+
		"\t\u0000rs\u0005\u0005\u0000\u0000s~\u0001\u0000\u0000\u0000tu\u0003\u001c"+
		"\u000e\u0000uv\u0003 \u0010\u0000vw\u0005 \u0000\u0000w~\u0001\u0000\u0000"+
		"\u0000xy\u0003\u001e\u000f\u0000yz\u0003 \u0010\u0000z{\u0003$\u0012\u0000"+
		"{~\u0001\u0000\u0000\u0000|~\u0003$\u0012\u0000}p\u0001\u0000\u0000\u0000"+
		"}t\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u001b\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0001\u0000\u0000"+
		"\u0080\u001d\u0001\u0000\u0000\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082"+
		"\u001f\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0002\u0000\u0000\u0084"+
		"!\u0001\u0000\u0000\u0000\u0085\u0088\u0005 \u0000\u0000\u0086\u0088\u0003"+
		"$\u0012\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088#\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0003\u0000"+
		"\u0000\u008a%\u0001\u0000\u0000\u0000\b,3O`hn}\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}