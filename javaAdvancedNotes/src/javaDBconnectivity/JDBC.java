package javaDBconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		// Declare connection configurations
		String jdbcURL = "jdbc:postgresql://localhost:3784/Steaksta";
		String username = "scvndy";
        String password = "Tornado123$";
		Connection connection = null;
		
		// SQL STATEMENT --------------------------------------
		
		// Configure statement data (Can be changed at any time, so you can use the same code)
		int rollno = 2;
		String name = "Erick";
		int age = 25;
		
		// Configure the SQL statement for database's modification
		String sql = "INSERT INTO employees(id, name, age)" + "VALUES("
		+ rollno + ", '" + name + "', " + age + ")";

		// SQL STATEMENT ---------------------------------------
		
		try {
			// Establish database connection
			connection = DriverManager.getConnection(jdbcURL, username, password);
			
			// Establish createStatement(); method to the database connection
			Statement st = connection.createStatement();
			
			// SQL statement update executed
			int x = st.executeUpdate(sql);
			
			// Verification Process 
			// x is only = 1 if 1 row was effected & if x = 0 that means no rows were effected,
			// that is when the else statement comes into the picture.
			if(x == 1)
				System.out.println("insert succesfully: " + sql);
			else
				System.out.println("insertion failed");
			
        } catch (SQLException ex) {
           System.err.println(ex);
        }finally {
        	if (connection != null ) {
        	connection.close();
        	}
        }	
	}
}