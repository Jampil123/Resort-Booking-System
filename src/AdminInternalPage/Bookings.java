
package AdminInternalPage;

import FloatedPage.addBookings;
import ReceiptPrinting.IndividualPrinting;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bookings extends javax.swing.JInternalFrame {

    public Bookings() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        booking_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14)); 
        booking_table.getTableHeader().setOpaque(false);
        booking_table.getTableHeader().setBorder(null);
        booking_table.getTableHeader().setBackground(new Color(51, 51, 255));
        booking_table.getTableHeader().setForeground(new Color(255, 255, 255));
        booking_table.setRowHeight(25);
    }
    
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
    
    
    public void displayData(){
        
        dbConnector dbc = new dbConnector();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM booking");         
           DefaultTableModel model = (DefaultTableModel)booking_table.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(4), 
                   rs.getString(6), 
                   rs.getString(9), 
                   rs.getString(10), 
                   rs.getString(11),
                   rs.getString(12),
                   rs.getString(13)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }  
    
    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }
    
    public int getSelectedUserId() {
        int selectedRow = booking_table.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(booking_table.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
            }
        return -1; // Return -1 if no row is selected
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booking_table = new javax.swing.JTable();
        addButton = new javax.swing.JLabel();
        printButton = new Swing.Button();
        approvedButton = new Swing.Button();
        rejectButton = new Swing.Button();
        deleteButton = new Swing.Button();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bookings");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        booking_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Full Name", "Contact Number", "Check In", "Check Out", "Total Nights", "Total Payment", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booking_table.setAutoscrolls(false);
        booking_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        booking_table.setFocusable(false);
        booking_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        booking_table.setOpaque(false);
        booking_table.setRowHeight(25);
        booking_table.setSelectionBackground(new java.awt.Color(255, 0, 0));
        booking_table.setSelectionForeground(new java.awt.Color(204, 255, 255));
        booking_table.setShowVerticalLines(false);
        booking_table.getTableHeader().setResizingAllowed(false);
        booking_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(booking_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 850, 480));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        printButton.setBackground(new java.awt.Color(51, 51, 51));
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print");
        printButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printButtonMouseExited(evt);
            }
        });
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        jPanel1.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 120, 40));

        approvedButton.setBackground(new java.awt.Color(51, 51, 51));
        approvedButton.setForeground(new java.awt.Color(255, 255, 255));
        approvedButton.setText("Approve");
        approvedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        approvedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approvedButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approvedButtonMouseExited(evt);
            }
        });
        approvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedButtonActionPerformed(evt);
            }
        });
        jPanel1.add(approvedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 110, 40));

        rejectButton.setBackground(new java.awt.Color(51, 51, 51));
        rejectButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectButton.setText("Reject");
        rejectButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rejectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rejectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rejectButtonMouseExited(evt);
            }
        });
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(rejectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 110, 40));

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
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        JDialog dialog = new JDialog(); // Create a floating window
        addBookings newPanel = new addBookings();

        dialog.add(newPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_addButtonMouseClicked

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        int rowIndex = booking_table.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        } else {
            try {
                dbConnector dbc = new dbConnector();
                TableModel tbl = booking_table.getModel();
                String bookingId = tbl.getValueAt(rowIndex, 0).toString();

                // Use LEFT JOINs and alias conflicting column names
                String query = "SELECT b.*, " +
                        "r.room_number, r.room_type, r.bed_type, r.capacity AS room_capacity, r.price_per_night, " +
                        "c.name AS cottage_name, c.capacity AS cottage_capacity, c.location AS cottage_location, c.price AS cottage_price " +
                        "FROM booking b " +
                        "LEFT JOIN room r ON b.room_id = r.room_id " +
                        "LEFT JOIN cottage c ON b.cottage_id = c.cottage_id " +
                        "WHERE b.booking_id = '" + bookingId + "'";

                ResultSet rs = dbc.getData(query);

                if (rs.next()) {
                    String status = rs.getString("status");
                    if ("Pending".equalsIgnoreCase(status) || "Rejected".equalsIgnoreCase(status)) {
                        JOptionPane.showMessageDialog(null, "Cannot print receipt for a booking with status: " + status);
                        return; 
                    }

                    JDialog dialog = new JDialog();
                    IndividualPrinting pr = new IndividualPrinting();

                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    pr.name.setText(rs.getString("full_name"));
                    pr.contact.setText(rs.getString("contact_number"));
                    pr.email.setText(rs.getString("email"));
                    pr.checkIn.setText(rs.getString("check_in"));
                    pr.checkOut.setText(rs.getString("check_out"));
                    pr.nGuest.setText(rs.getString("number_of_guests"));
                    pr.nightStayed.setText(rs.getString("total_nights"));

                    // Room details (null-safe)
                    pr.roomNumber.setText(nullToEmpty(rs.getString("room_number")));
                    pr.roomtype.setText(nullToEmpty(rs.getString("room_type")));
                    pr.bedType.setText(nullToEmpty(rs.getString("bed_type")));
                    pr.capacity.setText(nullToEmpty(rs.getString("room_capacity")));
                    pr.pricePerNight.setText(nullToEmpty(rs.getString("price_per_night")));

                    // Cottage details (null-safe)
                    pr.cottageName.setText(nullToEmpty(rs.getString("cottage_name")));
                    pr.ccapacity.setText(nullToEmpty(rs.getString("cottage_capacity")));
                    pr.location.setText(nullToEmpty(rs.getString("cottage_location")));
                    pr.price.setText(nullToEmpty(rs.getString("cottage_price")));

                    pr.receiptNumber.setText(rs.getString("booking_id"));
                    pr.date.setText(currentDate.format(formatter));
                    
                    pr.totalAmount.setText(rs.getString("total_payment"));

                    dialog.add(pr);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setModal(true);
                    dialog.setVisible(true);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_printButtonActionPerformed

    private void approvedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedButtonActionPerformed
        int selectedUserId = getSelectedUserId(); 

        if (selectedUserId != -1) {
            try {
                dbConnector db = new dbConnector(); 
                Connection conn = db.getConnection(); 

                String query = "UPDATE booking SET status = 'Approved' WHERE booking_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                    pstmt.setInt(1, selectedUserId);

                    int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    ResultSet generatedKeys = pstmt.getGeneratedKeys();
                        int lastInsertedId = 0;
                        if (generatedKeys.next()) {
                            lastInsertedId = generatedKeys.getInt(1);
                        }

                        // Logging the action
                        Session sess = Session.getInstance();
                        String action = "Approved booking with ID " + selectedUserId;
                        db.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    JOptionPane.showMessageDialog(this, "User approved successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to approve booking.");
                }
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to approve.");
        }
    }//GEN-LAST:event_approvedButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        int selectedUserId = getSelectedUserId(); 

        if (selectedUserId != -1) {
            try {
                dbConnector db = new dbConnector(); 
                Connection conn = db.getConnection(); 

                String query = "UPDATE booking SET status = 'Rejected' WHERE booking_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                    pstmt.setInt(1, selectedUserId);

                    int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    ResultSet generatedKeys = pstmt.getGeneratedKeys();
                        int lastInsertedId = 0;
                        if (generatedKeys.next()) {
                            lastInsertedId = generatedKeys.getInt(1);
                        }

                        // Logging the action
                        Session sess = Session.getInstance();
                        String action = "Reject booking with ID " + selectedUserId;
                        db.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    JOptionPane.showMessageDialog(this, "Booking rejected!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to reject .");
                }
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to reject.");
        }
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = booking_table.getSelectedRow(); // Get selected row index
    
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        // Assuming the ID is in the first column (index 0)
        int id = Integer.parseInt(booking_table.getValueAt(selectedRow, 0).toString());

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                dbConnector con = new dbConnector();
                Connection cn = con.getConnection();
                
                String sql = "DELETE FROM booking WHERE booking_id = ?";
                PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setInt(1, id);
                
                
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    int lastInsertedId = 0;
                    if (generatedKeys.next()) {
                        lastInsertedId = generatedKeys.getInt(1);
                    }

                    // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Delete booking with ID " + id;
                    con.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    JOptionPane.showMessageDialog(this, "Record deleted successfully.");

                    // Remove from JTable model
                    DefaultTableModel model = (DefaultTableModel) booking_table.getModel();
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Record not found.");
                }

                pst.close();
                cn.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error deleting record: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        deleteButton.setBackground(bodycolor);
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        deleteButton.setBackground(navcolor);
    }//GEN-LAST:event_deleteButtonMouseExited

    private void rejectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectButtonMouseEntered
        rejectButton.setBackground(bodycolor);
    }//GEN-LAST:event_rejectButtonMouseEntered

    private void rejectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectButtonMouseExited
        rejectButton.setBackground(navcolor);
    }//GEN-LAST:event_rejectButtonMouseExited

    private void approvedButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedButtonMouseEntered
        approvedButton.setBackground(bodycolor);
    }//GEN-LAST:event_approvedButtonMouseEntered

    private void approvedButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedButtonMouseExited
        approvedButton.setBackground(navcolor);
    }//GEN-LAST:event_approvedButtonMouseExited

    private void printButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseEntered
       printButton.setBackground(bodycolor);
    }//GEN-LAST:event_printButtonMouseEntered

    private void printButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseExited
        printButton.setBackground(navcolor);
    }//GEN-LAST:event_printButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private Swing.Button approvedButton;
    private javax.swing.JTable booking_table;
    private Swing.Button deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Swing.Button printButton;
    private Swing.Button rejectButton;
    // End of variables declaration//GEN-END:variables
}
