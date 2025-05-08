
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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class register extends javax.swing.JFrame {
    
    public register() {
        initComponents();
       
       
        check_icon.setVisible(false);

        
       
    }
    
    public void setInvalidTitledBorder(JComponent component, String title) {
            TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 0, 0)),  // Red border for invalid input
                title,
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("Arial", Font.PLAIN, 14),
                new Color(255, 0, 0) // Red text color for the title
            );

            component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 7, 0, 0)));

            // Make text field background fully transparent
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setOpaque(false); 
                textField.setBackground(new Color(0, 0, 0, 0)); 
                textField.setCaretColor(Color.WHITE); // Make sure cursor is visible
                textField.setForeground(new Color (255, 0, 0));
            }
        }

        public void setTitledBorder(JComponent component, String title, Color color) {
            TitledBorder titledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(color, 1),  // Use given color
                title,  
                TitledBorder.LEFT,  
                TitledBorder.TOP,  
                new Font("Arial", Font.PLAIN, 14),  
                color  // Title text color
            );

            component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

            // Make text field background fully transparent
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.setOpaque(false); // Remove background fill
                textField.setBackground(new Color(0, 0, 0, 0)); // Ensure full transparency
                textField.setCaretColor(Color.WHITE); // Ensure cursor is visible
                textField.setForeground(Color.WHITE);
            }
            
            
        }
       
        private void displayError(JLabel field, String message) {
                field.setText(message);
                field.setForeground(new Color(255,0,0));
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rigester_panel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        role = new javax.swing.JComboBox<>();
        password_validation = new javax.swing.JLabel();
        hide_pass1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        firstname_input = new javax.swing.JTextField();
        lastname_input = new javax.swing.JTextField();
        check_icon = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        hide_pass = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        lastname_validation = new javax.swing.JLabel();
        username_validation = new javax.swing.JLabel();
        firstname_validation = new javax.swing.JLabel();
        confirmpassword_validation = new javax.swing.JLabel();
        email_validation = new javax.swing.JLabel();
        signupButton = new Swing.Button();
        password_input = new javax.swing.JPasswordField();
        confirmpassword_input = new javax.swing.JPasswordField();
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
        email_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email_input.setForeground(new java.awt.Color(153, 153, 153));
        email_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
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

        password_validation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        password_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rigester_panel.add(password_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 270, 20));

        hide_pass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_pass1MousePressed(evt);
            }
        });
        rigester_panel.add(hide_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 490, 40, 60));
        rigester_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        firstname_input.setBackground(new java.awt.Color(51, 51, 51));
        firstname_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstname_input.setForeground(new java.awt.Color(153, 153, 153));
        firstname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        firstname_input.setCaretColor(new java.awt.Color(255, 255, 255));
        firstname_input.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstname_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstname_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstname_inputFocusLost(evt);
            }
        });
        rigester_panel.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 70));

        lastname_input.setBackground(new java.awt.Color(51, 51, 51));
        lastname_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastname_input.setForeground(new java.awt.Color(153, 153, 153));
        lastname_input.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
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
        username_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
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

        hide_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passMousePressed(evt);
            }
        });
        rigester_panel.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 490, 40, 60));

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

        lastname_validation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lastname_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rigester_panel.add(lastname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 270, 20));

        username_validation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        username_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rigester_panel.add(username_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, 20));

        firstname_validation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        firstname_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rigester_panel.add(firstname_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 270, 20));

        confirmpassword_validation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        confirmpassword_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rigester_panel.add(confirmpassword_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 250, 20));

        email_validation.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        email_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rigester_panel.add(email_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 270, 20));

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

        password_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password_input.setForeground(new java.awt.Color(153, 153, 153));
        password_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        password_input.setEchoChar('\u0000');
        password_input.setOpaque(false);
        password_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_inputFocusLost(evt);
            }
        });
        password_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_inputActionPerformed(evt);
            }
        });
        rigester_panel.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, 70));

        confirmpassword_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        confirmpassword_input.setForeground(new java.awt.Color(153, 153, 153));
        confirmpassword_input.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Confirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        confirmpassword_input.setEchoChar('\u0000');
        confirmpassword_input.setOpaque(false);
        confirmpassword_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassword_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpassword_inputFocusLost(evt);
            }
        });
        confirmpassword_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassword_inputActionPerformed(evt);
            }
        });
        rigester_panel.add(confirmpassword_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 260, 70));

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

    private void firstname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusGained
        firstname_input.setForeground(Color.WHITE);
        setTitledBorder(firstname_input, "First Name", Color.WHITE);
    }//GEN-LAST:event_firstname_inputFocusGained

    private void firstname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstname_inputFocusLost
        displayError(firstname_validation, "");
        setTitledBorder(firstname_input, "First Name", Color.WHITE);
        firstname_input.setForeground(Color.WHITE);
    }//GEN-LAST:event_firstname_inputFocusLost

    private void lastname_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusGained
        lastname_input.setForeground(Color.WHITE);
        setTitledBorder(lastname_input, "Last Name", Color.WHITE);
    }//GEN-LAST:event_lastname_inputFocusGained

    private void lastname_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastname_inputFocusLost
        displayError(lastname_validation, "");
        setTitledBorder(lastname_input, "Last Name", Color.WHITE);
        lastname_input.setForeground(Color.WHITE);
    }//GEN-LAST:event_lastname_inputFocusLost

    private void username_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusGained
        username_input.setForeground(Color.WHITE);
        setTitledBorder(username_input, "Username", Color.WHITE);
    }//GEN-LAST:event_username_inputFocusGained

    private void username_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_inputFocusLost
        displayError(username_validation, "");
        setTitledBorder(username_input, "Username", Color.WHITE);
        username_input.setForeground(Color.WHITE);
    }//GEN-LAST:event_username_inputFocusLost

    private void email_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusGained
        email_input.setForeground(Color.WHITE);
        setTitledBorder(email_input, "Email", Color.WHITE);
    }//GEN-LAST:event_email_inputFocusGained

    private void email_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_inputFocusLost
        displayError(email_validation, "");
        setTitledBorder(email_input, "Email", Color.WHITE);
        email_input.setForeground(Color.WHITE);
    }//GEN-LAST:event_email_inputFocusLost

    private void lastname_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastname_inputMouseReleased
      
    }//GEN-LAST:event_lastname_inputMouseReleased

    private void username_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username_inputMouseReleased
        
    }//GEN-LAST:event_username_inputMouseReleased

    private void email_inputMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_inputMouseReleased
       
    }//GEN-LAST:event_email_inputMouseReleased
    
   
    private void username_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_inputKeyReleased
        boolean valid = true;
        
        try {
            dbConnector con = new dbConnector();
            String uname = username_input.getText().trim();

            if (uname.isEmpty()) {
                setInvalidTitledBorder(username_input, "Username");
                displayError(username_validation, "Field cannot be empty!");
                valid = false;
            }

            if (uname.length() < 5) {
                username_validation.setText("Username must be at least 5 characters long");
                username_validation.setForeground(Color.RED);
                username_validation.setFont(new Font("Arial", Font.PLAIN, 13));
                username_validation.setText("");
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
                        setInvalidTitledBorder(username_input, "Username");
                        check_icon.setVisible(false);
                        username_validation.setText("Username is already taken");
                        username_validation.setForeground(Color.RED);
                        username_validation.setFont(new Font("Arial", Font.PLAIN, 13));
                    } else {
                        username_input.setForeground(Color.GREEN);
                        check_icon.setVisible(true);
                        username_validation.setText("");
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
        char[] pass1 = password_input.getPassword();
        char[] pass2 = confirmpassword_input.getPassword();

        dbConnector con = new dbConnector();
        Connection cn = con.getConnection();

        boolean valid = true;

        // Validate First Name
        if (fname.isEmpty()) {
            setInvalidTitledBorder(firstname_input, "First Name");
            displayError(firstname_validation, "Field cannot be empty!");
            valid = false;
        }

        // Validate Last Name
        if (lname.isEmpty()) {
            setInvalidTitledBorder(lastname_input, "Last Name");
            displayError(lastname_validation, "Field cannot be empty!");
            valid = false;
        }

        // Validate Username
        if (uname.isEmpty()) {
            setInvalidTitledBorder(username_input, "Username");
            displayError(username_validation, "Field cannot be empty!");
            valid = false;
        }

        // Validate Email
        if (email.isEmpty()) {
            setInvalidTitledBorder(email_input, "Email");
            displayError(email_validation, "Field cannot be empty!");
            valid = false;
        } else if (!util.isValidEmail(email)) {
            setInvalidTitledBorder(email_input, "Email");
            displayError(email_validation, "Invalid email!");
            valid = false;
        }

        // Validate Password
        if (pass1.length == 0) {
            setInvalidTitledBorder(password_input, "Password");
            displayError(password_validation, "Field cannot be empty!");
            valid = false;
        } else if (pass1.length < 8) {
            setInvalidTitledBorder(password_input, "Password");
            displayError(password_validation, "Password Too Short!");
            valid = false;
        }

        // Validate Confirm Password
        if (pass2.length == 0) {
            setInvalidTitledBorder(confirmpassword_input, "Confirm Password");
            displayError(confirmpassword_validation, "Field cannot be empty!");
            valid = false;
        } else if (!Arrays.equals(pass1, pass2)) {
            setInvalidTitledBorder(password_input, "Password");
            setInvalidTitledBorder(confirmpassword_input, "Confirm Password");
            displayError(password_validation, "Passwords DO NOT Match!");
            displayError(confirmpassword_validation, "Passwords DO NOT Match!");
            valid = false;
        }

        // Stop here if any field validation failed
        if (!valid) return;

        // Now check if username or email already exists (only if they were non-empty and passed above checks)
        if (con.fieldExists("username", uname)) {
            setInvalidTitledBorder(username_input, "Username");
            displayError(username_validation, "Username Already Taken!");
            return;
        }

        if (con.fieldExists("email", email)) {
            setInvalidTitledBorder(email_input, "Email");
            displayError(email_validation, "Email Already Exists!");
            return;
        }

        // Proceed with registration
        try {
            String hashedPassword = passwordHasher.hashPassword(new String(pass1));

            String insertSql = "INSERT INTO user (f_name, l_name, username, email, role, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertPst = cn.prepareStatement(insertSql)) {
                insertPst.setString(1, fname);
                insertPst.setString(2, lname);
                insertPst.setString(3, uname);
                insertPst.setString(4, email);
                insertPst.setString(5, role.getSelectedItem().toString());
                insertPst.setString(6, hashedPassword);
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

        } catch (NoSuchAlgorithmException | SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (cn != null) cn.close();
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

    private boolean pass_visible = true;
    
    private void hide_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passMousePressed
      pass_visible = !pass_visible;
        String currentText = password_input.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                password_input.setEchoChar((char) 0);
            }
            hide_pass.setIcon(new ImageIcon(getClass().getResource("/images/eye.png")));
        } else {
            if (!currentText.equals("")) {
                password_input.setEchoChar('•');
            }
            hide_pass.setIcon(new ImageIcon(getClass().getResource("/images/hidden.png")));
        } 
    }//GEN-LAST:event_hide_passMousePressed

    private void hide_pass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_pass1MousePressed
        pass_visible = !pass_visible;
        String currentText = password_input.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                confirmpassword_input.setEchoChar((char) 0);
            }
            hide_pass1.setIcon(new ImageIcon(getClass().getResource("/images/eye.png")));
        } else {
            if (!currentText.equals("")) {
                confirmpassword_input.setEchoChar('•');
            }
            hide_pass1.setIcon(new ImageIcon(getClass().getResource("/images/hidden.png")));
        }
    }//GEN-LAST:event_hide_pass1MousePressed

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        password_input.setEchoChar('•'); // Mask password
        password_input.setForeground(Color.WHITE);
        setTitledBorder(password_input, "Password", Color.WHITE);
    }//GEN-LAST:event_password_inputFocusGained

    private void password_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusLost

        setTitledBorder(password_input, "Password", Color.WHITE);
        password_input.setForeground(Color.WHITE);
        displayError(password_validation, "");
    }//GEN-LAST:event_password_inputFocusLost

    private void password_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_inputActionPerformed

    private void confirmpassword_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassword_inputFocusGained
        confirmpassword_input.setEchoChar('•'); // Mask password
        confirmpassword_input.setForeground(Color.WHITE);
        setTitledBorder(confirmpassword_input, "Confirm Password", Color.WHITE);
    }//GEN-LAST:event_confirmpassword_inputFocusGained

    private void confirmpassword_inputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassword_inputFocusLost

        setTitledBorder(confirmpassword_input, "Confirm Password", Color.WHITE);
        confirmpassword_input.setForeground(Color.WHITE);
        displayError(confirmpassword_validation, "");
    }//GEN-LAST:event_confirmpassword_inputFocusLost

    private void confirmpassword_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassword_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassword_inputActionPerformed

    
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
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel email_validation;
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
    private javax.swing.JPanel rigester_panel;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel signin;
    private Swing.Button signupButton;
    private javax.swing.JLabel text;
    private javax.swing.JTextField username_input;
    private javax.swing.JLabel username_validation;
    // End of variables declaration//GEN-END:variables
}
