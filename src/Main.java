import IR.TACInstructionsIR;
import IR.VisitorTAC;
import IR.TACBaseInstruction;
import SymbolTable.SymbolTable;
import CreatedVisitor.MiniPascalVisitor;
import ErrorClass.CustomErrorLexer;
import ErrorClass.CustomErrorParser;
import SymbolTable.ScopeManager;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import Parser.*;
import java.io.IOException;
import java.util.List;
import javax.swing.*;
import Optimizador.TACOptimizer;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            File selectedFile = chooseFile();
            if (selectedFile != null) {
                try {
                    is = new FileInputStream(selectedFile);
                    System.out.println("Archivo encontrado: " + selectedFile.getAbsolutePath());
                } catch (Exception e) {
                    System.err.println("No se pudo abrir el archivo: " + e.getMessage());
                }
            } else {
                System.out.println("No se seleccionó ningún archivo.");
            }


            CharStream input = CharStreams.fromStream(is);
            MiniPascalLexer lexer = new MiniPascalLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new CustomErrorLexer());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniPascalParser parser = new MiniPascalParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new CustomErrorParser());
          
            ParseTree tree = parser.programa();


            System.out.println("Parsing completado exitosamente.");

            ScopeManager scopeManager = new ScopeManager();
            CreatedVisitor.MiniPascalVisitor visitor = new MiniPascalVisitor(scopeManager);
            String result = visitor.visit(tree);

            System.out.println("Resultado del SymbolTable:");
            System.out.println(scopeManager);

            System.out.println("Resultado del Visitor:");
            System.out.println(result);

            SymbolTable globalSymbolTable = new SymbolTable();

            TACInstructionsIR ir = new TACInstructionsIR();
            VisitorTAC irVisitor = new VisitorTAC(ir, globalSymbolTable);
            irVisitor.visit(tree);  // Ahora visita el árbol de sintaxis

            TACOptimizer optimizer = new TACOptimizer(ir.getInstructions());
            List<TACBaseInstruction> optimizedInstructions = optimizer.optimize();

            // Print the generated TAC instructions
            List<TACBaseInstruction> instructions = ir.getInstructions();
            System.out.println("Generated TAC Instructions:");
            for (TACBaseInstruction instruction : instructions) {
                System.out.println(instruction);
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Optimized TAC Instructions:");
            for (TACBaseInstruction instruction : optimizedInstructions) {
                System.out.println(instruction);
            }


        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static File chooseFile() {
        String raizProyecto = System.getProperty("user.dir");
        JFileChooser fileChooser = new JFileChooser(new File(raizProyecto));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile.exists() && !selectedFile.isDirectory()) {
                return selectedFile;
            } else {
                System.err.println("El archivo no existe o es un directorio.");
                return null;
            }
        } else {
            System.out.println("El usuario canceló la selección del archivo.");
            return null;
        }
    }
}
