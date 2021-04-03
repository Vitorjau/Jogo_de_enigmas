/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Excecoes.UsuarioExistenteException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author eduardo
 */
public abstract class Arquivo {
    public abstract  void escreverFim (String linha)throws IOException;
     public abstract  void verificaEEscreve(JTextField txtNome, JPasswordField txtSenha) throws FileNotFoundException, IOException, UsuarioExistenteException;
}
