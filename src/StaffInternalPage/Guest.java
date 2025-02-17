
package StaffInternalPage;

import FloatedPage.AddGuest;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

public class Guest extends javax.swing.JInternalFrame {

    public Guest() {
        initComponents();
        displayData();
        
        guest.setVisible(true);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
        
     public void displayData(){
        try{
            dbConnector dbc = new dbConnector();          
            ResultSet rs = dbc.getData("SELECT * FROM guest");
            guest_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guest = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        guest_tbl = new javax.swing.JTable();
        editPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        refreshPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        guest.setBackground(new java.awt.Color(255, 255, 255));
        guest.setPreferredSize(new java.awt.Dimension(640, 380));
        guest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        guest.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        guest_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(guest_tbl);

        jScrollPane1.setViewportView(jScrollPane2);

        guest.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 620, 280));

        editPanel.setBackground(new java.awt.Color(51, 51, 51));
        editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editPanelMouseExited(evt);
            }
        });
        editPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edit");
        editPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, -1, -1));

        guest.add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 100, 30));

        refreshPanel.setBackground(new java.awt.Color(51, 51, 51));
        refreshPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshPanelMouseExited(evt);
            }
        });
        refreshPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Refresh");
        refreshPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 8, -1, -1));

        guest.add(refreshPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 30));

        deletePanel.setBackground(new java.awt.Color(51, 51, 51));
        deletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletePanelMouseExited(evt);
            }
        });
        deletePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Delete");
        deletePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 8, -1, -1));

        guest.add(deletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 30));

        addPanel.setBackground(new java.awt.Color(51, 51, 51));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanelMouseExited(evt);
            }
        });
        addPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Guest");
        addPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        guest.add(addPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void editPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseEntered
        editPanel.setBackground(bodycolor);
    }//GEN-LAST:event_editPanelMouseEntered

    private void editPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPanelMouseExited
        editPanel.setBackground(navcolor);
    }//GEN-LAST:event_editPanelMouseExited

    private void refreshPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseEntered
        refreshPanel.setBackground(bodycolor);
    }//GEN-LAST:event_refreshPanelMouseEntered

    private void refreshPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseExited
        refreshPanel.setBackground(navcolor);
    }//GEN-LAST:event_refreshPanelMouseExited

    private void deletePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseEntered
        deletePanel.setBackground(bodycolor);
    }//GEN-LAST:event_deletePanelMouseEntered

    private void deletePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseExited
        deletePanel.setBackground(navcolor);
    }//GEN-LAST:event_deletePanelMouseExited

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        addPanel.setBackground(bodycolor);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
        addPanel.setBackground(navcolor);
    }//GEN-LAST:event_addPanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        AddGuest ag = new AddGuest();
        ag.setVisible(true);
    }//GEN-LAST:event_addPanelMouseClicked

    private void refreshPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshPanelMouseClicked
        displayData();
    }//GEN-LAST:event_refreshPanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel guest;
    private javax.swing.JTable guest_tbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel refreshPanel;
    // End of variables declaration//GEN-END:variables
}
