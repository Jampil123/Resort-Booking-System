
package User.Dashboard;

import CRUD.Guest;
import CRUD.Properties;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    String choice;
    public void managerDashboard(){
         do {
            
            System.out.println("================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+"
                             + "\n|                    MANAGER TASK MENU                     |"
                             + "\n+----------------------------------------------------------+"
                             + "\n| 1.   |   Manage Properties                               |"
                             + "\n| 2.   |   Approve Bookings                                |"
                             + "\n| 3.   |   View Properties                                 |"
                             + "\n| 4.   |   View System logs                                |"
                             + "\n| 5.   |   Logout                                          |"
                             + "\n|----------------------------------------------------------|");
            System.out.print("| Enter Action: ");
            choice = sc.nextLine();   
            System.out.println("+----------------------------------------------------------+");
           
            do {
               if (!choice.matches("[1-5]")) {
                   System.out.print("Invalid choice! Please select again : ");
                   choice = sc.nextLine();
               }
            } while (!choice.matches("[1-5]"));
            
           
            switch (choice) {
                case "1": 
                    Properties properties = new Properties();
                    properties.propertiesCRUD();
                    break;

                case "2": 
                 
                    break;
                    
                case "3": 
                   
                    break;
                    
                case "4": 
                   
                    break;

                case "5": 
                    System.out.println(" You have been logged out successfully... ");
                    break;         
            }

        } while (!choice.equals("5")); 
    }
}

