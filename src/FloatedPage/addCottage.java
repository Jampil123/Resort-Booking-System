
package FloatedPage;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class addCottage extends javax.swing.JPanel {

    public addCottage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        addButton = new Swing.Button();
        cancelButton = new javax.swing.JLabel();
        name_validation = new javax.swing.JLabel();
        location_validation = new javax.swing.JLabel();
        capacity_validation = new javax.swing.JLabel();
        price_validation = new javax.swing.JLabel();
        name = new Swing.TextField();
        capacity = new Swing.TextField();
        location = new Swing.TextField();
        price = new Swing.TextField();
        checkOut_validation = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Cottage");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 210, 60));

        addButton.setBackground(new java.awt.Color(51, 51, 51));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
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
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 90, 40));

        cancelButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, -1, -1));

        name_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(name_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 10));

        location_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(location_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 210, 10));

        capacity_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(capacity_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 10));

        price_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(price_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 210, 10));

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setLabelText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 400, -1));

        capacity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacity.setLabelText("Capacity");
        jPanel1.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 400, -1));

        location.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        location.setLabelText("Location");
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 400, -1));

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.setLabelText("Price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 400, -1));

        checkOut_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(checkOut_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 230, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_addButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String Name = name.getText();
        String Capacity = capacity.getText();
        String Location = location.getText();
        String Price = price.getText();

        Boolean error = true;

        // Validate Name
        if (Name.isEmpty()) {
            name_validation.setText("Name field is empty");
            name_validation.setForeground(Color.RED);
            name_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            error = false;
        } else {
            name_validation.setText(""); 
        }

        // Validate Capacity
        if (Capacity.isEmpty()) {
            capacity_validation.setText("Capacity field is empty");
            capacity_validation.setForeground(Color.RED);
            capacity_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            error = false;
        } else {
            capacity_validation.setText("");
        }

        // Validate Location
        if (Location.isEmpty()) {
            location_validation.setText("Location field is empty");
            location_validation.setForeground(Color.RED);
            location_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            error = false;
        } else {
            location_validation.setText("");
        }

        // Validate Price
        if (Price.isEmpty()) {
            price_validation.setText("Price field is empty");
            price_validation.setForeground(Color.RED);
            price_validation.setFont(new Font("Arial", Font.PLAIN, 9));
            error = false;
        } else {
            price_validation.setText("");
        }

        // Proceed if no validation errors
        if (error) {
            dbConnector con = new dbConnector();
            try (Connection cn = con.getConnection()) {
                if (cn != null) {  
                    String insertQuery = "INSERT INTO cottage (name, capacity, location, price, status) VALUES (?, ?, ?, ?, 'Available')";

                    try (PreparedStatement pst = cn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                        pst.setString(1, Name);
                        pst.setInt(2, Integer.parseInt(Capacity));  
                        pst.setString(3, Location);
                        pst.setDouble(4, Double.parseDouble(Price)); 

                        int result = pst.executeUpdate();
                        if (result > 0) {
                            // Get the generated keys (ID of the inserted cottage)
                            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                                if (generatedKeys.next()) {
                                    int lastInsertedId = generatedKeys.getInt(1);

                                    // Log the action with the user's session
                                    Session sess = Session.getInstance();
                                    String action = "Added new cottage with ID " + lastInsertedId;
                                    con.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                                    JOptionPane.showMessageDialog(null, "Cottage added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                                    // Close the registration form (JDialog)
                                    JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                                    if (parentDialog != null) {
                                        parentDialog.dispose();  // Closes the JDialog
                                    }
                                }
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "Error retrieving generated keys: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to add cottage. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button addButton;
    private javax.swing.JLabel cancelButton;
    private Swing.TextField capacity;
    private javax.swing.JLabel capacity_validation;
    private javax.swing.JLabel checkOut_validation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private Swing.TextField location;
    private javax.swing.JLabel location_validation;
    private Swing.TextField name;
    private javax.swing.JLabel name_validation;
    private Swing.TextField price;
    private javax.swing.JLabel price_validation;
    private Swing.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
