
package AdminInternalPage;

import FloatedPage.addUser;
import FloatedPage.editUser;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
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
        users_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14)); 
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
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        users_table = new javax.swing.JTable();
        deleteButton = new Swing.Button();
        editButton = new Swing.Button();
        approvedButton = new Swing.Button();
        addButton = new Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setPreferredSize(new java.awt.Dimension(910, 610));
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
        home.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        home.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        users_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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

        home.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 870, 450));

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        home.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 100, 50));

        editButton.setBackground(new java.awt.Color(51, 51, 51));
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
        });
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        home.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 100, 50));

        approvedButton.setBackground(new java.awt.Color(51, 51, 51));
        approvedButton.setForeground(new java.awt.Color(255, 255, 255));
        approvedButton.setText("Approved");
        approvedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        approvedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approvedButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approvedButtonMouseExited(evt);
            }
        });
        approvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedButtonActionPerformed(evt);
            }
        });
        home.add(approvedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 100, 50));

        addButton.setBackground(new java.awt.Color(51, 51, 51));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add User");
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
        home.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Refresh");
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

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

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = users_table.getSelectedRow(); // Get selected row index
    
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        // Assuming the ID is in the first column (index 0)
        int id = Integer.parseInt(users_table.getValueAt(selectedRow, 0).toString());

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                dbConnector con = new dbConnector();
                Connection cn = con.getConnection();
                
                String sql = "DELETE FROM user WHERE user_id = ?";
                PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setInt(1, id);
                
                
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    int lastInsertedId = 0;
                    if (generatedKeys.next()) {
                        lastInsertedId = generatedKeys.getInt(1);
                    }

                    // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Delete user with ID " + id;
                    con.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    JOptionPane.showMessageDialog(this, "Record deleted successfully.");

                    // Remove from JTable model
                    DefaultTableModel model = (DefaultTableModel) users_table.getModel();
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Record not found.");
                }

                pst.close();
                cn.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Error deleting record: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
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
                    editUser newPanel = new editUser();
                    
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
                    dialog.pack();
                    dialog.setLocationRelativeTo(null); // Center the window
                    dialog.setModal(true); // Prevent interactions with the main window until closed
                    dialog.setVisible(true); // Show the floating add_user
                    
                    
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }    
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void approvedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedButtonActionPerformed
        int selectedUserId = getSelectedUserId(); 

        if (selectedUserId != -1) {
            try {
                dbConnector db = new dbConnector(); 
                Connection conn = db.getConnection(); 

                String query = "UPDATE user SET status = 'Approved' WHERE user_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                    pstmt.setInt(1, selectedUserId);

                    int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                    int lastInsertedId = 0;
                    if (generatedKeys.next()) {
                        lastInsertedId = generatedKeys.getInt(1);
                    }

                    // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Approved user with ID " + selectedUserId;
                    db.InsertData("INSERT INTO logs (user_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
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
    }//GEN-LAST:event_approvedButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        JDialog dialog = new JDialog(); // Create a floating window
        addUser newPanel = new addUser();

        dialog.add(newPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(bodycolor);
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(navcolor);    }//GEN-LAST:event_addButtonMouseExited

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        editButton.setBackground(bodycolor);
    }//GEN-LAST:event_editButtonMouseEntered

    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        editButton.setBackground(navcolor);    }//GEN-LAST:event_editButtonMouseExited

    private void approvedButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedButtonMouseEntered
        approvedButton.setBackground(bodycolor);
    }//GEN-LAST:event_approvedButtonMouseEntered

    private void approvedButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvedButtonMouseExited
        approvedButton.setBackground(navcolor);    }//GEN-LAST:event_approvedButtonMouseExited

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        deleteButton.setBackground(bodycolor);
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        deleteButton.setBackground(navcolor);
    }//GEN-LAST:event_deleteButtonMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        displayData();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Button addButton;
    private Swing.Button approvedButton;
    private Swing.Button deleteButton;
    private Swing.Button editButton;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_bar;
    private javax.swing.JTable users_table;
    // End of variables declaration//GEN-END:variables
}
