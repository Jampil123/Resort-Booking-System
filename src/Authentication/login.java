
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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        hide_pass.setVisible(false);
        show_pass.setVisible(false);
        
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        show_pass = new javax.swing.JLabel();
        hide_pass = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        password_input = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        forgotpass = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("WELCOME");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/show.png"))); // NOI18N
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_passMousePressed(evt);
            }
        });
        jPanel2.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, 30));

        hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passMousePressed(evt);
            }
        });
        jPanel2.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 30, 10));

        username_input.setBackground(new java.awt.Color(51, 51, 51));
        username_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setText(" Enter your username...");
        username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
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
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 220, 50));

        password_input.setBackground(new java.awt.Color(51, 51, 51));
        password_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password_input.setForeground(new java.awt.Color(255, 255, 255));
        password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        password_input.setCaretColor(new java.awt.Color(255, 255, 255));
        password_input.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        password_input.setInheritsPopupMenu(true);
        password_input.setOpaque(false);
        password_input.setText(" Enter your password...");
        password_input.setEchoChar((char) 0);
        password_input.setForeground(Color.GRAY);
        password_input.setFont(new Font("Arial", Font.PLAIN, 11));
        password_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_inputFocusLost(evt);
            }
        });
        password_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                password_inputMouseReleased(evt);
            }
        });
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, 50));

        Login.setBackground(new java.awt.Color(0, 102, 153));
        Login.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Login.setText("LOG IN");
        Login.setBorder(null);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 100, 40));

        forgotpass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(153, 255, 255));
        forgotpass.setText("Forgotten password?");
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassMouseClicked(evt);
            }
        });
        jPanel1.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        register.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        register.setForeground(new java.awt.Color(204, 204, 204));
        register.setText("Not registered yet?");
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        createAccount.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        createAccount.setForeground(new java.awt.Color(204, 0, 51));
        createAccount.setText("CREATE ACCOUNT");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        jPanel1.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, 10));
        jPanel1.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 280, 500));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 240, 250));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        register rt = new register();
        rt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createAccountMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String username = username_input.getText();
        String password = new String(password_input.getPassword());

        if (username.isEmpty() || username.equals(" Enter your username...")) {
            username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 1), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255)));
            username_validation.setText("Username is empty");
            username_validation.setForeground(Color.RED);
            username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
        if (password.isEmpty() || password.equals(" Enter your password...")) {
            password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 1), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255)));
            password_validation.setText("Password is empty");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
        
        dbConnector db = new dbConnector();

        try (Connection con = db.getConnection()) {

            if (loginAcc(username, password)) {

                Session sess = Session.getInstance();
                String roleFromDB = sess.getRole();
                String status = sess.getStatus();

                if ("Pending".equalsIgnoreCase(status)) {
                    JOptionPane.showMessageDialog(this, "Your account is pending approval.", "Login Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    // Logging the action
                    String action = "Account login for user ID: " + sess.getUser_id();
                    String logQuery = "INSERT INTO logs (user_id, action, date_time) VALUES (?, ?, ?)";

                    try (PreparedStatement logStmt = con.prepareStatement(logQuery)) {
                        logStmt.setInt(1, Integer.parseInt(sess.getUser_id()));
                        logStmt.setString(2, action);
                        logStmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
                        logStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(this, "Login successful! \nYou are logged in as " + roleFromDB + ".", "Success", JOptionPane.INFORMATION_MESSAGE);

                    if ("Admin".equalsIgnoreCase(roleFromDB)) {
                        Admin admin = new Admin();
                        admin.setVisible(true);
                    } else if ("Staff".equalsIgnoreCase(roleFromDB)) {
                        Staff staff = new Staff();
                        staff.setVisible(true);
                    }

                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle database errors properly in production
            JOptionPane.showMessageDialog(this, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        if (username_input.getText().equals(" Enter your username...")) {
            username_input.setText("");
            username_input.setFont(new Font("Arial", Font.PLAIN, 12));
            username_input.setForeground(Color.WHITE); 
        }
    }//GEN-LAST:event_username_inputFocusGained

    private void username_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusLost
        if (username_input.getText().isEmpty()) {
            username_input.setText(" Enter your username...");
            username_input.setFont(new Font("Arial", Font.PLAIN, 11));
            username_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_username_inputFocusLost

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        if (password_input.getText().equals(" Enter your password...")) {
            password_input.setText("");
            password_input.setEchoChar('*');
            password_input.setForeground(Color.WHITE);
            password_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
            show_pass.setVisible(false); 
            hide_pass.setVisible(true);        
    }//GEN-LAST:event_password_inputFocusGained

    private void password_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusLost
        if (password_input.getText().isEmpty()) {
            password_input.setText(" Enter your password...");
            password_input.setEchoChar((char) 0); 
            password_input.setForeground(Color.GRAY);
            password_input.setFont(new Font("Arial", Font.PLAIN, 11));
      
            hide_pass.setVisible(false);
            show_pass.setVisible(false);
        }
    }//GEN-LAST:event_password_inputFocusLost
    
    private void username_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_inputMouseReleased
        username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255)));
        username_validation.setText("");
    }//GEN-LAST:event_username_inputMouseReleased

    private void password_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_inputMouseReleased
        password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255)));
        password_validation.setText("");
    }//GEN-LAST:event_password_inputMouseReleased

    private void hide_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passMousePressed
        show_pass.setVisible(true);
        hide_pass.setVisible(false);
        password_input.setEchoChar((char) 0); 
    }//GEN-LAST:event_hide_passMousePressed

    private void show_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passMousePressed
        hide_pass.setVisible(true);
        show_pass.setVisible(false);
        password_input.setEchoChar('*'); 
    }//GEN-LAST:event_show_passMousePressed

    private void forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseClicked
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_forgotpassMouseClicked

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
    private javax.swing.JButton Login;
    private javax.swing.JLabel createAccount;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel header;
    private javax.swing.JLabel hide_pass;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_validation;
    private javax.swing.JLabel register;
    private javax.swing.JLabel show_pass;
    private javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    // End of variables declaration//GEN-END:variables
}
