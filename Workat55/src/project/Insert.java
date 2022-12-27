package project;

import java.sql.Connection;
import java.sql.PreparedStatement;

// Just finished creating this method before leaving 4 jim

public class Insert {
	
	public static void insertFamilyMember(Family family) throws Exception {
		
		try {
			
			Connection con = DBConnect.getConnection();
			
			//PreparedStatement insert = 
					//con.prepareStatement("INSERT INTO family (firstname, lastname) VALUES ('" + var1 + "', '" + var2 + "')");
			
			String sqlQuery = "INSERT INTO family (firstname, lastname, username, password, email, age, gender)" 
										+ " VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement insert = con.prepareStatement(sqlQuery);
			
			insert.setString(1, family.getFirstname());
			insert.setString(2,  family.getLastname());
			insert.setString(3,  family.getUsername());
			insert.setString(4,  family.getPassword());
			insert.setString(5,  family.getEmail());
			insert.setInt(6, family.getAge());
			insert.setString(7, family.getGender());
			
			insert.executeUpdate();
			
			System.out.println("Insert completed.");
			
			con.close();
			
			
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		} 
	}


}
