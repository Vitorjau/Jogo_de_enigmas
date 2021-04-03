/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Excecoes.CodigoDeSegurancaException;
import Excecoes.UsuarioExistenteException;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import DAO.Acoes;
import Model.Pessoa;

/**
 *
 * @author eduardo
 */
/*
*/
public class Cadastro  extends Acoes{
    
    static Acoes<String> acoes  = new Acoes<>();
    static String gerador = "";

    public static String getGerador() {
        return gerador;
    }
   
    /**
     *
     * @param linha
     * @throws IOException
     */
    
    private Object passwordField;

    public static void cadastro() {
        
        final JFrame cadastro = new JFrame("Cadastro");
        cadastro.setLayout(new FlowLayout());
        
        //Cor da Tela
        cadastro.getContentPane().setBackground(Color.DARK_GRAY);
        
        //Imagem
        final ImageIcon img = new ImageIcon("cadastro.jpg");
        //pega a altura e largura
        //container onde serão adicionados todos componentes
        Container container = cadastro.getContentPane();
        int altura = img.getIconHeight();
        int largura = img.getIconWidth();
        JLabel label = new JLabel(img);
        //adiciona a imagem em um label
        JLabel panel = new JLabel(img);
        panel.add(label, BorderLayout.SOUTH);
        //adiciona o panel no container
        container.add(panel, BorderLayout.CENTER);
        cadastro.pack();
        img.setImage(img.getImage().getScaledInstance(600, 600, 600));

        // Nome do Usuário
        final JPanel nome = new JPanel();
        nome.setLayout(new FlowLayout());
        nome.setBackground(Color.DARK_GRAY);
        JLabel labelLogin = new JLabel("Login:"); 
        labelLogin.setForeground(Color.WHITE);
        nome.add(labelLogin);
        final JTextField txtNome = new JTextField(30);
        nome.add(txtNome);
        cadastro.add(nome);
        //cadastro.getContentPane().setBackground(Color.DARK_GRAY);
        //Senha Usuário
        final JPanel senha = new JPanel();
        senha.setLayout(new FlowLayout());
        senha.setBackground(Color.DARK_GRAY);
        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setForeground(Color.WHITE);
        senha.add(labelSenha);
        final JPasswordField txtSenha = new javax.swing.JPasswordField(20);
        senha.add(txtSenha);
        cadastro.add(senha);

        //Gerador
        String[] carct = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        

        for (int x = 0; x < 10; x++) {
            int j = (int) (Math.random() * carct.length);
            gerador += carct[j];
        }
        //Codigo De Segurança
        final JPanel codigoSeguranca = new JPanel();
        codigoSeguranca.setLayout(new FlowLayout());
        codigoSeguranca.setBackground(Color.DARK_GRAY);
        
        JLabel labelCodigo = new JLabel("Codigo de Seguranca:");
         labelCodigo.setForeground(Color.WHITE);
        codigoSeguranca.add(labelCodigo);
        final JButton txtCodigoSeguranca = new JButton(gerador);
        codigoSeguranca.add(txtCodigoSeguranca);
        cadastro.add(codigoSeguranca);

        //Informe Codigo de Segurança
        final JPanel informe = new JPanel();
        informe.setLayout(new FlowLayout());
        informe.setBackground(Color.DARK_GRAY);
        JLabel informeCodigo = new JLabel("Informe Codigo de Segurança:");
        informeCodigo.setForeground(Color.WHITE);
        informe.add(informeCodigo);
        final JTextField txtCodigo = new JTextField(20);
        informe.add(txtCodigo);
        cadastro.add(informe);
        
        

        JCheckBox mostrar = new JCheckBox("mostrar senha");
        final JButton acessar = new JButton("Cadastrar");
        JButton exit = new JButton("Sair");
        JButton limpa = new JButton("Limpa");
        JButton volta = new JButton("Volta Ao Login");

        cadastro.add(mostrar);
        cadastro.add(acessar);
        cadastro.add(exit);
        cadastro.add(limpa);
        cadastro.add(volta);

        cadastro.setVisible(true);
        
       
        
        // Tamanho da Tela
        cadastro.setExtendedState(MAXIMIZED_BOTH);
        Thread verifica = new Thread() { // Faz verificações se o campo de texto está vazio ou não!
            public void run() {
                while (true) {
                    if (txtNome.getText().equals("") || txtSenha.getText().equals("") || txtCodigo.getText().equals("")) {
                        acessar.setEnabled(false);
                    } else {
                        acessar.setEnabled(true);
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
                txtCodigo.setText("");
                }

            }
        });
        acessar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                try {
                    if (!(txtNome.equals("") || txtSenha.getText().equals(""))) {

                        if (txtCodigoSeguranca.getText().equals(txtCodigo.getText())) {
                            try {
                                acoes.verificaEEscreve(txtNome, txtSenha);
                            } catch (FileNotFoundException ex) {
                               JOptionPane.showMessageDialog(null, ex.getMessage());
                            } catch (UsuarioExistenteException ex) {
                                 JOptionPane.showMessageDialog(null, ex.getMessage());
                            }
                           
                        } 
                        else {
                            try {
                                throw new CodigoDeSegurancaException("Codigo de Segurança incorreto!");
                            } catch (CodigoDeSegurancaException ex) {
                               JOptionPane.showMessageDialog(null, ex.getMessage());
                            }
                            
                        }
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
                }
            }
        });
        volta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                cadastro.setVisible(false);
                Login.login();

            }
        });
    }

}

