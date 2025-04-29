
package Authentication;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class register extends javax.swing.JFrame {
    
    public register() {
        initComponents();
       
        hide_pass.setVisible(false);
        show_pass.setVisible(false);
        hide_pass1.setVisible(false);
        show_pass1.setVisible(false);
        check_icon.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rigester_panel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        show_pass1 = new javax.swing.JLabel();
        hide_pass1 = new javax.swing.JLabel();
        confirmpassword_input = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        firstname_input = new javax.swing.JTextField();
        lastname_input = new javax.swing.JTextField();
        check_icon = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        hide_pass = new javax.swing.JLabel();
        show_pass = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        signin = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        lastname_validation = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        firstname_validation = new javax.swing.JLabel();
        confirmpassword_validation = new javax.swing.JLabel();
        email_validation = new javax.swing.JLabel();
        password_validation = new javax.swing.JLabel();
        username_validation1 = new javax.swing.JLabel();
        email_validation1 = new javax.swing.JLabel();
        password_validation1 = new javax.swing.JLabel();
        confirmpassword_validation1 = new javax.swing.JLabel();
        username_validation2 = new javax.swing.JLabel();
        signupButton = new Swing.Button();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rigester_panel.setBackground(new java.awt.Color(51, 51, 51));
        rigester_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("REGISTER");
        rigester_panel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 40));

        email_input.setBackground(new java.awt.Color(51, 51, 51));
        email_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        email_input.setForeground(new java.awt.Color(153, 153, 153));
        email_input.setText("name@example.com");
        email_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        email_input.setCaretColor(new java.awt.Color(255, 255, 255));
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
        rigester_panel.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 70));

        role.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        rigester_panel.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 270, 60));

        show_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        show_pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_pass1MousePressed(evt);
            }
        });
        rigester_panel.add(show_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, 60));

        hide_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_pass1MousePressed(evt);
            }
        });
        rigester_panel.add(hide_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, 60));

        confirmpassword_input.setBackground(new java.awt.Color(51, 51, 51));
        confirmpassword_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        confirmpassword_input.setForeground(new java.awt.Color(153, 153, 153));
        confirmpassword_input.setText(" Confirm password...");
        confirmpassword_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        confirmpassword_input.setCaretColor(new java.awt.Color(255, 255, 255));
        confirmpassword_input.setEchoChar('\u0000');
        confirmpassword_input.setOpaque(false);
        confirmpassword_input.setText(" Confirm password...");
        confirmpassword_input.setEchoChar((char) 0);
        confirmpassword_input.setForeground(Color.GRAY);
        confirmpassword_input.setFont(new Font("Arial", Font.PLAIN, 11));
        confirmpassword_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassword_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpassword_inputFocusLost(evt);
            }
        });
        confirmpassword_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmpassword_inputMouseReleased(evt);
            }
        });
        confirmpassword_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassword_inputActionPerformed(evt);
            }
        });
        rigester_panel.add(confirmpassword_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 260, 70));
        rigester_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        firstname_input.setBackground(new java.awt.Color(51, 51, 51));
        firstname_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstname_input.setForeground(new java.awt.Color(153, 153, 153));
        firstname_input.setText("Enter first name...");
        firstname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        firstname_input.setCaretColor(new java.awt.Color(255, 255, 255));
        firstname_input.setCaretPosition(18);
        firstname_input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstname_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstname_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstname_inputFocusLost(evt);
            }
        });
        firstname_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstname_inputMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                firstname_inputMouseReleased(evt);
            }
        });
        rigester_panel.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 70));

        lastname_input.setBackground(new java.awt.Color(51, 51, 51));
        lastname_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastname_input.setForeground(new java.awt.Color(153, 153, 153));
        lastname_input.setText("Enter last name...");
        lastname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        lastname_input.setCaretColor(new java.awt.Color(255, 255, 255));
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
        rigester_panel.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 70));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        rigester_panel.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 20, 60));

        username_input.setBackground(new java.awt.Color(51, 51, 51));
        username_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setText("Enter username...");
        username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        username_input.setCaretColor(new java.awt.Color(255, 255, 255));
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
        rigester_panel.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 70));

        hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passMousePressed(evt);
            }
        });
        rigester_panel.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 60));

        show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_passMousePressed(evt);
            }
        });
        rigester_panel.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 60));

        password_input.setBackground(new java.awt.Color(51, 51, 51));
        password_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password_input.setForeground(new java.awt.Color(153, 153, 153));
        password_input.setText(" Create password...");
        password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        password_input.setCaretColor(new java.awt.Color(255, 255, 255));
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
        rigester_panel.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 270, 70));

        signin.setBackground(new java.awt.Color(255, 0, 51));
        signin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 51, 51));
        signin.setText("Click here to Sign in");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
        });
        rigester_panel.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 120, -1));

        text.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("Already have an account?");
        rigester_panel.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, -1, -1));
        rigester_panel.add(lastname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 90, 10));
        rigester_panel.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, 10));
        rigester_panel.add(firstname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 10));
        rigester_panel.add(confirmpassword_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 120, 10));
        rigester_panel.add(email_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, 10));
        rigester_panel.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 80, 10));
        rigester_panel.add(username_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, 10));
        rigester_panel.add(email_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 90, 10));
        rigester_panel.add(password_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 40, 10));
        rigester_panel.add(confirmpassword_validation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 40, 10));
        rigester_panel.add(username_validation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 10));

        signupButton.setBackground(new java.awt.Color(30, 100, 255));
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign up");
        signupButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupButtonMouseExited(evt);
            }
        });
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        rigester_panel.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 180, 60));

        getContentPane().add(rigester_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 600, 700));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 300, 290));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        login li = new login();
        li.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinMouseClicked

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        if (password_input.getText().equals(" Create password...")) {
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
            password_input.setText(" Create password...");
            password_input.setEchoChar((char) 0); 
            password_input.setForeground(Color.GRAY);
            password_input.setFont(new Font("Arial", Font.PLAIN, 11));
      
            show_pass.setVisible(false);
            hide_pass.setVisible(false);
        }
    }//GEN-LAST:event_password_inputFocusLost

    private void confirmpassword_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassword_inputFocusGained
        if (confirmpassword_input.getText().equals(" Confirm password...")) {
            confirmpassword_input.setText("");
            confirmpassword_input.setEchoChar('*'); 
            confirmpassword_input.setForeground(Color.WHITE);
            confirmpassword_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        show_pass1.setVisible(false);  
        hide_pass1.setVisible(true);
    }//GEN-LAST:event_confirmpassword_inputFocusGained

    private void confirmpassword_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassword_inputFocusLost
        if (confirmpassword_input.getText().isEmpty()) {
            confirmpassword_input.setText(" Confirm password...");
            confirmpassword_input.setEchoChar((char) 0);
            confirmpassword_input.setForeground(Color.GRAY);
            confirmpassword_input.setFont(new Font("Arial", Font.PLAIN, 11));

            show_pass1.setVisible(false);
            hide_pass1.setVisible(false);
        }
    }//GEN-LAST:event_confirmpassword_inputFocusLost

    private void firstname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusGained
        if (firstname_input.getText().equals("Enter first name...")) {
            firstname_input.setText("");
            firstname_input.setFont(new Font("Arial", Font.PLAIN, 12));
            firstname_input.setForeground(Color.WHITE); 
        }
    }//GEN-LAST:event_firstname_inputFocusGained

    private void firstname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusLost
        if (firstname_input.getText().isEmpty()) {
            firstname_input.setText("Enter first name...");
            firstname_input.setFont(new Font("Arial", Font.PLAIN, 11));
            firstname_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_firstname_inputFocusLost

    private void lastname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusGained
        if (lastname_input.getText().equals("Enter last name...")) {
            lastname_input.setText("");
            lastname_input.setFont(new Font("Arial", Font.PLAIN, 12));
            lastname_input.setForeground(Color.WHITE); 
        }
    }//GEN-LAST:event_lastname_inputFocusGained

    private void lastname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusLost
        if (lastname_input.getText().isEmpty()) {
            lastname_input.setText("Enter last name...");
            lastname_input.setFont(new Font("Arial", Font.PLAIN, 11));
            lastname_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_lastname_inputFocusLost

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        if (username_input.getText().equals("Enter username...")) {
            username_input.setText("");
            username_input.setFont(new Font("Arial", Font.PLAIN, 12));
            username_input.setForeground(Color.WHITE); 
        }
    }//GEN-LAST:event_username_inputFocusGained

    private void username_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusLost
        if (username_input.getText().isEmpty()) {
            username_input.setText("Enter username...");
            username_input.setFont(new Font("Arial", Font.PLAIN, 11));
            username_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_username_inputFocusLost

    private void email_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusGained
        if (email_input.getText().equals("name@example.com")) {
            email_input.setText("");
            email_input.setFont(new Font("Arial", Font.PLAIN, 12));
            email_input.setForeground(Color.WHITE); 
        }
    }//GEN-LAST:event_email_inputFocusGained

    private void email_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusLost
        if (email_input.getText().isEmpty()) {
           email_input.setText("name@example.com");
            email_input.setFont(new Font("Arial", Font.PLAIN, 11));
            email_input.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_email_inputFocusLost

    private void confirmpassword_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassword_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassword_inputActionPerformed

    private void firstname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstname_inputMouseReleased
        firstname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
        firstname_validation.setText("");
    }//GEN-LAST:event_firstname_inputMouseReleased

    private void lastname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastname_inputMouseReleased
        lastname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
        lastname_validation.setText("");
    }//GEN-LAST:event_lastname_inputMouseReleased

    private void username_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_inputMouseReleased
        username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
        username_validation.setText("");
    }//GEN-LAST:event_username_inputMouseReleased

    private void email_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_inputMouseReleased
        email_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
        email_validation.setText("");
        email_validation1.setText("");
    }//GEN-LAST:event_email_inputMouseReleased

    private void password_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_inputMouseReleased
        password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
        password_validation.setText("");
        password_validation1.setText("");
    }//GEN-LAST:event_password_inputMouseReleased

    private void confirmpassword_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmpassword_inputMouseReleased
        confirmpassword_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
        confirmpassword_validation.setText("");
        confirmpassword_validation1.setText("");
    }//GEN-LAST:event_confirmpassword_inputMouseReleased

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

    private void hide_pass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_pass1MousePressed
        show_pass1.setVisible(true);
        hide_pass1.setVisible(false);
        confirmpassword_input.setEchoChar((char) 0); 
    }//GEN-LAST:event_hide_pass1MousePressed

    private void show_pass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_pass1MousePressed
        hide_pass1.setVisible(true);
        show_pass1.setVisible(false);
        confirmpassword_input.setEchoChar('*'); 
    }//GEN-LAST:event_show_pass1MousePressed

    private void username_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_inputKeyReleased
        try {
            dbConnector con = new dbConnector();
            String uname = username_input.getText().trim();

            if (uname.isEmpty()) {
                check_icon.setVisible(false);
                username_validation1.setText("");
                username_validation2.setText("");
                username_input.setForeground(Color.WHITE);
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
            e.printStackTrace(); // Better for debugging
        }     
    }//GEN-LAST:event_username_inputKeyReleased

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
       String fname = firstname_input.getText();
        String lname = lastname_input.getText();
        String uname = username_input.getText();
        String email = email_input.getText();
        String pass1 = password_input.getText();
        String pass2 = confirmpassword_input.getText();
        
        boolean Error = false;
     
        if(fname.isEmpty() || fname.equals("Enter first name...")){          
            firstname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            Error = true;
            firstname_validation.setText("first Name is empty");
            firstname_validation.setForeground(Color.RED);
            firstname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
            
        if(lname.isEmpty() || lname.equals("Enter last name...")){
            lastname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            Error = true;
            lastname_validation.setText("last Name is empty");
            lastname_validation.setForeground(Color.RED);
            lastname_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
            
        if(uname.isEmpty() || uname.equals("Enter username...")){
            username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Username Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            Error = true;
            username_validation.setText("username is empty");
            username_validation.setForeground(Color.RED);
            username_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(email.isEmpty() || email.equals("name@example.com")){
            email_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            Error = true;
            email_validation.setText("email is empty");
            email_validation.setForeground(Color.RED);
            email_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(pass1.isEmpty() || pass1.equals(" Create password...")){
            password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            Error = true;
            password_validation.setText("Password is empty");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }

        if(pass2.isEmpty() || pass2.equals(" Confirm password...")){
            confirmpassword_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            Error = true;
            confirmpassword_validation.setText("confirm password is empty");
            confirmpassword_validation.setForeground(Color.RED);
            confirmpassword_validation.setFont(new Font("Arial", Font.PLAIN, 9));
        }
        
        if (Error) {         
        return;
        }
        
        // Validate email format
       if (!util.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            email_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            email_validation1.setText("Invalid email format!");
            email_validation1.setForeground(Color.RED);
            email_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
            return;
        } 
        
        // Validate password match
       if (!password_input.getText().equals(confirmpassword_input.getText())) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            password_validation.setText("Passwords do not match!");
            password_validation.setForeground(Color.RED);
            password_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            confirmpassword_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            confirmpassword_validation.setText("Passwords do not match!");
            confirmpassword_validation.setForeground(Color.RED);
            confirmpassword_validation.setFont(new Font("Arial", Font.PLAIN, 9));
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
            
            password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            confirmpassword_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 255, 255))); 
            
            confirmpassword_validation1.setText("Invalid!");
            confirmpassword_validation1.setForeground(Color.RED);
            confirmpassword_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
            
            password_validation1.setText("Invalid!");
            password_validation1.setForeground(Color.RED);
            password_validation1.setFont(new Font("Arial", Font.PLAIN, 9));
            
            return;
        }
       
        dbConnector con = new dbConnector();
        Connection cn = con.getConnection();

        try {
            String pass = passwordHasher.hashPassword(new String(password_input.getPassword())); // Get password securely

            if (util.isEmailExists(email)) {
                JOptionPane.showMessageDialog(this, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (util.isUsernameExists(uname)) {
                JOptionPane.showMessageDialog(this, "Username is already taken!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Insert into database using prepared statement
            String insertSql = "INSERT INTO user (f_name, l_name, username, email, role, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertPst = cn.prepareStatement(insertSql)) {
                insertPst.setString(1, firstname_input.getText());
                insertPst.setString(2, lastname_input.getText());
                insertPst.setString(3, uname);
                insertPst.setString(4, email);
                insertPst.setString(5, role.getSelectedItem().toString());
                insertPst.setString(6, pass);
                insertPst.setString(7, "Pending");

                int result = insertPst.executeUpdate();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                    new login().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error: " + ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (cn != null) cn.close(); // Ensure connection is closed
            } catch (SQLException ex) {
                Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_signupButtonActionPerformed

    private void signupButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseEntered
        signupButton.setBackground(new Color(30, 100, 255));
    }//GEN-LAST:event_signupButtonMouseEntered

    private void signupButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseExited
        signupButton.setBackground(new Color(0, 51, 255));
    }//GEN-LAST:event_signupButtonMouseExited

    private void firstname_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstname_inputMouseClicked
        firstname_input.setCaretPosition(100);
    }//GEN-LAST:event_firstname_inputMouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel check_icon;
    private javax.swing.JPasswordField confirmpassword_input;
    private javax.swing.JLabel confirmpassword_validation;
    private javax.swing.JLabel confirmpassword_validation1;
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel email_validation;
    private javax.swing.JLabel email_validation1;
    private javax.swing.JTextField firstname_input;
    private javax.swing.JLabel firstname_validation;
    private javax.swing.JLabel header;
    private javax.swing.JLabel hide_pass;
    private javax.swing.JLabel hide_pass1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname_input;
    private javax.swing.JLabel lastname_validation;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JLabel password_validation;
    private javax.swing.JLabel password_validation1;
    private javax.swing.JPanel rigester_panel;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel show_pass;
    private javax.swing.JLabel show_pass1;
    private javax.swing.JLabel signin;
    private Swing.Button signupButton;
    private javax.swing.JLabel text;
    private javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    private javax.swing.JLabel username_validation1;
    private javax.swing.JLabel username_validation2;
    // End of variables declaration//GEN-END:variables
}
