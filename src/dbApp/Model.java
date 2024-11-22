package dbApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Model {
	// Database credentials
    private static final String HOSTNAME = "ccinfo206db.ct2kugc6gcjf.ap-southeast-1.rds.amazonaws.com";
    private static final int PORT = 3306;
    private static final String DATABASE = "yourDatabaseName"; // Replace with your actual database name
    private static final String USERNAME = "root";
    private static final String PASSWORD = "DLSU1234!";

    // JDBC URL
    private static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DATABASE + "?useSSL=false";

    public static Connection connect() {
        try {
            // Load the MySQL JDBC Driver (Optional for Java 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database successfully!");
            return connection;
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return null;
        
    }

    public static void main(String[] args) {
        // Test the connection
        Connection conn = connect();
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
