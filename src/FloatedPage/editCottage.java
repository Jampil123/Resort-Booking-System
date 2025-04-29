
package FloatedPage;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class editCottage extends javax.swing.JPanel {

    public editCottage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new Swing.Button();
        cancelButton = new javax.swing.JLabel();
        name_validation = new javax.swing.JLabel();
        location_validation = new javax.swing.JLabel();
        capacity_validation = new javax.swing.JLabel();
        price_validation = new javax.swing.JLabel();
        name_field = new Swing.TextField();
        capacity_field = new Swing.TextField();
        location_field = new Swing.TextField();
        price_field = new Swing.TextField();
        checkOut_validation = new javax.swing.JLabel();
        cottageId = new Swing.TextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel1.setBackground(new java.awt.Color(51, 51, 51));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Cottage");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 210, 60));

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
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 90, 40));

        cancelButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, -1, -1));

        name_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(name_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 210, 10));

        location_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(location_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 10));

        capacity_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(capacity_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 210, 10));

        price_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(price_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 210, 10));

        name_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_field.setLabelText("Name");
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 400, -1));

        capacity_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacity_field.setLabelText("Capacity");
        jPanel1.add(capacity_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 400, -1));

        location_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        location_field.setLabelText("Location");
        jPanel1.add(location_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 400, -1));

        price_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price_field.setLabelText("Price");
        jPanel1.add(price_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 400, -1));

        checkOut_validation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(checkOut_validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 230, 10));

        cottageId.setEditable(false);
        cottageId.setBackground(new java.awt.Color(255, 255, 255));
        cottageId.setLabelText("ID");
        jPanel1.add(cottageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 400, -1));

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

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        updateButton.setBackground(new Color (102,102,102));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        updateButton.setBackground(new Color (51,51,51));
    }//GEN-LAST:event_updateButtonMouseExited

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed


    }//GEN-LAST:event_updateButtonActionPerformed

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancelButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelButton;
    public Swing.TextField capacity_field;
    private javax.swing.JLabel capacity_validation;
    private javax.swing.JLabel checkOut_validation;
    public Swing.TextField cottageId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public Swing.TextField location_field;
    private javax.swing.JLabel location_validation;
    public Swing.TextField name_field;
    private javax.swing.JLabel name_validation;
    public Swing.TextField price_field;
    private javax.swing.JLabel price_validation;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.Button updateButton;
    // End of variables declaration//GEN-END:variables

}
