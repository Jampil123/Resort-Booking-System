
package FloatedPage;

import AdminInternalPage.Profile;
import Authentication.login;
import Dashboards.Admin;
import java.awt.Color;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Settings extends javax.swing.JPanel {
    

    public Settings() {
        initComponents();
    }
    
    Color navcolor = new Color(51,51,51);
    Color headcolor = new Color(0,0,0);
    Color bodycolor = new Color(102,102,102);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        settings = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        profileButton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        logsButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        securityQuestionButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(340, 489));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        jPanel1.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Settings");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));

        profileButton.setBackground(new java.awt.Color(51, 51, 51));
        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileButtonMouseExited(evt);
            }
        });
        profileButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Profile");
        profileButton.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        profileButton.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 60));

        add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 340, 60));

        logsButton.setBackground(new java.awt.Color(51, 51, 51));
        logsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logsButtonMouseExited(evt);
            }
        });
        logsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Logs");
        logsButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log.png"))); // NOI18N
        logsButton.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 60));

        add(logsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 340, 60));

        securityQuestionButton.setBackground(new java.awt.Color(51, 51, 51));
        securityQuestionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityQuestionButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                securityQuestionButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                securityQuestionButtonMouseExited(evt);
            }
        });
        securityQuestionButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Set up security Questions");
        securityQuestionButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/question.png"))); // NOI18N
        securityQuestionButton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 60));

        add(securityQuestionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 340, 60));

        logoutButton.setBackground(new java.awt.Color(51, 51, 51));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });
        logoutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logout");
        logoutButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 60));

        add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 340, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void logsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsButtonMouseEntered
        logsButton.setBackground(bodycolor);
    }//GEN-LAST:event_logsButtonMouseEntered

    private void logsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsButtonMouseExited
        logsButton.setBackground(navcolor);
    }//GEN-LAST:event_logsButtonMouseExited

    private void securityQuestionButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityQuestionButtonMouseEntered
        securityQuestionButton.setBackground(bodycolor);
    }//GEN-LAST:event_securityQuestionButtonMouseEntered

    private void securityQuestionButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityQuestionButtonMouseExited
        securityQuestionButton.setBackground(navcolor);
    }//GEN-LAST:event_securityQuestionButtonMouseExited

    private void profileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseEntered
        profileButton.setBackground(bodycolor);
    }//GEN-LAST:event_profileButtonMouseEntered

    private void profileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseExited
        profileButton.setBackground(navcolor);
    }//GEN-LAST:event_profileButtonMouseExited

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        logoutButton.setBackground(bodycolor);
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        logoutButton.setBackground(navcolor);
    }//GEN-LAST:event_logoutButtonMouseExited

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        
    }//GEN-LAST:event_profileButtonMouseClicked

    private void securityQuestionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityQuestionButtonMouseClicked
        JDialog dialog = new JDialog(); // Create a floating window
        setupSecurity newPanel = new setupSecurity();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.pack(); // Automatically set size based on the panel's preferred size
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    }//GEN-LAST:event_securityQuestionButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Logging out...", "Log", JOptionPane.INFORMATION_MESSAGE);

            SwingUtilities.invokeLater(() -> {
                new login().setVisible(true); 
            });

            // Open login form **AFTER closing other windows**
            login in = new login();

            // Close all open frames and dialogs
            for (Window window : Window.getWindows()) {
                if (window instanceof JFrame || window instanceof JDialog) {
                    window.dispose();  // Dispose both JFrame and JDialog
                }
            }

            // Ensure login frame opens after all other windows close
            SwingUtilities.invokeLater(() -> {
                in.setVisible(true);
            });
        }
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void logsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsButtonMouseClicked
        JDialog dialog = new JDialog(); // Create a floating window
        Logs newPanel = new Logs();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.pack(); // Automatically set size based on the panel's preferred size
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    }//GEN-LAST:event_logsButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logoutButton;
    private javax.swing.JPanel logsButton;
    private javax.swing.JPanel profileButton;
    private javax.swing.JPanel securityQuestionButton;
    private javax.swing.JLabel settings;
    // End of variables declaration//GEN-END:variables
}
