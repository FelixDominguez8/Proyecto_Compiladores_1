package IR;

import java.util.ArrayList;
import java.util.List;

public class TACInstructionsIR {
    private List<TACBaseInstruction> instructions; // Holds the list of TAC instructions
    private StringBuilder output;

    // Constructor to initialize the TACInstructionsIR
    public TACInstructionsIR() {
        this.instructions = new ArrayList<>();
        this.output = new StringBuilder(); // Initialize the output field
    }

    public void setOutput(StringBuilder output) {
        this.output = output;
    }

    // Method to add a new instruction to the list
    public void addInstruction(TACBaseInstruction instruction) {
        if (instruction != null) {
            this.instructions.add(instruction);
            this.output.append("Added instruction: ").append(instruction.toString()).append("\n");
        } else {
            this.output.append("Attempted to add a null instruction.");
        }
    }

    // Method to retrieve the list of TAC instructions
    public List<TACBaseInstruction> getInstructions() {
        return this.instructions;
    }

    // Optional: A method to print all instructions for debugging
    public String printInstructions() {
        StringBuilder sb = new StringBuilder();
        for (TACBaseInstruction instruction : instructions) {
            sb.append(instruction.toString()).append("\n");
        }
        return sb.toString();
    }
}