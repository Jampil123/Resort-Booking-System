
package FloatedPage;

import Authentication.LoginSecurityQuestion;
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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class setupSecurity extends javax.swing.JPanel {

    public setupSecurity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo1 = new javax.swing.JComboBox<>();
        answerField1 = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        answerField2 = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ans_error1 = new javax.swing.JLabel();
        ans_error2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(449, 327));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your favorite teacher?", "What is the title of your favorite book?", "What is your mother’s maiden name?" }));
        add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 280, 30));

        answerField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 360, 40));

        combo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your first pet?", "What is the name of the street you grew up on?", "What was your childhood best friend’s name?" }));
        add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 30));

        answerField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 360, 40));

        submit_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 80, 30));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 80, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Setup security Quetion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));

        ans_error1.setBackground(new java.awt.Color(255, 255, 255));
        ans_error1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ans_error1.setForeground(new java.awt.Color(255, 0, 0));
        ans_error1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(ans_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 360, 20));

        ans_error2.setBackground(new java.awt.Color(255, 255, 255));
        ans_error2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ans_error2.setForeground(new java.awt.Color(255, 0, 0));
        ans_error2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(ans_error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 360, 20));
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
 
           
    

                    String action = "User set up security questions with ID" +userId;
                    String logQuery = "INSERT INTO logs (user_id, action, date_time) VALUES (?, ?, ?)";

                    try (PreparedStatement logStmt = connection.prepareStatement(logQuery)) {
                        logStmt.setInt(1, userIdInt);
                        logStmt.setString(2, action);
                        logStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis())); // ✅ correct type
                        logStmt.executeUpdate();
                    }


           
                
        } catch (SQLException ex) {
            Logger.getLogger(setupSecurity.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(setupSecurity.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_submit_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans_error1;
    private javax.swing.JLabel ans_error2;
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
