package Entity;

import java.sql.Date;

public class Season {
    private int seasonId;
    private int hotelId;
    private Date startDate;
    private Date endDate;

    public Season(int seasonId, int hotelId, Date startDate, Date endDate) {
        this.seasonId = seasonId;
        this.hotelId = hotelId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getSeasonId() { return seasonId; }
    public int getHotelId() { return hotelId; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }

    // Setters
    public void setSeasonId(int seasonId) { this.seasonId = seasonId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
}