package Dao;

import Core.Db;
import Entity.Season;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SeasonDao {

    public List<Season> findAll() {
        List<Season> seasonList = new ArrayList<>();
        String query = "SELECT * FROM seasons";

        try (Connection conn = Db.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Season season = new Season(rs.getInt("season_id"), rs.getInt("hotel_id"), rs.getDate("start_date"), rs.getDate("end_date"));
                seasonList.add(season);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return seasonList;
    }

    public boolean addSeason(Season season) {
        String query = "INSERT INTO seasons (hotel_id, start_date, end_date) VALUES (?, ?, ?)";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, season.getHotelId());
            pstmt.setDate(2, season.getStartDate());
            pstmt.setDate(3, season.getEndDate());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateSeason(Season season) {
        String query = "UPDATE seasons SET hotel_id = ?, start_date = ?, end_date = ? WHERE season_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, season.getHotelId());
            pstmt.setDate(2, season.getStartDate());
            pstmt.setDate(3, season.getEndDate());
            pstmt.setInt(4, season.getSeasonId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean deleteSeason(int seasonId) {
        String query = "DELETE FROM seasons WHERE season_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, seasonId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
