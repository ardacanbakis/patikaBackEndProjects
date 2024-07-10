package Entity;

import java.sql.Date;

public class Reservation {
    private int reservationId;
    private int roomId;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;
    private String customerContact;
    private String customerName;
    private String customerSurname;
    private String customerIdInfo;

    public Reservation(int reservationId, int roomId, Date checkInDate, Date checkOutDate, double totalPrice, String customerContact, String customerName, String customerSurname, String customerIdInfo) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
        this.customerContact = customerContact;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerIdInfo = customerIdInfo;
    }

    public int getReservationId() { return reservationId; }
    public int getRoomId() { return roomId; }
    public Date getCheckInDate() { return checkInDate; }
    public Date getCheckOutDate() { return checkOutDate; }
    public double getTotalPrice() { return totalPrice; }
    public String getCustomerContact() { return customerContact; }
    public String getCustomerName() { return customerName; }
    public String getCustomerSurname() { return customerSurname; }
    public String getCustomerIdInfo() { return customerIdInfo; }


    public void setReservationId(int reservationId) { this.reservationId = reservationId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }
    public void setCheckInDate(Date checkInDate) { this.checkInDate = checkInDate; }
    public void setCheckOutDate(Date checkOutDate) { this.checkOutDate = checkOutDate; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
    public void setCustomerContact(String customerContact) { this.customerContact = customerContact; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCustomerSurname(String customerSurname) { this.customerSurname = customerSurname; }
    public void setCustomerIdInfo(String customerIdInfo) { this.customerIdInfo = customerIdInfo; }
}
