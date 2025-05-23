
package Authentication;

import Dashboards.Admin;
import Dashboards.Staff;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        hide_pass.setVisible(true);
        
    }
    static String status;
    static String type;
    
    public static boolean loginAcc(String username, String password){
        dbConnector con = new dbConnector();
  
        try {
            String query = "SELECT * FROM user WHERE username = '" + username + "'";
            ResultSet resultSet = con.getData(query);

            if (resultSet.next()) {
                
                String hashedPass = resultSet.getString("password");
                String rehashedPass = passwordHasher.hashPassword(password);
                if(hashedPass.equals(rehashedPass)){

                    status = resultSet.getString("status");
                    type = resultSet.getString("role");

                    Session sess = Session.getInstance();
                    sess.setUser_id(resultSet.getString("user_id"));
                    sess.setF_name(resultSet.getString("f_name"));
                    sess.setL_name(resultSet.getString("l_name"));
                    sess.setUsername(resultSet.getString("username"));
                    sess.setEmail(resultSet.getString("email"));
                    sess.setRole(resultSet.getString("role"));
                    sess.setStatus(resultSet.getString("status"));
                    
//                    System.out.println("Session User ID: " + sess.getUser_id());
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException | NoSuchAlgorithmException ex) {
            return false;
        }
    }
    
        public void setInvalidTitledBorder(JComponent component, String title) {
            TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 0, 0)),  // Red border for invalid input
                title,
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 14),
                new Color(255, 0, 0) // Red text color for the title
            );

            component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 7, 0, 0)));

            // Make text field background fully transparent
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setOpaque(false); 
                textField.setBackground(new Color(0, 0, 0, 0)); 
                textField.setCaretColor(Color.WHITE); // Make sure cursor is visible
                textField.setForeground(new Color (255, 0, 0));
            }
        }

        public void setTitledBorder(JComponent component, String title, Color color) {
            TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(color, 1),  // Use given color
                title,  
                TitledBorder.LEFT,  
                TitledBorder.TOP,  
                new Font("Arial", Font.PLAIN, 14), 
                color  // Title text color
            );

            component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

            // Make text field background fully transparent
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setOpaque(false); // Remove background fill
                textField.setBackground(new Color(0, 0, 0, 0)); // Ensure full transparency
                textField.setCaretColor(Color.WHITE); // Ensure cursor is visible
                textField.setForeground(Color.WHITE);
            }
            
            
        }
       
        private void displayError(JLabel field, String message) {
                field.setText(message);
                field.setForeground(new Color(255,0,0));
         }
        
        private void proceedToDashboard(String role) {
            
            JOptionPane.showMessageDialog(this, "Login successful! You are logged in as " + role + ".", "Success", JOptionPane.INFORMATION_MESSAGE);
            if ("Admin".equalsIgnoreCase(role)) {
                Admin admin = new Admin();
                admin.setVisible(true);
            } else if ("Staff".equalsIgnoreCase(role)) {
                Staff staff = new Staff();
                staff.setVisible(true);
            }
        }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        username_input = new javax.swing.JTextField();
        hide_pass = new javax.swing.JLabel();
        forgotpass = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        loginButton = new Swing.Button();
        validation = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Ready for Your Next Escape?");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 430, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 30, 10));

        username_input.setBackground(new java.awt.Color(51, 51, 51));
        username_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        username_input.setCaretColor(new java.awt.Color(255, 255, 255));
        username_input.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        username_input.setOpaque(false);
        username_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_inputFocusLost(evt);
            }
        });
        username_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                username_inputMouseReleased(evt);
            }
        });
        username_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_inputActionPerformed(evt);
            }
        });
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 350, 70));

        hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passMousePressed(evt);
            }
        });
        jPanel1.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 30, 60));

        forgotpass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(153, 255, 255));
        forgotpass.setText("Forgot Password");
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassMouseClicked(evt);
            }
        });
        jPanel1.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 20));

        register.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Not registered yet?");
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, -1));

        createAccount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        createAccount.setForeground(new java.awt.Color(255, 51, 51));
        createAccount.setText("CREATE ACCOUNT");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        username_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, 20));

        password_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 210, 20));

        header1.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        header1.setForeground(new java.awt.Color(255, 255, 255));
        header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header1.setText("Welcome Back! ");
        jPanel1.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 430, 40));

        loginButton.setBackground(new java.awt.Color(0, 51, 255));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 180, 60));

        validation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        validation.setForeground(new java.awt.Color(255, 0, 0));
        validation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 430, 30));

        password_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password_input.setForeground(new java.awt.Color(153, 153, 153));
        password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        password_input.setEchoChar('\u0000');
        password_input.setOpaque(false);
        password_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_inputFocusLost(evt);
            }
        });
        password_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_inputActionPerformed(evt);
            }
        });
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 430, 700));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 300, 300));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        register rt = new register();
        rt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createAccountMouseClicked

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        username_input.setForeground(Color.WHITE);
        setTitledBorder(username_input, "Username", Color.WHITE);
    }//GEN-LAST:event_username_inputFocusGained

    private void username_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusLost
        displayError(username_validation, "");
        setTitledBorder(username_input, "Username", Color.WHITE);
        username_input.setForeground(Color.WHITE);
    }//GEN-LAST:event_username_inputFocusLost
    
    private void username_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_inputMouseReleased
       
    }//GEN-LAST:event_username_inputMouseReleased

    private boolean pass_visible = false;  
    
    private void hide_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passMousePressed
        pass_visible = !pass_visible;
        String currentText = password_input.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                password_input.setEchoChar((char) 0);
            }
            hide_pass.setIcon(new ImageIcon(getClass().getResource("/images/eye.png")));
        } else {
            if (!currentText.equals("")) {
                password_input.setEchoChar('•');
            }
            hide_pass.setIcon(new ImageIcon(getClass().getResource("/images/hidden.png")));
        } 
    }//GEN-LAST:event_hide_passMousePressed

    private void forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseClicked
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_forgotpassMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        boolean valid = true;
    
        String username = username_input.getText().trim();
        String password = new String(password_input.getPassword()).trim();

        if (username.isEmpty()) {
            setInvalidTitledBorder(username_input, "Username");
            displayError(username_validation, "Username is empty!");
            valid = false;
        }

        if (password.isEmpty()) {
            setInvalidTitledBorder(password_input, "Password");
            displayError(password_validation, "Password is empty!");
            valid = false;
        }

        if (!valid) {
            return;
        }
        
        dbConnector con = new dbConnector();
        Connection cn = con.getConnection();

        if (loginAcc(username, password)) {

            Session sess = Session.getInstance();
            String roleFromDB = sess.getRole();
            String status = sess.getStatus();
            String user = sess.getUser_id();

            if (user == null || roleFromDB == null || status == null) {
                JOptionPane.showMessageDialog(this, "Session error: Incomplete session data.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Insert log
            String action = "User logged in with ID " + user;
            con.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + user + "', '" + action + "', '" + LocalDateTime.now() + "')");

            // Check if the account is pending
            if ("Pending".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(this, "Your account is pending approval.", "Login Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check for security question
            String sql = "SELECT question FROM securityQuestion WHERE user_id = ?";
            String securityQuestion = con.getSingleData(sql, user);

            if (securityQuestion == null || securityQuestion.trim().isEmpty()) {
                int choice = JOptionPane.showConfirmDialog(
                    this,
                    "You have not set a security question yet. Do you want to set it now?",
                    "Set Security Question",
                    JOptionPane.YES_NO_OPTION
                );

                if (choice == JOptionPane.YES_OPTION) {
                    LoginSecurityQuestion sqPanel = new LoginSecurityQuestion();
                    sqPanel.setVisible(true);
                } else {
                    proceedToDashboard(roleFromDB);
                }
            } else {
                proceedToDashboard(roleFromDB);
            }

            // Dispose login window
            this.dispose();

        } else {
            // Login failed
            setInvalidTitledBorder(password_input, "Password");
            setInvalidTitledBorder(username_input, "Username");

            validation.setText("Invalid Account!!!");
            validation.setForeground(new Color(255, 0, 0));
            validation.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
        }
 

    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(new Color(30, 100, 255));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_loginButtonMouseExited

    private void username_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_inputActionPerformed

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        password_input.setEchoChar('•'); // Mask password
        password_input.setForeground(Color.WHITE);
        setTitledBorder(password_input, "Password", Color.WHITE);
    }//GEN-LAST:event_password_inputFocusGained

    private void password_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusLost

        setTitledBorder(password_input, "Password", Color.WHITE);
        password_input.setForeground(Color.WHITE);
        displayError(password_validation, "");
    }//GEN-LAST:event_password_inputFocusLost

    private void password_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_inputActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccount;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel header;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel hide_pass;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Swing.Button loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_validation;
    private javax.swing.JLabel register;
    private javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    private javax.swing.JLabel validation;
    // End of variables declaration//GEN-END:variables
}
