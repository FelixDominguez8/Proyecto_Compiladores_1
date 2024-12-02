package SymbolTable;

public class FunctionSymbol extends Symbol {
    private final Type returnType;
    private final SymbolTable parameterTable;

    /**
     * Constructor for a function symbol. This extends the Symbol class.
     * @param identifier The identifier of the function.
     * @param returnType The return type of the function.
     */
    public FunctionSymbol(String identifier, Type returnType) {
        super(identifier, new Type(Type.BasicType.FUNCTION));
        this.returnType = returnType;
        this.parameterTable = new SymbolTable();
    }

    public Type getReturnType() {
        return returnType;
    }

    public SymbolTable getParameterTable() {
        return parameterTable;
    }

    @Override
    public String toString() {
        return String.format("FunctionSymbol(identifier: %s, returnType: %s, parameters: %s)",
                getIdentifier(), returnType, parameterTable);
    }
}