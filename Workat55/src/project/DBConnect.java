package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static Connection getConnection() throws Exception {
		
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost: 3306/test";
			String username = "root";
			String password = "Georgiastate9";
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful!\n");
			return con;
			
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		
		return null; 
		
	}

}
