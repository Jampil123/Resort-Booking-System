/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloatedPage;

import Authentication.register;
import config.dbConnector;
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

/**
 *
 * @author Esconde
 */
public class add_user extends javax.swing.JPanel {

    public add_user() {
        initComponents();
        check_icon.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        password_input = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastname_input = new javax.swing.JTextField();
        firstname_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancel_button = new javax.swing.JLabel();
        save_button = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();
        firstname_validation = new javax.swing.JLabel();
        lastname_validation = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        email_validation = new javax.swing.JLabel();
        email_validation1 = new javax.swing.JLabel();
        password_validation1 = new javax.swing.JLabel();
        username_validation1 = new javax.swing.JLabel();
        username_validation2 = new javax.swing.JLabel();
        check_icon = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(300, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        password_input.setForeground(new java.awt.Color(153, 153, 153));
        password_input.setText(" Create password...");
        password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        password_input.setEchoChar('\u0000');
        password_input.setOpaque(false);
        password_input.setText(" Create password...");
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
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 290, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        status.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 140, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        email_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        email_input.setForeground(new java.awt.Color(153, 153, 153));
        email_input.setText("name@example.com");
        email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_inputFocusLost(evt);
            }
        });
        email_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                email_inputMouseReleased(evt);
            }
        });
        jPanel1.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 290, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        username_input.setBackground(new java.awt.Color(51, 51, 51));
        username_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setText("Enter username...");
        username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        username_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                username_inputKeyReleased(evt);
            }
        });
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 290, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lastname_input.setForeground(new java.awt.Color(153, 153, 153));
        lastname_input.setText("Enter last name...");
        lastname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastname_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastname_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastname_inputFocusLost(evt);
            }
        });
        lastname_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lastname_inputMouseReleased(evt);
            }
        });
        lastname_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname_inputActionPerformed(evt);
            }
        });
        jPanel1.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        firstname_input.setForeground(new java.awt.Color(204, 204, 204));
        firstname_input.setText("Enter first name...");
        firstname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstname_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstname_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstname_inputFocusLost(evt);
            }
        });
        firstname_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                firstname_inputMouseReleased(evt);
            }
        });
        firstname_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname_inputActionPerformed(evt);
            }
        });
        jPanel1.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Create User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cancel_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(cancel_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        save_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        save_button.setText("Save");
        save_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_buttonMouseClicked(evt);
            }
        });
        jPanel1.add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));
        jPanel1.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 80, 10));
        jPanel1.add(firstname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 10));
        jPanel1.add(lastname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 90, 10));
        jPanel1.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, 10));
        jPanel1.add(email_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 70, 10));
        jPanel1.add(email_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 90, 10));
        jPanel1.add(password_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 40, 10));
        jPanel1.add(username_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, 10));
        jPanel1.add(username_validation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, 10));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jPanel1.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 10, 10));

        role.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 140, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Role");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void firstname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusGained
        if (firstname_input.getText().equals("Enter first name...")) {
            firstname_input.setText("");
            firstname_input.setFont(new Font("Arial", Font.PLAIN, 12));
            firstname_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_firstname_inputFocusGained

    private void firstname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusLost
        if (firstname_input.getText().isEmpty()) {
            firstname_input.setText("Enter first name...");
            firstname_input.setFont(new Font("Arial", Font.PLAIN, 11));
            firstname_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_firstname_inputFocusLost

    private void firstname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstname_inputMouseReleased
        firstname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstname_validation.setText("");
    }//GEN-LAST:event_firstname_inputMouseReleased

    private void lastname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusGained
        if (lastname_input.getText().equals("Enter last name...")) {
            lastname_input.setText("");
            lastname_input.setFont(new Font("Arial", Font.PLAIN, 12));
            lastname_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lastname_inputFocusGained

    private void lastname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusLost
        if (lastname_input.getText().isEmpty()) {
            lastname_input.setText("Enter last name...");
            lastname_input.setFont(new Font("Arial", Font.PLAIN, 11));
            lastname_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_lastname_inputFocusLost

    private void lastname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastname_inputMouseReleased
        lastname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastname_validation.setText("");
    }//GEN-LAST:event_lastname_inputMouseReleased

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        if (username_input.getText().equals("Enter username...")) {
            username_input.setText("");
            username_input.setFont(new Font("Arial", Font.PLAIN, 12));
            username_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_username_inputFocusGained

    private void username_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusLost
        if (username_input.getText().isEmpty()) {
            username_input.setText("Enter username...");
            username_input.setFont(new Font("Arial", Font.PLAIN, 11));
            username_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_username_inputFocusLost

    private void username_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_inputMouseReleased
        username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        username_validation.setText("");
    }//GEN-LAST:event_username_inputMouseReleased

    private void username_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_inputKeyReleased
        try {
            dbConnector con = new dbConnector();
            String uname = username_input.getText().trim();

            if (uname.isEmpty()) {
                check_icon.setVisible(false);
                username_validation1.setText("");
                username_validation2.setText("");
                username_input.setForeground(Color.BLACK);
                return;
            }

            if (uname.length() < 5) {
                username_validation2.setText("Username must be at least 5 characters long");
                username_validation2.setForeground(Color.RED);
                username_validation2.setFont(new Font("Arial", Font.PLAIN, 9));
                check_icon.setVisible(false);
                return;
            } else {
                username_validation2.setText("");
            }

            String query = "SELECT username FROM user WHERE username = ?";
            try (PreparedStatement ps = con.getConnection().prepareStatement(query)) {
                ps.setString(1, uname);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        username_input.setForeground(Color.RED);
                        check_icon.setVisible(false);
                        username_validation1.setText("Username is already taken");
                        username_validation1.setForeground(Color.RED);
                        username_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
                    } else {
                        username_input.setForeground(Color.GREEN);
                        check_icon.setVisible(true);
                        username_validation1.setText("");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Better for debugging
        }
    }//GEN-LAST:event_username_inputKeyReleased

    private void email_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusGained
        if (email_input.getText().equals("name@example.com")) {
            email_input.setText("");
            email_input.setFont(new Font("Arial", Font.PLAIN, 12));
            email_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_email_inputFocusGained

    private void email_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusLost
        if (email_input.getText().isEmpty()) {
            email_input.setText("name@example.com");
            email_input.setFont(new Font("Arial", Font.PLAIN, 11));
            email_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_email_inputFocusLost

    private void email_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_inputMouseReleased
          email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_validation.setText("");
//        email_validation1.setText("");
    }//GEN-LAST:event_email_inputMouseReleased

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        if (password_input.getText().equals(" Create password...")) {
            password_input.setText("");
            password_input.setEchoChar('*');
            password_input.setForeground(Color.BLACK);
            password_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
//        show_pass.setVisible(true);
//        hide_pass.setVisible(false);
    }//GEN-LAST:event_password_inputFocusGained

    private void password_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusLost
        if (password_input.getText().isEmpty()) {
            password_input.setText(" Create password...");
            password_input.setEchoChar((char) 0);
            password_input.setForeground(Color.GRAY);
            password_input.setFont(new Font("Arial", Font.PLAIN, 11));
//
//            show_pass.setVisible(false);
//            hide_pass.setVisible(false);
        }
    }//GEN-LAST:event_password_inputFocusLost

    private void password_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_inputMouseReleased
          password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));//        password_validation.setText("");
        password_validation.setText("");
    }//GEN-LAST:event_password_inputMouseReleased

    private void firstname_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname_inputActionPerformed

    private void lastname_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname_inputActionPerformed

    private void save_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_buttonMouseClicked
        String fname = firstname_input.getText();
        String lname = lastname_input.getText();
        String uname = username_input.getText();
        String email = email_input.getText();
        String pass1 = password_input.getText();
           
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

        if(pass1.isEmpty() || pass1.equals(" Create password...")){
            password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            password_validation.setText("Password is empty");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        // Validate email format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!email.matches(emailRegex)) {          
            email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
           email_validation1.setText("Invalid email format!");
           email_validation1.setForeground(Color.RED);
           email_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
           return;
        } 
       
        // Validate password strength
            String password = password_input.getText();
            String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        if (!password.matches(passwordRegex)) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:"
                    + "\n- One uppercase letter"
                    + "\n- One lowercase letter"
                    + "\n- One number"
                    + "\n- One special character (@#$%^&+=!)", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            
            password_validation1.setText("Invalid!");
            password_validation1.setForeground(Color.RED);
            password_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
            return;
        }
        
        dbConnector con = new dbConnector();
        Connection cn = con.getConnection();
        
        try{
            
            // Check if email already exists**
            String checkEmailSql = "SELECT COUNT(*) FROM user WHERE email = ?";
            try (PreparedStatement emailPst = cn.prepareStatement(checkEmailSql)) {
                emailPst.setString(1, email);
                ResultSet rsEmail = emailPst.executeQuery();
                if (rsEmail.next() && rsEmail.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            // Check if username is already exists**
            String query = "SELECT * FROM user WHERE username = ?";
            try (PreparedStatement ps = con.getConnection().prepareStatement(query)){
                
                ps.setString(1, uname);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) { 
                    JOptionPane.showMessageDialog(null, "Username is already taken!", "Error", JOptionPane.ERROR_MESSAGE);
                    return; 
                }
                rs.close();
                ps.close();
            }
            
            // Insert into database
            int result = con.InsertData("INSERT INTO user (f_name, l_name, username, email, role, password, status) "
                    + "VALUES('"+firstname_input.getText()+"',"
                    + "'"+lastname_input.getText()+"',"
                    + "'"+username_input.getText()+"',"
                    + "'"+email_input.getText()+"',"
                    + "'"+role.getSelectedItem()+"',"
                    + "'"+password_input.getText()+"',"
                    + "'"+status.getSelectedItem()+"' )");
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                
                JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                if (parentDialog != null) {
                    parentDialog.dispose();  // Closes the JDialog
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (cn != null) cn.close(); // Ensure connection is closed
            } catch (SQLException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_save_buttonMouseClicked

    private void cancel_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_buttonMouseClicked
    
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancel_buttonMouseClicked

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel_button;
    private javax.swing.JLabel check_icon;
    public javax.swing.JTextField email_input;
    private javax.swing.JLabel email_validation;
    private javax.swing.JLabel email_validation1;
    public javax.swing.JTextField firstname_input;
    private javax.swing.JLabel firstname_validation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField lastname_input;
    private javax.swing.JLabel lastname_validation;
    public javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_validation;
    private javax.swing.JLabel password_validation1;
    public javax.swing.JComboBox<String> role;
    private javax.swing.JLabel save_button;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    private javax.swing.JLabel username_validation1;
    private javax.swing.JLabel username_validation2;
    // End of variables declaration//GEN-END:variables
}
