
package FloatedPage;

import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AddRoom extends javax.swing.JPanel {

    public AddRoom() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppn = new Swing.TextField();
        rn = new Swing.TextField();
        rt = new Swing.TextField();
        bt = new Swing.TextField();
        c = new Swing.TextField();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        addButton = new Swing.Button();
        rnValidation = new javax.swing.JLabel();
        ppnValidation = new javax.swing.JLabel();
        rtValidation = new javax.swing.JLabel();
        btValidation = new javax.swing.JLabel();
        cValidation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(326, 500));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ppn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ppn.setLabelText("Price Per Night");
        ppn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ppnMousePressed(evt);
            }
        });
        add(ppn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 270, -1));

        rn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rn.setLabelText("Room Number");
        rn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rnMousePressed(evt);
            }
        });
        add(rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, -1));

        rt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rt.setLabelText("Room Type");
        rt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rtMousePressed(evt);
            }
        });
        add(rt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, -1));

        bt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bt.setLabelText("Bed Type");
        bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btMousePressed(evt);
            }
        });
        add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, -1));

        c.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        c.setLabelText("Capacity");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cMousePressed(evt);
            }
        });
        add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 270, -1));

        roundedPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundedPanel1.setForeground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD ROOM");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 220, 60));

        addButton.setBackground(new java.awt.Color(102, 102, 102));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 80, -1));

        rnValidation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rnValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rnValidation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rnValidation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(rnValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 20));

        ppnValidation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ppnValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ppnValidation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ppnValidation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(ppnValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 270, 20));

        rtValidation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        rtValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rtValidation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rtValidation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(rtValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 20));

        btValidation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btValidation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btValidation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(btValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 20));

        cValidation.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        cValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cValidation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cValidation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(cValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 270, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String roomNumber = rn.getText().trim();
        String roomType = rt.getText().trim();
        String bedType = bt.getText().trim();
        String capacity = c.getText().trim();
        String pricePerNight = ppn.getText().trim();

        boolean isValid = true;

        // Validate room number
        if (roomNumber.isEmpty()) {
            rnValidation.setText("Field is empty");
            rnValidation.setForeground(Color.RED);
            rnValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } 

        // Validate room type
        if (roomType.isEmpty()) {
            rtValidation.setText("Field is empty");
            rtValidation.setForeground(Color.RED);
            rtValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } 

        // Validate bed type (you can add more complex checks here if needed)
        if (bedType.isEmpty()) {
            btValidation.setText("Field is empty");
            btValidation.setForeground(Color.RED);
            btValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } 

        // Validate capacity (only numeric values allowed)
        if (capacity.isEmpty()) {
            cValidation.setText("Field is empty");
            cValidation.setForeground(Color.RED);
            cValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } else if (!capacity.matches("\\d+")) {  // Check if input contains only digits
            cValidation.setText("Invalid input");
            cValidation.setForeground(Color.RED);
            cValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } 

        // Validate price per night (you can also check if it's a valid number)
        if (pricePerNight.isEmpty()) {
            ppnValidation.setText("Field is empty");
            ppnValidation.setForeground(Color.RED);
            ppnValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } else if (!pricePerNight.matches("\\d+(\\.\\d{1,2})?")) {  // Optional: Check if pricePerNight is a valid number
            ppnValidation.setText("Invalid price");
            ppnValidation.setForeground(Color.RED);
            ppnValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        } 
        
        if (isValid) {
            dbConnector con = new dbConnector();
            try (Connection cn = con.getConnection()) {
                if (cn != null) {  // Ensure the connection is valid
                    String sql = "INSERT INTO room (room_number, room_type, bed_type, capacity, price_per_night, status) VALUES (?, ?, ?, ?, ?, 'Available')";
                    try (PreparedStatement stmt = cn.prepareStatement(sql)) {
                        stmt.setString(1, roomNumber);
                        stmt.setString(2, roomType);
                        stmt.setString(3, bedType);
                        stmt.setInt(4, Integer.parseInt(capacity));
                        stmt.setDouble(5, Double.parseDouble(pricePerNight));

                        int rowsInserted = stmt.executeUpdate();
                        if (rowsInserted > 0) {
                            JOptionPane.showMessageDialog(null, "Room details added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            
                            // Close the registration form (JDialog)
                            JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                            if (parentDialog != null) {
                                parentDialog.dispose();  // Closes the JDialog
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to insert data", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error inserting data into the database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Connection to the database failed", "Connection Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_addButtonMouseExited

    private void rnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rnMousePressed
        rnValidation.setText("");
    }//GEN-LAST:event_rnMousePressed

    private void rtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rtMousePressed
        rtValidation.setText("");
    }//GEN-LAST:event_rtMousePressed

    private void btMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMousePressed
        btValidation.setText("");
    }//GEN-LAST:event_btMousePressed

    private void cMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMousePressed
        cValidation.setText("");
    }//GEN-LAST:event_cMousePressed

    private void ppnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppnMousePressed
        ppnValidation.setText("");
    }//GEN-LAST:event_ppnMousePressed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button addButton;
    private Swing.TextField bt;
    private javax.swing.JLabel btValidation;
    private Swing.TextField c;
    private javax.swing.JLabel cValidation;
    private javax.swing.JLabel jLabel1;
    private Swing.TextField ppn;
    private javax.swing.JLabel ppnValidation;
    private Swing.TextField rn;
    private javax.swing.JLabel rnValidation;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.TextField rt;
    private javax.swing.JLabel rtValidation;
    // End of variables declaration//GEN-END:variables
}
