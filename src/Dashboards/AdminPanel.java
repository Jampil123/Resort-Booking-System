
package Dashboards;

import AdminInternalPage.*;
import Authentication.login;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AdminPanel extends javax.swing.JFrame {
    
    public AdminPanel() {
        initComponents();
        showHomePage();
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usersPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bookingsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        propertiesPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        profile_button = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reports_button = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mainDesktop = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersPanel.setBackground(new java.awt.Color(51, 51, 51));
        usersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersPanelMouseExited(evt);
            }
        });
        usersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Users");
        usersPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        usersPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        jPanel1.add(usersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 40));

        bookingsPanel.setBackground(new java.awt.Color(51, 51, 51));
        bookingsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingsPanelMouseExited(evt);
            }
        });
        bookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bookings");
        bookingsPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        bookingsPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        jPanel1.add(bookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 40));

        propertiesPanel.setBackground(new java.awt.Color(51, 51, 51));
        propertiesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propertiesPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                propertiesPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                propertiesPanelMouseExited(evt);
            }
        });
        propertiesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Properties");
        propertiesPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-button.png"))); // NOI18N
        propertiesPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        jPanel1.add(propertiesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 40));

        profile_button.setBackground(new java.awt.Color(51, 51, 51));
        profile_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profile_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profile_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profile_buttonMouseExited(evt);
            }
        });
        profile_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profile");
        profile_button.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        profile_button.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        jPanel1.add(profile_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        homePanel.setBackground(new java.awt.Color(51, 51, 51));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanelMouseExited(evt);
            }
        });
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Home");
        homePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-button.png"))); // NOI18N
        homePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        jPanel1.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Sign out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 120, 30));

        reports_button.setBackground(new java.awt.Color(51, 51, 51));
        reports_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reports_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reports_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reports_buttonMouseExited(evt);
            }
        });
        reports_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Reports");
        reports_button.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document.png"))); // NOI18N
        reports_button.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        jPanel1.add(reports_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, 30));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setText("ADMIN PANEL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        mainDesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainDesktopLayout = new javax.swing.GroupLayout(mainDesktop);
        mainDesktop.setLayout(mainDesktopLayout);
        mainDesktopLayout.setHorizontalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        mainDesktopLayout.setVerticalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel2.add(mainDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 720, 440));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void showHomePage() {
        Home home = new Home();
        mainDesktop.add(home);
        home.setVisible(true);
    }
    
    private void usersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersPanelMouseClicked
        ManageStaff ms = new ManageStaff();
        mainDesktop.add(ms).setVisible(true);
    }//GEN-LAST:event_usersPanelMouseClicked
 
    private void usersPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersPanelMouseEntered
        usersPanel.setBackground(bodycolor);
    }//GEN-LAST:event_usersPanelMouseEntered

    private void usersPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersPanelMouseExited
        usersPanel.setBackground(navcolor);
    }//GEN-LAST:event_usersPanelMouseExited

    private void bookingsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingsPanelMouseClicked

    private void bookingsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsPanelMouseEntered
        bookingsPanel.setBackground(bodycolor);
    }//GEN-LAST:event_bookingsPanelMouseEntered

    private void bookingsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsPanelMouseExited
        bookingsPanel.setBackground(navcolor);
    }//GEN-LAST:event_bookingsPanelMouseExited

    private void propertiesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesPanelMouseClicked
        Properties pt = new Properties();
        mainDesktop.add(pt).setVisible(true);
    }//GEN-LAST:event_propertiesPanelMouseClicked

    private void propertiesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesPanelMouseEntered
        propertiesPanel.setBackground(bodycolor);
    }//GEN-LAST:event_propertiesPanelMouseEntered

    private void propertiesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesPanelMouseExited
        propertiesPanel.setBackground(navcolor);
    }//GEN-LAST:event_propertiesPanelMouseExited

    private void profile_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseClicked
       Profile profileWindow = new Profile();
       mainDesktop.add(profileWindow);
       profileWindow.setVisible(true);
    }//GEN-LAST:event_profile_buttonMouseClicked

    private void profile_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseEntered
        profile_button.setBackground(bodycolor);
    }//GEN-LAST:event_profile_buttonMouseEntered

    private void profile_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_buttonMouseExited
        profile_button.setBackground(navcolor);
    }//GEN-LAST:event_profile_buttonMouseExited

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        Home hm = new Home();
        mainDesktop.add(hm).setVisible(true);
    }//GEN-LAST:event_homePanelMouseClicked

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        homePanel.setBackground(bodycolor);
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        homePanel.setBackground(navcolor);
    }//GEN-LAST:event_homePanelMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login login = new login();
        JOptionPane.showMessageDialog(null, "Logging out", "Log", JOptionPane.INFORMATION_MESSAGE);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reports_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reports_buttonMouseClicked

    private void reports_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_buttonMouseEntered
         reports_button.setBackground(bodycolor);
    }//GEN-LAST:event_reports_buttonMouseEntered

    private void reports_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reports_buttonMouseExited
        reports_button.setBackground(navcolor);
    }//GEN-LAST:event_reports_buttonMouseExited

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookingsPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JPanel profile_button;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JPanel reports_button;
    private javax.swing.JPanel usersPanel;
    // End of variables declaration//GEN-END:variables
}
