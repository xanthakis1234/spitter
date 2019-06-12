package spitterPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;



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
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	Transaction transaction = session.beginTransaction();  
     	
     	session.save(spitter);  
     	transaction.commit();  
	    System.out.println("successfully saved");    
	    
	    factory.close();  
	    session.close();   
     	
	
	}
		
	
	
	
	//Get spitter account from database
	public void getSpitter(Spitter spitter) {

		
		System.out.println("ID: " + spitter.getSpitterId());
		System.out.println("Firstname: " + spitter.getFirstname());
        System.out.println("Lastname: " + spitter.getLastname());
        System.out.println("Username: " + spitter.getUsername());
        System.out.println("Password: " + spitter.getPassword() + "\n");

		
	}
	
	
	//view all spitter acounts
	public void getAllSpitters() {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	
     	String hql = "from LogEntry";
		Query query = session.createQuery(hql);
		List<Spitter> AllSpitters = query.list();
		
		AllSpitters.forEach(System.out::println);
		
		
	/*	
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
		*/
	}
	
	
	//update Spitter account
		public void updateAccount(Spitter spitter) {
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
	       
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	     	Session session = factory.openSession();  
	     	Transaction transaction = session.beginTransaction();  
	     	
	     	session.update(spitter);  
	     	transaction.commit();  
		    System.out.println("successfully updated");    
		    
		    factory.close();  
		    session.close(); 
				
				
		}
		
		
		//delete Spitter account
		public void deleteAccount(Spitter spitter) {
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
	       
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	     	Session session = factory.openSession();  
	     	Transaction transaction = session.beginTransaction();  
	     	
	     	session.delete(spitter);  
		    transaction.commit();  
		    System.out.println("successfully deleted");    
		    
		    factory.close();  
		    session.close();   
			
			
		}


	
	
}

