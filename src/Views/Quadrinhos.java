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
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class Quadrinhos extends javax.swing.JFrame implements Volta{

    int erros;

    public Quadrinhos() {
        super("Fase 2");
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        erros = 0;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblvida2 = new javax.swing.JLabel();
        lblvida3 = new javax.swing.JLabel();
        lblvida1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 246, 246));
        jLabel1.setText("Joginho");

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton1.setText("Prosseguir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 14, 14));
        jLabel2.setText("Deixe todos os quadrados verdes!");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(249, 6, 6));
        jLabel3.setText("A cada jogada, sera revalado um quadrado. Boa sorte!!");

        lblvida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N
        lblvida2.setText("jLabel4");

        lblvida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N
        lblvida1.setText("jLabel4");

        vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/coracao.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 245, 245));
        jLabel4.setText("Vidas");

        jToggleButton1.setText("Desistir");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(lblvida3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(490, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblvida1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblvida2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(vida3)))
                .addGap(93, 93, 93)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vida3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblvida1)
                                .addComponent(lblvida2)))))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblvida3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );

        jLabel2.setForeground(Color.WHITE);
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        jButton11.setText("A");
        if (jButton11.getText().equals("A") && jButton12.getText().equals("C")) {
            jButton11.setText("");
            jButton12.setText("");
            erros += 1;
        }
        if (jButton11.getText().equals("A") && jButton13.getText().equals("E")) {
            jButton11.setText("");
            jButton13.setText("");
            erros += 1;
        }
        if (jButton11.getText().equals("A") && jButton17.getText().equals("F")) {
            jButton11.setText("");
            jButton17.setText("");
            erros += 1;
        }
        if (jButton11.getText().equals("A") && jButton14.getText().equals("E")) {
            jButton11.setText("");
            jButton14.setText("");
            erros += 1;
        }

        if (jButton11.getText().equals("A") && jButton15.getText().equals("F")) {
            jButton11.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton11.getText().equals("A") && jButton18.getText().equals("C")) {
            jButton11.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton11.getText().equals("A") && jButton16.getText().equals("A")) {
            jButton11.setText("");
            jButton16.setText("");
            jButton11.setBackground(Color.green);
            jButton16.setBackground(Color.green);

        }
        this.volta();
       


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setText("E");
        if (jButton11.getText().equals("A") && jButton13.getText().equals("E")) {
            jButton11.setText("");
            jButton13.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton13.getText().equals("E")) {
            jButton12.setText("");
            jButton13.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton17.getText().equals("F")) {
            jButton13.setText("");
            jButton17.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton15.getText().equals("F")) {
            jButton13.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton16.getText().equals("A")) {
            jButton13.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton18.getText().equals("C")) {
            jButton13.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton14.getText().equals("E")) {
            jButton13.setText("");
            jButton14.setText("");
            jButton13.setBackground(Color.green);
            jButton14.setBackground(Color.green);

        }
       this.volta();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        jButton16.setText("A");
        if (jButton12.getText().equals("C") && jButton16.getText().equals("A")) {
            jButton12.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton16.getText().equals("A")) {
            jButton13.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton17.getText().equals("F") && jButton16.getText().equals("A")) {
            jButton17.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton14.getText().equals("E") && jButton16.getText().equals("A")) {
            jButton14.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton15.getText().equals("F") && jButton16.getText().equals("A")) {
            jButton15.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton16.getText().equals("A") && jButton18.getText().equals("C")) {
            jButton16.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton11.getText().equals("A") && jButton16.getText().equals("A")) {
            jButton11.setText("");
            jButton16.setText("");
            jButton11.setBackground(Color.green);
            jButton16.setBackground(Color.green);

        }
       this.volta();

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setText("C");
        if (jButton12.getText().equals("C") && jButton11.getText().equals("A")) {
            jButton12.setText("");
            jButton11.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton13.getText().equals("E")) {
            jButton12.setText("");
            jButton13.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton17.getText().equals("F")) {
            jButton12.setText("");
            jButton17.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton14.getText().equals("E")) {
            jButton12.setText("");
            jButton14.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton15.getText().equals("F")) {
            jButton12.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton16.getText().equals("A")) {
            jButton12.setText("");
            jButton16.setText("");
            erros += 1;
        }

        if (jButton12.getText().equals("C") && jButton18.getText().equals("C")) {
            jButton12.setText("");
            jButton18.setText("");
            jButton12.setBackground(Color.green);
            jButton18.setBackground(Color.green);

        }
        this.volta();


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        jButton18.setText("C");
        if (jButton11.getText().equals("A") && jButton18.getText().equals("C")) {
            jButton11.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton18.getText().equals("C")) {
            jButton13.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton17.getText().equals("F") && jButton18.getText().equals("C")) {
            jButton17.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton14.getText().equals("E") && jButton18.getText().equals("C")) {
            jButton14.setText("");
            jButton18.setText("");
        }
        if (jButton15.getText().equals("F") && jButton18.getText().equals("C")) {
            jButton15.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton16.getText().equals("A") && jButton18.getText().equals("C")) {
            jButton16.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton18.getText().equals("C")) {
            jButton12.setText("");
            jButton18.setText("");
            jButton12.setBackground(Color.green);
            jButton18.setBackground(Color.green);

        }
       this.volta();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setText("F");

        if (jButton11.getText().equals("A") && jButton15.getText().equals("F")) {
            jButton11.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton15.getText().equals("F")) {
            jButton12.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton15.getText().equals("F")) {
            jButton13.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton14.getText().equals("E") && jButton15.getText().equals("F")) {
            jButton14.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton15.getText().equals("F") && jButton16.getText().equals("A")) {
            jButton15.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton15.getText().equals("F") && jButton18.getText().equals("C")) {
            jButton15.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton15.getText().equals("F") && jButton17.getText().equals("F")) {
            jButton15.setText("");
            jButton17.setText("");
            jButton15.setBackground(Color.green);
            jButton17.setBackground(Color.green);
        }
        this.volta();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setText("E");
        if (jButton11.getText().equals("A") && jButton14.getText().equals("E")) {
            jButton11.setText("");
            jButton14.setText("");
            erros += 1;
        }
        if (jButton12.getText().equals("C") && jButton14.getText().equals("E")) {
            jButton12.setText("");
            jButton14.setText("");
            erros += 1;
        }
        if (jButton17.getText().equals("F") && jButton14.getText().equals("E")) {
            jButton17.setText("");
            jButton14.setText("");
            erros += 1;
        }
        if (jButton14.getText().equals("E") && jButton15.getText().equals("F")) {
            jButton14.setText("");
            jButton15.setText("");
            erros += 1;
        }
        if (jButton14.getText().equals("E") && jButton16.getText().equals("A")) {
            jButton14.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton14.getText().equals("E") && jButton18.getText().equals("C")) {
            jButton14.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton14.getText().equals("E")) {
            jButton13.setText("");
            jButton14.setText("");
            jButton13.setBackground(Color.green);
            jButton14.setBackground(Color.green);

        }
       this.volta();


    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton17.setText("F");
        if (jButton11.getText().equals("A") && jButton17.getText().equals("F")) {
            jButton11.setText("");
            jButton17.setText("");
            erros += 1;

        }
        if (jButton12.getText().equals("C") && jButton17.getText().equals("F")) {
            jButton12.setText("");
            jButton17.setText("");
            erros += 1;
        }
        if (jButton13.getText().equals("E") && jButton17.getText().equals("F")) {
            jButton13.setText("");
            jButton17.setText("");
            erros += 1;
        }
        if (jButton17.getText().equals("F") && jButton14.getText().equals("E")) {
            jButton17.setText("");
            jButton14.setText("");
            erros += 1;
        }
        if (jButton17.getText().equals("F") && jButton16.getText().equals("A")) {
            jButton17.setText("");
            jButton16.setText("");
            erros += 1;
        }
        if (jButton17.getText().equals("F") && jButton18.getText().equals("C")) {
            jButton17.setText("");
            jButton18.setText("");
            erros += 1;
        }
        if (jButton15.getText().equals("F") && jButton17.getText().equals("F")) {
            jButton15.setText("");
            jButton17.setText("");
            jButton15.setBackground(Color.green);
            jButton17.setBackground(Color.green);

        }
        this.volta();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jButton11.getBackground() == Color.GREEN && jButton12.getBackground() == Color.GREEN && jButton13.getBackground() == Color.GREEN && jButton14.getBackground() == Color.GREEN && jButton15.getBackground() == Color.GREEN && jButton16.getBackground() == Color.GREEN && jButton17.getBackground() == Color.GREEN && jButton18.getBackground() == Color.GREEN) {
            if(erros == 1){
                Pessoa.setPontuacao(Pessoa.getPontuacao() + 8);
            }else if(erros == 2){
                Pessoa.setPontuacao(Pessoa.getPontuacao() + 6);
            }else{
                Pessoa.setPontuacao(Pessoa.getPontuacao() + 10);
            }
            
            
            JOptionPane.showMessageDialog(null, "Parabens vc conseguiu passar para fase 3!!");
            this.dispose();
            Fase3 fase3 = new Fase3();
            fase3.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(null, "Primeiro deixe todos os quadros verdes!");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
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
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblvida1;
    private javax.swing.JLabel lblvida2;
    private javax.swing.JLabel lblvida3;
    private javax.swing.JLabel vida3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void volta() {
        if (erros == 1) {
            lblvida1.setVisible(false);
        } else if (erros == 2) {
            lblvida1.setVisible(false);
            lblvida2.setVisible(false);
        } else if (erros == 3) {
            lblvida1.setVisible(false);
            lblvida2.setVisible(false);
            vida3.setVisible(false);

            JOptionPane.showMessageDialog(null, "Game Over!");
            Fase1 fase1 = new Fase1();

        }
    }
}