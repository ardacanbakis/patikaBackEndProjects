package Dao;

import Core.Db;
import Entity.Reservation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationDao {

    // Retrieve all reservations
    public List<Reservation> findAll() {
        List<Reservation> reservationList = new ArrayList<>();
        String query = "SELECT * FROM reservations";

        try (Connection conn = Db.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Reservation reservation = new Reservation(
                        rs.getInt("reservation_id"),
                        rs.getInt("room_id"),
                        rs.getDate("check_in_date"),
                        rs.getDate("check_out_date"),
                        rs.getDouble("total_price"),
                        rs.getString("customer_contact"),
                        rs.getString("customer_name"),
                        rs.getString("customer_surname"),
                        rs.getString("customer_id_info")
                );
                reservationList.add(reservation);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservationList;
    }

    // Add a new reservation
    public boolean addReservation(Reservation reservation) {
        String query = "INSERT INTO reservations (room_id, check_in_date, check_out_date, total_price, customer_contact, customer_name, customer_surname, customer_id_info) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, reservation.getRoomId());
            pstmt.setDate(2, reservation.getCheckInDate());
            pstmt.setDate(3, reservation.getCheckOutDate());
            pstmt.setDouble(4, reservation.getTotalPrice());
            pstmt.setString(5, reservation.getCustomerContact());
            pstmt.setString(6, reservation.getCustomerName());
            pstmt.setString(7, reservation.getCustomerSurname());
            pstmt.setString(8, reservation.getCustomerIdInfo());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Update an existing reservation
    public boolean updateReservation(Reservation reservation) {
        String query = "UPDATE reservations SET room_id = ?, check_in_date = ?, check_out_date = ?, total_price = ?, customer_contact = ?, customer_name = ?, customer_surname = ?, customer_id_info = ? WHERE reservation_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, reservation.getRoomId());
            pstmt.setDate(2, reservation.getCheckInDate());
            pstmt.setDate(3, reservation.getCheckOutDate());
            pstmt.setDouble(4, reservation.getTotalPrice());
            pstmt.setString(5, reservation.getCustomerContact());
            pstmt.setString(6, reservation.getCustomerName());
            pstmt.setString(7, reservation.getCustomerSurname());
            pstmt.setString(8, reservation.getCustomerIdInfo());
            pstmt.setInt(9, reservation.getReservationId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // Delete a reservation
    public boolean deleteReservation(int reservationId) {
        String query = "DELETE FROM reservations WHERE reservation_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, reservationId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
