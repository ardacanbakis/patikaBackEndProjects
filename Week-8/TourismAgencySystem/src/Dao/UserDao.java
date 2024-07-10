package Dao;

import Core.Db;
import Entity.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // ... other methods ...

    public List<User> findUsersByRole(String role) {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users WHERE role = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, role);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    User user = new User(
                            rs.getInt("user_id"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("role"));
                    users.add(user);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    public User findByLogin(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = Db.getInstance();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getInt("user_id"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("role"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<User> findAll() {
        return null;
    }

    public boolean addUser(User user) {
        return false;
    }

    public boolean updateUser(User user) {
        return false;
    }

    public boolean deleteUser(int userId) {
        return false;
    }
}