package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Detalles extends JFrame {
    private JTabbedPane JtabbedPane_Principal;
    private JPanel JPanel_ErrorSemantico;
    private JPanel JPanel_SymbolTable;
    private JPanel JPanel_AST;
    private JPanel JPanel_IR;
    private JPanel JPanel_TACGEN;
    private JPanel JPanel_LLVM;
    private JPanel JPanel_SemanticError;
    private JScrollPane JScrollPane_SemanticError;
    private JTextArea textArea_SemanticError;
    private JPanel JPanel_SymbolTable2;
    private JScrollPane JScrollPane_SymbolTable;
    private JTable table_SemanticSymbols;
    private SymbolTable symbolTable;
    public Detalles(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        createUIComponents();
    }

    private void initComponents() {

        JtabbedPane_Principal = new JTabbedPane();

        JPanel_ErrorSemantico = new JPanel();
        JPanel_SymbolTable = new JPanel();
        JPanel_AST = new JPanel();
        JPanel_IR = new JPanel();
        JPanel_TACGEN = new JPanel();
        JPanel_LLVM = new JPanel();
        JPanel_SemanticError = new JPanel();


        textArea_SemanticError = new JTextArea();
        JScrollPane_SemanticError = new JScrollPane(textArea_SemanticError);

        String[] columnNames = {"Identificador", "Tipo", "Scope"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        populateSymbolTable(symbolTable, model);
        table_SemanticSymbols = new JTable(model);

        JScrollPane_SymbolTable = new JScrollPane(table_SemanticSymbols);

        JPanel_SymbolTable.add(JScrollPane_SymbolTable, BorderLayout.CENTER);

        JtabbedPane_Principal.addTab("Error Semántico", JPanel_ErrorSemantico);
        JtabbedPane_Principal.addTab("Tabla de Símbolos", JPanel_SymbolTable);
        JtabbedPane_Principal.addTab("AST", JPanel_AST);
        JtabbedPane_Principal.addTab("IR", JPanel_IR);
        JtabbedPane_Principal.addTab("TACGEN", JPanel_TACGEN);
        JtabbedPane_Principal.addTab("LLVM", JPanel_LLVM);


        this.getContentPane().add(JtabbedPane_Principal);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
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

    public void showWindow() {
        this.setVisible(true);
    }

    private void createUIComponents() {
        initComponents();
    }

}
