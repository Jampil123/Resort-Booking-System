
package Authentication;

import User.Dashboard.Manager;
import User.Dashboard.Staff;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import resort.booking.appication.config;
import static resort.booking.appication.config.connectDB;

public class Login {
    Scanner sc = new Scanner(System.in);
    config conf = new config(); 
    String locatedUser, locatedPass, locatedRole, fname;
    int id;
    
    public void loginCredentials() {
        String choice;
        do {
            System.out.println("\n================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+"
                    + "\n|                        LOGIN MENU                        |"
                    + "\n+----------------------------------------------------------+"
                    + "\n| 1.  | Log in as Staff                                    |"
                    + "\n| 2.  | Log in as Approving Manager                        |"
                    + "\n| 3.  | BACK to Main Menu                                  |"
                    + "\n|----------------------------------------------------------|");
            System.out.print("| Enter Action: ");
            choice = sc.nextLine();
            System.out.println("+----------------------------------------------------------+");

            switch (choice) {
                case "1":
                    authenticateUser("staff");
                    break;

                case "2":
                    authenticateUser("manager");
                    break;

                case "3":
                    System.out.println("Returning to Main Menu...\n");
                    break;

                default:
                    System.out.println("Invalid action! Please select again.");
                    break;
            }
        } while (!choice.equals("3"));
    }
    
    public void authenticateUser(String role)  {
        
            System.out.println(
                        "╒════════════════════╕"
                    + "\n│ Login              │"
                    + "\n└────────────────────┘");
            System.out.print("| Enter username: ");
            String user = sc.nextLine();
            
            System.out.print("| Enter password: ");
            String password = sc.nextLine();
            
            
            
            locateUser(user, password);
    }
    
    public void locateUser(String username, String password) {
        boolean userLocated = false;
        
        try{
            PreparedStatement state = connectDB().prepareStatement("SELECT user_id, first_name, username, password, role FROM tbl_user");

            
            try (ResultSet result = state.executeQuery()) {
                while(result.next()){
                    locatedUser = result.getString("username");
                    locatedPass = result.getString("password");
                    locatedRole = result.getString("role");
                    fname = result.getString("first_name");
                    id = result.getInt("user_id");
                    
                    if(username.equals(locatedUser) && password.equals(locatedPass)){
                        userLocated = true;
                        break;
                    }
                }
                result.close();
                
                if(userLocated){
                    switch (locatedRole) {
                        case "staff":
                            Staff staffPage = new Staff();
                            staffPage.staffDashboard();
                            break;
                        case "manager":
                            Manager managerPage = new Manager();
                            managerPage.managerDashboard();
                            break;
                        default: System.out.println("Error: Role not found.");
                            break;
                    }
                }
                else{
                    System.out.println("\nUser not found.");
                }
                 result.close();
            }
        } catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
