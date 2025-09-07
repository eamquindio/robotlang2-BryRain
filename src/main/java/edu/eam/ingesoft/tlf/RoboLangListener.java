// Generated from edu/eam/ingesoft/tlf/RoboLang.g4 by ANTLR 4.13.1
package edu.eam.ingesoft.tlf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RoboLangParser}.
 */
public interface RoboLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RoboLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RoboLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#lista_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterLista_sentencia(RoboLangParser.Lista_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#lista_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitLista_sentencia(RoboLangParser.Lista_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(RoboLangParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(RoboLangParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sentencia_comando}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_comando(RoboLangParser.Sentencia_comandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sentencia_comando}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_comando(RoboLangParser.Sentencia_comandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#comando_simple}.
	 * @param ctx the parse tree
	 */
	void enterComando_simple(RoboLangParser.Comando_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#comando_simple}.
	 * @param ctx the parse tree
	 */
	void exitComando_simple(RoboLangParser.Comando_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sentencia_repeat}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_repeat(RoboLangParser.Sentencia_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sentencia_repeat}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_repeat(RoboLangParser.Sentencia_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_if(RoboLangParser.Sentencia_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_if(RoboLangParser.Sentencia_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#else_condicion}.
	 * @param ctx the parse tree
	 */
	void enterElse_condicion(RoboLangParser.Else_condicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#else_condicion}.
	 * @param ctx the parse tree
	 */
	void exitElse_condicion(RoboLangParser.Else_condicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_while(RoboLangParser.Sentencia_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_while(RoboLangParser.Sentencia_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(RoboLangParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(RoboLangParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#expresion_or}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_or(RoboLangParser.Expresion_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#expresion_or}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_or(RoboLangParser.Expresion_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#expresion_and}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_and(RoboLangParser.Expresion_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#expresion_and}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_and(RoboLangParser.Expresion_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#expresion_not}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_not(RoboLangParser.Expresion_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#expresion_not}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_not(RoboLangParser.Expresion_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#expresion_comparador}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_comparador(RoboLangParser.Expresion_comparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#expresion_comparador}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_comparador(RoboLangParser.Expresion_comparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sensor_numerico}.
	 * @param ctx the parse tree
	 */
	void enterSensor_numerico(RoboLangParser.Sensor_numericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sensor_numerico}.
	 * @param ctx the parse tree
	 */
	void exitSensor_numerico(RoboLangParser.Sensor_numericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#sensor_booleano}.
	 * @param ctx the parse tree
	 */
	void enterSensor_booleano(RoboLangParser.Sensor_booleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#sensor_booleano}.
	 * @param ctx the parse tree
	 */
	void exitSensor_booleano(RoboLangParser.Sensor_booleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(RoboLangParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(RoboLangParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(RoboLangParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(RoboLangParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RoboLangParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(RoboLangParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RoboLangParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(RoboLangParser.BooleanoContext ctx);
}