
package BookingsPages;

import config.GuestSession;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class propertiesPage extends javax.swing.JInternalFrame {
    
    private GuestSession guestSession;
    
    public propertiesPage(GuestSession session) {
        initComponents();
        
        this.guestSession = session;
        displayDataTbl_cottage();
        displayDataTbl_room();
        
        //table header layout
        roomTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13)); 
        roomTable.getTableHeader().setOpaque(false);
        roomTable.getTableHeader().setBorder(null);
        roomTable.getTableHeader().setBackground(new Color(51, 51, 255));
        roomTable.getTableHeader().setForeground(new Color(255, 255, 255));
        roomTable.setRowHeight(25);
        
        cottageTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13)); 
        cottageTable.getTableHeader().setOpaque(false);
        cottageTable.getTableHeader().setBorder(null);
        cottageTable.getTableHeader().setBackground(new Color(51, 51, 255));
        cottageTable.getTableHeader().setForeground(new Color(255, 255, 255));
        cottageTable.setRowHeight(25);
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    public void displayDataTbl_room(){
        
        dbConnector dbc = new dbConnector();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM room");         
           DefaultTableModel model = (DefaultTableModel)roomTable.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{
                   rs.getString(1), 
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
    
    public void displayDataTbl_cottage(){
        
        dbConnector dbc = new dbConnector();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM cottage");         
           DefaultTableModel model = (DefaultTableModel)cottageTable.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{
                   rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(4),
                   rs.getString(3),
                   rs.getString(5), 
                   rs.getString(6)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkInField = new Swing.TextField();
        checkOutField = new Swing.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        cottageTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button1 = new Swing.Button();
        selectButton = new Swing.Button();
        submitButton = new Swing.Button();

        dateChooser1.setTextRefernce(checkOutField);

        dateChooser2.setTextRefernce(checkInField);

        setPreferredSize(new java.awt.Dimension(896, 636));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(896, 636));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 20));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        roundedPanel1.setBackground(new java.awt.Color(102, 102, 102));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Booking Details");
        roundedPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 220, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agenda.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agenda.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        checkInField.setText("");
        checkInField.setLabelText("Check-In Date");
        checkInField.setOpaque(false);
        jPanel1.add(checkInField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, -1));

        checkOutField.setLabelText("Check-Out Date");
        checkOutField.setOpaque(false);
        jPanel1.add(checkOutField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, -1));

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Room Number", "Room Type", "Bed Type", "Capacity", "Price Per Night", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        roomTable.setShowHorizontalLines(false);
        roomTable.setShowVerticalLines(false);
        roomTable.getTableHeader().setResizingAllowed(false);
        roomTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(roomTable);

        jScrollPane1.setViewportView(jScrollPane3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 510, 180));

        cottageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Location", "Capacity", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cottageTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        cottageTable.setShowHorizontalLines(false);
        cottageTable.setShowVerticalLines(false);
        cottageTable.getTableHeader().setResizingAllowed(false);
        cottageTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(cottageTable);

        jScrollPane2.setViewportView(jScrollPane4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 510, 190));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cottage Table");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Room Table");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        button1.setBackground(new java.awt.Color(102, 102, 255));
        button1.setText("Select");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 80, 30));

        selectButton.setBackground(new java.awt.Color(102, 102, 255));
        selectButton.setText("Select");
        selectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectButtonMouseExited(evt);
            }
        });
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 80, 30));

        submitButton.setBackground(new java.awt.Color(153, 153, 153));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButtonMouseExited(evt);
            }
        });
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dateChooser2.showPopup();
    }//GEN-LAST:event_jLabel5MouseClicked
        
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dateChooser1.showPopup();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        int selectedRow = cottageTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a property first.");
            return;
        }
        
        String currentStatus = cottageTable.getValueAt(selectedRow, 5).toString(); // Column 5 holds the status

        if ("Booked".equalsIgnoreCase(currentStatus)) {
            JOptionPane.showMessageDialog(this, "This property is already booked. Please choose a different one.");
            return; 
        }
        
        String roomId = cottageTable.getValueAt(selectedRow, 0).toString(); 
        String roomName = cottageTable.getValueAt(selectedRow, 1).toString();
        String location = cottageTable.getValueAt(selectedRow, 2).toString();
        String roomCapacity = cottageTable.getValueAt(selectedRow, 3).toString();
        String price = cottageTable.getValueAt(selectedRow, 4).toString();

        guestSession.setSelectedCottageName(roomName);
        guestSession.setSelectedCottagelocation(location);
        guestSession.setSelectedCottageId(roomId);
        guestSession.setSelectedCottageCapacity(roomCapacity);
        guestSession.setSelectedCottagePrice(price);

        cottageTable.setValueAt("Booked", selectedRow, 5);

        JOptionPane.showMessageDialog(this, 
            "Cottage \"" + roomName + "\" has been successfully booked!", 
            "Booking Confirmed", 
            JOptionPane.INFORMATION_MESSAGE);

        // 🔍 Debug output
        System.out.println("=== Property Selection Debug ===");
        System.out.println("Selected Property ID: " + guestSession.getSelectedCottageId());
        System.out.println("Selected Property Name: " + guestSession.getSelectedCottageName());
        System.out.println("Selected Location: " + guestSession.getSelectedCottagelocation());
        System.out.println("Capacity: " + guestSession.getSelectedCottageCapacity());
        System.out.println("Price: " + guestSession.getSelectedCottagePrice());
        System.out.println("Status updated to: Booked");
        System.out.println("================================");

    }//GEN-LAST:event_button1ActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
                                            
        int selectedRow = roomTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a property first.");
            return;
        }
        
        String currentStatus = roomTable.getValueAt(selectedRow, 6).toString(); 

        if ("Booked".equalsIgnoreCase(currentStatus)) {
            JOptionPane.showMessageDialog(this, "This property is already booked. Please choose a different one.");
            return; 
        }

        String roomId = roomTable.getValueAt(selectedRow, 0).toString();
        String roomName = roomTable.getValueAt(selectedRow, 1).toString();
        String roomType = roomTable.getValueAt(selectedRow, 2).toString();
        String bedType = roomTable.getValueAt(selectedRow, 3).toString();
        String roomCapacity = roomTable.getValueAt(selectedRow, 4).toString();
        String roomPrice = roomTable.getValueAt(selectedRow, 5).toString();

        guestSession.setSelectedRoomName(roomName);
        guestSession.setSelectedRoomId(roomId);
        guestSession.setSelectedRoomCapacity(roomCapacity);
        guestSession.setSelectedRoomType(roomType);
        guestSession.setSelectedRoomPrice(roomPrice);
        guestSession.setSelectedBedType(bedType);

        roomTable.setValueAt("Booked", selectedRow, 6);

        JOptionPane.showMessageDialog(this, 
            "Room \"" + roomName + "\" has been successfully booked!", 
            "Booking Confirmed", 
            JOptionPane.INFORMATION_MESSAGE);

        // 🔍 Debug output
        System.out.println("=== Property Selection Debug ===");
        System.out.println("Selected Room ID: " + guestSession.getSelectedRoomId());
        System.out.println("Selected Room Number: " + guestSession.getSelectedRoomName());
        System.out.println("Selected Room Type: " + guestSession.getSelectedRoomType());
        System.out.println("Selected Bed Type: " + guestSession.getSelectedBedType());
        System.out.println("Selected Room Capacity: " + guestSession.getSelectedRoomCapacity());
        System.out.println("Selected Room Price: " + guestSession.getSelectedRoomPrice());
        System.out.println("Room status updated to: Booked");

    }//GEN-LAST:event_selectButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String checkInDate = checkInField.getText().trim();
        String checkOutDate = checkOutField.getText().trim();

        if (checkInDate.isEmpty() || checkOutDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select both check-in and check-out dates.");
            return;
        }

        // Save dates into session
        guestSession.setCheckIn(checkInDate);
        guestSession.setCheckOut(checkOutDate);

        boolean hasRoom = guestSession.getSelectedRoomId() != null;
        boolean hasCottage = guestSession.getSelectedCottageId() != null;

        if (!hasRoom && !hasCottage) {
            JOptionPane.showMessageDialog(this, "Please select at least a Room or a Cottage.");
            return;
        }

        // Optional: Show what was selected
        if (hasRoom) {
            System.out.println("Room selected: " + guestSession.getSelectedRoomName());
        }

        if (hasCottage) {
            System.out.println("Cottage selected: " + guestSession.getSelectedCottageName());
        }

        // Proceed to next screen
        ReviewDetails review = new ReviewDetails(guestSession);
        Effect.TransitionEffect.fadeOutAndOpen(this, review);

    }//GEN-LAST:event_submitButtonActionPerformed

    private void submitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseEntered
        submitButton.setBackground(new Color(102,102,102));    }//GEN-LAST:event_submitButtonMouseEntered

    private void submitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseExited
        submitButton.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_submitButtonMouseExited

    private void selectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectButtonMouseEntered
        selectButton.setBackground(new Color (0,0,255));
    }//GEN-LAST:event_selectButtonMouseEntered

    private void selectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectButtonMouseExited
        selectButton.setBackground(new Color (102,102,255));
    }//GEN-LAST:event_selectButtonMouseExited

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
        button1.setBackground(new Color (0,0,255));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        button1.setBackground(new Color (102,102,255));
    }//GEN-LAST:event_button1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button button1;
    private Swing.TextField checkInField;
    private Swing.TextField checkOutField;
    private javax.swing.JTable cottageTable;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable roomTable;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.Button selectButton;
    private Swing.Button submitButton;
    // End of variables declaration//GEN-END:variables
}
