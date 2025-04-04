
package FloatedPage;

import config.Session;
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class setupSecurity extends javax.swing.JPanel {

    public setupSecurity() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        question1 = new javax.swing.JComboBox<>();
        answerField1 = new javax.swing.JTextField();
        question2 = new javax.swing.JComboBox<>();
        answerField2 = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(449, 327));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        question1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        question1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your favorite teacher?", "What is the title of your favorite book?", "What is your mother’s maiden name?" }));
        add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 280, 30));

        answerField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 360, 40));

        question2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        question2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your first pet?", "What is the name of the street you grew up on?", "What was your childhood best friend’s name?" }));
        add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 280, 30));

        answerField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 360, 40));

        submit_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 80, 30));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("Setup security Quetion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        Session sess = Session.getInstance();
        String userId = sess.getUser_id();

        String selectedQuestion1 = question1.getSelectedItem().toString();
        String selectedQuestion2 = question2.getSelectedItem().toString(); 
        String userAnswer1 = answerField1.getText().trim(); 
        String userAnswer2 = answerField2.getText().trim(); 

        if (userId == null || userId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "User ID is missing. Please log in again.", "Session Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (userAnswer1.isEmpty() || userAnswer2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter answers for both questions.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            dbConnector con = new dbConnector();
            Connection connection = con.getConnection();

            String checkQuery = "SELECT * FROM securityQuestion WHERE user_id = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, Integer.parseInt(userId));
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "You have already set security questions.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Exit method early
                    }
                }
            }

            // Validate inputs
            if (selectedQuestion1 == null || selectedQuestion1.trim().isEmpty() ||
                userAnswer1 == null || userAnswer1.trim().isEmpty() ||
                selectedQuestion2 == null || selectedQuestion2.trim().isEmpty() ||
                userAnswer2 == null || userAnswer2.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Security questions and answers cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Insert two security questions
            String insertQuery = "INSERT INTO securityQuestion (user_id, question, answer) VALUES (?, ?, ?), (?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertQuery)) {
                pst.setInt(1, Integer.parseInt(userId));
                pst.setString(2, selectedQuestion1);
                pst.setString(3, userAnswer1);
                pst.setInt(4, Integer.parseInt(userId));
                pst.setString(5, selectedQuestion2);
                pst.setString(6, userAnswer2);
                pst.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Security questions saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Close the registration form (JDialog)
                JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                if (parentDialog != null) {
                    parentDialog.dispose();  // Closes the JDialog
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> question1;
    private javax.swing.JComboBox<String> question2;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
