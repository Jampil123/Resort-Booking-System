
package FloatedPage;

import Authentication.login;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class change_pass extends javax.swing.JPanel {

    public change_pass() {
        initComponents();
        
        hide.setVisible(false);
        show.setVisible(false);
        
        hide1.setVisible(false);
        show1.setVisible(false);
        
        hide2.setVisible(false);
        show2.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header_background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        confirm_pass = new javax.swing.JLabel();
        new_pass = new javax.swing.JLabel();
        curr_pass = new javax.swing.JLabel();
        cancel_button = new javax.swing.JLabel();
        save_button = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        hide1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        hide2 = new javax.swing.JLabel();
        show2 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_background.setBackground(new java.awt.Color(204, 204, 204));
        header_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Change Password");
        header_background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -3, 140, 60));

        add(header_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 491, 60));

        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirm_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        confirm_pass.setText("Confirm Password");
        jPanel3.add(confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        new_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        new_pass.setText("Enter new Password");
        jPanel3.add(new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        curr_pass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        curr_pass.setText("Current Password");
        jPanel3.add(curr_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        cancel_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_buttonMouseClicked(evt);
            }
        });
        jPanel3.add(cancel_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        save_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        save_button.setText("Save");
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_buttonMouseClicked(evt);
            }
        });
        jPanel3.add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        jPanel3.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, 30));

        oldpass.setOpaque(false);
        oldpass.setText(" Enter old password...");
        oldpass.setEchoChar((char) 0);
        oldpass.setForeground(Color.GRAY);
        oldpass.setFont(new Font("Arial", Font.PLAIN, 11));
        oldpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                oldpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                oldpassFocusLost(evt);
            }
        });
        jPanel3.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 290, 30));

        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
        });
        jPanel3.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 20, 30));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show1MousePressed(evt);
            }
        });
        jPanel3.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 20, 30));

        newpass.setOpaque(false);
        newpass.setText(" Enter new password...");
        newpass.setEchoChar((char) 0);
        newpass.setForeground(Color.GRAY);
        newpass.setFont(new Font("Arial", Font.PLAIN, 11));
        newpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newpassFocusLost(evt);
            }
        });
        jPanel3.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 290, 30));

        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide2MousePressed(evt);
            }
        });
        jPanel3.add(hide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 20, 30));

        show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show2MousePressed(evt);
            }
        });
        jPanel3.add(show2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 20, 30));

        confirmpass.setOpaque(false);
        confirmpass.setText(" Confirm password...");
        confirmpass.setEchoChar((char) 0);
        confirmpass.setForeground(Color.GRAY);
        confirmpass.setFont(new Font("Arial", Font.PLAIN, 11));
        confirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpassFocusLost(evt);
            }
        });
        jPanel3.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 290, 30));

        main_panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 490, 280));

        add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
       
        try {
            dbConnector con = new dbConnector();
            Session sess = Session.getInstance(); // Use existing session
            Connection cn = con.getConnection();

            // Ensure connection is not null
            if (cn == null) {
                JOptionPane.showMessageDialog(null, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Debug: Print Session User ID
            System.out.println("Session User ID: " + sess.getUser_id());

            // Ensure session user ID is valid
            String userIdStr = sess.getUser_id();
            if (userIdStr == null || userIdStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Session user ID is missing!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int userId = Integer.parseInt(userIdStr); // Convert user ID safely

            // Retrieve input passwords
            String oldPasswordInput = oldpass.getText();
            String newPasswordInput = newpass.getText();
            String confirmPasswordInput = confirmpass.getText();

            // Check if new password and confirm password match
            if (!newPasswordInput.equals(confirmPasswordInput)) {
                JOptionPane.showMessageDialog(null, "New Password and Confirm Password do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Query to get the current password
            String query = "SELECT password FROM user WHERE user_id = ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String oldDbPass = rs.getString("password");

                // Verify old password before updating
                if (passwordHasher.verifyPassword(oldPasswordInput, oldDbPass)) { 
                    try {
                        String newHashedPass = passwordHasher.hashPassword(newPasswordInput);

                        // Update password securely
                        String updateQuery = "UPDATE user SET password = ? WHERE user_id = ?";
                        PreparedStatement updatePst = cn.prepareStatement(updateQuery);
                        updatePst.setString(1, newHashedPass);
                        updatePst.setInt(2, userId);

                        int rowsUpdated = updatePst.executeUpdate();
                        if (rowsUpdated > 0) {
                            JOptionPane.showMessageDialog(null, "Password successfully updated! Please log in again.");

                            // Clear session (log out user)
                            sess.setUser_id(null);

                            // Open login form **AFTER closing other windows**
                            login in = new login();

                            // Close all open frames and dialogs
                            for (Window window : Window.getWindows()) {
                                if (window instanceof JFrame || window instanceof JDialog) {
                                    window.dispose();  // Dispose both JFrame and JDialog
                                }
                            }

                            // Ensure login frame opens after all other windows close
                            SwingUtilities.invokeLater(() -> {
                                in.setVisible(true);
                            });
                        }
                        updatePst.close();
                    } catch (NoSuchAlgorithmException e) {
                        JOptionPane.showMessageDialog(null, "Password hashing error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Old Password is Incorrect");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close resources
            rs.close();
            pst.close();
            cn.close();

        } catch (SQLException | NumberFormatException | NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error! " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_save_buttonMouseClicked

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        hide.setVisible(true);
        show.setVisible(false);
        oldpass.setEchoChar('*');
    }//GEN-LAST:event_showMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        oldpass.setEchoChar((char) 0); 
    }//GEN-LAST:event_hideMousePressed

    private void oldpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldpassFocusGained
        if (oldpass.getText().equals(" Enter old password...")) {
            oldpass.setText("");
            oldpass.setEchoChar('*');
            oldpass.setForeground(Color.BLACK);
            oldpass.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        hide.setVisible(true);
        show.setVisible(false);
    }//GEN-LAST:event_oldpassFocusGained

    private void oldpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldpassFocusLost
        if (oldpass.getText().isEmpty()) {
            oldpass.setText(" Enter old password...");
            oldpass.setEchoChar((char) 0);
            oldpass.setForeground(Color.GRAY);
            oldpass.setFont(new Font("Arial", Font.PLAIN, 11));

            hide.setVisible(false);
            show.setVisible(false);
        }
    }//GEN-LAST:event_oldpassFocusLost

    private void show1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MousePressed
        hide1.setVisible(true);
        show1.setVisible(false);
        newpass.setEchoChar('*');
    }//GEN-LAST:event_show1MousePressed

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        show1.setVisible(true);
        hide1.setVisible(false);
        newpass.setEchoChar((char) 0); 
    }//GEN-LAST:event_hide1MousePressed

    private void show2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show2MousePressed
        hide2.setVisible(true);
        show2.setVisible(false);
        confirmpass.setEchoChar('*');
    }//GEN-LAST:event_show2MousePressed

    private void hide2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MousePressed
        show2.setVisible(true);
        hide2.setVisible(false);
        confirmpass.setEchoChar((char) 0); 
    }//GEN-LAST:event_hide2MousePressed

    private void newpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpassFocusLost
         if (newpass.getText().isEmpty()) {
            newpass.setText(" Enter new password...");
            newpass.setEchoChar((char) 0);
            newpass.setForeground(Color.GRAY);
            newpass.setFont(new Font("Arial", Font.PLAIN, 11));

            hide1.setVisible(false);
            show1.setVisible(false);
        }
    }//GEN-LAST:event_newpassFocusLost

    private void newpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpassFocusGained
        if (newpass.getText().equals(" Enter new password...")) {
            newpass.setText("");
            newpass.setEchoChar('*');
            newpass.setForeground(Color.BLACK);
            newpass.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        hide1.setVisible(true);
        show1.setVisible(false);
    }//GEN-LAST:event_newpassFocusGained

    private void confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusGained
        if (confirmpass.getText().equals(" Confirm password...")) {
            confirmpass.setText("");
            confirmpass.setEchoChar('*');
            confirmpass.setForeground(Color.BLACK);
            confirmpass.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        hide2.setVisible(true);
        show2.setVisible(false);
    }//GEN-LAST:event_confirmpassFocusGained

    private void confirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusLost
         if (confirmpass.getText().isEmpty()) {
            confirmpass.setText(" Confirm password...");
            confirmpass.setEchoChar((char) 0);
            confirmpass.setForeground(Color.GRAY);
            confirmpass.setFont(new Font("Arial", Font.PLAIN, 11));

            hide2.setVisible(false);
            show2.setVisible(false);
        }
    }//GEN-LAST:event_confirmpassFocusLost

    private void cancel_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_buttonMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancel_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel_button;
    private javax.swing.JLabel confirm_pass;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel curr_pass;
    private javax.swing.JPanel header_background;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel hide2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel new_pass;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JLabel save_button;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    private javax.swing.JLabel show2;
    // End of variables declaration//GEN-END:variables
}
