/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import javax.swing.JOptionPane;
import Views.Login;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author eduardo
 */
public class EnviarEmail {
    
    public static void EnviandoEmail()  {

        String email = "eduardoafonso12345678@gmail.com";
        String senha = "eduardo12345678";

        MultiPartEmail emailSimples = new MultiPartEmail();
        emailSimples.setHostName("smtp.gmail.com");
        emailSimples.setSmtpPort(465);//Porta Smtp padrao
        emailSimples.setAuthenticator(new DefaultAuthenticator(email, senha)); // Autenticaçao
        emailSimples.setSSLOnConnect(true);

        try {

            emailSimples.setFrom(email); // Email de Origem
            emailSimples.setSubject("Joguinho");
            emailSimples.setMsg("Parabens "+Login.getTxtNome().getText()+"!!");
            emailSimples.addTo(Login.getTxtNome().getText()); // Email de Destino
            
            EmailAttachment anexo = new  EmailAttachment(); // Objeto para o anexo
            anexo.setPath("anexo.jpg"); //caminho do anexo
            anexo.setName("textinho.jpg");
            emailSimples.attach(anexo); // Coloca anexo no emailSimples
             
            
            emailSimples.send();// Email Sendo Enviado!!
            //System.out.println("Email Enviado com Sucesso!!");
            JOptionPane.showMessageDialog(null, "Parabens!!  E-mail Enviado com sucesso");
            JOptionPane.showMessageDialog(null, "Fim");
            System.exit(0);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
