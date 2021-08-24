import Project.ConnectionProvider;
import java.awt.*;
import static java.lang.Character.isDigit;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaun
 */
public class LoginWelcome extends javax.swing.JFrame {

    /**
     * Creates new form LoginWelcome
     */
    
    String adminUsername;
    
    public LoginWelcome(String admin_username) {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("billingICON.png")));
        
        adminNameLabel.setText(admin_username);
        
        adminUsername = admin_username;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        loginLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        adminNameLabel = new javax.swing.JLabel();
        editProfileButton = new javax.swing.JButton();
        billingHomeButton = new javax.swing.JButton();
        closeAppButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(60, 30));
        setMaximumSize(new java.awt.Dimension(1393, 800));
        setMinimumSize(new java.awt.Dimension(1393, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1393, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1350, 10));

        loginLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginLabel1.setText("WELCOME ! ");
        getContentPane().add(loginLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1370, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1370, 10));

        adminNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminNameLabel.setText("Admin_Name");
        getContentPane().add(adminNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        editProfileButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_admin_profile.png"))); // NOI18N
        editProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 70));

        billingHomeButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        billingHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing_icon.png"))); // NOI18N
        billingHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingHomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(billingHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 90, 70));

        closeAppButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_app.png"))); // NOI18N
        closeAppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeAppButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 80, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Edit Profile");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Log Out");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Close");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 90, -1, 20));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 20, 90));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 20, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Billing");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel2.setText("Newspaper Billing System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButtonActionPerformed
        // TODO add your handling code here:
        new EditAdminProfile(adminUsername).setVisible(true);
    }//GEN-LAST:event_editProfileButtonActionPerformed

    private void billingHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingHomeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new HomeGeneralAdmin(adminUsername).setVisible(true);
        
    }//GEN-LAST:event_billingHomeButtonActionPerformed

    private void closeAppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAppButtonActionPerformed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(null,"Do you want to Exit","Select",JOptionPane.YES_NO_OPTION);
        if(logout==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeAppButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(null,"Do you want to Log Out ?","Select",JOptionPane.YES_NO_OPTION);
        if(logout==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWelcome("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminNameLabel;
    private javax.swing.JButton billingHomeButton;
    private javax.swing.JButton closeAppButton;
    private javax.swing.JButton editProfileButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}