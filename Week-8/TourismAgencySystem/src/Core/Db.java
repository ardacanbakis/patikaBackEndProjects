package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static Db instance = null;
    private Connection connection = null;
    private final String URL = "jdbc:mysql://localhost/travelagencydatabase";
    private final String USER = "root";
    private final String PASSWORD = "mysql";

    private Db() {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connection Successfully Established");
        } catch (SQLException e) {
            System.out.println("Error Connecting to Database: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static Connection getInstance() {
        try {
            if (instance == null || instance.getConnection().isClosed()) {
                instance = new Db();
            }
        } catch (SQLException e) {
            System.out.println("Database Connection Error: " + e.getMessage());
        }
        return instance.getConnection();
    }
}
