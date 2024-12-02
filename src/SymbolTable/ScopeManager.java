package SymbolTable;
import ErrorClass.SymbolTableError;

public class ScopeManager {
    private SymbolTable symbolTable;

    public ScopeManager() {
        this.symbolTable = new SymbolTable();
    }

    public void enterScope() {
        symbolTable.enterScope();
    }

    public void exitScope() {
        symbolTable.exitScope();
    }

    public void define(String identifier, Symbol symbol) {
        if (symbolTable.existsInCurrentScope(identifier)) {
            throw new SymbolTableError("Símbolo redefinido en el scope actual: " + identifier);
        }
        symbolTable.insert(identifier, symbol);
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public String toString() {
        return symbolTable.toString();
    }

}
