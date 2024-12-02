package SymbolTable;

public class Symbol {
    private String identifier;
    private Type type;

    public Symbol(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }
    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    @Override
    public String toString() {
        return String.format("Symbol(identifier: %s, type: %s)", identifier, type);
    }

}
