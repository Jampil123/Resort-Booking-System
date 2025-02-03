
package resort.booking.appication;

import Authentication.Login;
import Authentication.Registration;
import java.util.Scanner;

public class ResortBookingApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            // Main menu
            System.out.println("================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+"
                             + "\n|                 RESORT BOOKING SYSTEM                    |"
                             + "\n+----------------------------------------------------------+"
                             + "\n| 1.   |   Login                                           |"
                             + "\n| 2.   |   Register                                        |"
                             + "\n| 3.   |   Report                                          |"
                             + "\n| 4.   |   Exit                                            |"
                             + "\n|----------------------------------------------------------|");
            System.out.print("| Enter Action: ");
            choice = sc.nextLine();   
            System.out.println("+----------------------------------------------------------+");
       
            switch (choice) {
                case "1": 
                    Login login = new Login();
                    login.loginCredentials();
                    break;
                case "2": 
                    Registration registration = new Registration();
                    registration.registerCredentials();
                    break;
                    
                case "3": 
                    
                    break;

                case "4": // Exit option
                    System.out.println("Exiting the application...");
                    break;         
            }

        } while (!choice.equals("4")); 

        sc.close();
    }     
}
