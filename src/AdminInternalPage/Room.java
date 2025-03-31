
package AdminInternalPage;

import FloatedPage.AddRoom;
import FloatedPage.add_user;
import javax.swing.*; 
import java.awt.*;    
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Room extends javax.swing.JInternalFrame {

    public Room() {
        initComponents();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        addRoom = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        approved = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        room_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        delete.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        home.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 100, 30));

        addRoom.setBackground(new java.awt.Color(51, 51, 51));
        addRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRoomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addRoomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addRoomMouseExited(evt);
            }
        });
        addRoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add Room");
        addRoom.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 30));

        home.add(addRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 100, 30));

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
        jLabel6.setText("Edit");
        approved.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 30));

        home.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 100, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 20, 20));

        home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 25, 25));

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

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 690, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 4, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_barFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusGained
        if (search_bar.getText().equals(" search...")) {
            search_bar.setText("");
            search_bar.setFont(new Font("Arial", Font.PLAIN, 11));
            search_bar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_search_barFocusGained

    private void search_barFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusLost
        if (search_bar.getText().isEmpty()) {
            search_bar.setText(" search...");
            search_bar.setFont(new Font("Arial", Font.PLAIN, 11));
            search_bar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_search_barFocusLost

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_barKeyReleased
        DefaultTableModel model = (DefaultTableModel)room_table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) room_table.getModel());
        room_table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
    }//GEN-LAST:event_search_barKeyReleased

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void addRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoomMouseClicked
        JDialog dialog = new JDialog(); // Create a floating window
        AddRoom newPanel = new AddRoom();

        dialog.add(newPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_addRoomMouseClicked

    private void addRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoomMouseEntered
        addRoom.setBackground(bodycolor);
    }//GEN-LAST:event_addRoomMouseEntered

    private void addRoomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoomMouseExited
        addRoom.setBackground(navcolor);
    }//GEN-LAST:event_addRoomMouseExited

    private void approvedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseClicked

    }//GEN-LAST:event_approvedMouseClicked

    private void approvedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseEntered
        approved.setBackground(bodycolor);
    }//GEN-LAST:event_approvedMouseEntered

    private void approvedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseExited
        approved.setBackground(navcolor);
    }//GEN-LAST:event_approvedMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addRoom;
    private javax.swing.JPanel approved;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable room_table;
    private javax.swing.JTextField search_bar;
    // End of variables declaration//GEN-END:variables
}
