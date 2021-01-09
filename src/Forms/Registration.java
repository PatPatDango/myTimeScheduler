/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;
import Classes.User;
import Handler.DatenbankHandler;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.sun.jdi.connect.spi.Connection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Julia
 */
public class Registration extends javax.swing.JFrame {

    
    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        this.setLocationRelativeTo(null); // Registration screen is shown in the center
        
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Registration_Reg = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel_smallWindow_Reg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        user_firstname = new javax.swing.JTextField();
        user_lastname = new javax.swing.JTextField();
        jLabel_Firstname_Reg = new javax.swing.JLabel();
        jLabel_Lastname_Reg = new javax.swing.JLabel();
        jLabel_Username_Reg = new javax.swing.JLabel();
        jLabel_Email_Reg = new javax.swing.JLabel();
        user_username = new javax.swing.JTextField();
        user_email = new javax.swing.JTextField();
        jLabel_EmailConfirmation_Reg = new javax.swing.JLabel();
        jLabel_Password_Reg = new javax.swing.JLabel();
        jLabel_PasswordConfirmation_Reg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton_Registrate_Reg = new javax.swing.JButton();
        jButton_Cancel_Reg = new javax.swing.JButton();
        jLabelChangeToLogIn = new javax.swing.JLabel();
        user_emailconfirmation = new javax.swing.JTextField();
        user_password = new javax.swing.JPasswordField();
        user_passwordconfirmation = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        jLabel_Registration_Reg.setBackground(new java.awt.Color(137, 196, 244));
        jLabel_Registration_Reg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Registration_Reg.setText("Registration");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel_smallWindow_Reg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_smallWindow_Reg.setText("-");
        jLabel_smallWindow_Reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_smallWindow_Reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_smallWindow_RegMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel_Registration_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jLabel_smallWindow_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(jLabel_smallWindow_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Registration_Reg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(231, 246, 255));

        user_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_firstnameActionPerformed(evt);
            }
        });

        jLabel_Firstname_Reg.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Firstname_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Firstname_Reg.setText("Firstname:");

        jLabel_Lastname_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Lastname_Reg.setText("Lastname:");

        jLabel_Username_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Username_Reg.setText("Username:");

        jLabel_Email_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Email_Reg.setText("Email:");

        jLabel_EmailConfirmation_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_EmailConfirmation_Reg.setText("Email Confirmation:");

        jLabel_Password_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Password_Reg.setText("Password:");

        jLabel_PasswordConfirmation_Reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_PasswordConfirmation_Reg.setText("Password Confirmation:");

        jPanel3.setBackground(new java.awt.Color(137, 196, 244));

        jButton_Registrate_Reg.setBackground(new java.awt.Color(0, 204, 51));
        jButton_Registrate_Reg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Registrate_Reg.setText("registrate");
        jButton_Registrate_Reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Registrate_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Registrate_RegActionPerformed(evt);
            }
        });

        jButton_Cancel_Reg.setText("cancel");
        jButton_Cancel_Reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancel_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_RegActionPerformed(evt);
            }
        });

        jLabelChangeToLogIn.setText("click here to log in");
        jLabelChangeToLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelChangeToLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelChangeToLogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabelChangeToLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton_Cancel_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Registrate_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton_Registrate_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton_Cancel_Reg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelChangeToLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_PasswordConfirmation_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jLabel_Password_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Email_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Firstname_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Lastname_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Username_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_EmailConfirmation_Reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(user_firstname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user_emailconfirmation)
                    .addComponent(user_password)
                    .addComponent(user_passwordconfirmation))
                .addGap(25, 25, 25))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(user_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Firstname_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Lastname_Reg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Username_Reg)
                    .addComponent(user_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Email_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_EmailConfirmation_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_emailconfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Password_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_PasswordConfirmation_Reg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_passwordconfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_firstnameActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);  //close the Registration window
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelChangeToLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChangeToLogInMouseClicked
       Login lg = new Login();
       lg.setVisible(true);
       lg.pack();
       lg.setLocationRelativeTo(null);
       lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabelChangeToLogInMouseClicked

    private void jLabel_smallWindow_RegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_smallWindow_RegMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);  // minimize the Registration screen
    }//GEN-LAST:event_jLabel_smallWindow_RegMouseClicked

    private void jButton_Registrate_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Registrate_RegActionPerformed
        // TODO add your handling code here:
        String firstname = user_firstname.getText();
        String lastname = user_lastname.getText();
        String username = user_username.getText();
        String email = user_email.getText();
        //String emailconfirmation=user_emailconfirmation.getText();
        String password=String.valueOf(user_password.getPassword());
        //String passwordconfirmation=String.valueOf(user_passwordconfirmation.getPassword());
        
        if(firstname.equals("")||lastname.equals("")||username.equals("")||email.equals("")/*||emailconfirmation.trim().equals("")||password.equals("")||passwordconfirmation.equals("")*/)
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty.");
        }
        /*else if(!password.equals(passwordconfirmation))
        {
            JOptionPane.showMessageDialog(null, "Passwords doesn't match","Confirm password",2);
        }
        else if(!email.equals(emailconfirmation))
        {
            JOptionPane.showMessageDialog(null, "E-mails doesn't match","Confirm e-mail",2);
        }*/
        else{
        
        PreparedStatement ps;
        String query="INSERT INTO 'user' (`u_firstName`,`u_lastName`,`u_username`,`u_email`,`u_password`) VALUES (?,?,?,?,?)";
        
        try {
            ps = (PreparedStatement) DatenbankHandler.getConnection().prepareStatement(query);
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New User added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        User Registrate = new User(firstname, lastname, username, email, password);
        
        //Go to Calendar
        //new Calendar().setVisible(true);
    }//GEN-LAST:event_jButton_Registrate_RegActionPerformed

    private void jButton_Cancel_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_RegActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_Cancel_RegActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel_Reg;
    private javax.swing.JButton jButton_Registrate_Reg;
    private javax.swing.JLabel jLabelChangeToLogIn;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabel_EmailConfirmation_Reg;
    private javax.swing.JLabel jLabel_Email_Reg;
    private javax.swing.JLabel jLabel_Firstname_Reg;
    private javax.swing.JLabel jLabel_Lastname_Reg;
    private javax.swing.JLabel jLabel_PasswordConfirmation_Reg;
    private javax.swing.JLabel jLabel_Password_Reg;
    private javax.swing.JLabel jLabel_Registration_Reg;
    private javax.swing.JLabel jLabel_Username_Reg;
    private javax.swing.JLabel jLabel_smallWindow_Reg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField user_email;
    private javax.swing.JTextField user_emailconfirmation;
    private javax.swing.JTextField user_firstname;
    private javax.swing.JTextField user_lastname;
    private javax.swing.JPasswordField user_password;
    private javax.swing.JPasswordField user_passwordconfirmation;
    private javax.swing.JTextField user_username;
    // End of variables declaration//GEN-END:variables
}
