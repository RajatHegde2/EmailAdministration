/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.package1.email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;

/**
 *
 * @author ASUS
 */
public class SendMail   {
    private String user ;
    private String pass;
    private String filepath;
    private String to,sub,msg;
    
        SendMail(String to,String sub,String msg,String filepath)
        {
            user = "psarnad@gmail.com" ;
            pass = "pssarnad123" ;
            this.to=to;
            this.sub=sub;
            this.filepath = filepath;
            this.msg=msg+"\n\n Regards,\n "+LoginAuth.firstName+" "+LoginAuth.lastName;
            System.out.println(filepath);
        }

     public void SendMailfunc(){
           System.out.println("in runbary");
        //Setting up configurations for the email connection to the Google SMTP server using TLS
        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        //Establishing a session with required user details
        
        
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user , pass);
            }
        });   
        System.out.println(session);
        
        try {
                 Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("Rajat"));
        if(filepath != null){
            File file = new File(filepath); 
  
            BufferedReader br = new BufferedReader(new FileReader(file)); 
  
            String st; 
            while ((st = br.readLine()) != null) {
                message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(st));
                message.setSubject(sub);
                message.setText(msg);
        
                Transport.send(message);
                System.out.println("Message sent");
            }
        }
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
        message.setSubject(sub);
        message.setText(msg);
        
        Transport.send(message);
        System.out.println("Message sent");}
            
        catch(javax.mail.AuthenticationFailedException e)
        {
            System.out.println("Wrong username password entered user "+user +" pass "+pass);
            
        }
  
            
        catch (Exception e) {
            System.out.println(e);
        }
    
}
}
