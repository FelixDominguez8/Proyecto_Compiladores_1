package SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ErrorClass.SymbolTableError;

public class SymbolTable {
    private List<Map<String, Symbol>> scopes;
    private int currentScopeIndex;

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
            throw new SymbolTableError("No se pueden cerrar más scopes, ya estás en el nivel global.");
        }
        currentScopeIndex--;
    }

    public void insert(String identifier, Symbol symbol) {
        Map<String, Symbol> currentScope = scopes.get(currentScopeIndex);
        if (currentScope.containsKey(identifier)) {
            throw new SymbolTableError("Símbolo ya definido en el scope actual: " + identifier);
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
        // Buscar desde el scope actual hacia atrás
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

    public boolean verifyIsFunctionOrProcedureSymbol(Symbol symbol) {
        return symbol instanceof FunctionSymbol || symbol instanceof ProcedureSymbol;
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
