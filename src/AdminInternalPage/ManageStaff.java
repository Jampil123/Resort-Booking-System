
package AdminInternalPage;

import config.dbConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

public class ManageStaff extends javax.swing.JInternalFrame {

  
    public ManageStaff() {
        initComponents();
        
        displayData();
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
            ResultSet rs = dbc.getData("SELECT * FROM user");
            users_table.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
    
    public int getSelectedUserId() {
        int selectedRow = users_table.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(users_table.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
            }
        return -1; // Return -1 if no row is selected
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();
        delete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        approved = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setPreferredSize(new java.awt.Dimension(640, 380));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        home.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 20));

        users_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(users_table);

        jScrollPane1.setViewportView(jScrollPane2);

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 620, 280));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delete");
        delete.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 8, -1, -1));

        home.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 100, 30));

        edit.setBackground(new java.awt.Color(51, 51, 51));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edit");
        edit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 8, -1, -1));

        home.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 100, 30));

        approved.setBackground(new java.awt.Color(51, 51, 51));
        approved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approvedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approvedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approvedMouseExited(evt);
            }
        });
        approved.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Approved");
        approved.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 8, -1, -1));

        home.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 100, 30));

        refresh.setBackground(new java.awt.Color(51, 51, 51));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Refresh");
        refresh.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 8, -1, -1));

        home.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void approvedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseEntered
        approved.setBackground(bodycolor);
    }//GEN-LAST:event_approvedMouseEntered

    private void approvedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseExited
        approved.setBackground(navcolor);
    }//GEN-LAST:event_approvedMouseExited

    private void approvedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseClicked
        int selectedUserId = getSelectedUserId(); // Get the selected user's ID

        if (selectedUserId != -1) {
            try {
                dbConnector db = new dbConnector(); // Create an instance of dbConnector
                Connection conn = db.getConnection(); // Get database connection

                String query = "UPDATE user SET status = 'Approved' WHERE user_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, selectedUserId);

                    int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "User approved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to approve user.");
            }
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to approve.");
        }
    }//GEN-LAST:event_approvedMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(bodycolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel approved;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel refresh;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
