package Entity;

public class Room {
    private int roomId;
    private int hotelId;
    private int pensionId;
    private int seasonId;
    private String type;
    private int stock;
    private double adultPrice;
    private double childPrice;
    private int bedCapacity;
    private int squareMeter;
    private boolean television;
    private boolean gameConsole;
    private boolean safeBox;
    private boolean projection;

    // Constructor
    public Room(int roomId, int hotelId, int pensionId, int seasonId, String type, int stock, double adultPrice, double childPrice, int bedCapacity, int squareMeter, boolean television, boolean gameConsole, boolean safeBox, boolean projection) {
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.pensionId = pensionId;
        this.seasonId = seasonId;
        this.type = type;
        this.stock = stock;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.bedCapacity = bedCapacity;
        this.squareMeter = squareMeter;
        this.television = television;
        this.gameConsole = gameConsole;
        this.safeBox = safeBox;
        this.projection = projection;
    }

    // Getters
    public int getRoomId() { return roomId; }
    public int getHotelId() { return hotelId; }
    public int getPensionId() { return pensionId; }
    public int getSeasonId() { return seasonId; }
    public String getType() { return type; }
    public int getStock() { return stock; }
    public double getAdultPrice() { return adultPrice; }
    public double getChildPrice() { return childPrice; }
    public int getBedCapacity() { return bedCapacity; }
    public int getSquareMeter() { return squareMeter; }
    public boolean isTelevision() { return television; }
    public boolean isGameConsole() { return gameConsole; }
    public boolean isSafeBox() { return safeBox; }
    public boolean isProjection() { return projection; }

    // Setters
    public void setRoomId(int roomId) { this.roomId = roomId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public void setPensionId(int pensionId) { this.pensionId = pensionId; }
    public void setSeasonId(int seasonId) { this.seasonId = seasonId; }
    public void setType(String type) { this.type = type; }
    public void setStock(int stock) { this.stock = stock; }
    public void setAdultPrice(double adultPrice) { this.adultPrice = adultPrice; }
    public void setChildPrice(double childPrice) { this.childPrice = childPrice; }
    public void setBedCapacity(int bedCapacity) { this.bedCapacity = bedCapacity; }
    public void setSquareMeter(int squareMeter) { this.squareMeter = squareMeter; }
    public void setTelevision(boolean television) { this.television = television; }
    public void setGameConsole(boolean gameConsole) { this.gameConsole = gameConsole; }
    public void setSafeBox(boolean safeBox) { this.safeBox = safeBox; }
    public void setProjection(boolean projection) { this.projection = projection; }
}
