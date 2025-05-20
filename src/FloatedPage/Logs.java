
package FloatedPage;

import config.dbConnector;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class Logs extends javax.swing.JPanel {

    public Logs() {
        initComponents();
        displayData();
        
        //table header layout
        logsTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12)); 
        logsTable.getTableHeader().setOpaque(false);
        logsTable.getTableHeader().setBorder(null);
        logsTable.getTableHeader().setBackground(new Color(51, 51, 255));
        logsTable.getTableHeader().setForeground(new Color(255, 255, 255));
        logsTable.setRowHeight(25);
        
        // Enable automatic column resizing
        logsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        // Adjust column widths based on content
        resizeColumnWidth(logsTable);
    }
    private void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 10, width); // Add padding
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    public void displayData(){
        
        dbConnector dbc = new dbConnector();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM logs");         
           DefaultTableModel model = (DefaultTableModel)logsTable.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(4), 
                   rs.getString(2), 
                   rs.getString(3)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        logsTable = new javax.swing.JTable();
        roundedPanel1 = new Swing.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(653, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        logsTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        logsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Log ID", "Date/Time", "User ID", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logsTable.setGridColor(new java.awt.Color(102, 102, 102));
        logsTable.setRowHeight(25);
        logsTable.setRowMargin(0);
        logsTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        logsTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        logsTable.setShowVerticalLines(false);
        logsTable.getTableHeader().setResizingAllowed(false);
        logsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(logsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 610, 570));

        roundedPanel1.setBackground(new java.awt.Color(102, 102, 102));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER LOGS");
        roundedPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 1, 400, 50));

        add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 420, 50));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable logsTable;
    private Swing.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
