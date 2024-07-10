package Business;

import Core.Db;
import Dao.PensionDao;
import Entity.Pension;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PensionManager {
    private PensionDao pensionDao;

    public PensionManager() {
        pensionDao = new PensionDao();
    }

    public List<Pension> getAllPensions() {
        return pensionDao.findAll();
    }

    public boolean addPension(Pension pension) {
        String query = "INSERT INTO pensions (type) VALUES (?)";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, pension.getType()); // Set the pension type parameter
            int affectedRows = pstmt.executeUpdate(); // Execute the insert operation
            return affectedRows > 0; // Return true if the operation was successful
        } catch (SQLException e) {
            System.out.println("Error Adding Pension: " + e.getMessage());
            return false; // Return false if any SQLException occurs

        }
    }


    public boolean updatePension(Pension pension) {
        // Validate pension data
        return pensionDao.updatePension(pension);
    }

    public boolean deletePension(int pensionId) {
        return pensionDao.deletePension(pensionId);
    }
}
