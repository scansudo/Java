package javaDBconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// The database PostgreSQL.jar file was added to the projects build path external archives
// and now is located in the Referenced Libraries.

public class DatabaseConnectionTest {
    public static void main(String[] args) {
    	
    	// Declare Connection Configurations
        String jdbcUrl = "jdbc:postgresql://localhost:3784/Steaksta";
        String username = "scvndy";
        String password = "Tornado123$";

        try {
        	
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");
            
            // Establish the database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            
            // Connection established
            System.out.println("Connected to the PostgreSQL server.");
            
            // Perform your database operations here:
            
            // Remember to close the connection when you're done
            connection.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load the PostgreSQL JDBC driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the PostgreSQL database.");
            e.printStackTrace();
        }
    }
}