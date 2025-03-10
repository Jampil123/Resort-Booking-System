/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminInternalPage;

import FloatedPage.add_user;
import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author Esconde
 */
public class Room extends javax.swing.JInternalFrame {

    /**
     * Creates new form Room
     */
    public Room() {
        initComponents();
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        search_bar = new javax.swing.JTextField();
        delete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        add_user = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        approved = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        room_table = new javax.swing.JTable();

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setPreferredSize(new java.awt.Dimension(720, 440));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_bar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        search_bar.setForeground(new java.awt.Color(153, 153, 153));
        search_bar.setText(" search...");
        search_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_bar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_barFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_barFocusLost(evt);
            }
        });
        search_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_barActionPerformed(evt);
            }
        });
        search_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_barKeyReleased(evt);
            }
        });
        home.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 14, 170, 25));

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

        home.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 100, 30));

        add_user.setBackground(new java.awt.Color(51, 51, 51));
        add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_userMouseExited(evt);
            }
        });
        add_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add User");
        add_user.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 8, -1, -1));

        home.add(add_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 100, 30));

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

        home.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 100, 30));

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

        home.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 20, 20));

        home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 25, 25));

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

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edit");
        edit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 8, -1, -1));

        home.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 100, 30));

        room_table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        room_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Room ID", "Room Number", "Room Type", "Bed Type", "Capacity", "Price per night", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        room_table.setAutoscrolls(false);
        room_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        room_table.setFocusable(false);
        room_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        room_table.setOpaque(false);
        room_table.setRowHeight(25);
        room_table.setSelectionBackground(new java.awt.Color(255, 0, 0));
        room_table.setSelectionForeground(new java.awt.Color(204, 255, 255));
        room_table.setShowVerticalLines(false);
        room_table.getTableHeader().setResizingAllowed(false);
        room_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(room_table);

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 700, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_barFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusGained
//        if (search_bar.getText().equals(" search...")) {
//            search_bar.setText("");
//            search_bar.setFont(new Font("Arial", Font.PLAIN, 11));
//            search_bar.setForeground(Color.BLACK);
//        }
    }//GEN-LAST:event_search_barFocusGained

    private void search_barFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusLost
//        if (search_bar.getText().isEmpty()) {
//            search_bar.setText(" search...");
//            search_bar.setFont(new Font("Arial", Font.PLAIN, 11));
//            search_bar.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_search_barFocusLost

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_barKeyReleased
//        DefaultTableModel model = (DefaultTableModel)users_table.getModel();
//        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) users_table.getModel());
//        users_table.setRowSorter(sorter);
//        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
    }//GEN-LAST:event_search_barKeyReleased

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseClicked

//        JDialog dialog = new JDialog(); // Create a floating window
//        add_user newPanel = new add_user();
//
//        dialog.add(newPanel); // Add add_user to the dialog
//        dialog.setSize(325, 450); // Set the size of the window
//        dialog.setLocationRelativeTo(null); // Center the window
//        dialog.setModal(true); // Prevent interactions with the main window until closed
//        dialog.setVisible(true); // Show the floating add_user

    }//GEN-LAST:event_add_userMouseClicked

    private void add_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseEntered
        add_user.setBackground(bodycolor);
    }//GEN-LAST:event_add_userMouseEntered

    private void add_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseExited
        add_user.setBackground(navcolor);
    }//GEN-LAST:event_add_userMouseExited

    private void approvedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseClicked
//        int selectedUserId = getSelectedUserId(); // Get the selected user's ID
//
//        if (selectedUserId != -1) {
//            try {
//                dbConnector db = new dbConnector(); // Create an instance of dbConnector
//                Connection conn = db.getConnection(); // Get database connection
//
//                String query = "UPDATE user SET status = 'Approved' WHERE user_id = ?";
//                PreparedStatement pstmt = conn.prepareStatement(query);
//                pstmt.setInt(1, selectedUserId);
//
//                int rowsUpdated = pstmt.executeUpdate();
//                if (rowsUpdated > 0) {
//                    JOptionPane.showMessageDialog(this, "User approved successfully!");
//                } else {
//                    JOptionPane.showMessageDialog(this, "Failed to approve user.");
//                }
//                pstmt.close();
//                conn.close();
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Please select a user to approve.");
//        }
    }//GEN-LAST:event_approvedMouseClicked

    private void approvedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseEntered
        approved.setBackground(bodycolor);
    }//GEN-LAST:event_approvedMouseEntered

    private void approvedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseExited
        approved.setBackground(navcolor);
    }//GEN-LAST:event_approvedMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
     
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(bodycolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_user;
    private javax.swing.JPanel approved;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh;
    private javax.swing.JTable room_table;
    private javax.swing.JTextField search_bar;
    // End of variables declaration//GEN-END:variables
}
