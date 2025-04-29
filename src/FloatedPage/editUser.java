
package FloatedPage;

import Authentication.register;
import com.mysql.jdbc.Statement;
import config.Session;
import config.dbConnector;
import config.util;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class editUser extends javax.swing.JPanel {

    public editUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        lastname_input = new Swing.TextField();
        firstname_input = new Swing.TextField();
        email_input = new Swing.TextField();
        check_icon = new javax.swing.JLabel();
        username_input = new Swing.TextField();
        status = new Swing.Combobox();
        role = new Swing.Combobox();
        UpdateButton = new Swing.Button();
        cancelButton = new javax.swing.JLabel();
        lastname_validation = new javax.swing.JLabel();
        firstname_validation = new javax.swing.JLabel();
        email_validation = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();
        user_id = new Swing.TextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(516, 599));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundedPanel1.setForeground(new java.awt.Color(51, 51, 51));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update User");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 210, 60));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastname_input.setLabelText("Last Name");
        jPanel1.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 230, -1));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstname_input.setLabelText("First Name");
        firstname_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                firstname_inputMouseReleased(evt);
            }
        });
        jPanel1.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, -1));

        email_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email_input.setLabelText("Email");
        jPanel1.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 470, -1));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jPanel1.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        username_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username_input.setLabelText("Username");
        username_input.setOpaque(false);
        username_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_inputKeyReleased(evt);
            }
        });
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 470, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Approved", "Pending" }));
        status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        status.setLabeText("");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 230, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Staff" }));
        role.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        role.setLabeText("");
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, -1));

        UpdateButton.setBackground(new java.awt.Color(51, 51, 51));
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("Update");
        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseExited(evt);
            }
        });
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 90, 40));

        cancelButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, -1, -1));

        lastname_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lastname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 210, 10));

        firstname_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(firstname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, 10));

        email_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(email_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 210, 10));

        username_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 210, 10));

        password_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 210, 10));

        user_id.setEditable(false);
        user_id.setBackground(new java.awt.Color(255, 255, 255));
        user_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        user_id.setLabelText("ID");
        user_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                user_idMouseReleased(evt);
            }
        });
        jPanel1.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstname_inputMouseReleased
        firstname_validation.setText("");
    }//GEN-LAST:event_firstname_inputMouseReleased

    private void username_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_inputKeyReleased
        try {
            dbConnector con = new dbConnector();
            String uname = username_input.getText().trim();

            if (uname.isEmpty()) {
                check_icon.setVisible(false);
                username_validation.setText("");
                username_input.setForeground(Color.BLACK);
                return;
            }

            if (uname.length() < 5) {
                username_validation.setText("Username must be at least 5 characters long");
                username_input.setForeground(Color.RED);
                username_validation.setForeground(Color.RED);
                username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
                check_icon.setVisible(false);
                return;
            } else {
                username_validation.setText("");
            }

            String query = "SELECT username FROM user WHERE username = ?";
            try (PreparedStatement ps = con.getConnection().prepareStatement(query)) {
                ps.setString(1, uname);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        username_input.setForeground(Color.RED);
                        check_icon.setVisible(false);
                        username_validation.setText("Username is already taken");
                        username_validation.setForeground(Color.RED);
                        username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
                    } else {
                        username_input.setForeground(Color.GREEN);
                        check_icon.setVisible(true);
                        username_validation.setText("");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(""+ e);
        }
    }//GEN-LAST:event_username_inputKeyReleased

    private void UpdateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseEntered
        UpdateButton.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_UpdateButtonMouseEntered

    private void UpdateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseExited
        UpdateButton.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_UpdateButtonMouseExited

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String fname = firstname_input.getText();
        String lname = lastname_input.getText();
        String uname = username_input.getText();
        String email = email_input.getText();  

        if(fname.isEmpty() || fname.equals("Enter first name...")){
            firstname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            firstname_validation.setText("first Name is empty");
            firstname_validation.setForeground(Color.RED);
            firstname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(lname.isEmpty() || lname.equals("Enter last name...")){
            lastname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            lastname_validation.setText("last Name is empty");
            lastname_validation.setForeground(Color.RED);
            lastname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(uname.isEmpty() || uname.equals("Enter username...")){
            username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            username_validation.setText("username is empty");
            username_validation.setForeground(Color.RED);
            username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(email.isEmpty() || email.equals("name@example.com")){
            email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            email_validation.setText("email is empty");
            email_validation.setForeground(Color.RED);
            email_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

         // Validate email format
        if (!util.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            email_validation.setText("Invalid email format!");
            email_validation.setForeground(Color.RED);
            email_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            return;
        } 
       
        dbConnector con = new dbConnector();
        Connection cn = con.getConnection();

        try {
            // Check if email already exists (excluding current user)
            String checkEmailSql = "SELECT COUNT(*) FROM user WHERE email = ? AND user_id != ?";
            try (PreparedStatement emailPst = cn.prepareStatement(checkEmailSql)) {
                emailPst.setString(1, email_input.getText());
                emailPst.setString(2, user_id.getText());  // Exclude current user
                ResultSet rsEmail = emailPst.executeQuery();
                if (rsEmail.next() && rsEmail.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Check if username already exists (excluding current user)
            String checkUsernameSql = "SELECT COUNT(*) FROM user WHERE username = ? AND user_id != ?";
            try (PreparedStatement usernamePst = cn.prepareStatement(checkUsernameSql)) {
                usernamePst.setString(1, username_input.getText());
                usernamePst.setString(2, user_id.getText());  // Exclude current user
                ResultSet rsUsername = usernamePst.executeQuery();
                if (rsUsername.next() && rsUsername.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Username is already taken!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Update user details using PreparedStatement and logs the process
            int lastInsertedId = 0;  
            String updateSql = "UPDATE user SET f_name = ?, l_name = ?, username = ?, email = ?, role = ?, status = ? WHERE user_id = ?";
            try (PreparedStatement pst = cn.prepareStatement(updateSql, Statement.RETURN_GENERATED_KEYS)) {
                pst.setString(1, firstname_input.getText());
                pst.setString(2, lastname_input.getText());
                pst.setString(3, username_input.getText());
                pst.setString(4, email_input.getText());
                pst.setString(5, role.getSelectedItem().toString());
                pst.setString(6, status.getSelectedItem().toString());
                pst.setString(7, user_id.getText());
 
                int rowsUpdated = pst.executeUpdate();
                
                if (rowsUpdated > 0) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    Session sess = Session.getInstance();
                    if (generatedKeys.next()){
                        lastInsertedId = generatedKeys.getInt(1);
                    }
                    
                    // Logging the action
                    String action = "Update user with ID " +user_id.getText();
                    con.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('"+sess.getUser_id()+"', '"+action+"', CURRENT_TIMESTAMP)");
                    JOptionPane.showMessageDialog(null, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                    if (parentDialog != null) {
                        parentDialog.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No user found with the given ID!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void user_idMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_idMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button UpdateButton;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel check_icon;
    public Swing.TextField email_input;
    private javax.swing.JLabel email_validation;
    public Swing.TextField firstname_input;
    private javax.swing.JLabel firstname_validation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public Swing.TextField lastname_input;
    private javax.swing.JLabel lastname_validation;
    private javax.swing.JLabel password_validation;
    public Swing.Combobox role;
    private Swing.RoundedPanel roundedPanel1;
    public Swing.Combobox status;
    public Swing.TextField user_id;
    public Swing.TextField username_input;
    private javax.swing.JLabel username_validation;
    // End of variables declaration//GEN-END:variables
}
