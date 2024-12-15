/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI2;

import CreatedVisitor.MiniPascalVisitor;
import ErrorClass.*;
import IR.TACBaseInstruction;
import IR.TACInstructionsIR;
import IR.VisitorTAC;
import Optimizador.TACOptimizer;
import Parser.MiniPascalLexer;
import Parser.MiniPascalParser;
import SymbolTable.ScopeManager;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.xml.transform.ErrorListener;
import java.io.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alberth
 */
public class Compilador extends javax.swing.JFrame {

    /**
     * Creates new form Compilador
     */
    public Compilador() {
        initComponents();
        addCodeAreaListeners();
        setLocationRelativeTo(null);
        loadFiletoJtree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane_Files = new javax.swing.JScrollPane();
        jTree_Files = new javax.swing.JTree();
        jButton_Load = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jScrollPane_textline = new javax.swing.JScrollPane();
        jTextArea_textline = new javax.swing.JTextArea();
        jScrollPane_textCode = new javax.swing.JScrollPane();
        jTextArea_textCode = new javax.swing.JTextArea();
        JButton_Compilar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jScrollPane_Files.setViewportView(jTree_Files);

        jButton_Load.setText("Cargar");
        jButton_Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoadActionPerformed(evt);
            }
        });
        jButton_Load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LoadMouseClicked(evt);
            }
        });

        jButton_Save.setText("Guardar");
        jButton_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SaveMouseClicked(evt);
            }
        });
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Edit.setText("Editar");
        jButton_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_EditMouseClicked(evt);
            }
        });

        jTextArea_textline.setEditable(false);
        jTextArea_textline.setColumns(20);
        jTextArea_textline.setRows(5);
        jScrollPane_textline.setViewportView(jTextArea_textline);

        jTextArea_textCode.setEditable(false);
        jTextArea_textCode.setColumns(20);
        jTextArea_textCode.setRows(5);
        jScrollPane_textCode.setViewportView(jTextArea_textCode);

        JButton_Compilar.setText("Compilar");
        JButton_Compilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_CompilarMouseClicked(evt);
            }
        });
        JButton_Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_CompilarActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane_Files, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton_Load)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                            .addComponent(jButton_Edit)))
                    .addComponent(JButton_Compilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_textline, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_textline)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane_Files, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JButton_Compilar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Load)
                                    .addComponent(jButton_Edit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Save))
                            .addComponent(jScrollPane_textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_LoadActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void JButton_CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_CompilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_CompilarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButton_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_EditMouseClicked
       jTextArea_textCode.setEditable(!jTextArea_textCode.isEditable());
    }//GEN-LAST:event_jButton_EditMouseClicked

    private void JButton_CompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_CompilarMouseClicked
        compileFile(getSelectedFileFromTree());
        detallesVentana.setVisible(true);
    }//GEN-LAST:event_JButton_CompilarMouseClicked
    private void jButton_LoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_CargarMouseClicked
        openSelectedFile();
    }//GEN-LAST:event_JButton_CargarMouseClicked
    private void jButton_SaveMouseClicked(java.awt.event.MouseEvent evt) {
        saveFile();
    }
    private void addCodeAreaListeners() {
        // Listener para capturar cambios en el textArea
        jTextArea_textCode.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLineNumbers();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLineNumbers();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLineNumbers();
            }
        });
            
  
        jScrollPane_textline.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane_textline.setVerticalScrollBar(jScrollPane_textCode.getVerticalScrollBar());
        
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
            ErrorHandler errorHandler = new ErrorHandler();
            CharStream input = CharStreams.fromFileName(selectedFile.getAbsolutePath());
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
            //limpiar errores
            detallesVentana.jTextArea_Errors.setText("");
            if (semanticErrorManager.getErrorsCount() > 0) {
                detallesVentana.jTextArea_Errors.setText(semanticErrorManager.toString());
            }
            System.out.println("ERRORES LEXICOS Y SINTACTICOS");
            System.out.println(errorHandler.imprimirErrores());
            if (!errorHandler.getErrores().isEmpty()) {
                detallesVentana.jTextArea_Errors.setText(errorHandler.imprimirErrores());
            }
            //CARGAR TABLA DE SIMBOLOS
            String[] columnNames = {"Identificador", "Tipo", "Scope"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            populateSymbolTable(scopeManager.getSymbolTable(), model);
            detallesVentana.jTable_SymbolTable.setModel(model);

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

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
     private void updateLineNumbers() {
       
        StringBuilder lineNumbers = new StringBuilder();
        int totalLines = jTextArea_textCode.getLineCount();

        for (int i = 1; i <= totalLines; i++) {
            lineNumbers.append(i).append("\n");
        }

       
        jTextArea_textline.setText(lineNumbers.toString());
    }

    private void openSelectedFile() {

        File selectedFile = getSelectedFileFromTree();

        if (selectedFile != null && selectedFile.getName().endsWith(".pas")) {

            String fileContent = readFileContent(selectedFile);
            if (fileContent != null) {
                jTextArea_textCode.setText(fileContent);

            }
        } else {

            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo .pas");
        }
    }


    private void populateSymbolTable(SymbolTable symbolTable, DefaultTableModel model) {
        List<Map<String, Symbol>> scopes = symbolTable.getScopes();
        for (int i = 0; i < scopes.size(); i++) {
            Map<String, Symbol> scope = scopes.get(i);
            String scopeName = "Scope " + i;
            for (Map.Entry<String, Symbol> entry : scope.entrySet()) {
                String identifier = entry.getKey();
                Symbol symbol = entry.getValue();
                String type = symbol.getType().getBaseType().toString();
                model.addRow(new Object[]{identifier, type, scopeName});
            }
        }
    }

    private File getSelectedFileFromTree() {
        TreePath selectedPath = jTree_Files.getSelectionPath();
        if (selectedPath != null) {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();

            String nodeName = (String) selectedNode.getUserObject();

            File rootFile = new File(System.getProperty("user.dir") + "/Proyecto_Compiladores_1/src/Archivos_Prueba");
            return findFileByName(rootFile, nodeName);
        }
        return null;
    }

    private void loadFiletoJtree(){
        String roothPath = System.getProperty("user.dir") + "/Proyecto_Compiladores_1/src/Archivos_Prueba"; ;
        File rootFile = new File(roothPath);

        if (!rootFile.exists() || !rootFile.isDirectory()) {
            System.err.println("La carpeta especificada no existe o no es un directorio válido: " + rootFile);
            return;
        }

        rootNode = createTreeNode(rootFile);
        treeModel = new DefaultTreeModel(rootNode);
        jTree_Files.setModel(treeModel);
        jTree_Files.repaint();
    }

    private DefaultMutableTreeNode createTreeNode(File file) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(file.getName());

        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {

                    node.add(createTreeNode(child));
                }
            }
        }
        return node;
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

    private void saveFile() {
        File selectedFile = getSelectedFileFromTree();
        if (selectedFile != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                writer.write(jTextArea_textCode.getText());
                JOptionPane.showMessageDialog(null, "Archivo guardado con éxito.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
            }
        }
    }
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    DefaultMutableTreeNode rootNode;
    DefaultTreeModel treeModel;
    private javax.swing.JButton JButton_Compilar;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Load;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JScrollPane jScrollPane_Files;
    private javax.swing.JScrollPane jScrollPane_textCode;
    private javax.swing.JScrollPane jScrollPane_textline;
    private javax.swing.JTextArea jTextArea_textCode;
    private javax.swing.JTextArea jTextArea_textline;
    private javax.swing.JTree jTree_Files;
    private Detalles detallesVentana = new Detalles();
    // End of variables declaration//GEN-END:variables
}
