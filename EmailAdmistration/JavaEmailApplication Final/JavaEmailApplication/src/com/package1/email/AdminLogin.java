
package com.package1.email;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminLogin extends javax.swing.JFrame {

    
    public AdminLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        PassWord = new javax.swing.JPasswordField();
        SendButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 40, -1));
        getContentPane().add(PassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, 30));

        SendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendButtonMouseReleased(evt);
            }
        });
        getContentPane().add(SendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 180, 40));

        jLabel1.setBackground(new java.awt.Color(0, 240, 0));
        jLabel1.setForeground(new java.awt.Color(0, 240, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/package1/image/New Project (1).png"))); // NOI18N
        jLabel1.setText("back");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 707));
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 400, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SendButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButtonMouseReleased
        Combine c1=new Combine(UserName.getText(),String.valueOf(PassWord.getPassword()));
        boolean authorisation = adminAuthentication();
        if(!authorisation){
            System.out.println("incorrect username or password");
            return;
        }
        new AdminWindow().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_SendButtonMouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        new LoginAuth().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseReleased

    public boolean adminAuthentication(){
       try {
           File f = new File("D:\\college\\V\\Java\\JavaEmailApplication\\src\\UserData\\AdminData.dat");
           BufferedReader fileReader = new BufferedReader(new FileReader(f));
           String uLine;
           String pLine;
           String junk;
           String user = UserName.getText();
           String pass = String.valueOf(PassWord.getPassword());
           while((uLine = fileReader.readLine())!=null){
               
           if(uLine.equals(user)){
               pLine = fileReader.readLine();
               
                if(pLine.equals(pass)){
                    System.out.print("logging in .. ");
                   return true;
                }
            }
           else{
                   junk = fileReader.readLine();
                   System.out.println(junk);
               
           }
           }
           
           
           fileReader.close();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(LoginAuth.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(LoginAuth.class.getName()).log(Level.SEVERE, null, ex);
       }
       return false;
    }
    
    
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassWord;
    private javax.swing.JLabel SendButton;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
