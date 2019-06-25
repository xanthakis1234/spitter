package spitterpackage.dao;

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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import spitterpackage.Spitter;


@Repository("SpitterDao")
public class SpitterDao implements DAO<Spitter>{

	private List<Spitter> AllSpitters = new ArrayList<>();
	
	//it adds a spitter into the database
	@Override
	public void insert(Spitter spitter) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	Transaction transaction = session.beginTransaction();  
     	
     	session.save(spitter);  
     	transaction.commit();  
	    //System.out.println("successfully saved");    
	    
	    factory.close();  
	    session.close();   
     	
	
	}
		
	
	
	
	//Get spitter account from database
	public List<Spitter> get(String username) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	
     	String hql = "from Spitter where username = :username";
		Query query = session.createQuery(hql);
		
		//int id = spitter.getSpitterId();
		query.setParameter("username", username );
		
		List<Spitter> spitterList = query.list();
		
		
		factory.close();  
	    session.close();
		
		return spitterList;
		
	}
	
	
	//view all spitter accounts
	@Override
	public List<Spitter> getAll() {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
       
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
     	Session session = factory.openSession();  
     	
     	String hql = "from Spitter";
		Query query = session.createQuery(hql);
		//List<Spitter> AllSpitters = query.list();
		this.AllSpitters = query.list();
		//AllSpitters.forEach(System.out::println);
		
		factory.close();  
	    session.close();
		
	return AllSpitters;
		

	}
	
	
	//update Spitter account
		@Override
		public void update(Spitter spitter) {
			
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
		@Override
		public void delete(Spitter spitter) {
			
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

		public void delete1(int id) {
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();  
	       
	        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	     	Session session = factory.openSession();  
	     	Transaction transaction = session.beginTransaction();  
	     	
	     	Spitter sp =session.load(Spitter.class, new Integer(id));
	     	session.delete(sp);  
		    transaction.commit();  
		    System.out.println("successfully deleted");    
		    
		    factory.close();  
		    session.close();   
			
			
		}

	
}

