package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ErrorClass.SemanticError;
import ErrorClass.SemanticErrorManager;
import ErrorClass.SymbolTableError;

public class SymbolTable {
    private List<Map<String, Symbol>> scopes;
    private int currentScopeIndex;
    private int line;
    private int column;
    private SemanticErrorManager semanticErrorManager;


    public SymbolTable(SemanticErrorManager semanticErrorManager) {
        this.scopes = new ArrayList<>();
        this.currentScopeIndex = 0;
        scopes.add(new HashMap<>());
        this.semanticErrorManager = semanticErrorManager;
    }

    public SymbolTable() {
        this.scopes = new ArrayList<>();
        this.currentScopeIndex = 0;
        scopes.add(new HashMap<>());
    }

    public void enterScope() {
        if (currentScopeIndex == scopes.size() - 1) {
            scopes.add(new HashMap<>());
        }
        currentScopeIndex++;
    }

    public void exitScope() {
        if (currentScopeIndex == 0) {
            System.out.println("Error: No se puede salir del scope global.");
        }
        currentScopeIndex--;
    }

    public void insert(String identifier, Symbol symbol) {
        Map<String, Symbol> currentScope = scopes.get(currentScopeIndex);
        if (currentScope.containsKey(identifier)) {
            semanticErrorManager.addError(new SemanticError("Semantic Error", line, column, "El identificador " + identifier + " ya ha sido declarado."));
        }

        if (isProcedureOrFunctionScope()) {
            Symbol previousSymbol = getPreviousSymbolPeak();
            if (getPreviousSymbolPeak() != null) {
                if (previousSymbol instanceof ProcedureSymbol) {
                    ((ProcedureSymbol) previousSymbol).getParameterTable().insert(identifier, symbol);
                } else if (previousSymbol instanceof FunctionSymbol) {
                    ((FunctionSymbol) previousSymbol).getParameterTable().insert(identifier, symbol);
                }
            }
        }


        currentScope.put(identifier, symbol);
     }

    public Symbol getPreviousSymbolPeak() {

        for (int i = currentScopeIndex; i >= 0; i--) {
            Map<String, Symbol> currentScope = scopes.get(i);

            Symbol result = currentScope.values().stream()
                    .filter(symbol -> symbol instanceof ProcedureSymbol || symbol instanceof FunctionSymbol)
                    .reduce((first, second) -> second)
                    .orElse(null);

            if (result != null) {
                return result;
            }
        }

        // No se encontró un símbolo válido
        return null;
    }

    public void verifyOperationType(Symbol symbol, String operationType){
        if(!symbol.getType().getBaseType().toString().equalsIgnoreCase(operationType)){
            semanticErrorManager.addError(new SemanticError("Semantic Error, error de Tipos", line, column, "Se esperaba " + symbol.getType().getBaseType() + " pero se encontró " + operationType));
        }
    }

    public Symbol getSymbol(String identifier) {
        if (currentScopeIndex == 0){
            for (int i = currentScopeIndex; i >= 0; i--) {
                Map<String, Symbol> currentScope = scopes.get(i);
                if (currentScope.containsKey(identifier)) {
                    return currentScope.get(identifier);
                }
            }
            return null;
        } else{
            return null;
        }

    }

    public List<Map<String, Symbol>> getScopes() {
        return scopes;
    }

    public int getScopeLevel() {
        return currentScopeIndex;
    }

    public boolean existsInCurrentScope(String identifier) {
        return scopes.get(currentScopeIndex).containsKey(identifier);
    }

    public boolean isProcedureOrFunctionScope() {
        return currentScopeIndex == 1;
    }

    public void validateSymbolExist(Symbol symbol){
        for (int i = currentScopeIndex; i >= 0; i--) {
            Map<String, Symbol> currentScope = scopes.get(i);
            if (!currentScope.containsValue(symbol)) {
                semanticErrorManager.addError(new SemanticError("Semantic Error", line, column, "El identificador " + symbol.getIdentifier() + " no ha sido declarado."));
            }
        }
    }

    public boolean verifyIsFunctionOrProcedureSymbol(Symbol symbol) {
        return symbol instanceof FunctionSymbol || symbol instanceof ProcedureSymbol;
    }

    public Symbol lookup(String identifier) {
        for (int i = currentScopeIndex; i >= 0; i--) {
            Map<String, Symbol> currentScope = scopes.get(i);
            if (currentScope.containsKey(identifier)) {
                return currentScope.get(identifier);
            }
        }
        return null;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("SymbolTable:\n");
        for (int i = 0; i < scopes.size(); i++) {
            result.append("Scope ").append(i);
            if (i == currentScopeIndex) {
                result.append(" (actual)");
            }
            result.append(": ").append(scopes.get(i)).append("\n");
        }
        return result.toString();
    }
}
