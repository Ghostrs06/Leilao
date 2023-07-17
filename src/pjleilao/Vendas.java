package pjleilao;

import Produtos.Produtos;
import Produtos.ProdutosDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Vendas extends javax.swing.JFrame {

    public Vendas() {
        initComponents();
        this.preencherTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painel2 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        painel2.setBackground(new java.awt.Color(35, 35, 35));
        painel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(35, 35, 35), new java.awt.Color(35, 35, 35), java.awt.Color.white, new java.awt.Color(35, 35, 35)));

        btnVoltar.setBackground(new java.awt.Color(30, 30, 30));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(250, 0, 0));
        btnVoltar.setText("<");
        btnVoltar.setToolTipText("Clique para voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(30, 30, 30));
        btnSair.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(250, 0, 0));
        btnSair.setText("X");
        btnSair.setToolTipText("Clique para sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 191, 255));
        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 191, 255));
        lblTitulo.setText("Vendas");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(154, 154, 154)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnVoltar))
                .addGap(4, 4, 4))
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        tblVendas.setBackground(new java.awt.Color(35, 35, 35));
        tblVendas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        tblVendas.setForeground(new java.awt.Color(248, 248, 255));
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Valor", "Status"
            }
        ));
        tblVendas.setSelectionBackground(new java.awt.Color(248, 248, 255));
        tblVendas.setSelectionForeground(new java.awt.Color(248, 248, 255));
        jScrollPane1.setViewportView(tblVendas);

        ScrollPane.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        String[] options = {"Sim", "Não"};

        int sair = JOptionPane.showOptionDialog(
            rootPane,
            "Tem certeza que deseja sair?",
            "Sair",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (sair == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painel2;
    private javax.swing.JTable tblVendas;
    // End of variables declaration//GEN-END:variables

    private void preencherTela() {
        ProdutosDao dao = new ProdutosDao();

        List<Produtos> listaProduto = dao.listagemProdutoVendidos();

        DefaultTableModel tabelaFilmes = (DefaultTableModel) tblVendas.getModel();

        tblVendas.setRowSorter(new TableRowSorter(tabelaFilmes));

        tabelaFilmes.setNumRows(0);

        for (Produtos p : listaProduto) {
            Object[] obj = new Object[]{
                p.getId(),
                p.getNome(),
                String.valueOf(p.getValor()),
                p.getStatus(),};

            tabelaFilmes.addRow(obj);
        }
    }
}
