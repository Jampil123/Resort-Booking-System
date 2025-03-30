
package Authentication;

import config.Session;
import config.dbConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
    }
    public static boolean searchUserForReset(String input) {
        dbConnector con = new dbConnector();

        try {
            // Search by either username or email
            String query = "SELECT * FROM user WHERE username = ? OR email = ?";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setString(1, input);
            pst.setString(2, input);
            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()) {
                // Store user details in session for further steps
                Session sess = Session.getInstance();
                sess.setUser_id(resultSet.getString("user_id"));
                sess.setF_name(resultSet.getString("f_name"));
                sess.setL_name(resultSet.getString("l_name"));
                sess.setUsername(resultSet.getString("username"));
                sess.setEmail(resultSet.getString("email"));

                System.out.println("User found! Redirecting to security questions...");
                return true;  // User found, proceed to security question page
            } else {
                System.out.println("User not found!");
                return false; // No user found
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        header.setForeground(new java.awt.Color(102, 102, 102));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Find Your Account");
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        jPanel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please Enter your username or email to search for your account. ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        search_field.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(search_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 360, 40));

        search_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 80, 30));

        cancel_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(cancel_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resort.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        login in = new login();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        String searchInput = search_field.getText().trim();

        if (searchInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username or email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        dbConnector con = new dbConnector();
        try {
            // Query to search by username OR email
            String query = "SELECT * FROM user WHERE username = ? OR email = ?";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setString(1, searchInput);
            pst.setString(2, searchInput);
            ResultSet rs = pst.executeQuery();

            // If user is found, store data in session and proceed
            if (rs.next()) {
                // Get user details
                String userId = rs.getString("user_id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String firstName = rs.getString("f_name");
                String lastName = rs.getString("l_name");

                // Store user details in session
                Session sess = Session.getInstance();
                sess.setUser_id(userId);
                sess.setUsername(username);
                sess.setEmail(email);
                sess.setF_name(firstName);
                sess.setL_name(lastName);

                JOptionPane.showMessageDialog(this, 
                    "User Found!\nRedirecting to Security Question Page...",
                    "Success", JOptionPane.INFORMATION_MESSAGE);

                // Open the security question page
                SecurityQuestion sqp = new SecurityQuestion();
                sqp.setVisible(true);
                this.dispose(); // Close search page

            } else {
                JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close resources
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_search_buttonActionPerformed

   
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
}
