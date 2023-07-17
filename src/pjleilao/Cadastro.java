package pjleilao;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        painel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel1.setBackground(new java.awt.Color(30, 30, 30));

        painel2.setBackground(new java.awt.Color(35, 35, 35));
        painel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(35, 35, 35), new java.awt.Color(35, 35, 35), java.awt.Color.lightGray, new java.awt.Color(35, 35, 35)));
        painel2.setForeground(new java.awt.Color(30, 30, 30));

        btnSair.setBackground(new java.awt.Color(30, 30, 30));
        btnSair.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(250, 0, 0));
        btnSair.setText("X");
        btnSair.setToolTipText("Clique para sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 191, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addComponent(btnSair)
                .addGap(42, 42, 42)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNome.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(248, 248, 255));
        lblNome.setText("Nome do produto");

        txtNome.setBackground(new java.awt.Color(35, 35, 35));
        txtNome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(248, 248, 255));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNome.setToolTipText("Informe o nome do produto");
        txtNome.setCaretColor(new java.awt.Color(248, 248, 255));
        txtNome.setDisabledTextColor(new java.awt.Color(248, 248, 255));
        txtNome.setSelectedTextColor(new java.awt.Color(250, 0, 0));
        txtNome.setSelectionColor(new java.awt.Color(100, 100, 100));

        lblValor.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        lblValor.setForeground(new java.awt.Color(248, 248, 255));
        lblValor.setText("Valor do Produto");

        txtValor.setBackground(new java.awt.Color(35, 35, 35));
        txtValor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtValor.setForeground(new java.awt.Color(248, 248, 255));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setToolTipText("Informe o valor do produto");
        txtValor.setCaretColor(new java.awt.Color(248, 248, 255));
        txtValor.setDisabledTextColor(new java.awt.Color(248, 248, 255));
        txtValor.setSelectedTextColor(new java.awt.Color(250, 0, 0));
        txtValor.setSelectionColor(new java.awt.Color(100, 100, 100));

        btnSalvar.setBackground(new java.awt.Color(35, 35, 35));
        btnSalvar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 191, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar produto cadastrado");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLista.setBackground(new java.awt.Color(35, 35, 35));
        btnLista.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnLista.setForeground(new java.awt.Color(0, 191, 255));
        btnLista.setText("Lista de produtos");
        btnLista.setToolTipText("Lista de produtos");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValor)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLista))
                .addGap(21, 21, 21))
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

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
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
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.cadastrar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        Listagem lista = new Listagem();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
