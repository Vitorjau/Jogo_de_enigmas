/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.Acoes;
import Model.Pessoa;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Excecoes.UsuarioOuSenhaIncorretoException;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Login  {
    protected static Pessoa p;

    public static Pessoa getPessoa() {
        return p;
    }
    
    private Object passwordField;
    protected static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    protected static JTextField txtNome;

    public static JTextField getTxtNome() {
        return txtNome;
    }

    public static void login() {
        final JFrame cadastro = new JFrame("Login");
        cadastro.setLayout(new FlowLayout());
         cadastro.getContentPane().setBackground(Color.DARK_GRAY);

        //Imagem
        final ImageIcon img = new ImageIcon("login.png");
        //pega a altura e largura
        //container onde serão adicionados todos componentes
        Container container = cadastro.getContentPane();
        int altura = img.getIconHeight();
        int largura = img.getIconWidth();
        JLabel label = new JLabel(img);
        //adiciona a imagem em um label
        JLabel panel = new JLabel(img);
        panel.setBackground(Color.DARK_GRAY);
        panel.add(label, BorderLayout.SOUTH);
        //adiciona o panel no container
        container.add(panel, BorderLayout.CENTER);
        cadastro.pack();
        img.setImage(img.getImage().getScaledInstance(300, 300, 300));

        // Nome do Usuário
        final JPanel nome = new JPanel();
        nome.setBackground(Color.DARK_GRAY);
        nome.setLayout(new FlowLayout());
        
        JLabel labelLogin = new JLabel("Login:");
        labelLogin.setForeground(Color.WHITE);
        
        nome.add(labelLogin);
        txtNome = new JTextField(30);
        nome.add(txtNome);
        cadastro.add(nome);
        //Senha Usuário
        final JPanel senha = new JPanel();
        senha.setBackground(Color.DARK_GRAY);
        senha.setLayout(new FlowLayout());
        JLabel labelSenha = new JLabel("Senha:");
        senha.add(labelSenha);
         labelSenha.setForeground(Color.WHITE);
        final JPasswordField txtSenha = new javax.swing.JPasswordField(20);
        senha.add(txtSenha);
        cadastro.add(senha);

        
        JCheckBox mostrar = new JCheckBox("mostrar senha");
        
        final JButton acesso = new JButton("Acesso");
        JButton exit = new JButton("Sair");
        JButton limpa = new JButton("Limpa");
        JButton cadastra = new JButton("Cadastro");

        cadastro.add(mostrar);
        cadastro.add(acesso);
        cadastro.add(exit);
        cadastro.add(limpa);
        cadastro.add(cadastra);

        cadastro.setVisible(true);
        //Tamanho da Tela
        cadastro.setExtendedState(MAXIMIZED_BOTH);
        Thread verifica = new Thread() { // Faz verificações se o campo de texto está vazio ou não!
            @Override
            public void run() {
                while (true) {
                    if (txtNome.getText().equals("") || txtSenha.getText().equals("")) {
                        acesso.setEnabled(false);
                    } else {
                        acesso.setEnabled(true);
                    }
                    try {
                        sleep(250); //0,25  segundo
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
                    }
                }
            }
        };
        verifica.start();
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if (txtSenha.getEchoChar() == '•') {
                    txtSenha.setEchoChar((char) 0);
                } else {
                    txtSenha.setEchoChar('•');
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                int confirm = JOptionPane.showConfirmDialog((Component) ev.getSource(),
                        "Deseja Realmente Sair?",
                        "Sair - Permanecer",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Fim!");
                    System.exit(0);
                }
            }
        });
        limpa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                int confirm = JOptionPane.showConfirmDialog((Component) ev.getSource(),
                        "Deseja Realmente Limpar os Campos?",
                        "Limpar - Cancelar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    txtNome.setText("");
                    txtSenha.setText("");
                }

            }
        });
        acesso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ArrayList<String> ps = new ArrayList<>();
                int cont = 0;
                FileReader f = null;
                try {
                    f = new FileReader("Dados.txt");
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
                }
                BufferedReader readerf = new BufferedReader(f);
                String linha = null;
                try {
                    linha = readerf.readLine();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
                }
                while (linha != null) {//se linha igual a null todas linhas já foram lidas
                    //System.out.println(linha);
                    ps.add(linha);
                    try {
                        linha = readerf.readLine();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
                    }

                }

                try {
                    readerf.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
                }
                for (int i = 0; i < ps.size(); i++) {
                    if (txtNome.getText().equals(ps.get(i)) && txtSenha.getText().equals(ps.get(i + 1))) {
                        //VisualizaLogados.visualizaLogados();
                        JOptionPane.showMessageDialog(null, "Seja bem vindo "+txtNome.getText()+"!");
                         Menu menu = new Menu();
                         menu.setVisible(true);
                         cadastro.dispose();
                        
                        Date entrada = new Date();
                        p = new Pessoa(entrada, txtNome);
                         
                        pessoas.add(p);
                        //MOSTRAR O HORARIO DE ENTRADA e nome
                        System.out.println("Usuario:" + p.getNome().getText());
                        System.out.println("Entrada:" + p.getEntrada());
                        try {
                            Acoes.escreverControle("Usuario:" +  p.getNome().getText());
                            Acoes.escreverControle("Entrada:" +  p.getEntrada());
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                      
                        break;
                    }
                    if (i == ps.size() - 1) {
                        try {
                            throw new UsuarioOuSenhaIncorretoException("Senha ou Usuario Invalido!!");
                        } catch (UsuarioOuSenhaIncorretoException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                        }
                       
                    }
                }

            }
        });
        cadastra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                cadastro.setVisible(false);
                Cadastro.cadastro();

            }
        });

    }

}
