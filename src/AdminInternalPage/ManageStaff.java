
package AdminInternalPage;

import FloatedPage.add_user;
import FloatedPage.edit_user;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ManageStaff extends javax.swing.JInternalFrame {

  
    public ManageStaff() {
        initComponents();
        displayData();
        setBackground(new Color(0, 0, 0, 0));
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        //table header layout
        users_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12)); 
        users_table.getTableHeader().setOpaque(false);
        users_table.getTableHeader().setBorder(null);
        users_table.getTableHeader().setBackground(new Color(51, 51, 255));
        users_table.getTableHeader().setForeground(new Color(255, 255, 255));
        users_table.setRowHeight(25);
        
        //table colum size
        users_table.getColumnModel().getColumn(0).setPreferredWidth(25);
        users_table.getColumnModel().getColumn(1).setPreferredWidth(55);
        users_table.getColumnModel().getColumn(2).setPreferredWidth(55);
        users_table.getColumnModel().getColumn(3).setPreferredWidth(70);
        users_table.getColumnModel().getColumn(4).setPreferredWidth(150);
        users_table.getColumnModel().getColumn(5).setPreferredWidth(30);
        users_table.getColumnModel().getColumn(6).setPreferredWidth(30);
          
    }
        Color navcolor = new Color(51,51,51);
        Color headcolor = new Color(0,0,0);
        Color bodycolor = new Color(102,102,102);
        
    public void displayData(){
        
        dbConnector dbc = new dbConnector();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM user");         
           DefaultTableModel model = (DefaultTableModel)users_table.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4), 
                   rs.getString(5), 
                   rs.getString(6), 
                   rs.getString(8)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }    
    
    public int getSelectedUserId() {
        int selectedRow = users_table.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(users_table.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
            }
        return -1; // Return -1 if no row is selected
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JPanel();
        search_bar = new javax.swing.JTextField();
        delete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        add_user = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        approved = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setPreferredSize(new java.awt.Dimension(720, 440));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_bar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        search_bar.setForeground(new java.awt.Color(153, 153, 153));
        search_bar.setText(" search...");
        search_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_bar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_barFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_barFocusLost(evt);
            }
        });
        search_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_barActionPerformed(evt);
            }
        });
        search_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_barKeyReleased(evt);
            }
        });
        home.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 14, 170, 25));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delete");
        delete.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 8, -1, -1));

        home.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 100, 30));

        add_user.setBackground(new java.awt.Color(51, 51, 51));
        add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_userMouseExited(evt);
            }
        });
        add_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Add User");
        add_user.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 8, -1, -1));

        home.add(add_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 100, 30));

        approved.setBackground(new java.awt.Color(51, 51, 51));
        approved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approvedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approvedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approvedMouseExited(evt);
            }
        });
        approved.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Approved");
        approved.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 8, -1, -1));

        home.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 100, 30));

        refresh.setBackground(new java.awt.Color(51, 51, 51));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Refresh");
        refresh.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 8, -1, -1));

        home.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, 20, 20));

        home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 25, 25));

        edit.setBackground(new java.awt.Color(51, 51, 51));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edit");
        edit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 8, -1, -1));

        home.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 100, 30));

        users_table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        users_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "First Name", "Last Name", "Username", "Email", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        users_table.setAutoscrolls(false);
        users_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        users_table.setFocusable(false);
        users_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        users_table.setOpaque(false);
        users_table.setRowHeight(25);
        users_table.setSelectionBackground(new java.awt.Color(255, 0, 0));
        users_table.setSelectionForeground(new java.awt.Color(204, 255, 255));
        users_table.setShowVerticalLines(false);
        users_table.getTableHeader().setResizingAllowed(false);
        users_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(users_table);

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 700, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseClicked
        
        JDialog dialog = new JDialog(); // Create a floating window
        add_user newPanel = new add_user();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.setSize(325, 500); // Set the size of the window
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    
    }//GEN-LAST:event_add_userMouseClicked

    private void add_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseEntered
        add_user.setBackground(bodycolor);
    }//GEN-LAST:event_add_userMouseEntered

    private void add_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseExited
        add_user.setBackground(navcolor);
    }//GEN-LAST:event_add_userMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodycolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void approvedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseEntered
        approved.setBackground(bodycolor);
    }//GEN-LAST:event_approvedMouseEntered

    private void approvedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseExited
        approved.setBackground(navcolor);
    }//GEN-LAST:event_approvedMouseExited

    private void approvedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedMouseClicked
        int selectedUserId = getSelectedUserId(); // Get the selected user's ID

        if (selectedUserId != -1) {
            try {
                dbConnector db = new dbConnector(); // Create an instance of dbConnector
                Connection conn = db.getConnection(); // Get database connection

                String query = "UPDATE user SET status = 'Approved' WHERE user_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, selectedUserId);

                    int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "User approved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to approve user.");
            }
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to approve.");
        }
    }//GEN-LAST:event_approvedMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(bodycolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_barKeyReleased
       DefaultTableModel model = (DefaultTableModel)users_table.getModel();
       TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) users_table.getModel());
       users_table.setRowSorter(sorter);
       sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
    }//GEN-LAST:event_search_barKeyReleased

    private void search_barFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusGained
        if (search_bar.getText().equals(" search...")) {
            search_bar.setText("");
            search_bar.setFont(new Font("Arial", Font.PLAIN, 11));
            search_bar.setForeground(Color.BLACK); 
        }
    }//GEN-LAST:event_search_barFocusGained

    private void search_barFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusLost
        if (search_bar.getText().isEmpty()) {
            search_bar.setText(" search...");
            search_bar.setFont(new Font("Arial", Font.PLAIN, 11));
            search_bar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_search_barFocusLost

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = users_table.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, " Please select an Item!!! ");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = users_table.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM user WHERE user_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                if(rs.next()){
                    JDialog dialog = new JDialog(); // Create a floating window
                    edit_user newPanel = new edit_user();
                    
                    newPanel.user_id.setText(""+rs.getString("user_id"));
                    newPanel.firstname_input.setText(""+rs.getString("f_name"));
                    newPanel.lastname_input.setText(""+rs.getString("l_name"));
                    newPanel.username_input.setText(""+rs.getString("username"));
                    newPanel.email_input.setText(""+rs.getString("email"));
                    newPanel.role.setSelectedItem(""+rs.getString("role"));
                    newPanel.status.setSelectedItem(""+rs.getString("status"));
                    
                    Font arialFont = new Font("Arial", Font.PLAIN, 12);

                    newPanel.firstname_input.setFont(arialFont);
                    newPanel.firstname_input.setForeground(Color.BLACK);

                    newPanel.lastname_input.setFont(arialFont);
                    newPanel.lastname_input.setForeground(Color.BLACK);

                    newPanel.username_input.setFont(arialFont);
                    newPanel.username_input.setForeground(Color.BLACK);

                    newPanel.email_input.setFont(arialFont);
                    newPanel.email_input.setForeground(Color.BLACK);
                    
                    dialog.add(newPanel); // Add add_user to the dialog
                    dialog.setSize(325, 500); // Set the size of the window
                    dialog.setLocationRelativeTo(null); // Center the window
                    dialog.setModal(true); // Prevent interactions with the main window until closed
                    dialog.setVisible(true); // Show the floating add_user
                    
                    
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }    
        }   
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(bodycolor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(navcolor);
    }//GEN-LAST:event_editMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_user;
    private javax.swing.JPanel approved;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh;
    private javax.swing.JTextField search_bar;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
