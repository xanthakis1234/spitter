package spitterpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;



public class SpittleDao implements DAO<Spittle>{
	
	static String databaseName = "";
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/" + databaseName;
	static final String USERNAME_DB = "root";
	static final String PASSWORD_DB = "1234";
	public String sql = null;
	private int status = 0;
	private int spitterid = 0;
	private List<Spittle> AllSpittles = new ArrayList<>();
	
		//create Spittle
		@Override
		public void insert(Spittle spittle ) {
			
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
	       
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	     	Session session = factory.openSession();  
	     	Transaction transaction = session.beginTransaction();  
	     	
	     	session.save(spittle);  
	     	transaction.commit();  
		    System.out.println("successfully saved Spittle");    
		    
		    factory.close();  
		    session.close();   
		
		
		}
		
		
		//view  my Spittles
		//thelei ftiaksimo
		public void get(Spitter spitter) {
			
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
		
		
		//view all Spittles
		@Override
		public List<Spittle> getAll() {
					
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
	       
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	     	Session session = factory.openSession();  
	     	
	     	String hql = "from Spittle";
			Query query = session.createQuery(hql);
			//List<Spittle> AllSpittles = query.list();
			this.AllSpittles = query.getResultList();
			//AllSpittles.forEach(System.out::println);
			
			factory.close();  
		    session.close();
			return AllSpittles;
				}
		
		
		//update spittle
		@Override
		public void update(Spittle spittle){
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
			
			SessionFactory factory = meta.getSessionFactoryBuilder().build();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.update(spittle);
			transaction.commit();
			System.out.println("Soittle updated!");
			
			factory.close();
			session.close();
			
		}
		
		
		//delete Spittle
		@Override
		public void delete(Spittle spittle) {
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
			
			SessionFactory factory = meta.getSessionFactoryBuilder().build();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.delete(spittle);
			transaction.commit();
			System.out.println("Spittle Deleted");
			
			factory.close();
			session.close();
			
			
		}


		@Override
		public List<Spittle> get(Spittle t) {
			// TODO Auto-generated method stub
			return null;
		}
		

}
