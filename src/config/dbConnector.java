
package config;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnector {
    
    public Connection connect;
    
    public dbConnector(){
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/resort_booking_system", "root", "");
        } 
        catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return connect;
    }
    
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }
    
     //Function to insert data
    public int InsertData(String sql){
        int result;
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            pst.close();
            result = 1;
        }catch(SQLException ex){
            System.out.println("Connection Error: "+ex);
            result = 0;
        }
        return result;
    }
    
    //Function to update data
    public void updateData(String sql){
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
                int rowsUpdated = pst.executeUpdate();
                    if(rowsUpdated > 0){
                        JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                    }else{
                        System.out.println("Data Update Failed!");
                    }
                    pst.close();
        }catch(SQLException ex){
            System.out.println("Connection Error: "+ex);
        }

    }
    
    //Function to check if field Exists
    public boolean fieldExists(String fieldName, String value) {
        String sql = "SELECT * FROM user WHERE " + fieldName + " = ?";
        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, value);
            try (ResultSet result = pstmt.executeQuery()) {
                return result.next();
            }
        } catch (SQLException e) {
            System.out.println("Field Check Error: " + e.getMessage());
        }
        return false;
    }
    
    // Get the security question based on the user_id
    public String getSingleData(String sql, Object... params) {
        String result = null;

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            // Set parameters for the prepared statement
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    result = rs.getString("question");  // Get the 'question' column value
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }

        return result;
    }
    
     // Insert Data (Parameterized Query to prevent SQL Injection)
    public int insertData(String sql, Object... params) {
        int result = 0;
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            result = pst.executeUpdate();
            System.out.println("Inserted Successfully!");
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
        return result;
    }
}
