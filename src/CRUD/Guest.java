
package CRUD;

import java.util.Scanner;
import resort.booking.appication.config;

public class Guest {
     Scanner sc = new Scanner(System.in);
    config conf = new config();

    public void guestCRUD() {
        String choice;
        do {
            System.out.println("\n================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+" +
                             "\n|                       MANAGE GUEST                       |" +
                             "\n+----------------------------------------------------------+" +
                             "\n| 1.  | Add Guests                                         |" +
                             "\n| 2.  | View Guests                                        |" +
                             "\n| 3.  | Update Guest                                       |" +
                             "\n| 4.  | Delete Guests                                      |" +
                             "\n| 5.  | BACK to Main Menu                                  |" +
                             "\n|----------------------------------------------------------|");
            System.out.print("| Enter Action: ");
            choice = sc.nextLine();
            System.out.println("+----------------------------------------------------------+");

            // Validate input for valid options 1-5
            while (!choice.matches("[1-5]")) {
                System.out.print("Invalid choice! Please select again: ");
                choice = sc.nextLine();
            }

            switch (choice) {
                case "1":
                    addGuest();
                    break;
                case "2":
                    viewGuest();
                    break;
                case "3":
                    updateGuest();
                    break;
                case "4":
                    deleteGuest();
                    break;
                case "5":
                    System.out.println("Returning to Main Menu...\n");
                    break;
                default:
                    System.out.println("Invalid action! Please select again.");
                    break;
            }
        } while (!choice.equals("5"));
    }
    public void addGuest() {
        System.out.println("\n------------------------------------------------------------" +
                         "\n| Enter Guest Details:                                     |" +
                         "\n------------------------------------------------------------");
        System.out.print("Enter Guest Name: ");
        String gname = sc.nextLine();

        System.out.print("Address: ");
        String gaddress = sc.nextLine();

        System.out.print("Contact Number: ");
        int gcontact_number = sc.nextInt();
        
        // Consume the remaining newline
        sc.nextLine(); // To handle the newline after nextInt()

        System.out.print("Email: ");
        String gemail = sc.nextLine();
        System.out.println("\n------------------------------------------------------------" +
                         "\n| [1] Save Guest   [2] Cancel                              |" +
                         "\n------------------------------------------------------------");  

        System.out.print("Enter your choice: ");
        String choice = sc.nextLine();

        switch(choice) {
            case "1":
                String sql = "INSERT INTO tbl_guest (g_name, g_address, g_contactnumber, g_email) VALUES (?, ?, ?, ?)";
                
                // Make sure the 'addRecord' method handles connection, exceptions, and resource management
                conf.addRecord(sql, gname, gaddress, gcontact_number, gemail);
                System.out.println("Guest saved successfully!");
                break;
            case "2":
                System.out.println("Operation canceled.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    } 
    public void viewGuest(){
        String sqlQuery = "SELECT guest_id, g_name, g_address, g_contactnumber, g_email FROM tbl_guest";
        String[] columnHeaders = {"Guest ID", "Name", "Address", "Contact Number", "Email"};
        String[] columnNames = {"guest_id", "g_name", "G_address", "g_contactnumber", "g_email"};
        
        conf.viewRecords(sqlQuery, columnHeaders, columnNames);
    }
    public void updateGuest() {
        System.out.println("Enter Guest ID to update: ");
        int guestId = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        System.out.println("Enter new name (leave blank to keep unchanged): ");
        String gname = sc.nextLine();

        System.out.println("Enter new address (leave blank to keep unchanged): ");
        String gaddress = sc.nextLine();

        System.out.println("Enter new contact number (leave blank to keep unchanged): ");
        String gcontactnumber = sc.nextLine();

        System.out.println("Enter new email (leave blank to keep unchanged): ");
        String gemail = sc.nextLine();

        // Construct the update SQL query
        String sql = "UPDATE tbl_guest SET g_name = ?, g_address = ?, g_contactnumber = ?, g_email = ? WHERE guest_id = ?";
        conf.updateRecord(sql, gname, gaddress, gcontactnumber, gemail, guestId);
        
        System.out.println("Guest updated successfully!");
    }
    public void deleteGuest() {
        System.out.println("Enter Guest ID to delete: ");
        int guestId = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        System.out.println("Are you sure you want to delete this guest? (yes/no): ");
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            String sql = "DELETE FROM tbl_guest WHERE guest_id = ?";
            conf.deleteRecord(sql, guestId);
            System.out.println("Guest deleted successfully!");
        } else {
            System.out.println("Deletion canceled.");
        }
    }

}
