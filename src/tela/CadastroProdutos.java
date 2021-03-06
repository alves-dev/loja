/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;
import classes.produtos;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.IncluirEditarDAO;
import persistencia.conexao;

/**
 *
 * @author Igor
 */
public class CadastroProdutos extends javax.swing.JFrame {
    
    private int acao;
    private int status;
    
    produtos produto = new produtos();
    IncluirEditarDAO propro;
    

    /**
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cadastroNome = new javax.swing.JTextField();
        cadastroQuantidade = new javax.swing.JTextField();
        cadastroCod = new javax.swing.JTextField();
        cadastroCodFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cadastroDescricao = new javax.swing.JTextArea();
        cadastroValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        opcaoAtivo = new javax.swing.JRadioButton();
        opcaoInativo = new javax.swing.JRadioButton();
        botaoNovo = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        cadastroNome.setEnabled(false);

        cadastroQuantidade.setEnabled(false);
        cadastroQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroQuantidadeActionPerformed(evt);
            }
        });

        cadastroCodFornecedor.setEnabled(false);
        cadastroCodFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCodFornecedorActionPerformed(evt);
            }
        });

        cadastroDescricao.setColumns(20);
        cadastroDescricao.setRows(5);
        cadastroDescricao.setEnabled(false);
        jScrollPane1.setViewportView(cadastroDescricao);

        cadastroValor.setEnabled(false);
        cadastroValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor:");

        jLabel2.setText("Cod.Fornecedor:");

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Cod:");

        jLabel5.setText("Nome:");

        jLabel6.setText("Descrição:");

        jLabel7.setText("Status:");

        buttonGroup1.add(opcaoAtivo);
        opcaoAtivo.setText("Ativo");
        opcaoAtivo.setEnabled(false);

        buttonGroup1.add(opcaoInativo);
        opcaoInativo.setText("Inativo");
        opcaoInativo.setEnabled(false);

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(52, 52, 52)
                                .addComponent(opcaoAtivo)
                                .addGap(87, 87, 87)
                                .addComponent(opcaoInativo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoNovo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cadastroCod, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cadastroQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(cadastroValor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cadastroCodFornecedor, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroCodFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(opcaoAtivo)
                    .addComponent(opcaoInativo))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoSair))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroCodFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCodFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroCodFornecedorActionPerformed

    private void cadastroValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroValorActionPerformed

    private void cadastroQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroQuantidadeActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        int cod;
        
        preencher_produtos();
                
        try {
            propro = new IncluirEditarDAO();
            if (acao == 1) {
                cod = propro.IncluirProdutos(produto);
                cadastroCod.setText(String.valueOf(cod));
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                salvarProduto();
            }
        } catch (SQLException | HeadlessException error) {
            JOptionPane.showMessageDialog(this, "Operação não realizada" + error.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        novoProduto();
        acao = 1;
        

        // TODO add your handling code here:
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
         int pesquisaCod;
        pesquisaCod = Integer.parseInt(cadastroCod.getText().trim());
        try {
            consultaProdutos(pesquisaCod);
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cadastroCod;
    private javax.swing.JTextField cadastroCodFornecedor;
    private javax.swing.JTextArea cadastroDescricao;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JTextField cadastroQuantidade;
    private javax.swing.JTextField cadastroValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcaoAtivo;
    private javax.swing.JRadioButton opcaoInativo;
    // End of variables declaration//GEN-END:variables

 public void novoProduto() {
        cadastroNome.setEnabled(true);
        cadastroDescricao.setEnabled(true);
        cadastroQuantidade.setEnabled(true);
        cadastroValor.setEnabled(true);
        cadastroCodFornecedor.setEnabled(true);
        
        opcaoAtivo.setSelected(true);
        botaoSalvar.setEnabled(true);
        botaoNovo.setEnabled(false);
    }
    
    public void salvarProduto() {
        
        cadastroNome.setEnabled(false);
        cadastroCodFornecedor.setEnabled(false);
        cadastroDescricao.setEnabled(false);
        cadastroValor.setEnabled(false);
        cadastroQuantidade.setEnabled(false);
       
        botaoSalvar.setEnabled(false);
        botaoNovo.setEnabled(true);
        
        opcaoAtivo.setSelected(false);
              
        limparTela();
        
    }
    
    public void limparTela(){
        cadastroNome.setText("");
        cadastroDescricao.setText("");
        cadastroCodFornecedor.setText("");
        cadastroQuantidade.setText("");
        cadastroValor.setText("");
    }
    
    public void preencher_produtos() {
        
        if (opcaoAtivo.isSelected()) {
            status = 1;
        }
        if (opcaoInativo.isSelected()) {
            status = 0;
        }
       
        //a baixo conversão das strings em inteiros
       int codFornecedor = Integer.parseInt(cadastroCodFornecedor.getText().trim());
       int quantidade = Integer.parseInt(cadastroQuantidade.getText().trim());
       float valor = Float.parseFloat(cadastroValor.getText());//.trim()); 
                
        produto.setPro_nome(cadastroNome.getText().trim());
        produto.setPro_dercricao(cadastroDescricao.getText().trim());
        produto.setPro_valor(valor);
        produto.setPro_quantidade(quantidade);
        produto.setPro_fornecedor(codFornecedor);
        produto.setPro_status(status);
        
    }

public void consultaProdutos(int cod) throws SQLException {

        limparTela();
        if (cod < 1) { // INPLEMENTAR: se letra bloquer se não vai dar erro 
            JOptionPane.showMessageDialog(null, cod + " não é um código valido!");
        }

        conexao conexao = new conexao();
        conexao.getConexao();
        String selectSQL = "SELECT * FROM PRODUTOS A WHERE A.PRO_ID = " + cod;

        Statement pstmtCon;
        pstmtCon = conexao.getConexao().createStatement();

        ResultSet rs = pstmtCon.executeQuery(selectSQL);

        while (rs.next()) {

            //if(rs.getInt("pes_id") == null) // INPLEMENTAR: pular se numero pesquisado não existir
            System.out.println("numero: " + rs.getInt("pro_id"));

            cadastroNome.setText(rs.getString("pro_nome"));
            cadastroDescricao.setText(rs.getString("pro_descricao"));
            cadastroValor.setText(rs.getString("pro_valor"));
            cadastroQuantidade.setText(rs.getString("pro_quantidade"));
            cadastroCodFornecedor.setText(rs.getString("pro_fornecedor"));
            

            int status = rs.getInt("pro_status");
            if (status == 1) {
                opcaoAtivo.setSelected(true);
            }
            if (status == 0) {
                opcaoInativo.setSelected(true);
            } 
            if (status < 0 || status > 1){
                JOptionPane.showMessageDialog(null, "Tem algo de errado com o status desse produto! \n"
                        + "Favor alterar!");
            }
        }

        rs.close();
        pstmtCon.close();

    }



}
