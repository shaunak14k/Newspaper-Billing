import Project.ConnectionProvider;
import com.email.durgesh.Email;
import java.awt.*;
import static java.lang.Character.isDigit;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

//import javax.mail.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaun
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
   
    
    public Login() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("billingICON.png")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        loginButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        forgotPasswordButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(60, 30));
        setMaximumSize(new java.awt.Dimension(1393, 800));
        setMinimumSize(new java.awt.Dimension(1393, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1393, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, 25));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, 20));

        usernameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 200, -1));

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 200, -1));

        showPasswordCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showPasswordCheckBox.setText(" Show Password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(showPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 210, -1));

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_button_icon.png"))); // NOI18N
        loginButton.setText("  Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 130, 50));

        closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_icon.png"))); // NOI18N
        closeButton.setText("  Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 630, 130, 50));

        loginLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        loginLabel.setText("Login");
        getContentPane().add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 176, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel1.setText("Newspaper Billing System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        forgotPasswordButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        forgotPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forgot_password_icon.png"))); // NOI18N
        forgotPasswordButton.setText("  Forgot Password ?");
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(forgotPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 210, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 990, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 990, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 40, 510));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 40, 510));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 730, 770, 20));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 770, 20));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 630, 20));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 620, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_icon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if(showPasswordCheckBox.isSelected())
        {
            passwordTextField.setEchoChar((char)0);
        }
        else
        {
            passwordTextField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
      
        try
        {
            
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            //Fetch username and password from database
            
            System.out.println("0");
            ResultSet rs = st.executeQuery("select * from Admin");
                       
            System.out.println("1");
            
            int flag=0;
             //Check if it matches the username and password from database
            while(rs.next())
            {
                int admin_no = rs.getInt(1);
                String admin_username = rs.getString(3);
                String admin_password = rs.getString(4);
                
                String is_superadmin = rs.getString(7);
            
                System.out.println("USERNAME "+admin_username);
                System.out.println("PASSWORD "+admin_password);

                if(usernameTextField.getText().equals(admin_username) && passwordTextField.getText().equals(admin_password))
                {
                    flag=1;
                    
                    setVisible(false);
                    
                    if(is_superadmin.equals("Yes"))
                    {
                        new SuperAdminLogin(admin_username).setVisible(true);
                    }
                    else
                    {
                        new LoginWelcome(admin_username).setVisible(true);
                        //new Home().setVisible(true);
                    }
                    System.out.println("2");
                    break;
                }
            }
            
            if(flag==0)
            {
                //If no username and password is matched
                JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                System.out.println("BOX");
            }
        }
        
        //Any other Exceotion
        catch(Exception e)
        {      
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
   
       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        int close = JOptionPane.showConfirmDialog(null,"Do you want to close the Application","Select",JOptionPane.YES_NO_OPTION);
        if(close==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        // TODO add your handling code here:
        
        //USERNAME TO UPDATE IN DATABASE
        String recieverUsrename = JOptionPane.showInputDialog(null,"Enter your Username ");
        //If Cancel is hit
        if(recieverUsrename.equals(null))
        {
            return;
        }
        // ************************ CHECK IF USERNAME EXISTS *****************************************************************
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs;

            //Check if username exists or not
            rs = st.executeQuery("select * from Admin where admin_username ='"+recieverUsrename+"'");
            if(!rs.next())
            {
                throw new UsernameNotFoundException();
            }

        }
        //USername not found
        catch(UsernameNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Username does not exist");
            return;
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return;
        }
        // ************************ CHECK IF USERNAME EXISTS *****************************************************************
        //SEND EMAIL FOR PASSWORD RECOVERY
        String recieverEmail = JOptionPane.showInputDialog(null,"Enter your Email to recover the password ");
        //If Cancel is hit
        if(recieverEmail.equals(null))
        {
            return;
        }
        
        System.out.println(recieverEmail);
        // ************************ CHECK IF USERNAME EXISTS *****************************************************************
        //System.exit(0);
        
        //JOptionPane.showMessageDialog(null, "Sending Email...");
        
        
        //************************************************* SENDING EMAIL *************************************************************************
        try
        {
            //Email and password of sender
            Email email = new Email("newspaperagency.vit@gmail.com", "Password1@");
            email.setFrom("newspaperagency.vit@gmail.com", "Shirude Newspaper Agency");
            email.setSubject("Password Recovery");
            
            // ******************** CREATE RANDOM PASSWORD **********************************************************************************
            // GENERATE 8 letter password having at least 1 lowcase, 1 uppercase, 1 special char, 1 number 
            String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
            String specialCharacters = "!@#$";
            String numbers = "1234567890";
            String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
            System.out.println("Password :0");
            Random random = new Random();
            int length=8;
            System.out.println("Password :-1");
            char[] password = new char[length];
            
            String passwordString="";
            
            password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
            password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
            password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
            password[3] = numbers.charAt(random.nextInt(numbers.length()));
            System.out.println("Password :1");
            for(int i = 4; i< length ; i++) 
            {
               password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
            }
            
            for(int i=0; i<length; i++)
            {  
               passwordString = passwordString.concat(String.valueOf(password[i]));
            }
            
            System.out.println("Password : "+passwordString);
            
            //System.exit(0);
            // ******************** CREATE RANDOM PASSWORD **********************************************************************************
            
            // ************************ SET PASSWORD IN DATABASE *****************************************************************
            try
            {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs;
                
                st.executeUpdate("update Admin set admin_password ='"+passwordString+"' where admin_username ='"+recieverUsrename+"'");
            }
            
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            // ************************ SET PASSWORD IN DATABASE *****************************************************************
            
            
            //Email contents
            email.setContent("<h2>Here is your new password : </h2><br> "+passwordString+"<br><br>You can use this password to Log in<br><br>Make sure to change your password after Logging in ", "text/html");
                 
            //Reciever email address
            email.addRecipient(recieverEmail);
            
            //Send email
            email.send();
                                   
            System.out.println("Sent Successfully");
            JOptionPane.showMessageDialog(null, "Email sent Successfully");
            
        }
       
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "There was an error. Please re-enter your email");
            e.printStackTrace();
            return;
        } 
        //************************************************* SENDING EMAIL *************************************************************************
        
        //SenMail ob = new SendMail();
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    private static class UsernameNotFoundException extends Exception{}
}
