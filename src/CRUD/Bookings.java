
package CRUD;

import java.util.Scanner;
import resort.booking.appication.config;

public class Bookings {
    Scanner sc = new Scanner(System.in);
    config conf = new config();
    Guest guest = new Guest();
    Properties properties = new Properties();
    public void customerbookings(){
         String choice;
        do {
            System.out.println("\n================================================================================================================================================================");
            System.out.println("\n+----------------------------------------------------------+" +
                             "\n|                          BOOKINGS                        |" +
                             "\n+----------------------------------------------------------+" +
                             "\n| 1.  | Create New Bookings                                |" +
                             "\n| 2.  | View Bookings                                      |" +
                             "\n| 3.  | Update Booking Status                              |" +
                             "\n| 4.  | Cancel booking                                     |" +
                             "\n| 5.  | BACK to Staff Task Menu                            |" +
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
                    guest.viewGuest();
                    properties.viewProperties();
                    createBookings();
                    break;
                case "2":
                    viewBookings();
                    break;
                case "3":
                    viewBookings();
                    updateBookingStatus();
                    break;
                case "4":
                    viewBookings();
                    cancelBooking();
                    break;
                case "5":
                    System.out.println("Returning to Staff task Menu...\n");
                    break;
                default:
                    System.out.println("Invalid action! Please select again.");
                    break;
            }
        } while (!choice.equals("5"));
    }
     public void createBookings() {
        System.out.print("Enter Guest ID: ");
        int guestId = sc.nextInt();
        System.out.print("Enter Property ID: ");
        int propertyId = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        String checkPropertySql = "SELECT p_status FROM tbl_properties WHERE property_id = ?";
        String propertyStatus = conf.getStringValue(checkPropertySql, propertyId); // Create a new method for String retrieval

            if (propertyStatus == null) {
                System.out.println("Error: Property ID does not exist.");
                return;
            } else if ("Booked".equalsIgnoreCase(propertyStatus)) {
                System.out.println("Error: Property is already booked and not available.");
                return;
            }

        
        System.out.print("Enter Start Date (YYYY-MM-DD): ");
        String startDate = sc.nextLine();
        System.out.print("Enter End Date (YYYY-MM-DD): ");
        String endDate = sc.nextLine();
        
        String sql = "INSERT INTO tbl_bookings (guest_id, property_id, start_date, end_date, status) VALUES (?, ?, ?, ?, 'Pending')";
        conf.addRecord(sql, guestId, propertyId, startDate, endDate);
        
        // Update property status to 'Booked'
        String updatePropertySql = "UPDATE tbl_properties SET p_status = 'Booked' WHERE property_id = ?";
        conf.updateRecord(updatePropertySql, propertyId);
        
        System.out.println("Booking created successfully, and property status updated to 'Booked'!");
    }
    
    public void viewBookings() {
        String sql = "SELECT * FROM tbl_bookings";
        String[] headers = {"Booking ID", "Guest ID", "Property ID", "Start Date", "End Date", "Status"};
        String[] columns = {"booking_id", "guest_id", "property_id", "start_date", "end_date", "status"};
        conf.viewRecords(sql, headers, columns);
    }
    public void updateBookingStatus() {
        System.out.print("Enter Booking ID: ");
        int bookingId = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter New Status (Confirmed/Canceled): ");
        String newStatus = sc.nextLine();
        
        String sql = "UPDATE tbl_bookings SET status = ? WHERE booking_id = ?";
        conf.updateRecord(sql, newStatus, bookingId);
        System.out.println("Booking status updated successfully!");
    }
    public void cancelBooking() {
        System.out.print("Enter Booking ID to cancel: ");
        int bookingId = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Get the property_id associated with this booking
        String getPropertySql = "SELECT property_id FROM tbl_bookings WHERE booking_id = ?";
        int propertyId = (int) conf.getSingleValue(getPropertySql, bookingId);

        if (propertyId == 0) {
            System.out.println("Error: Booking ID does not exist.");
            return;
        }

        // Delete the booking
        String deleteBookingSql = "DELETE FROM tbl_bookings WHERE booking_id = ?";
        conf.deleteRecord(deleteBookingSql, bookingId);

        // Update property status back to "Available"
        String updatePropertySql = "UPDATE tbl_properties SET p_status = 'Available' WHERE property_id = ?";
        conf.updateRecord(updatePropertySql, propertyId);

        System.out.println("Booking canceled successfully, and property is now available for booking!");
    }

}
