/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboards;

import AdminInternalPage.*;
import java.awt.Color;
/**
 *
 * @author Esconde
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public AdminPanel() {
        initComponents();
    }
    
    Color navcolor = new Color(102,102,102);
    Color headcolor = new Color(0,0,0);
    Color bodycolor = new Color(204,255,255);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        propertiesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bookingPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        staffPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        reportsPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        reportsPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mainDesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        propertiesPanel.setBackground(new java.awt.Color(102, 102, 102));
        propertiesPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, new java.awt.Color(0, 102, 102)));
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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Properties");
        propertiesPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel1.add(propertiesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 40));

        bookingPanel.setBackground(new java.awt.Color(102, 102, 102));
        bookingPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, new java.awt.Color(0, 102, 102)));
        bookingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingPanelMouseExited(evt);
            }
        });
        bookingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Booking Request");
        bookingPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(bookingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 40));

        staffPanel.setBackground(new java.awt.Color(102, 102, 102));
        staffPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, new java.awt.Color(0, 102, 102)));
        staffPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffPanelMouseExited(evt);
            }
        });
        staffPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Manage Staff");
        staffPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(staffPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, 40));

        reportsPanel.setBackground(new java.awt.Color(102, 102, 102));
        reportsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, new java.awt.Color(0, 102, 102)));
        reportsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsPanelMouseExited(evt);
            }
        });
        reportsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Log out");
        reportsPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(reportsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 40));

        reportsPanel1.setBackground(new java.awt.Color(102, 102, 102));
        reportsPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null, new java.awt.Color(0, 102, 102)));
        reportsPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsPanel1MouseExited(evt);
            }
        });
        reportsPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Reports & Revenue");
        reportsPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel1.add(reportsPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 380));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Approving Manager");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 230, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 460, 70));

        mainDesktop.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout mainDesktopLayout = new javax.swing.GroupLayout(mainDesktop);
        mainDesktop.setLayout(mainDesktopLayout);
        mainDesktopLayout.setHorizontalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        mainDesktopLayout.setVerticalGroup(
            mainDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel2.add(mainDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 460, 310));

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

    private void propertiesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesPanelMouseClicked
        Properties pr = new Properties();
        mainDesktop.add(pr).setVisible(true);
    }//GEN-LAST:event_propertiesPanelMouseClicked

    private void staffPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffPanelMouseClicked
       ManageStaff md = new ManageStaff();
       mainDesktop.add(md).setVisible(true);
    }//GEN-LAST:event_staffPanelMouseClicked

    private void propertiesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesPanelMouseEntered
        propertiesPanel.setBackground(bodycolor);
    }//GEN-LAST:event_propertiesPanelMouseEntered

    private void propertiesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesPanelMouseExited
        propertiesPanel.setBackground(navcolor);
    }//GEN-LAST:event_propertiesPanelMouseExited

    private void bookingPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingPanelMouseEntered
        bookingPanel.setBackground(bodycolor);
    }//GEN-LAST:event_bookingPanelMouseEntered

    private void bookingPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingPanelMouseExited
        bookingPanel.setBackground(navcolor);
    }//GEN-LAST:event_bookingPanelMouseExited

    private void staffPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffPanelMouseEntered
        staffPanel.setBackground(bodycolor);
    }//GEN-LAST:event_staffPanelMouseEntered

    private void staffPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffPanelMouseExited
        staffPanel.setBackground(navcolor);
    }//GEN-LAST:event_staffPanelMouseExited

    private void reportsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPanelMouseEntered
        reportsPanel.setBackground(bodycolor);
    }//GEN-LAST:event_reportsPanelMouseEntered

    private void reportsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPanelMouseExited
        reportsPanel.setBackground(navcolor);
    }//GEN-LAST:event_reportsPanelMouseExited

    private void bookingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingPanelMouseClicked
        Bookings pr = new Bookings();
        mainDesktop.add(pr).setVisible(true);
    }//GEN-LAST:event_bookingPanelMouseClicked

    private void reportsPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsPanel1MouseEntered

    private void reportsPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPanel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsPanel1MouseExited

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
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JPanel reportsPanel;
    private javax.swing.JPanel reportsPanel1;
    private javax.swing.JPanel staffPanel;
    // End of variables declaration//GEN-END:variables
}
