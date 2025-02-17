
package Authentication;

import Dashboards.AdminPanel;
import Dashboards.StaffPanel;
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        userf = new javax.swing.JTextField();
        passf = new javax.swing.JPasswordField();
        username = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        register = new javax.swing.JLabel();
        createAccount = new javax.swing.JLabel();
        jcshow_password = new javax.swing.JCheckBox();
        role = new javax.swing.JComboBox<>();
        password1 = new javax.swing.JLabel();
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

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Role");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, 20));
        jPanel1.add(userf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 30));

        passf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfActionPerformed(evt);
            }
        });
        jPanel1.add(passf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 30));

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
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 90, 30));

        register.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        register.setForeground(new java.awt.Color(204, 204, 204));
        register.setText("Not registered yet?");
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        createAccount.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        createAccount.setForeground(new java.awt.Color(204, 0, 51));
        createAccount.setText("CREATE ACCOUNT");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });
        jPanel1.add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 350, -1, -1));

        jcshow_password.setForeground(new java.awt.Color(204, 204, 204));
        jcshow_password.setText("Show Password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(jcshow_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 10));

        role.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, 28));

        password1.setBackground(new java.awt.Color(255, 255, 255));
        password1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("Password");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 20));

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

    private void passfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfActionPerformed

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        register rt = new register();
        rt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createAccountMouseClicked

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
        if (jcshow_password.isSelected()) {
            passf.setEchoChar((char)0);
        }
        else {
            passf.setEchoChar('*');
        } 
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String username = userf.getText();
        String password = new String(passf.getPassword());
        String selectedRole = role.getSelectedItem().toString(); // Get selected role

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Login Error", JOptionPane.ERROR_MESSAGE);
        return;
        }

        dbConnector db = new dbConnector(); // Create an instance of dbConnector
        Connection con = db.getConnection(); // Get connection

        String sql = "SELECT password, status, role FROM user WHERE username = ?";
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");
                String status = rs.getString("status");
                String roleFromDB = rs.getString("role");

                if (storedPassword.equals(password)) { // Ensure proper hashing if applicable
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JPasswordField passf;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel register;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField userf;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
