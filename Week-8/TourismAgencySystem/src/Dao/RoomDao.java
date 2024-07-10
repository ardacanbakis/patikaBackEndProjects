package Dao;

import Core.Db;
import Entity.Room;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDao {

    public List<Room> findAll() {
        List<Room> roomList = new ArrayList<>();
        String query = "SELECT * FROM rooms";

        try (Connection conn = Db.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Room room = new Room(
                        rs.getInt("room_id"),
                        rs.getInt("hotel_id"),
                        rs.getInt("pension_id"),
                        rs.getInt("season_id"),
                        rs.getString("type"),
                        rs.getInt("stock"),
                        rs.getDouble("adult_price"),
                        rs.getDouble("child_price"),
                        rs.getInt("bed_capacity"),
                        rs.getInt("square_meter"),
                        rs.getBoolean("television"),
                        rs.getBoolean("game_console"),
                        rs.getBoolean("safe_box"),
                        rs.getBoolean("projection")
                );
                roomList.add(room);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return roomList;
    }

    public boolean addRoom(Room room) {
        String query = "INSERT INTO rooms (hotel_id, pension_id, season_id, type, stock, adult_price, child_price, bed_capacity, square_meter, television, game_console, safe_box, projection) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, room.getHotelId());
            pstmt.setInt(2, room.getPensionId());
            pstmt.setInt(3, room.getSeasonId());
            pstmt.setString(4, room.getType());
            pstmt.setInt(5, room.getStock());
            pstmt.setDouble(6, room.getAdultPrice());
            pstmt.setDouble(7, room.getChildPrice());
            pstmt.setInt(8, room.getBedCapacity());
            pstmt.setInt(9, room.getSquareMeter());
            pstmt.setBoolean(10, room.isTelevision());
            pstmt.setBoolean(11, room.isGameConsole());
            pstmt.setBoolean(12, room.isSafeBox());
            pstmt.setBoolean(13, room.isProjection());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateRoom(Room room) {
        String query = "UPDATE rooms SET hotel_id = ?, pension_id = ?, season_id = ?, type = ?, stock = ?, adult_price = ?, child_price = ?, bed_capacity = ?, square_meter = ?, television = ?, game_console = ?, safe_box = ?, projection = ? WHERE room_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, room.getHotelId());
            pstmt.setInt(2, room.getPensionId());
            pstmt.setInt(3, room.getSeasonId());
            pstmt.setString(4, room.getType());
            pstmt.setInt(5, room.getStock());
            pstmt.setDouble(6, room.getAdultPrice());
            pstmt.setDouble(7, room.getChildPrice());
            pstmt.setInt(8, room.getBedCapacity());
            pstmt.setInt(9, room.getSquareMeter());
            pstmt.setBoolean(10, room.isTelevision());
            pstmt.setBoolean(11, room.isGameConsole());
            pstmt.setBoolean(12, room.isSafeBox());
            pstmt.setBoolean(13, room.isProjection());
            pstmt.setInt(14, room.getRoomId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean deleteRoom(int roomId) {
        String query = "DELETE FROM rooms WHERE room_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, roomId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
