package SymbolTable;

public class VariableSymbol extends Symbol {
    private final boolean isConstant;

    public VariableSymbol(String identifier, Type type, boolean isConstant) {
        super(identifier, type);
        this.isConstant = isConstant;
    }

    public boolean isConstant() {
        return isConstant;
    }

    @Override

    public String toString() {
        return String.format("VariableSymbol(identifier: %s, type: %s, isConstant: %s)",
                getIdentifier(), getType(), isConstant);
    }
}