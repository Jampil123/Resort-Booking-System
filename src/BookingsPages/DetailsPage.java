
package BookingsPages;

import config.GuestSession;
import java.awt.Color;
import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class DetailsPage extends javax.swing.JInternalFrame {

    public DetailsPage() {
        initComponents();
//        fillGuestData()
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    private void fillGuestData() {
        GuestSession guestSession = new GuestSession();
        if (guestSession != null) {
            FullNameField.setText(guestSession.getFullName());
            EmailField.setText(guestSession.getEmail());
            PhoneField.setText(guestSession.getPhone());
            Guestsfield.setText(String.valueOf(guestSession.getNumberOfGuests()));
            SpecialRequestField.setText(guestSession.getSpecialRequest());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        nextButton = new javax.swing.JLabel();
        roundedPanel2 = new Swing.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        PhoneField = new Swing.TextField();
        EmailField = new Swing.TextField();
        Guestsfield = new Swing.TextField();
        FullNameField = new Swing.TextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SpecialRequestField = new javax.swing.JTextArea();
        GValidation = new javax.swing.JLabel();
        FValidation = new javax.swing.JLabel();
        EValidation = new javax.swing.JLabel();
        PValidation = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(896, 636));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setMaximumSize(new java.awt.Dimension(880, 470));
        jPanel12.setMinimumSize(new java.awt.Dimension(880, 470));
        jPanel12.setPreferredSize(new java.awt.Dimension(896, 636));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextButton.setBackground(new java.awt.Color(102, 102, 102));
        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nextButton.setText("Proceed");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextButtonMouseExited(evt);
            }
        });
        jPanel12.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 70, 40));

        roundedPanel2.setBackground(new java.awt.Color(102, 102, 102));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Guest Details");
        roundedPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        jPanel12.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 220, 60));

        PhoneField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PhoneField.setLabelText("Phone Number");
        jPanel12.add(PhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 310, -1));

        EmailField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        EmailField.setLabelText("Email Address");
        jPanel12.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 310, -1));

        Guestsfield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Guestsfield.setLabelText("Number of Guest");
        jPanel12.add(Guestsfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 310, -1));

        FullNameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FullNameField.setLabelText("Full Name");
        jPanel12.add(FullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 310, -1));

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

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

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

        SpecialRequestField.setColumns(20);
        SpecialRequestField.setRows(5);
        SpecialRequestField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Special Request", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16))); // NOI18N
        jPanel12.add(SpecialRequestField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 310, 130));

        GValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(GValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 310, 20));

        FValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(FValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 310, 20));

        EValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(EValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 310, 20));

        PValidation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel12.add(PValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 310, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        String fullname = FullNameField.getText().trim();
        String email = EmailField.getText().trim();
        String phone = PhoneField.getText().trim();
        String guest = Guestsfield.getText().trim();
        String request = SpecialRequestField.getText().trim();

        boolean isValid = true;

        // Clear previous validation messages (optional)
        FValidation.setText("");
        EValidation.setText("");
        PValidation.setText("");

        // Validate Full Name
        if (fullname.isEmpty()) {
            FValidation.setText("Field cannot be Empty");
            FValidation.setForeground(Color.RED);
            FValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        }

        // Validate Email (you can add regex validation here if you want)
        if (email.isEmpty()) {
            EValidation.setText("Email is required");
            EValidation.setForeground(Color.RED);
            EValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        }

        // Validate Phone
        if (phone.isEmpty()) {
            PValidation.setText("Phone is required");
            PValidation.setForeground(Color.RED);
            PValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        }
        
        // Validate Phone
        if (guest.isEmpty()) {
            GValidation.setText("Phone is required");
            GValidation.setForeground(Color.RED);
            GValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        }

        // Validate Guest Count
        int guestCount = 0;
        try {
            guestCount = Integer.parseInt(guest);
            if (guestCount <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            GValidation.setText("Please enter a valid number of guests");
            GValidation.setForeground(Color.RED);
            GValidation.setFont(new Font("Arial", Font.PLAIN, 10));
            isValid = false;
        }

        // If any field is invalid, stop here
        if (!isValid) return;

        // If valid, create the session and pass to next form
        GuestSession guestSession = new GuestSession();
        guestSession.setFullName(fullname);
        guestSession.setEmail(email);
        guestSession.setPhone(phone);
        guestSession.setNumberOfGuests(guestCount);
        guestSession.setSpecialRequest(request);

        // Proceed to the next page
        propertiesPage properties = new propertiesPage(guestSession);
        Effect.TransitionEffect.fadeOutAndOpen(this, properties);

    }//GEN-LAST:event_nextButtonMouseClicked

    private void nextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseEntered
        nextButton.setForeground(new Color (102, 102 ,102));
    }//GEN-LAST:event_nextButtonMouseEntered

    private void nextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseExited
        nextButton.setForeground(new Color (0, 0, 0));
    }//GEN-LAST:event_nextButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EValidation;
    private Swing.TextField EmailField;
    private javax.swing.JLabel FValidation;
    private Swing.TextField FullNameField;
    private javax.swing.JLabel GValidation;
    private Swing.TextField Guestsfield;
    private javax.swing.JLabel PValidation;
    private Swing.TextField PhoneField;
    private javax.swing.JTextArea SpecialRequestField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nextButton;
    private Swing.RoundedPanel roundedPanel2;
    // End of variables declaration//GEN-END:variables
}
