
package AdminInternalPage;

import FloatedPage.change_pass;
import config.Session;
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Profile extends javax.swing.JInternalFrame {
         
    public Profile() {
        initComponents();
            
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        label_role1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstname_input = new javax.swing.JTextField();
        lastname_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        update_button = new javax.swing.JLabel();
        change_pass = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 160));

        label_username.setText("@username");
        jPanel2.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        label_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_name.setText("                  Name");
        jPanel2.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 230, -1));

        label_role1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_role1.setText("Admin");
        jPanel2.add(label_role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 380));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("First Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 23, -1, -1));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstname_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname_inputActionPerformed(evt);
            }
        });
        jPanel4.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 280, 30));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastname_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname_inputActionPerformed(evt);
            }
        });
        jPanel4.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Username");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        username_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        username_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_inputActionPerformed(evt);
            }
        });
        jPanel4.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Email");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        email_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_inputActionPerformed(evt);
            }
        });
        jPanel4.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, 30));

        update_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update_button.setText("Update");
        update_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_buttonMouseClicked(evt);
            }
        });
        jPanel4.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        change_pass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        change_pass.setText("Change Password");
        change_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_passMouseClicked(evt);
            }
        });
        jPanel4.add(change_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 350, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session sess = Session.getInstance();
        String fullName = sess.getF_name() + " " + sess.getL_name(); // Add space between first and last name
        label_name.setHorizontalAlignment(SwingConstants.CENTER); // Center align text
        label_name.setText(fullName);
        
        label_username.setText("@"+sess.getUsername());
        
        firstname_input.setText(""+sess.getF_name());
        lastname_input.setText(""+sess.getL_name());
        username_input.setText(""+sess.getUsername());
        email_input.setText(""+sess.getEmail());  
    }//GEN-LAST:event_formInternalFrameActivated

    private void firstname_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname_inputActionPerformed

    private void lastname_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname_inputActionPerformed

    private void username_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_inputActionPerformed

    private void email_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_inputActionPerformed

    private void update_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseClicked
                                                 
        // Get updated values from input fields
        String newFirstName = firstname_input.getText();
        String newLastName = lastname_input.getText();
        String newUsername = username_input.getText();
        String newEmail = email_input.getText();

        // Get session instance
        Session sess = Session.getInstance();
        String userId = sess.getUser_id(); // Retrieve user_id

        // Debugging check
        System.out.println("User ID: " + userId); 
        if (userId == null || userId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: User ID is missing!");
            return;
        }

        // Update session data
        sess.setF_name(newFirstName);
        sess.setL_name(newLastName);
        sess.setUsername(newUsername);
        sess.setEmail(newEmail);

        // Update UI labels
        label_name.setText(newFirstName + " " + newLastName);
        label_username.setText("@" + newUsername);

        // Update database
        try {
            dbConnector con = new dbConnector();
            Connection conn = con.getConnection();

            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection failed.");
                return;
            }

            String sql = "UPDATE user SET f_name = ?, l_name = ?, username = ?, email = ? WHERE user_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, newFirstName);
            pst.setString(2, newLastName);
            pst.setString(3, newUsername);
            pst.setString(4, newEmail);

            // Check if user_id is an integer or string
            try {
                int userIdInt = Integer.parseInt(userId);
                pst.setInt(5, userIdInt);
            } catch (NumberFormatException e) {
                pst.setString(5, userId); // Use string if user_id is stored as varchar
            }

            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Profile updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update profile.");
            }

            pst.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_update_buttonMouseClicked

    private void change_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseClicked
        JDialog dialog = new JDialog(); // Create a floating window
        change_pass newPanel = new change_pass();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.setSize(500, 380); // Set the size of the window
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    }//GEN-LAST:event_change_passMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel change_pass;
    private javax.swing.JTextField email_input;
    private javax.swing.JTextField firstname_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_role1;
    private javax.swing.JLabel label_username;
    private javax.swing.JTextField lastname_input;
    private javax.swing.JLabel update_button;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
