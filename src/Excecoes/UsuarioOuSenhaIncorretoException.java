/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author Aluno
 */
public class UsuarioOuSenhaIncorretoException extends Exception {
    public UsuarioOuSenhaIncorretoException(String mensagem){
        super(mensagem);
    }
}
