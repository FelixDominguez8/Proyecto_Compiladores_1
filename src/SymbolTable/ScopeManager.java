package SymbolTable;
import ErrorClass.SemanticErrorManager;
import ErrorClass.SymbolTableError;

public class ScopeManager {
    private SymbolTable symbolTable;
    private SemanticErrorManager semanticErrorManager;
    public ScopeManager(SemanticErrorManager semanticErrorManager) {
        this.symbolTable = new SymbolTable(semanticErrorManager);

    }

    public void enterScope() {
        symbolTable.enterScope();
    }

    public void exitScope() {
        symbolTable.exitScope();
    }

    public void define(String identifier, Symbol symbol) {

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
