/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sgce;


import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author flamingo_lindo
 */
public class CriarContaFrame extends javax.swing.JFrame {

    public CriarContaFrame() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfSobrenome = new javax.swing.JTextField();
        tfSenha = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfDataNasc = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfCnpj = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de empregado");

        jLabel1.setText("Nome:");

        tfNome.setBackground(new java.awt.Color(204, 204, 204));
        tfNome.setForeground(new java.awt.Color(0, 0, 0));
        tfNome.setCaretColor(new java.awt.Color(0, 0, 0));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("Senha:");

        jLabel4.setText("Email:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Data de nascimento:");

        jLabel7.setText("CPF:");

        jLabel8.setText("CNPJ:");

        tfSobrenome.setBackground(new java.awt.Color(204, 204, 204));
        tfSobrenome.setForeground(new java.awt.Color(0, 0, 0));
        tfSobrenome.setCaretColor(new java.awt.Color(0, 0, 0));

        tfSenha.setBackground(new java.awt.Color(204, 204, 204));
        tfSenha.setForeground(new java.awt.Color(0, 0, 0));
        tfSenha.setCaretColor(new java.awt.Color(0, 0, 0));

        tfEmail.setBackground(new java.awt.Color(204, 204, 204));
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfEmail.setCaretColor(new java.awt.Color(0, 0, 0));

        tfTelefone.setBackground(new java.awt.Color(204, 204, 204));
        tfTelefone.setForeground(new java.awt.Color(0, 0, 0));
        tfTelefone.setCaretColor(new java.awt.Color(0, 0, 0));

        tfDataNasc.setBackground(new java.awt.Color(204, 204, 204));
        tfDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        tfDataNasc.setCaretColor(new java.awt.Color(0, 0, 0));

        tfCpf.setBackground(new java.awt.Color(204, 204, 204));
        tfCpf.setForeground(new java.awt.Color(0, 0, 0));
        tfCpf.setCaretColor(new java.awt.Color(0, 0, 0));

        tfCnpj.setBackground(new java.awt.Color(204, 204, 204));
        tfCnpj.setForeground(new java.awt.Color(0, 0, 0));
        tfCnpj.setCaretColor(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Registrar-se");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(tfCnpj, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDataNasc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(tfNome.getText().isEmpty() || tfSobrenome.getText().isEmpty() || 
           tfSenha.getText().isEmpty() || tfEmail.getText().isEmpty() || 
           tfTelefone.getText().isEmpty() || tfCpf.getText().isEmpty()||
           tfCnpj.getText().isEmpty() || tfDataNasc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,
                "Preencha todos os campos para prosseguir!");
        }
        else
        {
        String nome = tfNome.getText();
        String sobrenome = tfSobrenome.getText();
        String senha = tfSenha.getText();
        String email = tfEmail.getText();
        String telefone = tfTelefone.getText();
        String cpf = tfCpf.getText();
        String cnpj = tfCnpj.getText();
        String dataNasc = tfDataNasc.getText();
        
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setSobrenome(sobrenome);
        p.setSenha(senha);
        p.setEmail(email);
        p.setTelefone(telefone);
        p.setCpf(cpf);
        p.setCnpj(cnpj);
        p.setDataNasc(dataNasc);
        
        new LoginFrame().setVisible(true);
        try
        {
            p.cadastrar();
            System.out.println("Cadastro feito com sucesso!");
        }
        catch(SQLException ex)
        {
            System.out.println("ERRPO: " + ex);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed

    }//GEN-LAST:event_tfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CriarContaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarContaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarContaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarContaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CriarContaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSenha;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
