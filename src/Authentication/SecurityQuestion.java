
package Authentication;

import config.Session;
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SecurityQuestion extends javax.swing.JFrame {

    public SecurityQuestion() {
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
        jButton2 = new javax.swing.JButton();
        answerField1 = new javax.swing.JTextField();
        question2 = new javax.swing.JComboBox<>();
        question1 = new javax.swing.JComboBox<>();
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
        jLabel3.setText("Verify Your Identity");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Answer your security question to reset your password.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        answerField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        answerField2.setText("  ");
        jPanel2.add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 560, 50));

        submit_button.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 100, 40));

        jButton2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 100, 40));

        answerField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        answerField1.setText("  ");
        jPanel2.add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 560, 50));

        question2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        question2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your first pet?", "What is the name of the street you grew up on?", "What was your childhood best friend’s name?" }));
        question2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question2ActionPerformed(evt);
            }
        });
        jPanel2.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 390, 30));

        question1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        question1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your favorite teacher?", "What is the title of your favorite book?", "What is your mother’s maiden name?" }));
        jPanel2.add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 390, 30));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
  
    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
  
        // Retrieve user details from session
        Session sess = Session.getInstance();
        String userId = sess.getUser_id();  // Get user_id from session

        if (userId == null || userId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Session expired. Please search for your account again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String selectedQuestion1 = question1.getSelectedItem().toString(); 
        String selectedQuestion2 = question2.getSelectedItem().toString();
        String userAnswer1 = answerField1.getText().trim(); 
        String userAnswer2 = answerField2.getText().trim(); 

        if (userAnswer1.isEmpty() || userAnswer2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both answers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Database connection
            dbConnector con = new dbConnector();
            Connection connection = con.getConnection();

            // Fetch security questions and answers using user_id from session
            String query = "SELECT question, answer FROM securityquestion WHERE user_id = ? AND question IN (?, ?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, userId);  // Using user_id from session
            pst.setString(2, selectedQuestion1);
            pst.setString(3, selectedQuestion2);
            ResultSet rs = pst.executeQuery();

            int correctAnswers = 0;

            while (rs.next()) {
                String storedQuestion = rs.getString("question").trim();
                String correctAnswer = rs.getString("answer").trim(); 

                if (storedQuestion.equals(selectedQuestion1) && correctAnswer.equalsIgnoreCase(userAnswer1.trim())) {
                    correctAnswers++;
                } else if (storedQuestion.equals(selectedQuestion2) && correctAnswer.equalsIgnoreCase(userAnswer2.trim())) {
                    correctAnswers++;
                }
            }

            if (correctAnswers == 2) {
                JOptionPane.showMessageDialog(this, "Answers verified! Proceed to reset password.", "Success", JOptionPane.INFORMATION_MESSAGE);
                new ResetPasswordForm().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect answer(s). Try again.", "Verification Failed", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pst.close();
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void question2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question2ActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> question1;
    private javax.swing.JComboBox<String> question2;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
