// Generated from C:/Users/Alberth/OneDrive - Universidad Tecnologica Centroamericana/Documents/Unitec/2024/III Trimestre/Compiladores_1/proyecto/proyecto_compi/Proyecto_Compiladores_1/src/MiniPascal.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiniPascalParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncabezado(MiniPascalParser.EncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiniPascalParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(MiniPascalParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(MiniPascalParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipoinstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoinstruccion(MiniPascalParser.TipoinstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instruccionsimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionsimple(MiniPascalParser.InstruccionsimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instruccionestructurada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionestructurada(MiniPascalParser.InstruccionestructuradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instruccionasignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#bloqueinstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueinstruccion(MiniPascalParser.BloqueinstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#estructurarepetitiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructurarepetitiva(MiniPascalParser.EstructurarepetitivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(MiniPascalParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#buclerepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuclerepeat(MiniPascalParser.BuclerepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#buclewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuclewhile(MiniPascalParser.BuclewhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#estructuraif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraif(MiniPascalParser.EstructuraifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(MiniPascalParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(MiniPascalParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#buclefor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuclefor(MiniPascalParser.BucleforContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#listafor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListafor(MiniPascalParser.ListaforContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiniPascalParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipolista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipolista(MiniPascalParser.TipolistaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipoidentificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoidentificador(MiniPascalParser.TipoidentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipoarreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoarreglo(MiniPascalParser.TipoarregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipocadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipocadena(MiniPascalParser.TipocadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tiposimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiposimple(MiniPascalParser.TiposimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tipoescalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoescalar(MiniPascalParser.TipoescalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#tiposubrango}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiposubrango(MiniPascalParser.TiposubrangoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#signo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno(MiniPascalParser.SignoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#valorbooleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorbooleano(MiniPascalParser.ValorbooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(MiniPascalParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#declaracionvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionvariable(MiniPascalParser.DeclaracionvariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#secciondeclaracionvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecciondeclaracionvariable(MiniPascalParser.SecciondeclaracionvariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#definicionconstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionconstante(MiniPascalParser.DefinicionconstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#secciondeclaracionconstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecciondeclaracionconstante(MiniPascalParser.SecciondeclaracionconstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#declaracionproceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionproceso(MiniPascalParser.DeclaracionprocesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#declaracionprocesoofuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionprocesoofuncion(MiniPascalParser.DeclaracionprocesoofuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#secciondeclaracionprocesoofuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecciondeclaracionprocesoofuncion(MiniPascalParser.SecciondeclaracionprocesoofuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#listaparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaparametros(MiniPascalParser.ListaparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#grupoparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrupoparametros(MiniPascalParser.GrupoparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#parametroactual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroactual(MiniPascalParser.ParametroactualContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#anchoparametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchoparametro(MiniPascalParser.AnchoparametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#listaformalparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaformalparametros(MiniPascalParser.ListaformalparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#seccionformalparametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionformalparametros(MiniPascalParser.SeccionformalparametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#listaidentificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaidentificadores(MiniPascalParser.ListaidentificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionfuncion(MiniPascalParser.DeclaracionfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#designarfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignarfuncion(MiniPascalParser.DesignarfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instruccionprocedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionprocedimiento(MiniPascalParser.InstruccionprocedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expresionsimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionsimple(MiniPascalParser.ExpresionsimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiniPascalParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#operadorrelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorrelacional(MiniPascalParser.OperadorrelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#operadormultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadormultiplicativo(MiniPascalParser.OperadormultiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#operadoraditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoraditivo(MiniPascalParser.OperadoraditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(MiniPascalParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#signofactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignofactor(MiniPascalParser.SignofactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instruccionvacia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionvacia(MiniPascalParser.InstruccionvaciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#vacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacio(MiniPascalParser.VacioContext ctx);
}