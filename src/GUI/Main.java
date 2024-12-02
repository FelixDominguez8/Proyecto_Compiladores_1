package GUI;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import Parser.*;
import SymbolTable.ScopeManager;
import ErrorClass.CustomErrorLexer;
import ErrorClass.CustomErrorParser;
import CreatedVisitor.MiniPascalVisitor;

public class Main {
    private JPanel mainPanel;
    private JTree files_tree;
    private JButton save_button;
    private JButton abrirButton;
    private JPanel Jpanelcompile;
    private JButton compilarButton;
    private JButton verDetallesButton;
    private JTextArea textArea_Code;
    private JScrollPane jScrollpanelTextAreaCode;
    private JScrollPane JScrollPaneLineText;
    private JTextArea textArea_LineText;
    private JPanel JPanelFiles;
    private JScrollPane JScrollPaneTreeFile;
    private JPanel JPanel_ButtonsCreate;
    private JButton guardarButton;

    public Main() {
        abrirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compileFile();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MiniPascal Compiler");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1200, 700);
            frame.setLocation(200, 100);
            Main main = new Main();
            frame.setContentPane(main.createMainPanel());

            frame.setVisible(true);
        });
    }

    private JPanel createMainPanel() {
        return mainPanel;
    }

    private void compileFile() {
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
                return;
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
            MiniPascalVisitor visitor = new MiniPascalVisitor(scopeManager);
            String result = visitor.visit(tree);

            System.out.println("Resultado del Visitor:");
            System.out.println(result);

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


    private void createUIComponents() {
        String roothPath = System.getProperty("user.dir") + "/Proyecto_Compiladores_1/src/Archivos_Prueba"; ;
        File rootFile = new File(roothPath);

        if (!rootFile.exists() || !rootFile.isDirectory()) {
            System.err.println("La carpeta especificada no existe o no es un directorio válido: " + rootFile);
            return;
        }

        DefaultMutableTreeNode rootNode = createTreeNode(rootFile);
        DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
        files_tree = new JTree(treeModel);
        files_tree.setRootVisible(true);
        files_tree.setShowsRootHandles(true);
    }

    private DefaultMutableTreeNode createTreeNode(File file) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    node.add(createTreeNode(child)); //
                }
            }
        }
        return node;
    }
}