/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.Volta;
import Model.Pessoa;
import static Views.Login.txtNome;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author eduardo
 */
public class Fase1 implements ItemListener, Volta {

    final JLabel panel, panel2, panel3;

    private int cont = 0;
    JComboBox<String> combo;

    JLabel label2;
    final JFrame fase1 = new JFrame("Fase 1");

    ImageIcon[] imagens = {
        new ImageIcon(("milan.png")),
        new ImageIcon(("juventus.jpg")),
        new ImageIcon(("real.jpg")),
        new ImageIcon(("city.jpg")),
        new ImageIcon(("liverpool.png")),
        new ImageIcon(("bayer.png")),
        new ImageIcon(("barcelona.png")),};

    public Fase1() {

        for (int i = 0; i < imagens.length; i++) {
            imagens[i].setImage(imagens[i].getImage().getScaledInstance(300, 300, 300));
        }

        Container c = fase1.getContentPane();
        //combo.setFont(new Font("Serif", Font.PLAIN, 26));
        combo = new JComboBox<String>(); // Itens tipo string
        combo.addItem("Milan");
        combo.addItem("Juventus");
        combo.addItem("Real Madrid");
        combo.addItem("Manchester City");
        combo.addItem("Liverpool");
        combo.addItem("Bayern de Munique");
        combo.addItem("Barcelona");
        combo.addItemListener(this);
        //Adicionando Labels
        label2 = new JLabel(imagens[0]);

        c.add(BorderLayout.NORTH, combo);
        c.add(BorderLayout.CENTER, label2);

        //Panels
        //panel.add(combo);
        //panel.add(label2);
        JPanel msg1 = new JPanel();
        msg1.setLayout(null); // Define o layout do seu painel, para o JLabel atender as coordenadas.
        msg1.setBounds(0, 0, 300, 300); // Define o tamanho do painel.
        fase1.add(msg1); // Adiciona ao container (Que por sinal, é um null container)

        // Inicia a variavel label.
        JLabel label1 = new JLabel("Qual foi o primeiro clube  a conquistar a Champions League?");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        label1.setBounds(570, 570, 900, 35); // Define o tamanho e a coordenada x,y,z..
        fase1.add(label1); // Adiciona ao painel com layout nullo.

        //Label3
        JLabel label3 = new JLabel("Selecione a opçao correta:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        label3.setBounds(600, 600, 400, 35); // Define o tamanho e a coordenada x,y,z..
        fase1.add(label3); // Adiciona ao painel com layout nullo.

        /* JLabel mensagem2 = new JLabel("Selecione a opçao correta:");
         mensagem2.setHorizontalAlignment(SwingConstants.CENTER);
         mensagem2.setSize(1000, 1000);
         mensagem2.setBounds(150, 150, 100, 35);

         panelMensagem.add(mensagem2);
         fase1.add(mensagem2);*/
        fase1.setLayout(new FlowLayout());

        // frames
        //fase1.add(panel);
        fase1.add(label2);
        fase1.add(combo);

        //Botao de desistir
        JButton desistir = new JButton("Desistir");
        fase1.add(desistir);
        // Inicia a variavel verifica.
        JButton verifica = new JButton("Verifica");
        verifica.setBounds(1000, 1000, 150, 35); // Define o tamanho e a coordenada x,y,z..
        fase1.add(verifica); // Adiciona ao painel com layout nullo.

        fase1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Coracao1
        final ImageIcon img = new ImageIcon("coracao.png");
        //container onde serão adicionados todos componentes
        Container container = fase1.getContentPane();
        final JLabel label = new JLabel(img);
        fase1.getContentPane().setBackground(Color.BLACK);
        //adiciona a imagem em um label
        panel = new JLabel(img);
        panel.add(label, BorderLayout.SOUTH);
        //adiciona o panel no container
        container.add(panel, BorderLayout.CENTER);
        fase1.pack();
        img.setImage(img.getImage().getScaledInstance(30, 30, 30));
        fase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a  janela
        fase1.add(panel);

        //Coracao2
        final ImageIcon img2 = new ImageIcon("coracao.png");
        //container onde serão adicionados todos componentes
        Container container2 = fase1.getContentPane();
        final JLabel label4 = new JLabel(img2);
        fase1.getContentPane().setBackground(Color.DARK_GRAY);
        //adiciona a imagem em um label
        panel2 = new JLabel(img2);
        panel.add(label4, BorderLayout.SOUTH);
        //adiciona o panel no container
        container2.add(panel2, BorderLayout.CENTER);
        fase1.pack();
        img2.setImage(img2.getImage().getScaledInstance(30, 30, 30));
        fase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a  janela
        fase1.add(panel);

        //Coracao3
        final ImageIcon img3 = new ImageIcon("coracao.png");
        //container onde serão adicionados todos componentes
        Container container3 = fase1.getContentPane();
        final JLabel label5 = new JLabel(img3);
        fase1.getContentPane().setBackground(Color.DARK_GRAY);
        //adiciona a imagem em um label
        panel3 = new JLabel(img3);
        panel.add(label5, BorderLayout.SOUTH);
        //adiciona o panel no container
        container3.add(panel3, BorderLayout.CENTER);
        fase1.pack();
        img3.setImage(img3.getImage().getScaledInstance(30, 30, 30));
        fase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a  janela
        fase1.add(panel3);

        //Uefa
        //Coracao3
        final ImageIcon imgUefa = new ImageIcon("uefa.jpg");
        //container onde serão adicionados todos componentes
        Container container4 = fase1.getContentPane();
        JLabel label6 = new JLabel(imgUefa);
        fase1.getContentPane().setBackground(Color.DARK_GRAY);
        //adiciona a imagem em um label
        JLabel panel4 = new JLabel(imgUefa);
        panel.add(label4, BorderLayout.SOUTH);
        //adiciona o panel no container
        container4.add(panel4, BorderLayout.CENTER);
        fase1.pack();
        imgUefa.setImage(imgUefa.getImage().getScaledInstance(600, 600, 600));
        fase1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a  janela
        fase1.add(panel4);

        fase1.setVisible(true);

        //tamanho da tela
        fase1.setExtendedState(MAXIMIZED_BOTH);

        verifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if (combo.getSelectedItem().equals("Real Madrid")) {
                    if (cont == 1) {
                        Pessoa.setPontuacao(8);
                    } else if (cont == 2) {
                        Pessoa.setPontuacao(6);
                    } else {
                        Pessoa.setPontuacao(10);
                    }
                    JOptionPane.showMessageDialog(null, "Parabens voce acertou!!");
                    fase1.dispose();
                    Quadrinhos quadrinhos = new Quadrinhos();
                    quadrinhos.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Nao foi dessa vez, mas continue tentando!!");
                    cont++;
                    volta();

                }

            }
        });
        desistir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                int confirm = JOptionPane.showConfirmDialog((Component) ev.getSource(),
                        "Deseja Realmente Desistir?",
                        "Sim - Nao",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Sua Pontuaçao foi de: 0" + "\n" + "Obrigado(a) por participar do nosso jogo!!");
                    fase1.dispose();
                    Menu menu = new Menu();
                    menu.setVisible(true);
                }

            }
        });

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) { // Item Selecionado
            label2.setIcon(imagens[combo.getSelectedIndex()]);

        }
    }

    @Override
    public void volta() {
        if (cont == 1) {
            panel.setVisible(false);

        } else if (cont == 2) {
            panel.setVisible(false);
            panel2.setVisible(false);
        } else if (cont == 3) {
            panel.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            JOptionPane.showMessageDialog(null, "Game Over!");
            fase1.setVisible(false);
            Fase1 fase1 = new Fase1();
        }
    }

}
