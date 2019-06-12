package spitterPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class SpitterService {
	
	
	SpitterDao spitterDao = new SpitterDao();
	SpittleDao spittleDao = new SpittleDao();
	

	//---------------------spitter-----------------------
	
	
	//create Spitter
	public void addSpitter(Spitter spitter) {
				
		spitterDao.insertSpitter(spitter);
		
	}
	
	
	
	//view Spitter account
	public void viewSpitter(int idSpitter) {

		spitterDao.getSpitter(idSpitter);
			
	}
	
	//get all Spitters
	public void viewAllSpitters() {
		
		spitterDao.getAllSpitters();

	}

	
	//update Spitter account
	public void updateSpitter(Spitter spitter) {
		
		spitterDao.updateAccount(spitter);
	
	}
	
	
	//delete Spitter account
	public void deleteSpitter(Spitter spitter) {
		
		spitterDao.deleteAccount(spitter);
		
	}
	

	
	
	//-------------------------spittle---------------------------
	
	
	
	//create Spittle
	public void createSpittle(Spitter spitter, Spittle spittle ) {
		
		spittleDao.insertSpittle(spitter, spittle);
			
	}
	
	
	//view Spittle
	public void viewMySpittles(Spitter spitter) {
		
		spittleDao.getMySpittles(spitter);
		
	}
	
	//view all spittles
	public void viewAllSpittles() {
		
		spittleDao.getAllSpittles();
		
	}
	
	
	//update Spittle
	public void updateSpittle(Spittle spittle){
		
		spittleDao.update(spittle);
	
	}
	
	
	//delete Spittle
	public void deleteSpittle(Spittle spittle) {
		
		spittleDao.delete(spittle);
			
	}
	
}
