package Optimizador;

import IR.TACBaseInstruction;

import java.util.*;

public class TACOptimizer {
    private List<TACBaseInstruction> instructions;

    public TACOptimizer(List<TACBaseInstruction> instructions) {
        this.instructions = instructions;
    }

    public List<TACBaseInstruction> optimize() {
        int maxIterations = 10; // Límite para evitar ciclos infinitos
        boolean changesMade;

        for (int i = 0; i < maxIterations; i++) {
            changesMade = false;

            changesMade |= removeRedundantLoadsAndAssignments();
            changesMade |= performConstantFolding();
            changesMade |= propagateCopies();
            changesMade |= simplifyAlgebraicExpressions();
            changesMade |= optimizeLoops();
            changesMade |= eliminateDeadCode();
            changesMade |= removeRedundantJumps();
            changesMade |= propagateConstants();

            if (!changesMade) {
                break; // Termina si no hubo más cambios
            }
        }

        return instructions;
    }

    private boolean removeRedundantLoadsAndAssignments() {
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if ("ASSIGN".equals(instr.getOperation()) && instr.getOperand1() != null &&
                    instr.getOperand1().equals(instr.getResult())) {
                // Eliminar asignaciones redundantes como ASSIGN x, x
                changesMade = true;
                continue;
            }

            if ("LOAD".equals(instr.getOperation()) && instr.getOperand1() != null &&
                    instr.getOperand1().equals(instr.getResult())) {
                // Eliminar cargas redundantes como LOAD x, x
                changesMade = true;
                continue;
            }

            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
        return changesMade;
    }

    private boolean performConstantFolding() {
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperation() != null && instr.getOperation().matches("[\\+\\-\\*/]") &&
                    isNumeric(instr.getOperand1()) && isNumeric(instr.getOperand2())) {
                double result = calculate(instr.getOperand1(), instr.getOperand2(), instr.getOperation());
                instr.setOperation("ASSIGN");
                instr.setOperand1(String.valueOf(result));
                instr.setOperand2(null);
                changesMade = true;
            }
        }

        return changesMade;
    }

    private boolean propagateCopies() {
        Map<String, String> copyMap = new HashMap<>();
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if ("ASSIGN".equals(instr.getOperation()) && !instr.getResult().contains("[")) {
                copyMap.put(instr.getResult(), instr.getOperand1());
                changesMade = true;
            }

            if (instr.getOperand1() != null && copyMap.containsKey(instr.getOperand1())) {
                instr.setOperand1(copyMap.get(instr.getOperand1()));
                changesMade = true;
            }
            if (instr.getOperand2() != null && copyMap.containsKey(instr.getOperand2())) {
                instr.setOperand2(copyMap.get(instr.getOperand2()));
                changesMade = true;
            }

            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
        return changesMade;
    }

    private boolean simplifyAlgebraicExpressions() {
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if ("+".equals(instr.getOperation()) && "0".equals(instr.getOperand2())) {
                instr.setOperation("ASSIGN");
                instr.setOperand2(null);
                changesMade = true;
            }
            if ("*".equals(instr.getOperation()) && "1".equals(instr.getOperand2())) {
                instr.setOperation("ASSIGN");
                instr.setOperand2(null);
                changesMade = true;
            }
            if ("+".equals(instr.getOperation()) && "0".equals(instr.getOperand1())) {
                instr.setOperation("ASSIGN");
                instr.setOperand1(null);
                changesMade = true;
            }
        }

        return changesMade;
    }

    private boolean optimizeLoops() {
        boolean changesMade = false;

        for (int i = 0; i < instructions.size(); i++) {
            TACBaseInstruction instr = instructions.get(i);

            if ("LABEL".equals(instr.getOperation()) && i + 1 < instructions.size()) {
                TACBaseInstruction nextInstr = instructions.get(i + 1);
                if ("GOTO".equals(nextInstr.getOperation()) && nextInstr.getOperand1().equals(instr.getResult())) {
                    instructions.remove(i + 1); // Elimina el GOTO redundante
                    changesMade = true;
                }
            }
        }

        return changesMade;
    }

    private boolean eliminateDeadCode() {
        Set<String> usedVariables = new HashSet<>();
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if (instr.getOperand1() != null) usedVariables.add(instr.getOperand1());
            if (instr.getOperand2() != null) usedVariables.add(instr.getOperand2());
        }

        for (TACBaseInstruction instr : instructions) {
            if ("ASSIGN".equals(instr.getOperation()) && !usedVariables.contains(instr.getResult())) {
                changesMade = true;
                continue; // Elimina código muerto
            }
            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
        return changesMade;
    }

    private boolean removeRedundantJumps() {
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean changesMade = false;

        for (int i = 0; i < instructions.size() - 1; i++) {
            TACBaseInstruction current = instructions.get(i);
            TACBaseInstruction next = instructions.get(i + 1);

            if ("GOTO".equals(current.getOperation()) && "LABEL".equals(next.getOperation()) &&
                    current.getOperand1() != null && current.getOperand1().equals(next.getResult())) {
                changesMade = true;
                continue; // Elimina el salto redundante
            }

            optimizedInstructions.add(current);
        }

        if (!instructions.isEmpty()) {
            optimizedInstructions.add(instructions.get(instructions.size() - 1));
        }

        instructions = optimizedInstructions;
        return changesMade;
    }

    private boolean propagateConstants() {
        Map<String, String> constants = new HashMap<>();
        List<TACBaseInstruction> optimizedInstructions = new ArrayList<>();
        boolean changesMade = false;

        for (TACBaseInstruction instr : instructions) {
            if ("ASSIGN".equals(instr.getOperation()) && isNumeric(instr.getOperand1())) {
                constants.put(instr.getResult(), instr.getOperand1());
                changesMade = true;
            } else {
                if (instr.getOperand1() != null && constants.containsKey(instr.getOperand1())) {
                    instr.setOperand1(constants.get(instr.getOperand1()));
                    changesMade = true;
                }
                if (instr.getOperand2() != null && constants.containsKey(instr.getOperand2())) {
                    instr.setOperand2(constants.get(instr.getOperand2()));
                    changesMade = true;
                }
            }
            optimizedInstructions.add(instr);
        }

        instructions = optimizedInstructions;
        return changesMade;
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
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Operación no soportada: " + operation);
        };
    }
}
