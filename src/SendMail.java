
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaun
 */
public class SendMail {
    
    public static void sendMail(String recipientEmail) throws MessagingException
    {
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String senderAccountEmail = "newspaperagency.vit@gmail.com";
        String senderAccountPassword = "Password1@";
        
        Session session = Session.getInstance(properties, new Authenticator(){
           
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(senderAccountEmail, senderAccountPassword);
            } 
        });
        
        Message message = prepareMessage(session, senderAccountEmail, recipientEmail);
    
        Transport.send(message);
        
        System.out.println("Email sent successfully");
    }
    
    private static Message prepareMessage(Session session, String senderAccountEmail, String recipientEmail)
    {
        try
        {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("My First Emaail from java app");
            message.setText("Hey ! \n Hello World");
            
            return message;
        }
        catch(Exception e)
        {
            //Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null ,e);
        }
        
        return null;
    }
    
    
        
        
        
    
}
