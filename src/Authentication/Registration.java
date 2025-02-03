
package Authentication;

import java.util.Scanner;
import resort.booking.appication.config;

public class Registration {
    config conf = new config();
    
    public void registerCredentials(){
         Scanner sc = new Scanner(System.in);
        System.out.println("================================================================================================================================================================");
        System.out.print("| Enter first name: ");
        String fname = sc.nextLine();
       
        System.out.print("| Enter last name: ");
        String lname = sc.nextLine();
        
        System.out.print("| Enter username: ");
        String username = sc.nextLine();
        
        System.out.print("| Enter email address: ");
        String email = sc.nextLine();
        
        System.out.print("| Enter password: ");
        String password = sc.nextLine();
        
        System.out.print("| Confirm password: ");
        String confirmPass = sc.nextLine();
        
        while(!confirmPass.equals(password)){
            System.out.print("| Passwords don't match, try again: ");
            confirmPass = sc.nextLine();
            
        }
        System.out.print("| Confirm registration? [y/n]: ");
        String confirm = sc.nextLine();
        if(confirm.equals("y")){
            String sql = "INSERT INTO tbl_user (first_name, last_name, username, email, password, role) "
                  + "VALUES (?, ?, ?, ?, ?, 'member')";
            
            conf.addRecord(sql, fname, lname, username, email, password);
        } else{
          System.out.println("Registration Cancelled.");
        }
    }
}
