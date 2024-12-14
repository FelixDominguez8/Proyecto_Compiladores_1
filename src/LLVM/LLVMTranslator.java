package LLVM;

import IR.TACBaseInstruction;
import java.util.*;

public class LLVMTranslator {
    private int tempVarCounter = 0;
    private List<String> llvmInstructions;
    private Set<String> allocatedVariables = new HashSet<>();
    private Set<String> globalVariables = new HashSet<>();
    private List<String> globalStrings = new ArrayList<>();
    private Map<String, Integer> globalStringLengths = new HashMap<>();
    private int stringCounter = 0;

    public List<String> translateAll(List<TACBaseInstruction> instructions) {
        llvmInstructions = new ArrayList<>();
        addLLVMHeader();

        // Declare global variables
        for (TACBaseInstruction inst : instructions) {
            if ("VAR".equals(inst.getOperation())) {
                String variable = inst.getResult();
                if (!globalVariables.contains(variable)) {
                    llvmInstructions.add("@" + variable + " = global i32 0");
                    globalVariables.add(variable);
                }
            }
        }

        llvmInstructions.add("declare i32 @printf(i8*, ...)");
        llvmInstructions.add("define i32 @main() {");
        llvmInstructions.add("entry:");

        for (TACBaseInstruction inst : instructions) {
            String llvmCode = translate(inst);
            if (!llvmCode.isEmpty()) {
                llvmInstructions.add(llvmCode);
            }
        }

        llvmInstructions.add("ret i32 0");
        llvmInstructions.add("}");

        llvmInstructions.addAll(globalStrings);

        return llvmInstructions;
    }

    private void addLLVMHeader() {
        llvmInstructions.add("; ModuleID = 'MiniPascal'");
        llvmInstructions.add("source_filename = \"output.ll\"");
        llvmInstructions.add("target datalayout = \"e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-f80:128-n8:16:32:64-S128\"");
        llvmInstructions.add("target triple = \"x86_64-pc-windows-msvc19.34.31937\"\n");
    }

    private String addGlobalString(String str) {
        String globalStringName = "@.str" + stringCounter++;
        int length = str.length() + 1; // Incluye el carácter nulo
        // Aquí se genera correctamente la cadena en el formato adecuado para LLVM
        globalStrings.add(globalStringName + " = private unnamed_addr constant ["
                + length + " x i8] c\""
                + str + "\\00\", align 1");
        globalStringLengths.put(globalStringName, length);
        return globalStringName;
    }

    private String translate(TACBaseInstruction instruction) {
        switch (instruction.getOperation()) {
            case "VAR":
                return ""; // Global variables are handled earlier
            case "ALLOCATE":
                return translateAllocate(instruction);
            case "STORE":
                return translateStore(instruction);
            case "ASSIGN":
                return translateAssign(instruction);
            case "LOAD":
                return translateLoad(instruction);
            case "LOAD_CONST":
                return translateLoadConst(instruction);
            case "LABEL":
                return translateLabel(instruction);
            case "CALL":
                return translateCall(instruction);
            case "RETURN":
                return translateReturn(instruction);
            case "PARAM":
                return translateParam(instruction);
            case "+":
            case "-":
            case "*":
            case "/":
                return translateArithmetic(instruction);
            case "NOT":
                return translateNot(instruction);
            case "LOAD_BOOL":
                return translateLoadBool(instruction);
            case ">":
                return translateGreaterThan(instruction);
            case "<=":
                return translateLessEqual(instruction);
            case "IF":
                return translateIf(instruction);
            case "IF_FALSE":
                return translateIfFalse(instruction);
            case "GOTO":
                return translateGoto(instruction);
            case "INCREMENT":
                return translateIncrement(instruction);
            case "=":
                return translateEqual(instruction);
            case "div":
                return translateDiv(instruction);
            case "<":
                return translateLessThan(instruction);
            case ">=":
                return translateGreaterEqual(instruction);
            case "CONST":
                return translateConst(instruction);
            case "WHILE":
                return translateWhile(instruction);
            case "FOR":
                return translateFor(instruction);
            case "REPEAT":
                return translateRepeat(instruction);
            default:
                throw new IllegalArgumentException("Unsupported operation: " + instruction.getOperation());
        }
    }

    private String translateWhile(TACBaseInstruction instruction) {
        String labelCond = "while_cond_" + generateTempVariable();
        String labelBody = "while_body_" + generateTempVariable();
        String labelEnd = "while_end_" + generateTempVariable();

        StringBuilder llvmCode = new StringBuilder();
        llvmCode.append("br label %").append(labelCond).append("\n");
        llvmCode.append(labelCond).append(":\n");
        llvmCode.append("  %i = load i32, i32* @i\n");
        llvmCode.append("  %cmp = icmp sle i32 %i, 5\n");
        llvmCode.append("  br i1 %cmp, label %").append(labelBody).append(", label %").append(labelEnd).append("\n");
        llvmCode.append(labelBody).append(":\n");
        llvmCode.append("  %suma = load i32, i32* @suma\n");
        llvmCode.append("  %new_suma = add i32 %suma, %i\n");
        llvmCode.append("  store i32 %new_suma, i32* @suma\n");
        llvmCode.append("  %new_i = add i32 %i, 1\n");
        llvmCode.append("  store i32 %new_i, i32* @i\n");
        llvmCode.append("  br label %").append(labelCond).append("\n");
        llvmCode.append(labelEnd).append(":");

        return llvmCode.toString();
    }

    private String translateFor(TACBaseInstruction instruction) {
        String labelInit = "for_init_" + generateTempVariable();
        String labelCond = "for_cond_" + generateTempVariable();
        String labelBody = "for_body_" + generateTempVariable();
        String labelEnd = "for_end_" + generateTempVariable();

        StringBuilder llvmCode = new StringBuilder();
        llvmCode.append(labelInit).append(":\n");
        llvmCode.append("  store i32 1, i32* @i\n");
        llvmCode.append("  br label %").append(labelCond).append("\n");
        llvmCode.append(labelCond).append(":\n");
        llvmCode.append("  %i = load i32, i32* @i\n");
        llvmCode.append("  %cmp = icmp sle i32 %i, 5\n");
        llvmCode.append("  br i1 %cmp, label %").append(labelBody).append(", label %").append(labelEnd).append("\n");
        llvmCode.append(labelBody).append(":\n");
        llvmCode.append("  %suma = load i32, i32* @suma\n");
        llvmCode.append("  %new_suma = add i32 %suma, %i\n");
        llvmCode.append("  store i32 %new_suma, i32* @suma\n");
        llvmCode.append("  %next_i = add i32 %i, 1\n");
        llvmCode.append("  store i32 %next_i, i32* @i\n");
        llvmCode.append("  br label %").append(labelCond).append("\n");
        llvmCode.append(labelEnd).append(":");

        return llvmCode.toString();
    }

    private String translateRepeat(TACBaseInstruction instruction) {
        String labelRepeat = "repeat_body_" + generateTempVariable();
        String labelCond = "repeat_cond_" + generateTempVariable();
        String labelEnd = "repeat_end_" + generateTempVariable();

        StringBuilder llvmCode = new StringBuilder();
        llvmCode.append("  store i32 1, i32* @i\n");
        llvmCode.append("  br label %").append(labelRepeat).append("\n");
        llvmCode.append(labelRepeat).append(":\n");
        llvmCode.append("  %i = load i32, i32* @i\n");
        llvmCode.append("  %suma = load i32, i32* @suma\n");
        llvmCode.append("  %new_suma = add i32 %suma, %i\n");
        llvmCode.append("  store i32 %new_suma, i32* @suma\n");
        llvmCode.append("  %new_i = add i32 %i, 1\n");
        llvmCode.append("  store i32 %new_i, i32* @i\n");
        llvmCode.append("  br label %").append(labelCond).append("\n");
        llvmCode.append(labelCond).append(":\n");
        llvmCode.append("  %i_cond = load i32, i32* @i\n");
        llvmCode.append("  %cmp = icmp sgt i32 %i_cond, 5\n");
        llvmCode.append("  br i1 %cmp, label %").append(labelEnd).append(", label %").append(labelRepeat).append("\n");
        llvmCode.append(labelEnd).append(":");

        return llvmCode.toString();
    }

    private String translateIf(TACBaseInstruction instruction) {
        String condition = instruction.getOperand1();
        String labelTrue = instruction.getOperand2();
        String labelFalse = "else_" + generateTempVariable();

        return "br i1 %" + condition + ", label %" + labelTrue + ", label %" + labelFalse;
    }

    private String translateIfFalse(TACBaseInstruction instruction) {
        String condition = instruction.getOperand1();
        String labelFalse = instruction.getOperand2();
        String labelTrue = "else_" + generateTempVariable();

        return "br i1 %" + condition + ", label %" + labelTrue + ", label %" + labelFalse;
    }

    private String translateAllocate(TACBaseInstruction instruction) {
        String variable = instruction.getResult();
        if (!allocatedVariables.contains(variable)) {
            allocatedVariables.add(variable);
            return variable + " = alloca i32";
        }
        return "";
    }

    private String translateDeclaracionfuncion(TACBaseInstruction instruction) {
        String functionName = instruction.getOperand1();
        String returnType = "i32"; // Suponemos que es de tipo entero, puedes ajustarlo según sea necesario.

        StringBuilder llvmCode = new StringBuilder();
        llvmCode.append("define ").append(returnType).append(" @").append(functionName).append("() {\n");

        // Si tiene parámetros, agregarlos al código de la función
        // En este caso asumimos que no tiene parámetros, si los tiene puedes añadir algo similar al manejo de variables locales
        // llvmCode.append("  ; Parámetros aquí\n");

        // Generar el cuerpo de la función (esto puede incluir otros bloques de código, como las asignaciones y el retorno)
        llvmCode.append("  ; Cuerpo de la función\n");
        llvmCode.append("  ret ").append(returnType).append(" 0\n"); // Ejemplo, puedes generar el código según el cuerpo

        llvmCode.append("}\n");

        return llvmCode.toString();
    }

    private String translateDesignarfuncion(TACBaseInstruction instruction) {
        String functionName = instruction.getOperand1();
        String resultTempVar = generateTempVariable(); // Genera una variable temporal para almacenar el resultado

        StringBuilder llvmCode = new StringBuilder();
        llvmCode.append("  ; Llamada a la función ").append(functionName).append("\n");

        // Instrucción CALL
        llvmCode.append("  %").append(resultTempVar).append(" = call i32 @").append(functionName).append("()\n");

        // Asignar el resultado de la llamada a una variable
        llvmCode.append("  store i32 %").append(resultTempVar).append(", i32* @").append(instruction.getResult()).append("\n");

        return llvmCode.toString();
    }


    private String translateAssign(TACBaseInstruction instruction) {
        String variable = instruction.getResult();
        String value = instruction.getOperand1();
        System.out.println("Variable: "+variable);
        return "store i32 " + value + ", i32* @" + variable;
    }

    private String translateStore(TACBaseInstruction instruction) {
        String value = instruction.getOperand1();
        String variable = instruction.getResult();
        System.out.println("Variable: "+variable);

        if (globalVariables.contains(variable)) {
            return "store i32 " + value + ", i32* @" + variable;
        } else {
            return "store i32 " + value + ", i32* " + variable;
        }
    }

    private String translateLoad(TACBaseInstruction instruction) {
        String variable = instruction.getOperand1();
        String tempVar = instruction.getResult();
        if (allocatedVariables.contains(variable)) {
            return tempVar + " = load i32, i32* " + variable;
        }
        return tempVar + " = load i32, i32* @" + variable;
    }

    private String translateLoadConst(TACBaseInstruction instruction) {
        String constValue = instruction.getOperand1();
        String tempVar = instruction.getResult();
        try {
            int intValue = Integer.parseInt(constValue);
            return tempVar + " = add i32 0, " + intValue;
        } catch (NumberFormatException e) {
            // Manejo de constantes de tipo string
            String globalStringName = addGlobalString(constValue);
            // Retorna el código con el tipo adecuado de la constante string
            return tempVar + " = getelementptr inbounds [" +
                    globalStringLengths.get(globalStringName) + " x i8], [" +
                    globalStringLengths.get(globalStringName) + " x i8]* " +
                    globalStringName + ", i32 0, i32 0";
        }
    }

    private String translateCall(TACBaseInstruction instruction) {
        String functionName = instruction.getResult();
        if (functionName == null || functionName.isEmpty()) {
            return "";
        }

        if (functionName.equals("writeln")) {
            String stringIndex = instruction.getResult();
            String variable = instruction.getOperand1();
            String variable2 = instruction.getOperand2();

            String paraglobal = variable2+"\\n";
            String formatString = addGlobalString(paraglobal);
            int stringLength = globalStringLengths.get(formatString);
            return "call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" +
                    stringLength + " x i8], [" + stringLength + " x i8]* " +
                    formatString + ", i32 0, i32 0), i32 " + variable + ")";
        } else if (functionName.equals("write")) {
            String stringIndex = instruction.getResult();
            String variable = instruction.getOperand1();
            String variable2 = instruction.getOperand2();

            String formatString = addGlobalString(variable2);
            int stringLength = globalStringLengths.get(formatString);

            return "call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" +
                    stringLength + " x i8], [" + stringLength + " x i8]* " +
                    formatString + ", i32 0, i32 0), i32 " + variable + ")";
        }

        return "call void @" + functionName + "()";
    }


    private String translateArithmetic(TACBaseInstruction instruction) {
        String result = instruction.getResult();
        String operand1 = instruction.getOperand1();
        String operand2 = instruction.getOperand2();
        String op;

        switch (instruction.getOperation()) {
            case "+":
                op = "add";
                break;
            case "-":
                op = "sub";
                break;
            case "*":
                op = "mul";
                break;
            case "/":
                op = "sdiv";
                break;
            default:
                return "";
        }

        return result + " = " + op + " i32 " + operand1 + ", " + operand2;
    }

    private String translateNot(TACBaseInstruction instruction) {
        String result = instruction.getResult();
        String operand = instruction.getOperand1();
        return result + " = xor i1 " + operand + ", true";
    }

    private String translateLoadBool(TACBaseInstruction instruction) {
        String result = instruction.getResult();
        String value = instruction.getOperand1();
        return result + " = load i1, i1* @" + value;
    }

    private String generateComparison(TACBaseInstruction instruction, String comparisonType) {
        String result = instruction.getResult();
        String operand1 = instruction.getOperand1();
        String operand2 = instruction.getOperand2();
        return result + " = icmp " + comparisonType + " i32 " + operand1 + ", " + operand2;
    }

    private String translateDiv(TACBaseInstruction instruction) {
        String result = instruction.getResult();
        String operand1 = instruction.getOperand1();
        String operand2 = instruction.getOperand2();
        return result + " = sdiv i32 " + operand1 + ", " + operand2;
    }

    private String translateConst(TACBaseInstruction instruction) {
        String result = instruction.getResult();
        String value = instruction.getOperand1();
        return result + " = add i32 0, " + value;
    }

    private String translateGoto(TACBaseInstruction instruction) {
        String label = instruction.getOperand1();
        return "br label " + label;
    }

    private String translateIncrement(TACBaseInstruction instruction) {
        String variable = instruction.getResult();
        String incrementValue = instruction.getOperand2();
        String tempVar1 = generateTempVariable();
        String tempVar2 = generateTempVariable();

        return tempVar1 + " = load i32, i32* @" + variable + "\n" +
                tempVar2 + " = add i32 " + tempVar1 + ", " + incrementValue + "\n" +
                "store i32 " + tempVar2 + ", i32* @" + variable;
    }

    private String translateLabel(TACBaseInstruction instruction) {
        // Retorna solo el nombre de la etiqueta sin el prefijo '%' y sin '='
        return instruction.getResult() + " :"; // Solo el nombre seguido de ':'
    }

    private String translateReturn(TACBaseInstruction instruction) {
        String returnValue = instruction.getOperand1();
        if (returnValue != null) {
            return "ret i32 " + returnValue;
        }
        return "ret void";
    }

    private String translateParam(TACBaseInstruction instruction) {
        return "load i32, i32* @" + instruction.getResult();
    }

    private String translateGreaterThan(TACBaseInstruction instruction) {
        return generateComparison(instruction, "sgt");
    }

    private String translateLessEqual(TACBaseInstruction instruction) {
        return generateComparison(instruction, "sle");
    }

    private String translateEqual(TACBaseInstruction instruction) {
        return generateComparison(instruction, "eq");
    }

    private String translateLessThan(TACBaseInstruction instruction) {
        return generateComparison(instruction, "slt");
    }

    private String translateGreaterEqual(TACBaseInstruction instruction) {
        return generateComparison(instruction, "sge");
    }

    private String generateTempVariable() {
        return "tmp" + tempVarCounter++;
    }
}