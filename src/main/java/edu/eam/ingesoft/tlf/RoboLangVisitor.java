// Generated from edu/eam/ingesoft/tlf/RoboLang.g4 by ANTLR 4.13.1
package edu.eam.ingesoft.tlf;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RoboLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RoboLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RoboLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#lista_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_sentencia(RoboLangParser.Lista_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(RoboLangParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sentencia_comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_comando(RoboLangParser.Sentencia_comandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#comando_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_simple(RoboLangParser.Comando_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sentencia_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_repeat(RoboLangParser.Sentencia_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(RoboLangParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#else_condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condicion(RoboLangParser.Else_condicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sentencia_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_while(RoboLangParser.Sentencia_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(RoboLangParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#expresion_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_or(RoboLangParser.Expresion_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#expresion_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_and(RoboLangParser.Expresion_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#expresion_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_not(RoboLangParser.Expresion_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#expresion_comparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_comparador(RoboLangParser.Expresion_comparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sensor_numerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor_numerico(RoboLangParser.Sensor_numericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#sensor_booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensor_booleano(RoboLangParser.Sensor_booleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(RoboLangParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(RoboLangParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RoboLangParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(RoboLangParser.BooleanoContext ctx);
}