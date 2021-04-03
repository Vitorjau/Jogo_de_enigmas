/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.Volta;
import Model.Pessoa;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class Tela7 extends javax.swing.JFrame implements Volta {

    /**
     * Creates new form tela02
     */
    public Tela7() {
        initComponents();
    }
    int erros;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resp01 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Prosseguir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vida3 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 30, 30, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/enigmaimage.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 100, 300, 270);

        resp01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resp01ActionPerformed(evt);
            }
        });
        resp01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resp01KeyReleased(evt);
            }
        });
        getContentPane().add(resp01);
        resp01.setBounds(210, 380, 200, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Resposta:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 390, 60, 20);

        Prosseguir.setText("Prosseguir");
        Prosseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsseguirActionPerformed(evt);
            }
        });
        getContentPane().add(Prosseguir);
        Prosseguir.setBounds(210, 420, 100, 29);

        jButton2.setText("Desistir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 420, 90, 29);

        vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N
        getContentPane().add(vida3);
        vida3.setBounds(840, 0, 100, 100);

        vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N
        getContentPane().add(vida1);
        vida1.setBounds(620, 0, 100, 100);

        vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N
        getContentPane().add(vida2);
        vida2.setBounds(730, 0, 100, 100);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("vidas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 10, 60, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resp01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resp01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resp01ActionPerformed

    private void resp01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resp01KeyReleased
        if (resp01.getText().equals("sempre olhe alem")) {
            resp01.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "resposta certa");
        } else {
            resp01.requestFocus();
        }
    }//GEN-LAST:event_resp01KeyReleased

    private void ProsseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsseguirActionPerformed
        if (resp01.getText().equals("sempre olhe alem")) {
            if (erros == 1) {
                Pessoa.setPontuacao(Pessoa.getPontuacao() + 8);
            } else if (erros == 2) {
                Pessoa.setPontuacao(Pessoa.getPontuacao() + 6);
            } else {
                Pessoa.setPontuacao(Pessoa.getPontuacao() + 10);
            }
            this.dispose();
            Tela8 t8 = new Tela8();
            t8.setVisible(true);
        } else {
            erros++;
            this.volta();
        }
    }//GEN-LAST:event_ProsseguirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int confirm = JOptionPane.showConfirmDialog((Component) evt.getSource(),
                "Deseja Realmente Desistir?",
                "Sim - Nao",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Sua Pontuaçao foi de:" + Pessoa.getPontuacao() + "\n" + "Obrigado(a) por participar do nosso jogo!!");
            this.dispose();
            Menu menu = new Menu();
            menu.setVisible(true);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Prosseguir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField resp01;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void volta() {
        if (erros == 1) {
            vida3.setVisible(false);
        } else if (erros == 2) {
            vida3.setVisible(false);
            vida2.setVisible(false);
        } else if (erros == 3) {
            vida3.setVisible(false);
            vida2.setVisible(false);
            vida1.setVisible(false);

            JOptionPane.showMessageDialog(null, "Game Over!");
            this.setVisible(false);
            Fase1 fase1 = new Fase1();

        }
    }
}