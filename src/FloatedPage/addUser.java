
package FloatedPage;

import Authentication.register;
import com.mysql.jdbc.Statement;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import config.util;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class addUser extends javax.swing.JPanel {

    public addUser() {
        initComponents();
        check_icon.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        lastname_input = new Swing.TextField();
        firstname_input = new Swing.TextField();
        email_input = new Swing.TextField();
        check_icon = new javax.swing.JLabel();
        username_input = new Swing.TextField();
        password_input = new Swing.PasswordField();
        status = new Swing.Combobox();
        role = new Swing.Combobox();
        addButton = new Swing.Button();
        cancelButton = new javax.swing.JLabel();
        lastname_validation = new javax.swing.JLabel();
        firstname_validation = new javax.swing.JLabel();
        email_validation = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add User");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 210, 60));

        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Swing/eye_hide.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassMousePressed(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastname_input.setLabelText("Last Name");
        jPanel1.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 230, -1));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstname_input.setLabelText("First Name");
        firstname_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                firstname_inputMouseReleased(evt);
            }
        });
        jPanel1.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, -1));

        email_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email_input.setLabelText("Email");
        jPanel1.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 470, -1));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jPanel1.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        username_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username_input.setLabelText("Username");
        username_input.setOpaque(false);
        username_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_inputKeyReleased(evt);
            }
        });
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, -1));

        password_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password_input.setLabelText("Password");
        password_input.setOpaque(false);
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 470, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Approved", "Pending" }));
        status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        status.setLabeText("");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 230, -1));

        role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Staff" }));
        role.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        role.setLabeText("");
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, -1));

        addButton.setBackground(new java.awt.Color(51, 51, 51));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 90, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String fname = firstname_input.getText();
        String lname = lastname_input.getText();
        String uname = username_input.getText();
        String email = email_input.getText();
        String pass1 = password_input.getText();

        boolean Error = false;

        if(fname.isEmpty() || fname.equals(" Enter first name...")){
            Error = true;
            firstname_validation.setText("first Name is empty");
            firstname_validation.setForeground(Color.RED);
            firstname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(lname.isEmpty() || lname.equals(" Enter last name...")){
            Error = true;
            lastname_validation.setText("last Name is empty");
            lastname_validation.setForeground(Color.RED);
            lastname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(uname.isEmpty() || uname.equals(" Enter username...")){
            Error = true;
            username_validation.setText("username is empty");
            username_validation.setForeground(Color.RED);
            username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(email.isEmpty() || email.equals(" name@example.com")){
            Error = true;
            email_validation.setText("email is empty");
            email_validation.setForeground(Color.RED);
            email_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(pass1.isEmpty() || pass1.equals(" Create password...")){
            Error = true;
            password_validation.setText("Password is empty");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if (Error) {
            return;
        }

        // Validate email format
        if (!util.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            email_validation.setText("Invalid email format!");
            email_validation.setForeground(Color.RED);
            email_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            return;
        }
        // Validate password strength
        if (!util.isValidPassword(pass1)) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:"
                + "\n- One uppercase letter"
                + "\n- One lowercase letter"
                + "\n- One number"
                + "\n- One special character (@#$%^&+=!)",
                "Error", JOptionPane.ERROR_MESSAGE);
            password_validation.setText("Invalid!");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            return;
        }

        // Hash the password before storing it
        String hashedPassword;
        try {
            hashedPassword = passwordHasher.hashPassword(pass1);
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Password hashing error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        dbConnector con = new dbConnector();
        Connection cn = con.getConnection();

        try {
            if (util.isEmailExists(email)) {
                JOptionPane.showMessageDialog(this, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (util.isUsernameExists(uname)) {
                JOptionPane.showMessageDialog(this, "Username is already taken!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Insert new user and log the process correctly
            String insertQuery = "INSERT INTO user (f_name, l_name, username, email, role, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = cn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, uname);
                pst.setString(4, email);
                pst.setString(5, role.getSelectedItem().toString());
                pst.setString(6, hashedPassword);
                pst.setString(7, status.getSelectedItem().toString());

                int result = pst.executeUpdate();

                if (result > 0) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    int lastInsertedId = 0;
                    if (generatedKeys.next()) {
                        lastInsertedId = generatedKeys.getInt(1);
                    }

                    // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Added new user with ID " + lastInsertedId;
                    con.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                    JOptionPane.showMessageDialog(null, "User registered successfully!");

                    // Close the registration form (JDialog)
                    JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                    if (parentDialog != null) {
                        parentDialog.dispose();  // Closes the JDialog
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (cn != null) cn.close(); // Close database connection
            } catch (SQLException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void firstname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstname_inputMouseReleased
        firstname_validation.setText("");
    }//GEN-LAST:event_firstname_inputMouseReleased
    private boolean pass_visible = false;
    private void showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMousePressed
        pass_visible = !pass_visible;
        String currentText = password_input.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                password_input.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/images/hidePass.png")));
        } else {
            if (!currentText.equals("")) {
                password_input.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/images/showPass.png")));
        }
    }//GEN-LAST:event_showPassMousePressed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_addButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancelButtonMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button addButton;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel check_icon;
    private Swing.TextField email_input;
    private javax.swing.JLabel email_validation;
    private Swing.TextField firstname_input;
    private javax.swing.JLabel firstname_validation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private Swing.TextField lastname_input;
    private javax.swing.JLabel lastname_validation;
    private Swing.PasswordField password_input;
    private javax.swing.JLabel password_validation;
    private Swing.Combobox role;
    private Swing.RoundedPanel roundedPanel1;
    private javax.swing.JLabel showPass;
    private Swing.Combobox status;
    private Swing.TextField username_input;
    private javax.swing.JLabel username_validation;
    // End of variables declaration//GEN-END:variables
}
