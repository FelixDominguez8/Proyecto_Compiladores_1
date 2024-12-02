package GUI;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.io.*;

import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import Parser.*;
import SymbolTable.ScopeManager;
import ErrorClass.CustomErrorLexer;
import ErrorClass.CustomErrorParser;
import CreatedVisitor.MiniPascalVisitor;
import GUI.Detalles;

public class Main {
    private boolean isEditable = false;
    private JPanel mainPanel;
    private JTree files_tree;
    private JButton save_button;
    private JButton abrirButton;
    private JPanel Jpanelcompile;
    private JButton compilarButton;
    private JButton verDetallesButton;
    private JTextArea textArea_Code;
    private JScrollPane jScrollpanelTextAreaCode;
    private JPanel JPanelFiles;
    private JScrollPane JScrollPaneTreeFile;
    private JPanel JPanel_ButtonsCreate;
    private JButton editarButton;
    private Detalles detallesPanel;
    private SymbolTable symbolTable;
    public Main() {



        compilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Compilar el archivo seleccionado
                File selectedFile = getSelectedFileFromTree();
                compileFile(selectedFile);
                if (selectedFile == null) {
                    JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo .pas");
                } else{
                    // Mostrar el panel de detalles
                    showDetailsPanel();
                }

            }
        });

        textArea_Code.addContainerListener(new ContainerAdapter() {
        });
        abrirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSelectedFile();
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isEditable = !isEditable;
                textArea_Code.setEditable(isEditable);
                editarButton.setText(isEditable ? "Deseditar" : "Editar");
            }
        });
        save_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isEditable) {
                    // Guardar el contenido solo si se ha editado
                    saveFile();
                } else {
                    JOptionPane.showMessageDialog(null, "Primero edite el archivo antes de guardar.");
                }

            }
        });
    }

    private void showDetailsPanel() {
        detallesPanel = new Detalles(symbolTable);
        detallesPanel.setVisible(true);
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

    private void saveFile() {
        File selectedFile = getSelectedFileFromTree();
        if (selectedFile != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                writer.write(textArea_Code.getText());
                JOptionPane.showMessageDialog(null, "Archivo guardado con éxito.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
            }
        }
    }

    private JPanel createMainPanel() {
        return mainPanel;
    }

    private void compileFile(File selectedFile) {
        try {
            InputStream is = System.in;

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

            symbolTable = scopeManager.getSymbolTable();

            System.out.println("Resultado del Visitor:");
            System.out.println(result);

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
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

    private void openSelectedFile() {

        File selectedFile = getSelectedFileFromTree();

        if (selectedFile != null && selectedFile.getName().endsWith(".pas")) {

            String fileContent = readFileContent(selectedFile);
            if (fileContent != null) {

                textArea_Code.setText(fileContent);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo .pas");
        }
    }

    private File getSelectedFileFromTree() {
        TreePath selectedPath = files_tree.getSelectionPath();
        if (selectedPath != null) {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();

            String nodeName = (String) selectedNode.getUserObject();

            File rootFile = new File(System.getProperty("user.dir") + "/Proyecto_Compiladores_1/src/Archivos_Prueba");
            return findFileByName(rootFile, nodeName);
        }
        return null;
    }

    private File findFileByName(File directory, String fileName) {
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                if (file.getName().equals(fileName)) {
                    return file;
                }
                if (file.isDirectory()) {
                    File found = findFileByName(file, fileName);
                    if (found != null) {
                        return found;
                    }
                }
            }
        }
        return null;
    }

    private String readFileContent(File file) {
        try {

            StringBuilder content = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
            return null;
        }
    }





    private DefaultMutableTreeNode createTreeNode(File file) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    node.add(createTreeNode(child));
                }
            }
        }
        return node;
    }
}