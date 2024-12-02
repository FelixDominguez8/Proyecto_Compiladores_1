package SymbolTable;

public class ProcedureSymbol extends Symbol {
    private final SymbolTable parameterTable;
    /**
     * Constructor for a procedure symbol. This extends the Symbol class.
     * @param identifier The identifier of the procedure.
     */
    public ProcedureSymbol(String identifier) {
        super(identifier, new Type(Type.BasicType.PROCEDURE));
        this.parameterTable = new SymbolTable();
    }

    public SymbolTable getParameterTable() {
        return parameterTable;
    }

    @Override
    public String toString() {
        return String.format("ProcedureSymbol(identifier: %s, parameters: %s)",
                getIdentifier(), parameterTable);
    }
}