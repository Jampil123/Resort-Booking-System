
package FloatedPage;

import BookingsPages.DetailsPage;

public class addBookings extends javax.swing.JPanel {

    public addBookings() {
        initComponents();
        DefaultPage();
    }

    private void DefaultPage() {
        
        DetailsPage dp = new DetailsPage();
        bookingsDesktop.add(dp);
        dp.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        bookingsDesktop = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 660));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookingsDesktop.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout bookingsDesktopLayout = new javax.swing.GroupLayout(bookingsDesktop);
        bookingsDesktop.setLayout(bookingsDesktopLayout);
        bookingsDesktopLayout.setHorizontalGroup(
            bookingsDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        bookingsDesktopLayout.setVerticalGroup(
            bookingsDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel4.add(bookingsDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 600));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane bookingsDesktop;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
