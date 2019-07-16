
package com.package1.email;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class LoginAuth extends javax.swing.JFrame {

   String username;
   String password;
   static String firstName;
   static String lastName;
   
    public LoginAuth() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PassWord = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        SendButton = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 0, 240));
        setMaximumSize(new java.awt.Dimension(500, 707));
        setMinimumSize(new java.awt.Dimension(500, 707));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(PassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, 30));

        jLabel3.setText("Admin Login");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 80, 20));

        SendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendButtonMouseReleased(evt);
            }
        });
        getContentPane().add(SendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 180, 40));
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 400, 30));

        jLabel1.setBackground(new java.awt.Color(0, 240, 0));
        jLabel1.setForeground(new java.awt.Color(0, 240, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/package1/image/New Project (1).png"))); // NOI18N
        jLabel1.setText("Register");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 707));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public BufferedReader openFileToRead() throws FileNotFoundException{
            File readFile = new File("D:\\college\\V\\Java\\JavaEmailApplication\\src\\UserData\\Users.dat");
            BufferedReader fileReader = new BufferedReader(new FileReader(readFile));
            return fileReader;
    }
    public boolean userAuthentication(){
       try {
           BufferedReader fileReader = openFileToRead();
           String uLine;
           String pLine;
           String junk;
           String user = UserName.getText();
           String pass = String.valueOf(PassWord.getPassword());
           while((uLine = fileReader.readLine())!=null){
               System.out.println(uLine);
           if(uLine.equals(user)){
               pLine = fileReader.readLine();
               System.out.println(pLine);
               if(pLine.equals(pass)){
                   firstName = fileReader.readLine();
                   lastName = fileReader.readLine();
                   return true;
               }
               else{
                   junk = fileReader.readLine();
                   System.out.println(junk);
                   junk = fileReader.readLine();
                   System.out.println(junk);
               }
           }
           else{
               for(int i=1;i<=3;i++){
                   junk = fileReader.readLine();
                   System.out.println(junk);
               }
           }
           }
           
           System.out.println("file:\n username : "+uLine);
           fileReader.close();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(LoginAuth.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(LoginAuth.class.getName()).log(Level.SEVERE, null, ex);
       }
       return false;
    }
    
    private void SendButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButtonMouseReleased
        Combine c1=new Combine(UserName.getText(),String.valueOf(PassWord.getPassword())); 
        boolean authorisation = userAuthentication();
        if(!authorisation){
            System.out.println("incorrect username or password");
            return;
        }
        new emailMainGUI().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_SendButtonMouseReleased

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        new AdminLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAuth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAuth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassWord;
    private javax.swing.JLabel SendButton;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
