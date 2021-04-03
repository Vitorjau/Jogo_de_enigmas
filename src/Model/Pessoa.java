/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author eduardo
 * @param <T>
 */
public class Pessoa <T>{
    public Pessoa(Date entrada, JTextField nome){
        Pessoa.entrada = entrada;
        Pessoa.nome = nome;
    }
    public Pessoa(Date saida){
       Pessoa.saida = saida;
    }
    public static String getPontucaoConvertidaParaString(){
        return Integer.toString(pontuacao);
    } 
    
    protected static Date entrada, saida;
    private T algo;
    protected static int pontuacao = 0;

    public static int getPontuacao() {
        return pontuacao;
    }

    public static void setPontuacao(int pontuacao) {
        Pessoa.pontuacao = pontuacao;
    }

    public  T getAlgo() {
        return algo;
    }

    public void setAlgo(T algo) {
        this.algo = algo;
    }
    
    public static  Date getSaida() {
        return saida;
    }
    private static JTextField nome;

    
   

    public static JTextField getNome() {
        return nome;
    }

   
    public static Date  getEntrada() {
        return entrada;
    }
    public static void retornaPessoa(){
            JOptionPane.showMessageDialog(null, "Login: " + getNome().getText()  + "\n" + "Entrada:" + getEntrada() + "\n" + "Saida:" + getSaida() + "\n" + "tempo(m): " + (((getSaida().getTime() - getEntrada().getTime()) / 1000) / 60)  );
    }

}
