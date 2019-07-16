package com.package1.email;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminWindow extends javax.swing.JFrame {

    public AdminWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usernameArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        userInfoArea = new javax.swing.JTextArea();
        buttonDisplay = new javax.swing.JButton();
        deleteField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameArea.setColumns(20);
        usernameArea.setRows(5);
        jScrollPane1.setViewportView(usernameArea);

        userInfoArea.setColumns(20);
        userInfoArea.setRows(5);
        jScrollPane2.setViewportView(userInfoArea);

        buttonDisplay.setText("Display Users");
        buttonDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonDisplayMouseReleased(evt);
            }
        });

        jLabel1.setText("Delete Username :");

        buttonDelete.setText("Delete");
        buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseReleased(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Firstname Lastname");

        buttonBack.setText("Logout");
        buttonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonBackMouseReleased(evt);
            }
        });

        buttonRegister.setText("Register");
        buttonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonRegisterMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete))
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonRegister)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(buttonDisplay))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBack)
                            .addComponent(buttonRegister))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(deleteField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDisplayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDisplayMouseReleased
        DisplayUsernames();
        
    }//GEN-LAST:event_buttonDisplayMouseReleased

    private void buttonDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseReleased
        try {
            deleteUser();
        } catch (IOException ex) {
            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDeleteMouseReleased

    private void buttonBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBackMouseReleased
        new LoginAuth().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonBackMouseReleased

    private void buttonRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegisterMouseReleased
        this.setVisible(false);
        new RegisterWindow().setVisible(true);
    }//GEN-LAST:event_buttonRegisterMouseReleased
    
public void deleteUser() throws FileNotFoundException, IOException
{

        File inputFile = new File("D:\\college\\V\\Java\\JavaEmailApplication\\src\\UserData\\Users.dat");
        File tempFile = new File("UsersTemp.dat");
        boolean flag = false;
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        while((currentLine = reader.readLine()) != null) {
            if(currentLine.equals(deleteField.getText())){
               flag =  true;
                for(int i=0 ; i<=3 ; i++)
                    currentLine = reader.readLine();
            }
             writer.write(currentLine);
             writer.newLine();
        }
        writer.close(); 
        reader.close(); 
        String path = inputFile.getAbsolutePath();
        inputFile.delete();
        File newFile = new File("D:\\college\\V\\Java\\JavaEmailApplication\\src\\UserData\\Users.dat");
        boolean successful = tempFile.renameTo(newFile);
        if(flag){
            System.out.println(successful);
            statusLabel.setText("successful");
        }
        else{
            System.out.println("user doesnot exist");
            statusLabel.setText("user doesnot exist");
        }
}
    
    public void DisplayUsernames(){
       try {
           File f = new File("D:\\college\\V\\Java\\JavaEmailApplication\\src\\UserData\\Users.dat");
           String full;
           String info="";
           try (BufferedReader fileReader = new BufferedReader(new FileReader(f))) {
               String users;
               full = "";
               while((users = fileReader.readLine())!=null){
                   full += users + "\n";
                   users = fileReader.readLine();
                   info += fileReader.readLine();
                   info += " "+fileReader.readLine()+ "\n";
               }
           }
           usernameArea.setText(full);
           userInfoArea.setText(info);
       } catch (FileNotFoundException ex) {
           Logger.getLogger(LoginAuth.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(LoginAuth.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
    
    // ~~~~~~~~~
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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDisplay;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JTextField deleteField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextArea userInfoArea;
    private javax.swing.JTextArea usernameArea;
    // End of variables declaration//GEN-END:variables
}
