package Dao;

import Core.Db;
import Entity.Hotel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDao {

    public List<Hotel> findAll() {
        List<Hotel> hotelList = new ArrayList<>();
        String query = "SELECT * FROM hotels";

        try (Connection conn = Db.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Hotel hotel = new Hotel(
                        rs.getInt("hotel_id"),
                        rs.getString("hotel_name"),
                        rs.getString("address"),
                        rs.getString("city"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("star_rating"),
                        rs.getBoolean("free_parking"),
                        rs.getBoolean("free_wifi"),
                        rs.getBoolean("hotel_concierge"),
                        rs.getBoolean("room_service_24_7"),
                        rs.getBoolean("fitness_center"),
                        rs.getBoolean("spa"),
                        rs.getBoolean("swimming_pool"));

                        hotelList.add(hotel);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hotelList;
    }
    public boolean addHotel(Hotel hotel) {
        String query = "INSERT INTO hotels (hotel_name, address, city, email, phone, star_rating, free_parking, free_wifi, hotel_concierge, room_service_24_7, fitness_center, spa, swimming_pool) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, hotel.getHotelName());
            pstmt.setString(2, hotel.getAddress());
            pstmt.setString(3, hotel.getCity());
            pstmt.setString(4, hotel.getEmail());
            pstmt.setString(5, hotel.getPhone());
            pstmt.setString(6, hotel.getStarRating());
            pstmt.setBoolean(7, hotel.isFreeParking());
            pstmt.setBoolean(8, hotel.isFreeWifi());
            pstmt.setBoolean(9, hotel.isHotelConcierge());
            pstmt.setBoolean(10, hotel.isRoomService247());
            pstmt.setBoolean(11, hotel.isFitnessCenter());
            pstmt.setBoolean(12, hotel.isSpa());
            pstmt.setBoolean(13, hotel.isSwimmingPool());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateHotel(Hotel hotel) {
        String query = "UPDATE hotels SET hotel_name = ?, address = ?, city = ?, email = ?, phone = ?, star_rating = ?, free_parking = ?, free_wifi = ?, hotel_concierge = ?, room_service_24_7 = ?, fitness_center = ?, spa = ?, swimming_pool = ? WHERE hotel_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, hotel.getHotelName());
            // Set the rest of the parameters based on the Hotel entity...
            pstmt.setInt(14, hotel.getHotelId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean deleteHotel(int hotelId) {
        String query = "DELETE FROM hotels WHERE hotel_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, hotelId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

