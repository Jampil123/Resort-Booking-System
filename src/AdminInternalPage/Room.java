
package AdminInternalPage;

import FloatedPage.AddRoom;
import FloatedPage.editCottage;
import FloatedPage.editRoom;
import config.dbConnector;
import javax.swing.*; 
import java.awt.*;    
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Room extends javax.swing.JInternalFrame {

    public Room() {
        initComponents();
        displayData();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        //table header layout
        room_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14)); 
        room_table.getTableHeader().setOpaque(false);
        room_table.getTableHeader().setBorder(null);
        room_table.getTableHeader().setBackground(new Color(51, 51, 255));
        room_table.getTableHeader().setForeground(new Color(255, 255, 255));
        room_table.setRowHeight(30);
        
        // Enable automatic column resizing
        room_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // Adjust column widths based on content
        resizeColumnWidth(room_table);
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
    
    private void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 10, width); // Add padding
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
        
    public void displayData(){
        
        dbConnector dbc = new dbConnector();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM room");         
           DefaultTableModel model = (DefaultTableModel)room_table.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4), 
                   rs.getString(5), 
                   rs.getString(6), 
                   rs.getString(7)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        search_bar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        room_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addButton = new Swing.Button();
        deleteButton = new Swing.Button();
        editButton = new Swing.Button();
        jLabel2 = new javax.swing.JLabel();

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setPreferredSize(new java.awt.Dimension(910, 610));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_bar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        home.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        room_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 870, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 30));

        addButton.setBackground(new java.awt.Color(51, 51, 51));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add Room");
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        home.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 120, 50));

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });
        home.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 120, 50));

        editButton.setBackground(new java.awt.Color(51, 51, 51));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        home.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 120, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Refresh");
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        JDialog dialog = new JDialog(); // Create a floating window
        AddRoom newPanel = new AddRoom();

        dialog.add(newPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(bodycolor);
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(navcolor);
    }//GEN-LAST:event_addButtonMouseExited

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        deleteButton.setBackground(bodycolor);
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        deleteButton.setBackground(navcolor);
    }//GEN-LAST:event_deleteButtonMouseExited

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        editButton.setBackground(bodycolor);
    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        editButton.setBackground(navcolor);
    }//GEN-LAST:event_editButtonMouseExited

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int rowIndex = room_table.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, " Please select an Item!!! ");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = room_table.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM room WHERE room_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                if(rs.next()){
                    JDialog dialog = new JDialog(); // Create a floating window
                    editRoom newPanel = new editRoom();
                    
                    newPanel.roomIdField.setText(""+rs.getString("room_id"));
                    newPanel.rn.setText(""+rs.getString("room_number"));
                    newPanel.rt.setText(""+rs.getString("room_type"));
                    newPanel.bt.setText(""+rs.getString("bed_type"));
                    newPanel.c.setText(""+rs.getString("capacity"));
                    newPanel.ppn.setText(""+rs.getString("price_per_night"));
                    
                    Font arialFont = new Font("Arial", Font.PLAIN, 12);

                    newPanel.roomIdField.setFont(arialFont);
                    newPanel.roomIdField.setForeground(Color.BLACK);

                    newPanel.rn.setFont(arialFont);
                    newPanel.rn.setForeground(Color.BLACK);

                    newPanel.rt.setFont(arialFont);
                    newPanel.rt.setForeground(Color.BLACK);

                    newPanel.bt.setFont(arialFont);
                    newPanel.bt.setForeground(Color.BLACK);
                    
                    newPanel.c.setFont(arialFont);
                    newPanel.c.setForeground(Color.BLACK);
                    
                    newPanel.ppn.setFont(arialFont);
                    newPanel.ppn.setForeground(Color.BLACK);
                    
                    dialog.add(newPanel); // Add add_user to the dialog
                    dialog.pack();
                    dialog.setLocationRelativeTo(null); // Center the window
                    dialog.setModal(true); // Prevent interactions with the main window until closed
                    dialog.setVisible(true); // Show the floating add_user
                    
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }    
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        displayData();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button addButton;
    private Swing.Button deleteButton;
    private Swing.Button editButton;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable room_table;
    private javax.swing.JTextField search_bar;
    // End of variables declaration//GEN-END:variables
}
