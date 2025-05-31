
package StaffInternalPage;

import AdminInternalPage.*;
import FloatedPage.addCottage;
import FloatedPage.editCottage;
import FloatedPage.editUser;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Cottage extends javax.swing.JInternalFrame {

    public Cottage() {
        initComponents();
        displayData();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        //table header layout
        cottage_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14)); 
        cottage_table.getTableHeader().setOpaque(false);
        cottage_table.getTableHeader().setBorder(null);
        cottage_table.getTableHeader().setBackground(new Color(51, 51, 255));
        cottage_table.getTableHeader().setForeground(new Color(255, 255, 255));
        cottage_table.setRowHeight(25);
    }
    
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
        
    public void displayData(){
        dbConnector dbc = new dbConnector();
        try{
            ResultSet rs = dbc.getData("SELECT * FROM cottage");         

            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    // Make only the "Status" column editable
                    return column == 5; // index 5 = 6th column = Status
                }
            };

            model.setColumnIdentifiers(new String[]{"ID", "Cottage No", "Type", "Capacity", "Price", "Status"});
            cottage_table.setModel(model);
            model.setRowCount(0);

            while(rs.next()){
                model.addRow(new String[]{
                    rs.getString(1), 
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getString(4), 
                    rs.getString(5), 
                    rs.getString(6)
                });             
            }

            // Add combo box editor to "Status" column
            String[] statusOptions = {"Available", "Booked", "Reserved", "Maintenance"};
            TableColumn statusColumn = cottage_table.getColumnModel().getColumn(5); // column 6 = index 5
            statusColumn.setCellEditor(new DefaultCellEditor(new JComboBox<>(statusOptions)));

        } catch(SQLException ex){
            System.out.println("Errors: " + ex.getMessage());
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
        cottage_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateButton = new Swing.Button();

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

        cottage_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cottage_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cottage ID", "Name", "Capacity", "Location", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cottage_table.setAutoscrolls(false);
        cottage_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cottage_table.setFocusable(false);
        cottage_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        cottage_table.setOpaque(false);
        cottage_table.setRowHeight(25);
        cottage_table.setSelectionBackground(new java.awt.Color(255, 0, 0));
        cottage_table.setSelectionForeground(new java.awt.Color(204, 255, 255));
        cottage_table.setShowVerticalLines(false);
        cottage_table.getTableHeader().setResizingAllowed(false);
        cottage_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(cottage_table);

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 870, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Refresh");
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        updateButton.setBackground(new java.awt.Color(51, 51, 51));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        home.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        DefaultTableModel model = (DefaultTableModel)cottage_table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) cottage_table.getModel());
        cottage_table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
    }//GEN-LAST:event_search_barKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        displayData();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        updateButton.setBackground(bodycolor);
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        updateButton.setBackground(navcolor);
    }//GEN-LAST:event_updateButtonMouseExited

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selectedRow = cottage_table.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to update.");
            return;
        }

        // Get room ID and new status from the selected row
        String roomId = cottage_table.getValueAt(selectedRow, 0).toString(); // Assuming ID is in column 0
        String newStatus = cottage_table.getValueAt(selectedRow, 5).toString(); // Assuming Status is in column 6

        dbConnector dbc = new dbConnector();
        Connection conn = dbc.getConnection();

        try {
            // Update query
            String query = "UPDATE cottage SET status = ? WHERE cottage_id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, newStatus);
            pst.setString(2, roomId);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Status updated successfully.");
                displayData(); // Refresh table
            } else {
                JOptionPane.showMessageDialog(null, "Update failed.");
            }

        } catch (SQLException ex) {
            System.out.println("Error updating status: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An error occurred while updating.");
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cottage_table;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_bar;
    private Swing.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
