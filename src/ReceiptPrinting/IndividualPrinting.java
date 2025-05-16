
package ReceiptPrinting;

import config.panelPrinter;
import java.awt.Dimension;
import javax.swing.JPanel;

public class IndividualPrinting extends javax.swing.JPanel {

    public IndividualPrinting() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receipt = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nGuest = new javax.swing.JLabel();
        sr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nightStayed = new javax.swing.JLabel();
        checkIn = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        checkOut = new javax.swing.JLabel();
        roundedPanel3 = new Swing.RoundedPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pricePerNight = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        roomtype = new javax.swing.JLabel();
        capacity = new javax.swing.JLabel();
        bedType = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JLabel();
        ccapacity = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        cottageName = new javax.swing.JLabel();
        roundedPanel4 = new Swing.RoundedPanel();
        jLabel16 = new javax.swing.JLabel();
        roundedPanel5 = new Swing.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        receiptNumber = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        printButton = new Swing.Button();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receipt.setBackground(new java.awt.Color(255, 255, 255));

        roundedPanel1.setBackground(new java.awt.Color(236, 233, 233));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Guest Details");
        roundedPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Full Name :");
        roundedPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("Name");
        roundedPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setText("Email");
        roundedPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nights :");
        roundedPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Phone :");
        roundedPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Number of Guest :");
        roundedPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        nGuest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nGuest.setText("Guest");
        roundedPanel1.add(nGuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, -1));

        sr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sr.setText("Request");
        roundedPanel1.add(sr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Special Request :");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contact.setText("Phone");
        roundedPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jLabel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        roundedPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 208, 330, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Email :");
        roundedPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Check-in :");
        roundedPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        nightStayed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nightStayed.setText("nights");
        roundedPanel1.add(nightStayed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        checkIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkIn.setText("in");
        roundedPanel1.add(checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("Check-out :");
        roundedPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        checkOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkOut.setText("out");
        roundedPanel1.add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 180, -1));

        roundedPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Property Book Details");
        roundedPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Price Per Night :");
        roundedPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cottage");
        roundedPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Location :");
        roundedPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Room Type :");
        roundedPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Bed Type :");
        roundedPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Capacity :");
        roundedPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        pricePerNight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pricePerNight.setText("None");
        roundedPanel3.add(pricePerNight, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 180, -1));

        price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        price.setText("None");
        roundedPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 180, -1));

        roomtype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roomtype.setText("None");
        roundedPanel3.add(roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        capacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        capacity.setText("None");
        roundedPanel3.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, -1));

        bedType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bedType.setText("None");
        roundedPanel3.add(bedType, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 180, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Room Number :");
        roundedPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Cottage Name :");
        roundedPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Price :");
        roundedPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Capacity :");
        roundedPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        roundedPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 237, 400, -1));

        jLabel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        roundedPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 388, 400, -1));

        roomNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roomNumber.setText("None");
        roundedPanel3.add(roomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        ccapacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ccapacity.setText("None");
        roundedPanel3.add(ccapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, -1));

        location.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        location.setText("None");
        roundedPanel3.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 180, -1));

        cottageName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cottageName.setText("None");
        roundedPanel3.add(cottageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, -1));

        roundedPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Room ");

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(21, 21, 21))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        roundedPanel3.add(roundedPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 110, 30));

        roundedPanel5.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        roundedPanel3.add(roundedPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 250, 110, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Receipt No. :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Date :");

        receiptNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        receiptNumber.setForeground(new java.awt.Color(255, 51, 0));

        date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setText("Total :");

        totalAmount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText(" Thank you for choosing Paradise Resort. We look forward to ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel31.setText(" welcoming you again!");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Authorized Signature:");

        javax.swing.GroupLayout receiptLayout = new javax.swing.GroupLayout(receipt);
        receipt.setLayout(receiptLayout);
        receiptLayout.setHorizontalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptLayout.createSequentialGroup()
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(receiptNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel32)))
                                .addGap(18, 18, 18)
                                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel30)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptLayout.createSequentialGroup()
                                            .addGap(130, 130, 130)
                                            .addComponent(jLabel31)
                                            .addGap(149, 149, 149)))
                                    .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        receiptLayout.setVerticalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(receiptNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addGap(57, 57, 57))
        );

        add(receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 47, -1, 690));

        printButton.setBackground(new java.awt.Color(51, 51, 255));
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setText("Print");
        printButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 760, 60, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        receipt.setPreferredSize(new Dimension(870, 651)); // for example
        receipt.revalidate(); // refresh layout

        // Proceed to print
        JPanel  newpanel = new JPanel();
        panelPrinter panelprint = new panelPrinter(receipt);
        panelprint.printPanel();
        

    }//GEN-LAST:event_printButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel bedType;
    public javax.swing.JLabel capacity;
    public javax.swing.JLabel ccapacity;
    public javax.swing.JLabel checkIn;
    public javax.swing.JLabel checkOut;
    public javax.swing.JLabel contact;
    public javax.swing.JLabel cottageName;
    public javax.swing.JLabel date;
    public javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel location;
    public javax.swing.JLabel nGuest;
    public javax.swing.JLabel name;
    public javax.swing.JLabel nightStayed;
    public javax.swing.JLabel price;
    public javax.swing.JLabel pricePerNight;
    private Swing.Button printButton;
    private javax.swing.JPanel receipt;
    public javax.swing.JLabel receiptNumber;
    public javax.swing.JLabel roomNumber;
    public javax.swing.JLabel roomtype;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.RoundedPanel roundedPanel3;
    private Swing.RoundedPanel roundedPanel4;
    private Swing.RoundedPanel roundedPanel5;
    public javax.swing.JLabel sr;
    public javax.swing.JLabel totalAmount;
    // End of variables declaration//GEN-END:variables
}
