package Entity;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private String address;
    private String city;
    private String email;
    private String phone;
    private String starRating;
    private boolean freeParking;
    private boolean freeWifi;
    private boolean hotelConcierge;
    private boolean roomService247;
    private boolean fitnessCenter;
    private boolean spa;
    private boolean swimmingPool;

    // Constructor
    public Hotel(int hotelId, String hotelName, String address, String city, String email, String phone, String starRating, boolean freeParking, boolean freeWifi, boolean hotelConcierge, boolean roomService247, boolean fitnessCenter, boolean spa, boolean swimmingPool) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.starRating = starRating;
        this.freeParking = freeParking;
        this.freeWifi = freeWifi;
        this.hotelConcierge = hotelConcierge;
        this.roomService247 = roomService247;
        this.fitnessCenter = fitnessCenter;
        this.spa = spa;
        this.swimmingPool = swimmingPool;
    }

    // Getters
    public int getHotelId() { return hotelId; }
    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getStarRating() { return starRating; }
    public boolean isFreeParking() { return freeParking; }
    public boolean isFreeWifi() { return freeWifi; }
    public boolean isHotelConcierge() { return hotelConcierge; }
    public boolean isRoomService247() { return roomService247; }
    public boolean isFitnessCenter() { return fitnessCenter; }
    public boolean isSpa() { return spa; }
    public boolean isSwimmingPool() { return swimmingPool; }

    // Setters
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }
    public void setAddress(String address) { this.address = address; }
    public void setCity(String city) { this.city = city; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setStarRating(String starRating) { this.starRating = starRating; }
    public void setFreeParking(boolean freeParking) { this.freeParking = freeParking; }
    public void setFreeWifi(boolean freeWifi) { this.freeWifi = freeWifi; }
    public void setHotelConcierge(boolean hotelConcierge) { this.hotelConcierge = hotelConcierge; }
    public void setRoomService247(boolean roomService247) { this.roomService247 = roomService247; }
    public void setFitnessCenter(boolean fitnessCenter) { this.fitnessCenter = fitnessCenter; }
    public void setSpa(boolean spa) { this.spa = spa; }
    public void setSwimmingPool(boolean swimmingPool) { this.swimmingPool = swimmingPool; }
}
