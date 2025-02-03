
package User.Dashboard;

import CRUD.Bookings;
import CRUD.Guest;
import CRUD.Properties;
import java.util.Scanner;

public class Staff {
     Scanner sc = new Scanner(System.in);
    String choice;
    public void staffDashboard(){
         do {
            
            System.out.println("================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+"
                             + "\n|                    STAFF TASK MENU                       |"
                             + "\n+----------------------------------------------------------+"
                             + "\n| 1.   |   Guests                                          |"
                             + "\n| 2.   |   Bookings                                        |"
                             + "\n| 3.   |   View Properties                                 |"
                             + "\n| 4.   |   Report                                          |"
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
                    Guest guest = new Guest();
                    guest.guestCRUD();
                    break;

                case "2": 
                    Bookings booking = new Bookings();
                    booking.customerbookings();
                    break;
                    
                case "3": 
                    Properties property = new Properties();
                    property.viewProperties();
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
