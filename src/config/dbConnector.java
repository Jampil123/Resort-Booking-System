
package config;

import AdminInternalPage.ManageStaff;
import java.sql.*;

public class dbConnector {
    
    private Connection connect;
    
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
    
    public int InsertData(String sql){
        int result;
        try{
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Inserted Successfully! ");
            pst.close();
            result = 1;
        }catch(SQLException ex){
            System.out.println("Connection Error: "+ex);
            result = 0;
        }
        return result;
    }
}
