
package config;

public class GuestSession {
    
    private static GuestSession instance;
    private String fullName;
    private String email;
    private String phone;
    private int numberOfGuests;
    private String specialRequest;
    
    private String selectedRoomName;
    private String selectedRoomId = null;
    private String selectedRoomType;
    private String selectedBedType;
    private String selectedRoomCapacity;
    private String selectedRoomPrice;
    
    private String selectedCottageName;
    private String selectedCottageId = null;
    private String selectedCottageCapacity;
    private String selectedCottagelocation;
    private String selectedCottagePrice;
    private String checkIn;
    private String checkOut;
    
    public GuestSession(){
        
    }

    public static synchronized GuestSession getInstance() {
        if(instance == null){
            instance = new GuestSession();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }
    
    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }
    
    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
    
    
    //Room setter and gettter
    public void setSelectedRoomName(String name) { 
        this.selectedRoomName = name; 
    }
    
    public String getSelectedRoomName() { 
        return selectedRoomName;
    }

    public void setSelectedRoomId(String id) { 
        this.selectedRoomId = id;
    }
    
    public String getSelectedRoomId() {
        return selectedRoomId;
    }
    
    public String getSelectedRoomType() {
        return selectedRoomType;
    }

    public void setSelectedRoomType(String selectedRoomType) {
        this.selectedRoomType = selectedRoomType;
    }

    public String getSelectedBedType() {
        return selectedBedType;
    }

    public void setSelectedBedType(String selectedBedType) {
        this.selectedBedType = selectedBedType;
    }

    public String getSelectedRoomCapacity() {
        return selectedRoomCapacity;
    }

    public void setSelectedRoomCapacity(String selectedRoomCapacity) {
        this.selectedRoomCapacity = selectedRoomCapacity;
    }

    public String getSelectedRoomPrice() {
        return selectedRoomPrice;
    }

    public void setSelectedRoomPrice(String selectedRoomPrice) {
        this.selectedRoomPrice = selectedRoomPrice;
    }
    
    
    //Cottage getter and settter
    public void setSelectedCottageName(String name) {
        this.selectedCottageName = name;
    }
    
    public String getSelectedCottageName() { 
        return selectedCottageName;
    }

    public void setSelectedCottageId(String id) {
        this.selectedCottageId = id; 
    }
    
    public String getSelectedCottageId() {
        return selectedCottageId;
    }
    
    public String getSelectedCottageCapacity() {
        return selectedCottageCapacity;
    }

    public void setSelectedCottageCapacity(String selectedCottageCapacity) {
        this.selectedCottageCapacity = selectedCottageCapacity;
    }

    public String getSelectedCottagelocation() {
        return selectedCottagelocation;
    }

    public void setSelectedCottagelocation(String selectedCottagelocation) {
        this.selectedCottagelocation = selectedCottagelocation;
    }
    
    public String getSelectedCottagePrice() {
        return selectedCottagePrice;
    }

    public void setSelectedCottagePrice(String selectedCottagePrice) {
        this.selectedCottagePrice = selectedCottagePrice;
    }
}
