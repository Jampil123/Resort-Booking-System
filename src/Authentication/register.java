
package Authentication;

import config.dbConnector;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {
    
    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        password1 = new javax.swing.JLabel();
        password2 = new javax.swing.JLabel();
        rl = new javax.swing.JComboBox<>();
        cpw = new javax.swing.JPasswordField();
        password4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        password5 = new javax.swing.JLabel();
        password3 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jcshow_password = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("REGISTER");
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, 40));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Confirm Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, 20));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 28));

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("First Name");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 20));

        signup.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        signup.setText("SIGN UP");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 90, 30));

        password1.setBackground(new java.awt.Color(255, 255, 255));
        password1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("Last Name");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, 20));

        password2.setBackground(new java.awt.Color(255, 255, 255));
        password2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password2.setForeground(new java.awt.Color(255, 255, 255));
        password2.setText("Username");
        jPanel1.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));

        rl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        rl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        jPanel1.add(rl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 28));
        jPanel1.add(cpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 130, 28));

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
        jPanel1.add(password5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 20));

        password3.setBackground(new java.awt.Color(255, 255, 255));
        password3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        password3.setForeground(new java.awt.Color(255, 255, 255));
        password3.setText("Email");
        jPanel1.add(password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, 20));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 28));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 28));

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 28));
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 28));

        jcshow_password.setForeground(new java.awt.Color(204, 204, 204));
        jcshow_password.setText("Show Password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(jcshow_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, 10));

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Click here to Sign in");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, 10));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Already have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 320, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        if (fn.getText().isEmpty() 
           || ln.getText().isEmpty()
           || un.getText().isEmpty()
           || em.getText().isEmpty()
           || pw.getText().isEmpty()
           || cpw.getText().isEmpty()) {

           JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        else {
            // Validate email format
            String email = em.getText();
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                
            if (!email.matches(emailRegex)) {
               JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
               } 
                // Validate password match
            else if (!pw.getText().equals(cpw.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            } 
                // Validate password strength
            else {
                String password = pw.getText();
                String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

            if (!password.matches(passwordRegex)) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:\n- One uppercase letter\n- One lowercase letter\n- One number\n- One special character (@#$%^&+=!)", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
               } 
            else {
                // Insert into database
                dbConnector con = new dbConnector();
                int result = con.InsertData("INSERT INTO user (f_name, l_name, username, email, role, password, status) "
                       + "VALUES('"+fn.getText()+"',"
                               + "'"+ln.getText()+"',"
                               + "'"+un.getText()+"',"
                               + "'"+em.getText()+"',"
                               + "'"+rl.getSelectedItem()+"',"
                               + "'"+pw.getText()+"',"
                               + "'Pending' )");
                   if (result == 1) {
                       JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                       new login().setVisible(true);
                       this.dispose();
                   } 
                   else {
                       JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                   }
               }
           }
       }
    }//GEN-LAST:event_signupActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
        if (jcshow_password.isSelected()) {
            cpw.setEchoChar((char)0);
            pw.setEchoChar((char)0);
        }
        else {
            cpw.setEchoChar('*');
            pw.setEchoChar('*');
        }
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        login li = new login();
        li.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
       
    }//GEN-LAST:event_signupMouseClicked

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
    private javax.swing.JPasswordField cpw;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password2;
    private javax.swing.JLabel password3;
    private javax.swing.JLabel password4;
    private javax.swing.JLabel password5;
    private javax.swing.JPasswordField pw;
    private javax.swing.JComboBox<String> rl;
    private javax.swing.JButton signup;
    private javax.swing.JTextField un;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
