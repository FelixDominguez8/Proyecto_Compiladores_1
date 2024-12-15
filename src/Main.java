import ErrorClass.*;
import IR.TACInstructionsIR;
import IR.VisitorTAC;
import IR.TACBaseInstruction;
import SymbolTable.SymbolTable;
import CreatedVisitor.MiniPascalVisitor;
import SymbolTable.ScopeManager;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import Parser.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import Optimizador.TACOptimizer;
import LLVM.LLVMFileHandler;
import LLVM.LLVMOutput;
import LLVM.LLVMTranslator;

public class Main {

    public static void main(String[] args) {
        try {
            ErrorHandler errorHandler = new ErrorHandler();
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
            lexer.addErrorListener(new CustomErrorLexer(errorHandler));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniPascalParser parser = new MiniPascalParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new CustomErrorParser(errorHandler));
          
            ParseTree tree = parser.programa();


            System.out.println("Parsing completado exitosamente.");
            SemanticErrorManager semanticErrorManager = new SemanticErrorManager();
            ScopeManager scopeManager = new ScopeManager(semanticErrorManager);
            CreatedVisitor.MiniPascalVisitor visitor = new MiniPascalVisitor(scopeManager);
            String result = visitor.visit(tree);
            semanticErrorManager.deleteRepeat();
            System.out.println("=====================================Resultado del SemanticErrorManager:===============================");
            System.out.println(semanticErrorManager);
            System.out.println("Resultado del SymbolTable:");
            System.out.println(scopeManager);

            System.out.println("Resultado del Visitor:");
            System.out.println(result);


            TACInstructionsIR ir = new TACInstructionsIR();
            VisitorTAC irVisitor = new VisitorTAC(ir, scopeManager.getSymbolTable());
            irVisitor.visit(tree);  // Ahora visita el árbol de sintaxis
            //ERORES SEMANTICOS
            for (SemanticError error : semanticErrorManager.getErrors()) {
                System.err.println(error);
            }
            // Print the generated TAC instructions
            List<TACBaseInstruction> instructions = ir.getInstructions();
            System.out.println("Generated TAC Instructions:");
            for (TACBaseInstruction instruction : instructions) {
                System.out.println(instruction);
            }

            TACOptimizer optimizer = new TACOptimizer(ir.getInstructions());
            List<TACBaseInstruction> optimizedInstructions = optimizer.optimize();

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Optimized TAC Instructions:");
            for (TACBaseInstruction instruction : optimizedInstructions) {
                System.out.println(instruction);
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");

            LLVMTranslator llvmTranslator = new LLVMTranslator();
            LLVMFileHandler llvmFileHandler = new LLVMFileHandler();
            LLVMOutput llvmOutput = new LLVMOutput();
            // Translate TAC instructions to LLVM IR
            List<String> llvmInstructions = new ArrayList<>();
            llvmInstructions = llvmTranslator.translateAll(optimizedInstructions);

            System.out.println("Generated LLVM Instructions:");
            for (String llvmInstruction : llvmInstructions) {
                System.out.println(llvmInstruction);
            }

            String llvmFilename = "output.ll";
            String inputFilename = "myProgram.pas"; // Replace with the actual input file name
            llvmFileHandler.writeToFile(llvmFilename, llvmInstructions, inputFilename);

            // Compile LLVM IR to an executable
            String executableName = "output.exe";
            llvmOutput.compile(llvmFilename, executableName, llvmInstructions);


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
