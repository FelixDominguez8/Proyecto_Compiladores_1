package Optimizador;

import IR.TACBaseInstruction;

import java.util.*;

public class TACOptimizer {
    private List<TACBaseInstruction> instructions;
    private Map<String, String> lastAssignedValue = new HashMap<>(); // Store the last value assigned to each variable

    public TACOptimizer(List<TACBaseInstruction> instructions) {
        this.instructions = instructions;
    }

    public List<TACBaseInstruction> optimize() {
        removeRedundantLoadsAndStores();
        performConstantFolding();
        eliminateDeadCode();
        propagateCopies();
        simplifyAlgebraicExpressions();
        skipRedundantWrites();
        return instructions;
    }

    private void removeRedundantLoadsAndStores() {
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        Set<String> accessedVariables = new HashSet<>();

        // First pass to determine used variables
        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().equals("LOAD") || instr.getOperation().equals("STORE")) {
                accessedVariables.add(instr.getResult());
                accessedVariables.add(instr.getOperand1());
            }
        }

        // Second pass to eliminate redundant loads and stores
        for (TACBaseInstruction instr : instructions) {
            if ((instr.getOperation().equals("LOAD") || instr.getOperation().equals("STORE"))
                    && !accessedVariables.contains(instr.getResult())) {
                continue; // Skip redundant load/store
            }
            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
    }

    private void performConstantFolding() {
        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().matches("[\\+\\-\\*/]") && isNumeric(instr.getOperand1()) && isNumeric(instr.getOperand2())) {
                double result = calculate(instr.getOperand1(), instr.getOperand2(), instr.getOperation());
                instr.setOperation("ASSIGN");
                instr.setOperand1(String.valueOf(result));
                instr.setOperand2(null);
            }
        }
    }

    private void eliminateDeadCode() {
        Set<String> usedVariables = new HashSet<>();
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();

        // Collect used variables
        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperand1() != null) {
                usedVariables.add(instr.getOperand1());
            }
            if (instr.getOperand2() != null) {
                usedVariables.add(instr.getOperand2());
            }
        }

        // Eliminate dead code
        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().equals("ASSIGN") && !usedVariables.contains(instr.getResult())) {
                continue;
            }
            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
    }

    private void propagateCopies() {
        Map<String, String> copyMap = new HashMap<>();
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();

        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().equals("ASSIGN") && !instr.getResult().contains("[")) {
                copyMap.put(instr.getResult(), instr.getOperand1());
            }

            // Substitute uses of copied variables
            if (copyMap.containsKey(instr.getOperand1())) {
                instr.setOperand1(copyMap.get(instr.getOperand1()));
            }
            if (copyMap.containsKey(instr.getOperand2())) {
                instr.setOperand2(copyMap.get(instr.getOperand2()));
            }

            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
    }

    private void simplifyAlgebraicExpressions() {
        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().equals("+") && instr.getOperand2().equals("0")) {
                instr.setOperation("ASSIGN");
                instr.setOperand2(null);
            }
        }
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double calculate(String op1, String op2, String operation) {
        double num1 = Double.parseDouble(op1);
        double num2 = Double.parseDouble(op2);
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    private void skipRedundantWrites() {
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean lastWasPush = false;

        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation().equals("PUSH")) {
                lastWasPush = true;
                optimizedInstructions.add(instr);
                continue;
            }

            if (lastWasPush && instr.getOperation().equals("CALL") && instr.getOperand1().equals("WRITE")) {
                lastWasPush = false;
                continue;
            }

            lastWasPush = false;
            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
    }
}
