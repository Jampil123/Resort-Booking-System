package CRUD;

import java.util.Scanner;
import resort.booking.appication.config;


public class Properties {
    Scanner sc = new Scanner(System.in);
    config conf = new config();
    
    public void propertiesCRUD() {
        String choice;
        do {
            System.out.println("\n================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+" +
                               "\n|                   MANAGE PROPERTIES                      |" +
                               "\n+----------------------------------------------------------+" +
                               "\n| 1.  | Add Properties                                     |" +
                               "\n| 2.  | View Properties                                    |" +
                               "\n| 3.  | Update Properties                                  |" +
                               "\n| 4.  | Delete Properties                                  |" +
                               "\n| 5.  | BACK to Main Menu                                  |" +
                               "\n|-----------------------------------------------------+----|");
            System.out.print("| Enter Action: ");
            choice = sc.nextLine();
            System.out.println("+----------------------------------------------------------+");

            switch (choice) {
                case "1":
                    addProperty();
                    break;
                case "2":
                    viewProperties();
                    break;
                case "3":
                    // Update properties logic (not yet implemented)
                    break;
                case "4":
                    // Delete properties logic (not yet implemented)
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
    
    public void addProperty() {
        System.out.println("\n------------------------------------------------------------" +
                           "\n| Enter Property Details:                                  |" +
                           "\n------------------------------------------------------------");
        
        System.out.print("Property Name: ");
        String pname = sc.nextLine();
        
        System.out.print("Property Type: ");
        String ptype = sc.nextLine();
        
        System.out.print("Location: ");
        String plocation = sc.nextLine();
        
        System.out.print("Capacity: ");
        int pcapacity = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Price: ");
        double pprice = sc.nextDouble();
        sc.nextLine(); 
        
        String sql = "INSERT INTO tbl_properties (p_name, p_type, p_location, p_capacity, p_price, p_status) " +
                     "VALUES (?, ?, ?, ?, ?, 'Available')";
        
        conf.addRecord(sql, pname, ptype, plocation, pcapacity, pprice);
        System.out.println("Property added successfully!!!");
    }
    public void viewProperties(){
        String sqlQuery = "SELECT property_id, p_name, p_type, p_location, p_capacity, p_price, p_status FROM tbl_properties";
        String[] columnHeaders = {"Property ID", "Property Name", "Type", "Location", "Capacity", "Price", "Status"};
        String[] columnNames = {"Property_id", "p_name", "p_type", "p_location", "P_capacity", "p_price", "p_status" };
        
        conf.viewRecords(sqlQuery, columnHeaders, columnNames);
    }
}
