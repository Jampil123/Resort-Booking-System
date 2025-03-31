
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
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class add_user extends javax.swing.JPanel {

    public add_user() {
        initComponents();
        check_icon.setVisible(false);
        
        hide.setVisible(false);
        show.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(300, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 15, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 15, 30));

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
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 290, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        status.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        email_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        email_input.setForeground(new java.awt.Color(153, 153, 153));
        email_input.setText(" name@example.com");
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
        jPanel1.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 290, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        username_input.setBackground(new java.awt.Color(51, 51, 51));
        username_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setText(" Enter username...");
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
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Username");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lastname_input.setForeground(new java.awt.Color(153, 153, 153));
        lastname_input.setText(" Enter last name...");
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
        jPanel1.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        firstname_input.setForeground(new java.awt.Color(153, 153, 153));
        firstname_input.setText(" Enter first name...");
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
        jPanel1.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

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
        jPanel1.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 90, 10));
        jPanel1.add(firstname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 90, 10));
        jPanel1.add(lastname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 88, 10));
        jPanel1.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 90, 10));
        jPanel1.add(email_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 70, 10));
        jPanel1.add(email_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, 10));
        jPanel1.add(password_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 40, 10));
        jPanel1.add(username_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, 10));
        jPanel1.add(username_validation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 10));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jPanel1.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 10, 10));

        role.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 130, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Role");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Create User");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void firstname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusGained
        if (firstname_input.getText().equals(" Enter first name...")) {
            firstname_input.setText("");
            firstname_input.setFont(new Font("Arial", Font.PLAIN, 12));
            firstname_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_firstname_inputFocusGained

    private void firstname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusLost
        if (firstname_input.getText().isEmpty()) {
            firstname_input.setText(" Enter first name...");
            firstname_input.setFont(new Font("Arial", Font.PLAIN, 11));
            firstname_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_firstname_inputFocusLost

    private void firstname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstname_inputMouseReleased
        firstname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstname_validation.setText("");
    }//GEN-LAST:event_firstname_inputMouseReleased

    private void lastname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusGained
        if (lastname_input.getText().equals(" Enter last name...")) {
            lastname_input.setText("");
            lastname_input.setFont(new Font("Arial", Font.PLAIN, 12));
            lastname_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lastname_inputFocusGained

    private void lastname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusLost
        if (lastname_input.getText().isEmpty()) {
            lastname_input.setText(" Enter last name...");
            lastname_input.setFont(new Font("Arial", Font.PLAIN, 11));
            lastname_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_lastname_inputFocusLost

    private void lastname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastname_inputMouseReleased
        lastname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastname_validation.setText("");
    }//GEN-LAST:event_lastname_inputMouseReleased

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        if (username_input.getText().equals(" Enter username...")) {
            username_input.setText("");
            username_input.setFont(new Font("Arial", Font.PLAIN, 12));
            username_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_username_inputFocusGained

    private void username_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusLost
        if (username_input.getText().isEmpty()) {
            username_input.setText(" Enter username...");
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
                username_validation1.setText("");
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
            System.out.println(""+ e);
        }
    }//GEN-LAST:event_username_inputKeyReleased

    private void email_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusGained
        if (email_input.getText().equals(" name@example.com")) {
            email_input.setText("");
            email_input.setFont(new Font("Arial", Font.PLAIN, 12));
            email_input.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_email_inputFocusGained

    private void email_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusLost
        if (email_input.getText().isEmpty()) {
            email_input.setText(" name@example.com");
            email_input.setFont(new Font("Arial", Font.PLAIN, 11));
            email_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_email_inputFocusLost

    private void email_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_inputMouseReleased
        email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_validation.setText("");
        email_validation1.setText("");
    }//GEN-LAST:event_email_inputMouseReleased

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        if (password_input.getText().equals(" Create password...")) {
            password_input.setText("");
            password_input.setEchoChar('*');
            password_input.setForeground(Color.BLACK);
            password_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        hide.setVisible(true);
        show.setVisible(false);
    }//GEN-LAST:event_password_inputFocusGained

    private void password_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusLost
        if (password_input.getText().isEmpty()) {
            password_input.setText(" Create password...");
            password_input.setEchoChar((char) 0);
            password_input.setForeground(Color.GRAY);
            password_input.setFont(new Font("Arial", Font.PLAIN, 11));

            hide.setVisible(false);
            show.setVisible(false);
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
        
        boolean Error = false;
      
        if(fname.isEmpty() || fname.equals(" Enter first name...")){        
            firstname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            Error = true;
            firstname_validation.setText("first Name is empty");
            firstname_validation.setForeground(Color.RED);
            firstname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
            
        if(lname.isEmpty() || lname.equals(" Enter last name...")){
            lastname_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            Error = true;
            lastname_validation.setText("last Name is empty");
            lastname_validation.setForeground(Color.RED);
            lastname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
            
        if(uname.isEmpty() || uname.equals(" Enter username...")){
            username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            Error = true;
            username_validation.setText("username is empty");
            username_validation.setForeground(Color.RED);
            username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(email.isEmpty() || email.equals(" name@example.com")){
            email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            Error = true;
            email_validation.setText("email is empty");
            email_validation.setForeground(Color.RED);
            email_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(pass1.isEmpty() || pass1.equals(" Create password...")){
            password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
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
            email_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            email_validation1.setText("Invalid email format!");
            email_validation1.setForeground(Color.RED);
            email_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
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
            password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            password_validation1.setText("Invalid!");
            password_validation1.setForeground(Color.RED);
            password_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
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
    }//GEN-LAST:event_save_buttonMouseClicked

    private void cancel_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_buttonMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancel_buttonMouseClicked

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        password_input.setEchoChar((char) 0); 
    }//GEN-LAST:event_hideMousePressed

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        hide.setVisible(true);
        show.setVisible(false);
        password_input.setEchoChar('*'); 
    }//GEN-LAST:event_showMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel_button;
    private javax.swing.JLabel check_icon;
    public javax.swing.JTextField email_input;
    private javax.swing.JLabel email_validation;
    private javax.swing.JLabel email_validation1;
    public javax.swing.JTextField firstname_input;
    private javax.swing.JLabel firstname_validation;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lastname_input;
    private javax.swing.JLabel lastname_validation;
    public javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_validation;
    private javax.swing.JLabel password_validation1;
    public javax.swing.JComboBox<String> role;
    private javax.swing.JLabel save_button;
    private javax.swing.JLabel show;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    private javax.swing.JLabel username_validation1;
    private javax.swing.JLabel username_validation2;
    // End of variables declaration//GEN-END:variables
}
