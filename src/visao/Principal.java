/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import controle.ConectaBanco;

/**
 *
 * @author frede
 */
public class Principal extends javax.swing.JFrame {

    ConectaBanco conexao = new ConectaBanco();
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        conexao.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        item_estados = new javax.swing.JMenuItem();
        item_cidades = new javax.swing.JMenuItem();
        item_bairro = new javax.swing.JMenuItem();
        item_telefones = new javax.swing.JMenuItem();
        item_clientes = new javax.swing.JMenuItem();
        item_fornecedores = new javax.swing.JMenuItem();
        item_produtos = new javax.swing.JMenuItem();
        mnuCompra = new javax.swing.JMenu();
        mnuVenda = new javax.swing.JMenu();
        mnuRelatorios = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        jLabel1.setText("Assistir aula 34");

        mnuCadastros.setText("Cadastros");

        item_estados.setText("Estados");
        item_estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_estadosActionPerformed(evt);
            }
        });
        mnuCadastros.add(item_estados);

        item_cidades.setText("Cidades");
        item_cidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cidadesActionPerformed(evt);
            }
        });
        mnuCadastros.add(item_cidades);

        item_bairro.setText("Bairro");
        mnuCadastros.add(item_bairro);

        item_telefones.setText("Telefones");
        mnuCadastros.add(item_telefones);

        item_clientes.setText("Clientes");
        mnuCadastros.add(item_clientes);

        item_fornecedores.setText("Fornecedores");
        mnuCadastros.add(item_fornecedores);

        item_produtos.setText("Produtos");
        mnuCadastros.add(item_produtos);

        jMenuBar1.add(mnuCadastros);

        mnuCompra.setText("Compra");
        jMenuBar1.add(mnuCompra);

        mnuVenda.setText("Venda");
        jMenuBar1.add(mnuVenda);

        mnuRelatorios.setText("Relatórios");
        jMenuBar1.add(mnuRelatorios);

        mnuSair.setText("Sair");
        mnuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(519, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSairMouseClicked
        conexao.desconectar();
        //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        System.exit(0);
    }//GEN-LAST:event_mnuSairMouseClicked

    private void item_estadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_estadosActionPerformed
        TelaEstados estados = new TelaEstados();
        estados.setVisible(true);
    }//GEN-LAST:event_item_estadosActionPerformed

    private void item_cidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cidadesActionPerformed
        TelaCidades cidades = new TelaCidades();
        cidades.setVisible(true);    }//GEN-LAST:event_item_cidadesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem item_bairro;
    private javax.swing.JMenuItem item_cidades;
    private javax.swing.JMenuItem item_clientes;
    private javax.swing.JMenuItem item_estados;
    private javax.swing.JMenuItem item_fornecedores;
    private javax.swing.JMenuItem item_produtos;
    private javax.swing.JMenuItem item_telefones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenu mnuCompra;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JMenu mnuVenda;
    // End of variables declaration//GEN-END:variables
}