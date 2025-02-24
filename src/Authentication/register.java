
package Authentication;

import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class register extends javax.swing.JFrame {
    
    public register() {
        initComponents();
        hide_pass.setVisible(false);
        show_pass.setVisible(false);
        hide_pass1.setVisible(false);
        show_pass1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        password1 = new javax.swing.JLabel();
        password2 = new javax.swing.JLabel();
        rl = new javax.swing.JComboBox<>();
        hide_pass1 = new javax.swing.JLabel();
        show_pass1 = new javax.swing.JLabel();
        confirmpassword_input = new javax.swing.JPasswordField();
        password4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        password5 = new javax.swing.JLabel();
        password3 = new javax.swing.JLabel();
        firstname_input = new javax.swing.JTextField();
        lastname_input = new javax.swing.JTextField();
        username_input = new javax.swing.JTextField();
        hide_pass = new javax.swing.JLabel();
        show_pass = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fn_validation = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("REGISTER");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 100, 40));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Confirm Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, 20));

        email_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        email_input.setForeground(new java.awt.Color(153, 153, 153));
        email_input.setText("name@example.com");
        email_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_inputFocusLost(evt);
            }
        });
        jPanel1.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 30));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("First Name");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 20));

        signup.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 90, 30));

        password1.setBackground(new java.awt.Color(255, 255, 255));
        password1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("Last Name");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, 20));

        password2.setBackground(new java.awt.Color(255, 255, 255));
        password2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password2.setForeground(new java.awt.Color(255, 255, 255));
        password2.setText("Username");
        jPanel1.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));

        rl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        rl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        jPanel1.add(rl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 160, 30));

        hide_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_pass1MousePressed(evt);
            }
        });
        jPanel1.add(hide_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 30));

        show_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        show_pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_pass1MousePressed(evt);
            }
        });
        jPanel1.add(show_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 30));

        confirmpassword_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        confirmpassword_input.setForeground(new java.awt.Color(153, 153, 153));
        confirmpassword_input.setText(" Confirm password...");
        confirmpassword_input.setEchoChar('\u0000');
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
        jPanel1.add(confirmpassword_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, 30));

        password4.setBackground(new java.awt.Color(255, 255, 255));
        password4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password4.setForeground(new java.awt.Color(255, 255, 255));
        password4.setText("Role");
        jPanel1.add(password4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 20));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        password5.setBackground(new java.awt.Color(255, 255, 255));
        password5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password5.setForeground(new java.awt.Color(255, 255, 255));
        password5.setText("Password");
        jPanel1.add(password5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 20));

        password3.setBackground(new java.awt.Color(255, 255, 255));
        password3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password3.setForeground(new java.awt.Color(255, 255, 255));
        password3.setText("Email");
        jPanel1.add(password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 20));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        firstname_input.setForeground(new java.awt.Color(153, 153, 153));
        firstname_input.setText("Enter first name...");
        firstname_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstname_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstname_inputFocusLost(evt);
            }
        });
        firstname_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname_inputActionPerformed(evt);
            }
        });
        jPanel1.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lastname_input.setForeground(new java.awt.Color(153, 153, 153));
        lastname_input.setText("Enter last name...");
        lastname_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastname_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastname_inputFocusLost(evt);
            }
        });
        jPanel1.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, 30));

        username_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        username_input.setForeground(new java.awt.Color(153, 153, 153));
        username_input.setText("Enter username...");
        username_input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_inputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_inputFocusLost(evt);
            }
        });
        jPanel1.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 30));

        hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidden.png"))); // NOI18N
        hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_passMousePressed(evt);
            }
        });
        jPanel1.add(hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 30));

        show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_passMousePressed(evt);
            }
        });
        jPanel1.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 30));

        password_input.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        password_input.setForeground(new java.awt.Color(153, 153, 153));
        password_input.setText(" Create password...");
        password_input.setEchoChar('\u0000');
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
        jPanel1.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 30));

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Click here to Sign in");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 370, -1, 10));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Already have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));
        jPanel1.add(fn_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, 10));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 370, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed

            String fname = firstname_input.getText();
            String lname = lastname_input.getText();
            String uname = username_input.getText();
            String email = email_input.getText();
            String pass1 = password_input.getText();
            String pass2 = confirmpassword_input.getText();
        
        
        JComponent[] fields = {firstname_input, lastname_input,username_input, email_input, password_input, confirmpassword_input};
        for(JComponent field : fields){
            field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));            
        }

            boolean Error = false;
            StringBuilder eMsg = new StringBuilder();
            
            if(fname.isEmpty() || fname.equals("Enter first name...")){
                eMsg.append("- First name field cannot be empty!\n");
                firstname_input.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(lname.isEmpty() || lname.equals("Enter last name...")){
                eMsg.append("- Last name field cannot be empty!\n");
                lastname_input.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(uname.isEmpty() || uname.equals("Enter username...")){
                eMsg.append("- Username field cannot be empty!\n");
                username_input.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(email.isEmpty() || email.equals("name@example.com")){
                eMsg.append("- Email field cannot be empty!\n");
                email_input.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(pass1.isEmpty() || pass1.equals(" Create password...")){
                eMsg.append("- Create password field cannot be empty!\n");
                password_input.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
            
            if(pass2.isEmpty() || pass2.equals(" Confirm password...")){
                eMsg.append("- Confirm password field cannot be empty!\n");
                confirmpassword_input.setBorder(new LineBorder(Color.RED, 1));
                Error = true;
            }
        
            if (Error) {
            JOptionPane.showMessageDialog(null, eMsg.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
        
            // Validate email format
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                
            if (!email.matches(emailRegex)) {
               JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
               email_input.setBorder(new LineBorder(Color.RED, 1));
               return;
               } 
               
            // Validate password match
           if (!password_input.getText().equals(confirmpassword_input.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                password_input.setBorder(new LineBorder(Color.RED, 1));
                confirmpassword_input.setBorder(new LineBorder(Color.RED, 1));
                return;
            } 
                // Validate password strength
          
                String password = password_input.getText();
                String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

            if (!password.matches(passwordRegex)) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:\n- One uppercase letter\n- One lowercase letter\n- One number\n- One special character (@#$%^&+=!)", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
                password_input.setBorder(new LineBorder(Color.RED, 1));
                return;
               } 
           
                
                
                
                // Insert into database
                dbConnector con = new dbConnector();
                int result = con.InsertData("INSERT INTO user (f_name, l_name, username, email, role, password, status) "
                       + "VALUES('"+firstname_input.getText()+"',"
                               + "'"+lastname_input.getText()+"',"
                               + "'"+username_input.getText()+"',"
                               + "'"+email_input.getText()+"',"
                               + "'"+rl.getSelectedItem()+"',"
                               + "'"+password_input.getText()+"',"
                               + "'Pending' )");
                   if (result == 1) {
                       JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                       new login().setVisible(true);
                       this.dispose();
                   } 
                   else {
                       JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                   }
               
           
       
    }//GEN-LAST:event_signupActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        login li = new login();
        li.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void password_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_inputFocusGained
        if (password_input.getText().equals(" Create password...")) {
            password_input.setText("");
            password_input.setEchoChar('*'); 
            password_input.setForeground(Color.BLACK);
            password_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
            show_pass.setVisible(true); 
            hide_pass.setVisible(false);
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
            confirmpassword_input.setForeground(Color.BLACK);
            confirmpassword_input.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        show_pass1.setVisible(true);  
        hide_pass1.setVisible(false);
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

    private void show_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passMousePressed
        hide_pass.setVisible(true);
        show_pass.setVisible(false);
        password_input.setEchoChar((char) 0); 
    }//GEN-LAST:event_show_passMousePressed

    private void hide_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_passMousePressed
        show_pass.setVisible(true);
        hide_pass.setVisible(false);
        password_input.setEchoChar('*'); 
    }//GEN-LAST:event_hide_passMousePressed

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

    private void hide_pass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_pass1MousePressed
        show_pass1.setVisible(true);
        hide_pass1.setVisible(false);
        confirmpassword_input.setEchoChar('*'); 
    }//GEN-LAST:event_hide_pass1MousePressed

    private void show_pass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_pass1MousePressed
        hide_pass1.setVisible(true);
        show_pass1.setVisible(false);
        confirmpassword_input.setEchoChar((char) 0); 
    }//GEN-LAST:event_show_pass1MousePressed

    private void firstname_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname_inputActionPerformed

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
    private javax.swing.JPasswordField confirmpassword_input;
    private javax.swing.JTextField email_input;
    private javax.swing.JTextField firstname_input;
    private javax.swing.JLabel fn_validation;
    private javax.swing.JLabel header;
    private javax.swing.JLabel hide_pass;
    private javax.swing.JLabel hide_pass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname_input;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password2;
    private javax.swing.JLabel password3;
    private javax.swing.JLabel password4;
    private javax.swing.JLabel password5;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JComboBox<String> rl;
    private javax.swing.JLabel show_pass;
    private javax.swing.JLabel show_pass1;
    private javax.swing.JButton signup;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
