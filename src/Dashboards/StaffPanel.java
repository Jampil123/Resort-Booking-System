
package Dashboards;

import AdminInternalPage.Properties;
import Authentication.login;
import StaffInternalPage.Guest;
import StaffInternalPage.HomePage;
import java.awt.Color;
import javax.swing.JOptionPane;

public class StaffPanel extends javax.swing.JFrame {

    public StaffPanel() {
        initComponents();
        showHomePage();
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        buttons_panel = new javax.swing.JPanel();
        header_logo = new javax.swing.JLabel();
        signout_button = new javax.swing.JButton();
        homePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guestPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        propertiesPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookingsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        header_title = new javax.swing.JLabel();
        header_subtitle = new javax.swing.JLabel();
        mainDesktop = new javax.swing.JDesktopPane();
        header_background = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setPreferredSize(new java.awt.Dimension(630, 380));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttons_panel.setBackground(new java.awt.Color(51, 51, 51));
        buttons_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo icon.png"))); // NOI18N
        buttons_panel.add(header_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        signout_button.setBackground(new java.awt.Color(255, 255, 255));
        signout_button.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signout_button.setForeground(new java.awt.Color(51, 51, 51));
        signout_button.setText("Sign out");
        signout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signout_buttonActionPerformed(evt);
            }
        });
        buttons_panel.add(signout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 30));

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
        homePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-button.png"))); // NOI18N
        homePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        buttons_panel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

        guestPanel.setBackground(new java.awt.Color(51, 51, 51));
        guestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guestPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guestPanelMouseExited(evt);
            }
        });
        guestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Guest");
        guestPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        guestPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        buttons_panel.add(guestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 40));

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
        propertiesPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-button.png"))); // NOI18N
        propertiesPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        buttons_panel.add(propertiesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 40));

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
        bookingsPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 13, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        bookingsPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        buttons_panel.add(bookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 40));

        main_panel.add(buttons_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        header_title.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        header_title.setText("Dashboard");
        main_panel.add(header_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, 30));

        header_subtitle.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        header_subtitle.setText("STAFF PANEL");
        main_panel.add(header_subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

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

        main_panel.add(mainDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 720, 440));

        header_background.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout header_backgroundLayout = new javax.swing.GroupLayout(header_background);
        header_background.setLayout(header_backgroundLayout);
        header_backgroundLayout.setHorizontalGroup(
            header_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        header_backgroundLayout.setVerticalGroup(
            header_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        main_panel.add(header_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void showHomePage() {
        HomePage home = new HomePage();
        mainDesktop.add(home);
        home.setVisible(true);
    }
    
    private void signout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signout_buttonActionPerformed
        login login = new login();
        JOptionPane.showMessageDialog(null, "Logging out", "Log", JOptionPane.INFORMATION_MESSAGE);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signout_buttonActionPerformed

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
         HomePage hp = new HomePage();
         mainDesktop.add(hp).setVisible(true);
    }//GEN-LAST:event_homePanelMouseClicked

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseEntered
        homePanel.setBackground(bodycolor);
    }//GEN-LAST:event_homePanelMouseEntered

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseExited
        homePanel.setBackground(navcolor);
    }//GEN-LAST:event_homePanelMouseExited

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

    private void guestPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestPanelMouseClicked
        Guest gt = new Guest();
        mainDesktop.add(gt).setVisible(true);
    }//GEN-LAST:event_guestPanelMouseClicked

    private void guestPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestPanelMouseEntered
        guestPanel.setBackground(bodycolor);
    }//GEN-LAST:event_guestPanelMouseEntered

    private void guestPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestPanelMouseExited
        guestPanel.setBackground(navcolor);
    }//GEN-LAST:event_guestPanelMouseExited

    private void bookingsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingsPanelMouseClicked

    private void bookingsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsPanelMouseEntered
        bookingsPanel.setBackground(bodycolor);
    }//GEN-LAST:event_bookingsPanelMouseEntered

    private void bookingsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingsPanelMouseExited
        bookingsPanel.setBackground(navcolor);
    }//GEN-LAST:event_bookingsPanelMouseExited

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
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookingsPanel;
    private javax.swing.JPanel buttons_panel;
    private javax.swing.JPanel guestPanel;
    private javax.swing.JPanel header_background;
    private javax.swing.JLabel header_logo;
    private javax.swing.JLabel header_subtitle;
    private javax.swing.JLabel header_title;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JButton signout_button;
    // End of variables declaration//GEN-END:variables
}
