package Dao;

import Core.Db;
import Entity.Pension;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PensionDao {

    public List<Pension> findAll() {
        List<Pension> pensionList = new ArrayList<>();
        String query = "SELECT * FROM pensions";

        try (Connection conn = Db.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Pension pension = new Pension(rs.getInt("pension_id"), rs.getString("type"));
                pensionList.add(pension);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pensionList;
    }
    public void initializePensionTypes() {
        List<String> pensionTypes = Arrays.asList(
                "Ultra All Inclusive",
                "All Inclusive",
                "Full credit excluding alcohol",
                "Room Breakfast",
                "Full Pension",
                "Half Board",
                "Bed Only"
        );

        for (String type : pensionTypes) {
            addPension(new Pension(type));
        }
    }

    public void addPension(Pension pension) {
        String query = "INSERT INTO pensions (type) VALUES (?)";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, pension.getType());
            int affectedRows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public boolean updatePension(Pension pension) {
        String query = "UPDATE pensions SET type = ? WHERE pension_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, pension.getType());
            pstmt.setInt(2, pension.getPensionId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean deletePension(int pensionId) {
        String query = "DELETE FROM pensions WHERE pension_id = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, pensionId);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
