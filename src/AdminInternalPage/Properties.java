
package AdminInternalPage;

import Effect.ShakeButton;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Properties extends javax.swing.JInternalFrame {


    public Properties() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        roomButton = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        cottageButton = new Swing.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PROPERTIES");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 70));

        roomButton.setBackground(new java.awt.Color(51, 51, 51));
        roomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomButtonMouseExited(evt);
            }
        });
        roomButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room");
        roomButton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jPanel1.add(roomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 220, 230));

        cottageButton.setBackground(new java.awt.Color(51, 51, 51));
        cottageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cottageButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cottageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cottageButtonMouseExited(evt);
            }
        });
        cottageButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cottage");
        cottageButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jPanel1.add(cottageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 220, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomButtonMouseClicked
        Room ro = new Room();
        Effect.TransitionEffect.fadeOutAndOpen(this, ro);
    }//GEN-LAST:event_roomButtonMouseClicked

    private void roomButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomButtonMouseEntered
        roomButton.setBackground(bodycolor);
        ShakeButton.shake(roomButton);
    }//GEN-LAST:event_roomButtonMouseEntered

    private void roomButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomButtonMouseExited
        roomButton.setBackground(navcolor);
    }//GEN-LAST:event_roomButtonMouseExited

    private void cottageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cottageButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cottageButtonMouseClicked

    private void cottageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cottageButtonMouseEntered
        cottageButton.setBackground(bodycolor);
        ShakeButton.shake(cottageButton);
    }//GEN-LAST:event_cottageButtonMouseEntered

    private void cottageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cottageButtonMouseExited
        cottageButton.setBackground(navcolor);
    }//GEN-LAST:event_cottageButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.RoundedPanel cottageButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Swing.RoundedPanel roomButton;
    // End of variables declaration//GEN-END:variables
}
