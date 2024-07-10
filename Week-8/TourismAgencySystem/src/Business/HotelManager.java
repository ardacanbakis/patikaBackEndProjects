package Business;

import Dao.HotelDao;
import Entity.Hotel;
import java.util.List;

public class HotelManager {
    private HotelDao hotelDao;

    public HotelManager() {
        hotelDao = new HotelDao();
    }

    public List<Hotel> getAllHotels() {
        return hotelDao.findAll();
    }

    public boolean addHotel(Hotel hotel) {
        // Validate hotel data
        return hotelDao.addHotel(hotel);
    }

    public boolean updateHotel(Hotel hotel) {
        // Validate hotel data
        return hotelDao.updateHotel(hotel);
    }

    public boolean deleteHotel(int hotelId) {
        return hotelDao.deleteHotel(hotelId);
    }
}
