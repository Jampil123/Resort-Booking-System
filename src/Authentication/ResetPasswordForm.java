
package Authentication;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import config.util;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ResetPasswordForm extends javax.swing.JFrame {

    public ResetPasswordForm() {
        initComponents();
        
        show.setVisible(false);
        hide.setVisible(false);
        show1.setVisible(false);
        hide1.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        new_pass = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        confirm_pass = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        hide1 = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        header.setForeground(new java.awt.Color(102, 102, 102));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reset Password");
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        mainPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter a new password to complete the reset process.");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        submit_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        mainPanel.add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 80, 30));

        cancel_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });
        mainPanel.add(cancel_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 30));

        new_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        new_pass.setForeground(new java.awt.Color(255, 255, 255));
        new_pass.setText("Enter new Password");
        mainPanel.add(new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        mainPanel.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 40));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        mainPanel.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 40));

        newPasswordField.setCaretColor(new java.awt.Color(255, 255, 255));
        newPasswordField.setText(" Enter new password...");
        newPasswordField.setEchoChar((char) 0);
        newPasswordField.setForeground(Color.GRAY);
        newPasswordField.setFont(new Font("Arial", Font.PLAIN, 11));
        newPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPasswordFieldFocusLost(evt);
            }
        });
        mainPanel.add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 360, 40));

        confirm_pass.setBackground(new java.awt.Color(255, 255, 255));
        confirm_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        confirm_pass.setForeground(new java.awt.Color(255, 255, 255));
        confirm_pass.setText("Confirm Password");
        mainPanel.add(confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show1MousePressed(evt);
            }
        });
        mainPanel.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 40));

        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
        });
        mainPanel.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 40));

        confirmPasswordField.setText(" Confirm password...");
        confirmPasswordField.setEchoChar((char) 0);
        confirmPasswordField.setForeground(Color.GRAY);
        confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 11));
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmPasswordFieldFocusLost(evt);
            }
        });
        mainPanel.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 360, 40));

        panel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 360));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        int choice = JOptionPane.showConfirmDialog(
            this, 
            "Are you sure you want to cancel?", 
            "Confirm Cancel", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE
        );

        if (choice == JOptionPane.YES_OPTION) {
            login in = new login();
            in.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
         // Get new password input
        String newPassword = newPasswordField.getText().trim();
        String confirmPassword = confirmPasswordField.getText().trim();

        // Validate input fields
        if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter and confirm your new password.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Password Validation
        if (!util.isValidPassword(newPassword)) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:"
                    + "\n- One uppercase letter"
                    + "\n- One lowercase letter"
                    + "\n- One number"
                    + "\n- One special character (@#$%^&+=!)", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Try again.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Get the user ID from session
            Session sess = Session.getInstance();
            int userId = Integer.parseInt(sess.getUser_id());

            if (userId == -1) {
                JOptionPane.showMessageDialog(this, "Session expired. Please log in again.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hash the new password
            String hashedPassword = passwordHasher.hashPassword(newPassword);

            // Database connection
            dbConnector con = new dbConnector();
            Connection connection = con.getConnection();

            // Update password query
            String updateQuery = "UPDATE user SET password = ? WHERE user_id = ?";
            PreparedStatement pst = connection.prepareStatement(updateQuery);
            pst.setString(1, hashedPassword);
            pst.setInt(2, userId);

            int updated = pst.executeUpdate();

            if (updated > 0) {
                // **Clear the session before redirecting**
                sess.setUser_id(null);

                JOptionPane.showMessageDialog(this, "Password reset successful! Please log in with your new password.", "Success", JOptionPane.INFORMATION_MESSAGE);
                new login().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password reset failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            connection.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void newPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordFieldFocusGained
        if (newPasswordField.getText().equals(" Enter new password...")) {
            newPasswordField.setText("");
            newPasswordField.setEchoChar('*');
            newPasswordField.setForeground(Color.BLACK);
            newPasswordField.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        hide.setVisible(true);
        show.setVisible(false);
    }//GEN-LAST:event_newPasswordFieldFocusGained

    private void newPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordFieldFocusLost
        if (newPasswordField.getText().isEmpty()) {
            newPasswordField.setText(" Enter new password...");
            newPasswordField.setEchoChar((char) 0);
            newPasswordField.setForeground(Color.GRAY);
            newPasswordField.setFont(new Font("Arial", Font.PLAIN, 11));

            hide.setVisible(false);
            show.setVisible(false);
        }
    }//GEN-LAST:event_newPasswordFieldFocusLost

    private void confirmPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusGained
        if (confirmPasswordField.getText().equals(" Confirm password...")) {
            confirmPasswordField.setText("");
            confirmPasswordField.setEchoChar('*');
            confirmPasswordField.setForeground(Color.BLACK);
            confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        hide1.setVisible(true);
        show1.setVisible(false);
    }//GEN-LAST:event_confirmPasswordFieldFocusGained

    private void confirmPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPasswordFieldFocusLost
        if (confirmPasswordField.getText().isEmpty()) {
            confirmPasswordField.setText(" Confirm password...");
            confirmPasswordField.setEchoChar((char) 0);
            confirmPasswordField.setForeground(Color.GRAY);
            confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 11));

            hide1.setVisible(false);
            show1.setVisible(false);
        }
    }//GEN-LAST:event_confirmPasswordFieldFocusLost

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        hide.setVisible(true);
        show.setVisible(false);
        newPasswordField.setEchoChar('*');
    }//GEN-LAST:event_showMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        newPasswordField.setEchoChar((char) 0); 
    }//GEN-LAST:event_hideMousePressed

    private void show1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MousePressed
        hide1.setVisible(true);
        show1.setVisible(false);
        confirmPasswordField.setEchoChar('*');
    }//GEN-LAST:event_show1MousePressed

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        show1.setVisible(true);
        hide1.setVisible(false);
        confirmPasswordField.setEchoChar((char) 0); 
    }//GEN-LAST:event_hide1MousePressed

   
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
            java.util.logging.Logger.getLogger(ResetPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel_button;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirm_pass;
    private javax.swing.JPanel header;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel new_pass;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
