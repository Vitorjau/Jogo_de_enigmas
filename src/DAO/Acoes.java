/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Excecoes.UsuarioExistenteException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author eduardo
 */
public class Acoes<T> extends Arquivo {

    @Override
    public  void escreverFim(String linha) throws IOException {
        FileWriter fw = new FileWriter("Dados.txt", true);
        BufferedWriter fwriter = new BufferedWriter(fw);
        fwriter.write(linha + "\n");
        fwriter.close();
    }
    @Override
    public  void verificaEEscreve(JTextField txtNome, JPasswordField txtSenha) throws FileNotFoundException, IOException, UsuarioExistenteException {
        ArrayList<T> ps = new ArrayList<>();
        int cont = 0;
        FileReader f = new FileReader("Dados.txt");
        try (BufferedReader readerf = new BufferedReader(f)) {
            T linha = (T) readerf.readLine();
            while (linha != null) {//se linha igual a null todas linhas já foram lidas
                //System.out.println(linha);
                ps.add((T) linha);
                linha = (T) readerf.readLine();

            }
        }
        for (int i = 0; i < ps.size(); i++) {
            if (i % 2 == 0) {
                if (txtNome.getText().equals(ps.get(i))) {
                    throw new UsuarioExistenteException("Usuario Ja existente!!");
                    //return;
                }
            }
        }

        escreverFim(txtNome.getText());
        escreverFim(txtSenha.getText());
        JOptionPane.showMessageDialog(null, "Cadastro feito com Sucesso!");
    }
    
     public static void escreverControle(String linha) throws IOException {
        FileWriter fw = new FileWriter("Controle.txt", true);
        BufferedWriter fwriter = new BufferedWriter(fw);
        fwriter.write(linha + "\n");
        fwriter.close();
    }

}
