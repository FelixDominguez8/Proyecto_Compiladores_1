package Optimizador;

import IR.TACBaseInstruction;
import java.util.*;

public class TACOptimizer {
    private List<TACBaseInstruction> instructions;

    public TACOptimizer(List<TACBaseInstruction> instructions) {
        this.instructions = instructions;
    }

    public List<TACBaseInstruction> optimize() {
        boolean changesMade;

        // Solo optimizaciones muy básicas
        do {
            changesMade = false;

            changesMade |= performConstantFolding();
            changesMade |= removeRedundantLoadsAndAssignments();
            changesMade |= performConstantFolding();

        } while (changesMade); // Continúa hasta que no haya cambios

        return instructions;
    }

    private boolean removeRedundantLoadsAndAssignments() {
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().equals("LOAD_CONST")) {
                changesMade = true;
                continue; // Elimina LOAD_CONST x, x
            }

            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
        return changesMade;
    }

    private boolean performConstantFolding() {
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            // Realiza la operación de constante si ambos operandos son numéricos
            if (instr.getOperation() != null && instr.getOperation().matches("[\\+\\-\\*/]") &&
                    isNumeric(instr.getOperand1()) && isNumeric(instr.getOperand2())) {
                int result = calculate(instr.getOperand1(), instr.getOperand2(), instr.getOperation());
                instr.setOperation("LOAD_CONST");
                instr.setOperand1(String.valueOf(result));
                instr.setOperand2(null);
                changesMade = true;
            }
        }

        return changesMade;
    }

    private boolean isNumeric(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int calculate(String operand1, String operand2, String operator) {
        int val1 = Integer.parseInt(operand1);
        int val2 = Integer.parseInt(operand2);

        switch (operator) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                return val1 / val2;
            default:
                return 0;
        }
    }
}
