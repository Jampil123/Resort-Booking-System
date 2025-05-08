
package BookingsPages;

import config.GuestSession;
import config.dbConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ReviewDetails extends javax.swing.JInternalFrame {
    
    private GuestSession guestSession;
    
    public ReviewDetails(GuestSession guestSession) {
        initComponents();
        this.guestSession = guestSession;
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    // Helper method for date conversion
    private String convertToSQLDate(String dateStr) throws ParseException {
        // Define the input date format (dd-MM-yyyy)
        SimpleDateFormat fromFormat = new SimpleDateFormat("dd-MM-yyyy");
        // Define the output date format (yyyy-MM-dd)
        SimpleDateFormat toFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse the date string from the input format
        Date date = fromFormat.parse(dateStr);

        // Return the formatted date string in the required SQL format
        return toFormat.format(date);
    }
    
        
    private String valueOrDefault(Object value, String defaultText) {
        return (value != null && !value.toString().isEmpty()) ? value.toString() : defaultText;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        roundedPanel2 = new Swing.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guest = new javax.swing.JLabel();
        sr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        night = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        out = new javax.swing.JLabel();
        roundedPanel3 = new Swing.RoundedPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rPrice = new javax.swing.JLabel();
        cPrice = new javax.swing.JLabel();
        rType = new javax.swing.JLabel();
        rCapacity = new javax.swing.JLabel();
        rBed = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rNumber = new javax.swing.JLabel();
        cCapacity = new javax.swing.JLabel();
        cLocation = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        roundedPanel4 = new Swing.RoundedPanel();
        jLabel16 = new javax.swing.JLabel();
        roundedPanel5 = new Swing.RoundedPanel();
        submitButton = new Swing.Button();
        roundedPanel6 = new Swing.RoundedPanel();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(886, 636));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMaximumSize(new java.awt.Dimension(880, 470));
        jPanel12.setMinimumSize(new java.awt.Dimension(880, 470));
        jPanel12.setPreferredSize(new java.awt.Dimension(886, 636));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedPanel2.setBackground(new java.awt.Color(102, 102, 102));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Review Your Details");
        roundedPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 180, 60));

        jPanel12.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 220, 60));

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

        jPanel12.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

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

        jPanel12.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 20));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

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

        jPanel12.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

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

        guest.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guest.setText("Guest");
        roundedPanel1.add(guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 180, -1));

        sr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sr.setText("Request");
        roundedPanel1.add(sr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Special Request :");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone.setText("Phone");
        roundedPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jLabel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        roundedPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 208, 330, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Email :");
        roundedPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Check-in :");
        roundedPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        night.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        night.setText("nights");
        roundedPanel1.add(night, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        in.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        in.setText("in");
        roundedPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("Check-out :");
        roundedPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        out.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        out.setText("out");
        roundedPanel1.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 180, -1));

        jPanel12.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 400));

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

        rPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rPrice.setText("None");
        roundedPanel3.add(rPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 180, -1));

        cPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cPrice.setText("None");
        roundedPanel3.add(cPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 180, -1));

        rType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rType.setText("None");
        roundedPanel3.add(rType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        rCapacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rCapacity.setText("None");
        roundedPanel3.add(rCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, -1));

        rBed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rBed.setText("None");
        roundedPanel3.add(rBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 180, -1));

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

        rNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rNumber.setText("None");
        roundedPanel3.add(rNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        cCapacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cCapacity.setText("None");
        roundedPanel3.add(cCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, -1));

        cLocation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cLocation.setText("None");
        roundedPanel3.add(cLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 180, -1));

        cname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cname.setText("None");
        roundedPanel3.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, -1));

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

        jPanel12.add(roundedPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 440, 400));

        submitButton.setBackground(new java.awt.Color(153, 153, 153));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel12.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 110, -1));

        roundedPanel6.setBackground(new java.awt.Color(102, 102, 102));
        roundedPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total : ");
        roundedPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2, -1, 60));

        total.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        roundedPanel6.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 150, 60));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("₱");
        roundedPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 2, -1, 60));

        jPanel12.add(roundedPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 540, 500, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

        name.setText(valueOrDefault(guestSession.getFullName(), "Not provided"));
        email.setText(valueOrDefault(guestSession.getEmail(), "Not provided"));
        phone.setText(valueOrDefault(guestSession.getPhone(), "Not provided"));
        guest.setText(valueOrDefault(guestSession.getNumberOfGuests(), "0"));
        sr.setText(valueOrDefault(guestSession.getSpecialRequest(), "None"));

        // Cottage section
        cname.setText(valueOrDefault(guestSession.getSelectedCottageName(), "None"));
        cCapacity.setText(valueOrDefault(guestSession.getSelectedCottageCapacity(), "None"));
        cLocation.setText(valueOrDefault(guestSession.getSelectedCottagelocation(), "None"));
        cPrice.setText(valueOrDefault(guestSession.getSelectedCottagePrice(), "0"));

        // Room section
        rNumber.setText(valueOrDefault(guestSession.getSelectedRoomName(), "None"));
        rType.setText(valueOrDefault(guestSession.getSelectedRoomType(), "None"));
        rCapacity.setText(valueOrDefault(guestSession.getSelectedRoomCapacity(), "None"));
        rPrice.setText(valueOrDefault(guestSession.getSelectedRoomPrice(), "0"));

        
        // Date handling & total calculation
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            String checkInStr = guestSession.getCheckIn();
            String checkOutStr = guestSession.getCheckOut();

            in.setText(valueOrDefault(checkInStr, "None"));
            out.setText(valueOrDefault(checkOutStr, "None"));

            Date checkInDate = sdf.parse(checkInStr);
            Date checkOutDate = sdf.parse(checkOutStr);

            long diffInMillies = checkOutDate.getTime() - checkInDate.getTime();
            long numberOfNights = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            night.setText(String.valueOf(numberOfNights));

            // Price parsing
            double roomPrice = 0.0;
            double cottagePrice = 0.0;

            if (guestSession.getSelectedRoomPrice() != null && !guestSession.getSelectedRoomPrice().isEmpty()) {
                roomPrice = Double.parseDouble(guestSession.getSelectedRoomPrice());
            }

            if (guestSession.getSelectedCottagePrice() != null && !guestSession.getSelectedCottagePrice().isEmpty()) {
                cottagePrice = Double.parseDouble(guestSession.getSelectedCottagePrice());
            }

            double roomTotal = roomPrice * numberOfNights;
            double totalCost = roomTotal + cottagePrice;

            total.setText(String.format("%.2f", totalCost));

        } catch (ParseException | NumberFormatException | NullPointerException e) {
            night.setText("Invalid");
            total.setText("Error");
            System.err.println("Error calculating total: " + e.getMessage());
        }

    }//GEN-LAST:event_formInternalFrameActivated

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
 
        String fullName = name.getText();
        String emailStr = email.getText();
        String phoneStr = phone.getText();
        int numberOfGuests = Integer.parseInt(guest.getText());
        String specialReq = sr.getText();
        String checkInStr = in.getText();
        String checkOutStr = out.getText();
        int totalNights = Integer.parseInt(night.getText());
        String roomId = guestSession.getSelectedRoomId();      
        String cottageId = guestSession.getSelectedCottageId(); 
        String status = "Pending";

        String totalPaymentStr = total.getText(); 
        double totalPayment = Double.parseDouble(totalPaymentStr); 

        dbConnector con = new dbConnector();

        String sql = "INSERT INTO booking (room_id, cottage_id, full_name, email, contact_number, number_of_guests, " +
                     "special_request, check_in, check_out, total_nights, total_payment, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = con.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Handle null IDs safely
            if (roomId != null && !roomId.isEmpty()) {
                stmt.setInt(1, Integer.parseInt(roomId));
            } else {
                stmt.setNull(1, java.sql.Types.INTEGER);
            }

            if (cottageId != null && !cottageId.isEmpty()) {
                stmt.setInt(2, Integer.parseInt(cottageId));
            } else {
                stmt.setNull(2, java.sql.Types.INTEGER);
            }

            stmt.setString(3, fullName);
            stmt.setString(4, emailStr);
            stmt.setString(5, phoneStr);
            stmt.setInt(6, numberOfGuests);
            stmt.setString(7, specialReq);
            stmt.setDate(8, java.sql.Date.valueOf(convertToSQLDate(checkInStr))); 
            stmt.setDate(9, java.sql.Date.valueOf(convertToSQLDate(checkOutStr)));
            stmt.setInt(10, totalNights);
            stmt.setDouble(11, totalPayment); 
            stmt.setString(12, status);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                // Update room status if room was selected
                if (roomId != null && !roomId.isEmpty()) {
                    String updateRoomSql = "UPDATE room SET status = 'Booked' WHERE room_id = ?";
                    try (PreparedStatement roomStmt = conn.prepareStatement(updateRoomSql)) {
                        roomStmt.setInt(1, Integer.parseInt(roomId));
                        roomStmt.executeUpdate();
                    }
                }

                // Update cottage status if cottage was selected
                if (cottageId != null && !cottageId.isEmpty()) {
                    String updateCottageSql = "UPDATE cottage SET status = 'Booked' WHERE cottage_id = ?";
                    try (PreparedStatement cottageStmt = conn.prepareStatement(updateCottageSql)) {
                        cottageStmt.setInt(1, Integer.parseInt(cottageId));
                        cottageStmt.executeUpdate();
                    }
                }

                JOptionPane.showMessageDialog(this, "Booking submitted successfully!");

                // Close the registration form (JDialog)
                JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                if (parentDialog != null) {
                    parentDialog.dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            // Optional: to help with debugging
        }


    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cCapacity;
    private javax.swing.JLabel cLocation;
    private javax.swing.JLabel cPrice;
    private javax.swing.JLabel cname;
    private javax.swing.JLabel email;
    private javax.swing.JLabel guest;
    private javax.swing.JLabel in;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel night;
    private javax.swing.JLabel out;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel rBed;
    private javax.swing.JLabel rCapacity;
    private javax.swing.JLabel rNumber;
    private javax.swing.JLabel rPrice;
    private javax.swing.JLabel rType;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.RoundedPanel roundedPanel2;
    private Swing.RoundedPanel roundedPanel3;
    private Swing.RoundedPanel roundedPanel4;
    private Swing.RoundedPanel roundedPanel5;
    private Swing.RoundedPanel roundedPanel6;
    private javax.swing.JLabel sr;
    private Swing.Button submitButton;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
