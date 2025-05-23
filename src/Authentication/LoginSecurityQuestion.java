
package Authentication;

import Dashboards.Admin;
import Dashboards.Staff;
import static config.AnswerHashing.hashAnswer;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginSecurityQuestion extends javax.swing.JFrame {

    public LoginSecurityQuestion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        answerField2 = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        answerField1 = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        combo1 = new javax.swing.JComboBox<>();
        ans_error2 = new javax.swing.JLabel();
        ans_error1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Set Up Security Questions");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        answerField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        answerField2.setText("  ");
        jPanel2.add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 560, 50));

        submit_button.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 100, 40));

        answerField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        answerField1.setText("  ");
        jPanel2.add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 560, 50));

        combo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your first pet?", "What is the name of the street you grew up on?", "What was your childhood best friend’s name?" }));
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        jPanel2.add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 390, 30));

        combo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your favorite teacher?", "What is the title of your favorite book?", "What is your mother’s maiden name?" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        jPanel2.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 390, 30));

        ans_error2.setBackground(new java.awt.Color(255, 255, 255));
        ans_error2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        ans_error2.setForeground(new java.awt.Color(255, 0, 0));
        ans_error2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ans_error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 560, 30));

        ans_error1.setBackground(new java.awt.Color(255, 255, 255));
        ans_error1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        ans_error1.setForeground(new java.awt.Color(255, 0, 0));
        ans_error1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ans_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 560, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 680, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
     private void displayError(JLabel field, String message) {
        field.setText(message);
        field.setForeground(new Color(255, 0, 0));
       
       }
     
     
    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
         boolean valid = true;

        // Retrieve user details from session
        Session sess = Session.getInstance();
        String userId = sess.getUser_id();  // Get user_id from session

        if (userId == null || userId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Session expired. Please search for your account again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Null-safe combo selections
        String selectedQuestion1 = (combo1.getSelectedItem() != null) ? combo1.getSelectedItem().toString().trim() : "";
        String selectedQuestion2 = (combo2.getSelectedItem()!= null) ? combo2.getSelectedItem().toString().trim() : "";
        String userAnswer1 = answerField1.getText().trim();
        String userAnswer2 = answerField2.getText().trim();

        String answerError = "Answer field cannot be empty!";
        String questionError = "Please select a security question!";

        // Validation
        if (selectedQuestion1.isEmpty()) {
            displayError(ans_error1, questionError);
            valid = false;
        }

        if (userAnswer1.isEmpty()) {
            displayError(ans_error1, answerError);
            valid = false;
        }

        if (selectedQuestion2.isEmpty()) {
            displayError(ans_error2, questionError);
            valid = false;
        }

        if (userAnswer2.isEmpty()) {
            displayError(ans_error2, answerError);
            valid = false;
        }

        if (!valid) {
            return;
        }

        dbConnector con = new dbConnector();
        int userIdInt;

        try {
            userIdInt = Integer.parseInt(userId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid user ID format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        try (Connection connection = con.getConnection()) {
            // Check if user already set security questions
            String checkQuery = "SELECT 1 FROM securityQuestion WHERE user_id = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, userIdInt);
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "You have already set security questions.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            // Hash the answers before saving
            String hashedAnswer1 = hashAnswer(userAnswer1);
            String hashedAnswer2 = hashAnswer(userAnswer2);
            


            // Insert both questions and answers
            String insertQuery = "INSERT INTO securityQuestion (user_id, question, answer) VALUES (?, ?, ?), (?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertQuery)) {
                pst.setInt(1, userIdInt);
                pst.setString(2, selectedQuestion1);
                pst.setString(3, hashedAnswer1);
                pst.setInt(4, userIdInt);
                pst.setString(5, selectedQuestion2);
                pst.setString(6, hashedAnswer2);
                pst.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Security questions saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
 
            String roleQuery = "SELECT role FROM user WHERE user_id = ?";
                try (PreparedStatement roleStmt = connection.prepareStatement(roleQuery)) {
                    roleStmt.setInt(1, userIdInt);
                    try (ResultSet roleRs = roleStmt.executeQuery()) {
                        if (roleRs.next()) {
                            String role = roleRs.getString("role");

                            if ("staff".equalsIgnoreCase(role)) {
                                new Staff().setVisible(true);
                            } else if ("admin".equalsIgnoreCase(role)) {
                                new Admin().setVisible(true);
                            } else {
                                JOptionPane.showMessageDialog(null, "Unknown user role: " + role, "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "User role not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
}
    

                    String action = "User set up security questions with ID" +userId;
                    String logQuery = "INSERT INTO logs (user_id, action, date_time) VALUES (?, ?, ?)";

                    try (PreparedStatement logStmt = connection.prepareStatement(logQuery)) {
                        logStmt.setInt(1, userIdInt);
                        logStmt.setString(2, action);
                        logStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis())); // ✅ correct type
                        logStmt.executeUpdate();
                    }


           
                
        } catch (SQLException ex) {
            Logger.getLogger(LoginSecurityQuestion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginSecurityQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo2ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSecurityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans_error1;
    private javax.swing.JLabel ans_error2;
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
