package spitterpackage;

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
	public List<Spitter> getSpitter(Spitter spitter) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	
     	String hql = "from Spitter where id_spitter = :id";
		Query query = session.createQuery(hql);
		
		int id = spitter.getSpitterId();
		query.setParameter("id", id );
		
		List<Spitter> spitterList = query.list();
		
		
		factory.close();  
	    session.close();
		
		return spitterList;
			
		/*
		System.out.println("ID: " + spitter.getSpitterId());
		System.out.println("Firstname: " + spitter.getFirstname());
        System.out.println("Lastname: " + spitter.getLastname());
        System.out.println("Username: " + spitter.getUsername());
        System.out.println("Password: " + spitter.getPassword() + "\n");
		*/
		
	}
	
	
	//view all spitter accounts
	public List<Spitter> getAllSpitters() {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	
     	String hql = "from Spitter";
		Query query = session.createQuery(hql);
		List<Spitter> AllSpitters = query.list();
		
		//AllSpitters.forEach(System.out::println);
		
		factory.close();  
	    session.close();
		
	return AllSpitters;
		

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

