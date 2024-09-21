// Generated from C:/Users/Alberth/OneDrive - Universidad Tecnologica Centroamericana/Documents/Unitec/2024/III Trimestre/Compiladores_1/proyecto/proyecto_compi/Proyecto_Compiladores_1/src/MiniPascal.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiniPascalParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiniPascalParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#encabezado}.
	 * @param ctx the parse tree
	 */
	void enterEncabezado(MiniPascalParser.EncabezadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#encabezado}.
	 * @param ctx the parse tree
	 */
	void exitEncabezado(MiniPascalParser.EncabezadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiniPascalParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiniPascalParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(MiniPascalParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(MiniPascalParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiniPascalParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiniPascalParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipoinstruccion}.
	 * @param ctx the parse tree
	 */
	void enterTipoinstruccion(MiniPascalParser.TipoinstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipoinstruccion}.
	 * @param ctx the parse tree
	 */
	void exitTipoinstruccion(MiniPascalParser.TipoinstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instruccionsimple}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionsimple(MiniPascalParser.InstruccionsimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instruccionsimple}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionsimple(MiniPascalParser.InstruccionsimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instruccionestructurada}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionestructurada(MiniPascalParser.InstruccionestructuradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instruccionestructurada}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionestructurada(MiniPascalParser.InstruccionestructuradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instruccionasignacion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instruccionasignacion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#bloqueinstruccion}.
	 * @param ctx the parse tree
	 */
	void enterBloqueinstruccion(MiniPascalParser.BloqueinstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#bloqueinstruccion}.
	 * @param ctx the parse tree
	 */
	void exitBloqueinstruccion(MiniPascalParser.BloqueinstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#estructurarepetitiva}.
	 * @param ctx the parse tree
	 */
	void enterEstructurarepetitiva(MiniPascalParser.EstructurarepetitivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#estructurarepetitiva}.
	 * @param ctx the parse tree
	 */
	void exitEstructurarepetitiva(MiniPascalParser.EstructurarepetitivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(MiniPascalParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(MiniPascalParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#buclerepeat}.
	 * @param ctx the parse tree
	 */
	void enterBuclerepeat(MiniPascalParser.BuclerepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#buclerepeat}.
	 * @param ctx the parse tree
	 */
	void exitBuclerepeat(MiniPascalParser.BuclerepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void enterBuclewhile(MiniPascalParser.BuclewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void exitBuclewhile(MiniPascalParser.BuclewhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#estructuraif}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraif(MiniPascalParser.EstructuraifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#estructuraif}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraif(MiniPascalParser.EstructuraifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void enterBuclefor(MiniPascalParser.BucleforContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void exitBuclefor(MiniPascalParser.BucleforContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#listafor}.
	 * @param ctx the parse tree
	 */
	void enterListafor(MiniPascalParser.ListaforContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#listafor}.
	 * @param ctx the parse tree
	 */
	void exitListafor(MiniPascalParser.ListaforContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiniPascalParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiniPascalParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipolista}.
	 * @param ctx the parse tree
	 */
	void enterTipolista(MiniPascalParser.TipolistaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipolista}.
	 * @param ctx the parse tree
	 */
	void exitTipolista(MiniPascalParser.TipolistaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipoidentificador}.
	 * @param ctx the parse tree
	 */
	void enterTipoidentificador(MiniPascalParser.TipoidentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipoidentificador}.
	 * @param ctx the parse tree
	 */
	void exitTipoidentificador(MiniPascalParser.TipoidentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipoarreglo}.
	 * @param ctx the parse tree
	 */
	void enterTipoarreglo(MiniPascalParser.TipoarregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipoarreglo}.
	 * @param ctx the parse tree
	 */
	void exitTipoarreglo(MiniPascalParser.TipoarregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipocadena}.
	 * @param ctx the parse tree
	 */
	void enterTipocadena(MiniPascalParser.TipocadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipocadena}.
	 * @param ctx the parse tree
	 */
	void exitTipocadena(MiniPascalParser.TipocadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tiposimple}.
	 * @param ctx the parse tree
	 */
	void enterTiposimple(MiniPascalParser.TiposimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tiposimple}.
	 * @param ctx the parse tree
	 */
	void exitTiposimple(MiniPascalParser.TiposimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipoescalar}.
	 * @param ctx the parse tree
	 */
	void enterTipoescalar(MiniPascalParser.TipoescalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipoescalar}.
	 * @param ctx the parse tree
	 */
	void exitTipoescalar(MiniPascalParser.TipoescalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tiposubrango}.
	 * @param ctx the parse tree
	 */
	void enterTiposubrango(MiniPascalParser.TiposubrangoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tiposubrango}.
	 * @param ctx the parse tree
	 */
	void exitTiposubrango(MiniPascalParser.TiposubrangoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#signo}.
	 * @param ctx the parse tree
	 */
	void enterSigno(MiniPascalParser.SignoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#signo}.
	 * @param ctx the parse tree
	 */
	void exitSigno(MiniPascalParser.SignoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#valorbooleano}.
	 * @param ctx the parse tree
	 */
	void enterValorbooleano(MiniPascalParser.ValorbooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#valorbooleano}.
	 * @param ctx the parse tree
	 */
	void exitValorbooleano(MiniPascalParser.ValorbooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(MiniPascalParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(MiniPascalParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracionvariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionvariable(MiniPascalParser.DeclaracionvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracionvariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionvariable(MiniPascalParser.DeclaracionvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#secciondeclaracionvariable}.
	 * @param ctx the parse tree
	 */
	void enterSecciondeclaracionvariable(MiniPascalParser.SecciondeclaracionvariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#secciondeclaracionvariable}.
	 * @param ctx the parse tree
	 */
	void exitSecciondeclaracionvariable(MiniPascalParser.SecciondeclaracionvariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#definicionconstante}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionconstante(MiniPascalParser.DefinicionconstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#definicionconstante}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionconstante(MiniPascalParser.DefinicionconstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#secciondeclaracionconstante}.
	 * @param ctx the parse tree
	 */
	void enterSecciondeclaracionconstante(MiniPascalParser.SecciondeclaracionconstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#secciondeclaracionconstante}.
	 * @param ctx the parse tree
	 */
	void exitSecciondeclaracionconstante(MiniPascalParser.SecciondeclaracionconstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracionproceso}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionproceso(MiniPascalParser.DeclaracionprocesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracionproceso}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionproceso(MiniPascalParser.DeclaracionprocesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracionprocesoofuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionprocesoofuncion(MiniPascalParser.DeclaracionprocesoofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracionprocesoofuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionprocesoofuncion(MiniPascalParser.DeclaracionprocesoofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#secciondeclaracionprocesoofuncion}.
	 * @param ctx the parse tree
	 */
	void enterSecciondeclaracionprocesoofuncion(MiniPascalParser.SecciondeclaracionprocesoofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#secciondeclaracionprocesoofuncion}.
	 * @param ctx the parse tree
	 */
	void exitSecciondeclaracionprocesoofuncion(MiniPascalParser.SecciondeclaracionprocesoofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#listaparametros}.
	 * @param ctx the parse tree
	 */
	void enterListaparametros(MiniPascalParser.ListaparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#listaparametros}.
	 * @param ctx the parse tree
	 */
	void exitListaparametros(MiniPascalParser.ListaparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#grupoparametros}.
	 * @param ctx the parse tree
	 */
	void enterGrupoparametros(MiniPascalParser.GrupoparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#grupoparametros}.
	 * @param ctx the parse tree
	 */
	void exitGrupoparametros(MiniPascalParser.GrupoparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#parametroactual}.
	 * @param ctx the parse tree
	 */
	void enterParametroactual(MiniPascalParser.ParametroactualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#parametroactual}.
	 * @param ctx the parse tree
	 */
	void exitParametroactual(MiniPascalParser.ParametroactualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#anchoparametro}.
	 * @param ctx the parse tree
	 */
	void enterAnchoparametro(MiniPascalParser.AnchoparametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#anchoparametro}.
	 * @param ctx the parse tree
	 */
	void exitAnchoparametro(MiniPascalParser.AnchoparametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#listaformalparametros}.
	 * @param ctx the parse tree
	 */
	void enterListaformalparametros(MiniPascalParser.ListaformalparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#listaformalparametros}.
	 * @param ctx the parse tree
	 */
	void exitListaformalparametros(MiniPascalParser.ListaformalparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#seccionformalparametros}.
	 * @param ctx the parse tree
	 */
	void enterSeccionformalparametros(MiniPascalParser.SeccionformalparametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#seccionformalparametros}.
	 * @param ctx the parse tree
	 */
	void exitSeccionformalparametros(MiniPascalParser.SeccionformalparametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#listaidentificadores}.
	 * @param ctx the parse tree
	 */
	void enterListaidentificadores(MiniPascalParser.ListaidentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#listaidentificadores}.
	 * @param ctx the parse tree
	 */
	void exitListaidentificadores(MiniPascalParser.ListaidentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionfuncion(MiniPascalParser.DeclaracionfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracionfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionfuncion(MiniPascalParser.DeclaracionfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#designarfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDesignarfuncion(MiniPascalParser.DesignarfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#designarfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDesignarfuncion(MiniPascalParser.DesignarfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instruccionprocedimiento}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionprocedimiento(MiniPascalParser.InstruccionprocedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instruccionprocedimiento}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionprocedimiento(MiniPascalParser.InstruccionprocedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expresionsimple}.
	 * @param ctx the parse tree
	 */
	void enterExpresionsimple(MiniPascalParser.ExpresionsimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expresionsimple}.
	 * @param ctx the parse tree
	 */
	void exitExpresionsimple(MiniPascalParser.ExpresionsimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiniPascalParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiniPascalParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#operadorrelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorrelacional(MiniPascalParser.OperadorrelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#operadorrelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorrelacional(MiniPascalParser.OperadorrelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#operadormultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperadormultiplicativo(MiniPascalParser.OperadormultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#operadormultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperadormultiplicativo(MiniPascalParser.OperadormultiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#operadoraditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperadoraditivo(MiniPascalParser.OperadoraditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#operadoraditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperadoraditivo(MiniPascalParser.OperadoraditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(MiniPascalParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(MiniPascalParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#signofactor}.
	 * @param ctx the parse tree
	 */
	void enterSignofactor(MiniPascalParser.SignofactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#signofactor}.
	 * @param ctx the parse tree
	 */
	void exitSignofactor(MiniPascalParser.SignofactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instruccionvacia}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionvacia(MiniPascalParser.InstruccionvaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instruccionvacia}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionvacia(MiniPascalParser.InstruccionvaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#vacio}.
	 * @param ctx the parse tree
	 */
	void enterVacio(MiniPascalParser.VacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#vacio}.
	 * @param ctx the parse tree
	 */
	void exitVacio(MiniPascalParser.VacioContext ctx);
}