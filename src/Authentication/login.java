
package Authentication;

import Dashboards.AdminPanel;
import Dashboards.StaffPanel;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        hide_pass.setVisible(false);
        show_pass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        hide_pass = new javax.swing.JLabel();
        show_pass = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        password_input = new javax.swing.JPasswordField();
        username = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        register = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        password1 = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("WELCOME");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 110, 40));

        hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passMousePressed(evt);
            }
        });
        jPanel1.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 30));

        show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_passMousePressed(evt);
            }
        });
        jPanel1.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 30));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Role");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 20));

        username_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setText(" Enter your username...");
        username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 30));

        password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 30));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 20));

        Login.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Login.setText("LOG IN");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 30));

        register.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        register.setForeground(new java.awt.Color(204, 204, 204));
        register.setText("Not registered yet?");
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        createAccount.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        createAccount.setForeground(new java.awt.Color(204, 0, 51));
        createAccount.setText("CREATE ACCOUNT");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 331, -1, -1));

        role.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 28));

        password1.setBackground(new java.awt.Color(255, 255, 255));
        password1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("Password");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 20));
        jPanel1.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, 10));
        jPanel1.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 230, 440));

        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 220, 220);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, 220));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

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
        String selectedRole = role.getSelectedItem().toString(); // Get selected role

        if(username.isEmpty() || username.equals(" Enter your username...") ){
            username_input.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            username_validation.setText("Username is empty");
            username_validation.setForeground(Color.RED);
            username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            
        }
        if(password.isEmpty() || password.equals(" Enter your password...")){
            password_input.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            password_validation.setText("Password is empty");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
            
        dbConnector db = new dbConnector(); 
        Connection con = db.getConnection(); 

        String sql = "SELECT password, status, role FROM user WHERE username = ?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");
                String status = rs.getString("status");
                String roleFromDB = rs.getString("role");

                if (storedPassword.equals(password)) { 
                    if ("Pending".equalsIgnoreCase(status)) {
                        JOptionPane.showMessageDialog(this, "Your account is pending approval.", "Login Error", JOptionPane.ERROR_MESSAGE);
                    } else if (roleFromDB.equalsIgnoreCase(selectedRole)) { 
                        JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                        // Redirect based on role
                        if ("Admin".equalsIgnoreCase(roleFromDB)) {
                            AdminPanel admin = new AdminPanel();
                            admin.setVisible(true);
                        } else if ("Staff".equalsIgnoreCase(roleFromDB)) {
                            StaffPanel staff = new StaffPanel();
                            staff.setVisible(true);
                        }

                        this.dispose(); // Close login form
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect role selection!", "Login Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_LoginActionPerformed

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        if (username_input.getText().equals(" Enter your username...")) {
            username_input.setText("");
            username_input.setFont(new Font("Arial", Font.PLAIN, 12));
            username_input.setForeground(Color.BLACK); 
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
            password_input.setForeground(Color.BLACK);
            password_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        show_pass.setVisible(true); 
        hide_pass.setVisible(false);
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
    
    private void show_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passMousePressed
        hide_pass.setVisible(true);
        show_pass.setVisible(false);
        password_input.setEchoChar((char) 0); 
    }//GEN-LAST:event_show_passMousePressed

    private void hide_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passMousePressed
        show_pass.setVisible(true);
        hide_pass.setVisible(false);
        password_input.setEchoChar('*'); 
    }//GEN-LAST:event_hide_passMousePressed

    private void username_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_inputMouseReleased
        username_input.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        username_validation.setText("");
    }//GEN-LAST:event_username_inputMouseReleased

    private void password_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_inputMouseReleased
        password_input.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        password_validation.setText("");
    }//GEN-LAST:event_password_inputMouseReleased

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
    private javax.swing.JLabel header;
    private javax.swing.JLabel hide_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_validation;
    private javax.swing.JLabel register;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel show_pass;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    // End of variables declaration//GEN-END:variables
}
