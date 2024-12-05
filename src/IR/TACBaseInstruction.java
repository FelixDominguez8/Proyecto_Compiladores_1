package IR;

public class TACBaseInstruction {
    private String operation; // The operator like ADD, SUB, MUL, ASSIGN
    private String result;    // The destination operand
    private String operand1;  // The first source operand
    private String operand2;  // The second source operand (optional)

    // Constructor to initialize the TACBaseInstruction
    public TACBaseInstruction(String operation, String result, String operand1, String operand2) {
        this.operation = operation;
        this.result = result;
        this.operand1 = operand1;
        this.operand2 = operand2; // Can be null if the operation is unary
    }

    public TACBaseInstruction(String load, String operand1, Object operand11) {
        //create a new TACBaseInstruction object
        this.operation = load;
        this.operand1 = operand1;
        this.operand2 = (String) operand11;

    }

    // Getter for operation
    public String getOperation() {
        return operation;
    }

    // Setter for operation
    public void setOperation(String operation) {
        this.operation = operation;
    }

    // Getter for result
    public String getResult() {
        return result;
    }

    // Setter for result
    public void setResult(String result) {
        this.result = result;
    }

    // Getter for operand1
    public String getOperand1() {
        return operand1;
    }

    // Setter for operand1
    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    // Getter for operand2
    public String getOperand2() {
        return operand2;
    }

    // Setter for operand2
    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }

    // toString method to provide a visual and pretty representation of the TAC instruction
    @Override
    public String toString() {
        return operation + " " + result + ", " + operand1 + (operand2 != null ? ", " + operand2 : "");
    }

    public int getOperandsCount() {
        return operand2 == null ? 1 : 2;
    }

    public String getOperand(int i) {
        if (i == 0) {
            return operand1;
        } else if (i == 1) {
            return operand2;
        } else {
            return null;
        }
    }
}
