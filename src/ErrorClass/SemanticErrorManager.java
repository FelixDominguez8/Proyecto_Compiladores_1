package ErrorClass;

import java.util.ArrayList;

public class SemanticErrorManager {
    private ArrayList<SemanticError> semanticErrors = new ArrayList<>();

    public void addError(SemanticError error) {
        semanticErrors.add(error);
    }

    public int getErrorsCount() {
        return semanticErrors.size();
    }

    public ArrayList<SemanticError> getErrors() {
        return semanticErrors;
    }

    public void deleteRepeat(){
        //recorer la lista de errores con un for
        for (int i = 0; i < semanticErrors.size(); i++){
            if (semanticErrors.get(i).getLine() == semanticErrors.get(i+1).getLine() && semanticErrors.get(i).getColumn() == semanticErrors.get(i+1).getColumn()){
                semanticErrors.remove(i+1);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SemanticErrorsCollector{");
        for (SemanticError error : semanticErrors) {
            sb.append("\n").append(error.toString());
        }
        sb.append("\n}");
        return sb.toString();
    }
}