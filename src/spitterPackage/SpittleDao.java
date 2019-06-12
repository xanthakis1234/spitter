package spitterPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SpittleDao {
	
	static String databaseName = "";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/" + databaseName;
	static final String USERNAME_DB = "root";
	static final String PASSWORD_DB = "1234";
	public String sql = null;
	private int status = 0;
	private int spitterid = 0;
	
	
	//create Spittle
		public void insertSpittle(Spitter spitter, Spittle spittle ) {
			try {
				
				Class.forName(DRIVER).newInstance();
				Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
				sql = "insert into spitterdb.spittle (post , username , id_spittle) values (?,?,?);";
				PreparedStatement ps = connection.prepareStatement(sql);
				
				ps.setString(1, spittle.getSpittle());
				ps.setString(2, spitter.getUsername());
				ps.setInt(3, spittle.getSpittleId());
				
				status = ps.executeUpdate();
				
				if (status != 0) {
					System.out.println("Spittle created! \n");
					connection.close();
					
				}else {
					System.out.println("error in createSpittle \n");
				}
				
				}catch (Exception e) {
					e.printStackTrace(); 
				}  
				
				
		}
		
		
		//view  my Spittles
		public void getMySpittles(Spitter spitter) {
			
			try {
				
				
				Class.forName(DRIVER).newInstance();
				Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
				sql = "select post from spitterdb.spittle where username = " + "'" + spitter.getUsername() + "'";
				
				PreparedStatement viewspittle = connection.prepareStatement(sql);
				
				ResultSet rs = viewspittle.executeQuery(sql);
				
				while (rs.next()) {
					
			         String post = rs.getString("post");
			         System.out.println("Spittle : " + post + "\n");
			        
				}
				
				rs.close();
				connection.close();
				
			}catch (Exception e) {
				e.printStackTrace();  
			} 
		}
		
		
		//view  my Spittles
		public void getAllSpittles() {
					
					try {
						
						
						Class.forName(DRIVER).newInstance();
						Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
						sql = "select post , id_spittle, username from spitterdb.spittle";
						
						PreparedStatement viewspittle = connection.prepareStatement(sql);
						
						ResultSet rs = viewspittle.executeQuery(sql);
						
						while (rs.next()) {
							 String username = rs.getString("username");
							 int spittleId = rs.getInt("id_spittle");
					         String post = rs.getString("post");
					         
					         System.out.println("Username : " + username + "\n");
					         System.out.println("Spittle id : " + spittleId + "\n");
					         System.out.println("Spittle : " + post + "\n");
					        
						}
						
						rs.close();
						connection.close();
						
					}catch (Exception e) {
						e.printStackTrace();  
					} 
				}
		
		
		//update spittle
		public void update(Spittle spittle){
			
			try {
				
				Class.forName(DRIVER).newInstance();
				Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
				sql = "update spitterdb.spittle set post = ? where id_spittle =?";
				PreparedStatement update = connection.prepareStatement(sql);
				
				update.setString(1, spittle.getSpittle());
				update.setInt(2, spittle.getSpittleId());
				
				status = update.executeUpdate();
				
				if (status != 0) {
					System.out.println("Spittle Updated! \n");
					
					connection.close();
					
				}else {
					System.out.println("error in updateSpittle \n");
				}
				
				}catch (Exception e) {
					e.printStackTrace(); 
				}  
				
			
		}
		
		
		//delete Spittle
		public void delete(Spittle spittle) {
			
			try {
				
				Class.forName(DRIVER).newInstance();
				Connection connection = DriverManager.getConnection(URL, USERNAME_DB, PASSWORD_DB);
				sql = "delete from spitterdb.spittle where id_spittle = ?";
				PreparedStatement delete = connection.prepareStatement(sql);
				delete.setInt(1, spittle.getSpittleId());
						
				status = delete.executeUpdate();
				
				if (status != 0) {
					System.out.println("Spittle deleted! \n");
					connection.close();
					
				}else {
					System.out.println("error in deleteSpittle \n");
				}
				
				}catch (Exception e) {
					e.printStackTrace();  
				}  
			
			
			
			
		}
		

}
