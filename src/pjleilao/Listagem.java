package pjleilao;

import Conect.Conexao;
import Produtos.Produtos;
import Produtos.ProdutosDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Listagem extends javax.swing.JFrame {

    public Listagem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        painel3 = new javax.swing.JPanel();
        btnVoltar1 = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        lblVender = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaProdutos = new javax.swing.JTable();
        btnVendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel1.setBackground(new java.awt.Color(30, 30, 30));

        painel3.setBackground(new java.awt.Color(35, 35, 35));
        painel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(35, 35, 35), new java.awt.Color(35, 35, 35), java.awt.Color.white, new java.awt.Color(35, 35, 35)));

        btnVoltar1.setBackground(new java.awt.Color(30, 30, 30));
        btnVoltar1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnVoltar1.setForeground(new java.awt.Color(250, 0, 0));
        btnVoltar1.setText("<");
        btnVoltar1.setToolTipText("Clique para voltar ");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        btnSair1.setBackground(new java.awt.Color(30, 30, 30));
        btnSair1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSair1.setForeground(new java.awt.Color(250, 0, 0));
        btnSair1.setText("X");
        btnSair1.setToolTipText("Clique para sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 191, 255));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Lista de Produtos");

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addComponent(btnVoltar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair1)
                .addGap(99, 99, 99)
                .addComponent(lblTitulo1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel3Layout.createSequentialGroup()
                .addComponent(lblTitulo1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painel3Layout.createSequentialGroup()
                .addGroup(painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblVender.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblVender.setForeground(new java.awt.Color(248, 248, 255));
        lblVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVender.setText("Vender produto (ID)");

        txtId.setBackground(new java.awt.Color(35, 35, 35));
        txtId.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(248, 248, 255));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setToolTipText("Informe o id do produto ");
        txtId.setCaretColor(new java.awt.Color(248, 248, 255));
        txtId.setDisabledTextColor(new java.awt.Color(248, 248, 255));
        txtId.setSelectedTextColor(new java.awt.Color(250, 0, 0));
        txtId.setSelectionColor(new java.awt.Color(100, 100, 100));

        btnVender.setBackground(new java.awt.Color(35, 35, 35));
        btnVender.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVender.setForeground(new java.awt.Color(0, 191, 255));
        btnVender.setText("Vender");
        btnVender.setToolTipText("Clique para vender o produto");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        tblListaProdutos.setBackground(new java.awt.Color(35, 35, 35));
        tblListaProdutos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblListaProdutos.setForeground(new java.awt.Color(248, 248, 255));
        tblListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Valor", "Status"
            }
        ));
        tblListaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaProdutos);

        scrollPane.setViewportView(jScrollPane1);

        btnVendas.setBackground(new java.awt.Color(35, 35, 35));
        btnVendas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(0, 191, 255));
        btnVendas.setText("Vendas");
        btnVendas.setToolTipText("Clique para vender o produto");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVendas)
                    .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painel1Layout.createSequentialGroup()
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnVender))
                        .addComponent(lblVender)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
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
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        this.atualizar();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void tblListaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaProdutosMouseClicked
        int linha = tblListaProdutos.getSelectedRow();
        int con = Integer.parseInt(tblListaProdutos.getValueAt(linha, 0).toString());
        consulta(con);
    }//GEN-LAST:event_tblListaProdutosMouseClicked

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        
    }//GEN-LAST:event_btnVendasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblVender;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblListaProdutos;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    private void preencherTebela() {
        ProdutosDao dao = new ProdutosDao();

        List<Produtos> listaProduto = dao.listagemProduto();

        DefaultTableModel tabelaFilmes = (DefaultTableModel) tblListaProdutos.getModel();

        tblListaProdutos.setRowSorter(new TableRowSorter(tabelaFilmes));

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

    private void consulta(int id) {
        ProdutosDao dao = new ProdutosDao();
        Conexao c = new Conexao();
        boolean status = c.conectar();
        if (status == true) {
            Produtos p = dao.consultar(id);
            System.out.println(dao.consultar(id));
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Id não localizado");
            } else {
                txtId.setText(String.valueOf(p.getId()));
            }
            c.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        }
    }

    private void atualizar() {
        Produtos p = new Produtos();
        ProdutosDao dao = new ProdutosDao();
        Conexao c = new Conexao();
        boolean status = c.conectar();
        int resposta;

        int idd = Integer.parseInt(txtId.getText());
        p.setId(idd);

        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo id não preenchido", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            resposta = dao.atualizar(p);
            switch (resposta) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
                }
                case 1062 ->
                    JOptionPane.showMessageDialog(null, "Produto já foi vendido");
                default ->
                    JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");
            }
            c.desconectar();
        }
    }
}
