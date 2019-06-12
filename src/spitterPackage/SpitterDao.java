package spitterPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SpitterDao {
	
	static String databaseName = "";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/" + databaseName;
	static final String USERNAME_DB = "root";
	static final String PASSWORD_DB = "1234";
	public String sql = null;
	private int status;
	
	
	
	
	
	//it adds a spitter into the database
	public void insertSpitter(Spitter spitter) {
		
		try {
			
			Class.forName(DRIVER).newInstance();
			Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
			sql = "insert into spitterdb.spitter (firstname , lastname, username , passwrd , id_spitter) values (?,?,?,?,?);";
			PreparedStatement insert = connection.prepareStatement(sql);
			
			insert.setString(1, spitter.getFirstname());
			insert.setString(2, spitter.getLastname());
			insert.setString(3, spitter.getUsername());
			insert.setString(4, spitter.getPassword());
			insert.setInt(5, spitter.getSpitterId());
			
			status = insert.executeUpdate();
			
			if (status != 0) {
				System.out.println("insert spitter was done \n");
				connection.close();
				
			}else {
				System.out.println("error in insertspitter \n");
			}
			
			}catch (Exception e) {
				e.printStackTrace(); 
			}  
		
	}
		
	
	
	
	//Get spitter account from database
	public void getSpitter(int idSpitter) {

		try {
			
			Class.forName(DRIVER).newInstance();
			Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
			sql = "select firstname , lastname, username , passwrd from spitterdb.spitter  where id_spitter = " + "'" + idSpitter + "'";
			
			
			PreparedStatement view = connection.prepareStatement(sql);
			
			
			ResultSet rs = view.executeQuery(sql);
			
			while (rs.next()) {
				
		         String firstnamefromdb = rs.getString("firstname");
		         String lastnamefromdb = rs.getString("lastname");
		         String usernamefromdb = rs.getString("username");
		         String passwordfromdb = rs.getString("passwrd");


		         System.out.println("Firstname: " + firstnamefromdb);
		         System.out.println("Lastname: " + lastnamefromdb);
		         System.out.println("Username: " + usernamefromdb);
		         System.out.println("Password: " + passwordfromdb + "\n");
			}
			
			rs.close();
			connection.close();
			
		}catch (Exception e) {
			e.printStackTrace(); 
		} 
		
	}
	
	
	//view all spitter acounts
	public void getAllSpitters() {
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
			sql = "select firstname , lastname, username, id_spitter  from spitterdb.spitter";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(sql);
			
			while (rs.next()) {
				
		         String first = rs.getString("firstname");
		         String last = rs.getString("lastname");
		         String username = rs.getString("username");
		         int spitterId = rs.getInt("id_spitter");
		        

		         System.out.println("Firstname: " + first);
		         System.out.println("Lastname: " + last);
		         System.out.println("Username: " + username );
		         System.out.println("ID: " + spitterId + "\n");
			}
			
			rs.close();
			connection.close();
			
		}catch (Exception e) {
			e.printStackTrace();  
		}
		
	}
	
	
	//update Spitter account
		public void updateAccount(Spitter spitter) {
			
			try {
				
				Class.forName(DRIVER).newInstance();
				Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
				sql = "update spitterdb.spitter set firstname = ?, lastname = ?, username = ?, passwrd= ? where id_spitter =?";
				PreparedStatement update = connection.prepareStatement(sql);
				
				update.setString(1, spitter.getFirstname());
				update.setString(2, spitter.getLastname());
				update.setString(3, spitter.getUsername());
				update.setString(4, spitter.getPassword());
				update.setInt(5, spitter.getSpitterId());
				
				
				status = update.executeUpdate();
				
				if (status != 0) {
					System.out.println("Update completed! \n");
					connection.close();
					
				}else {
					System.out.println("error in Update Spitter \n");
				}
				
				}catch (Exception e) {
					e.printStackTrace(); 
				}  
				
				
		}
		
		
		//delete Spitter account
		public void deleteAccount(Spitter spitter) {
			
			try {
				
				Class.forName(DRIVER).newInstance();
				Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
				sql = "delete from spitterdb.spitter where id_spitter = ?";
				PreparedStatement delete = connection.prepareStatement(sql);
				delete.setInt(1, spitter.getSpitterId());
						
				status = delete.executeUpdate();
				
				if (status != 0) {
					System.out.println("Spitter deleted! \n");
					connection.close();
					
				}else {
					System.out.println("error in deleteSpitter \n");
				}
				
				}catch (Exception e) {
					e.printStackTrace(); 
				}  
			
			
			
		}


	
	
	
}
