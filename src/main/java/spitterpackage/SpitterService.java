package main.java.spitterpackage;

import java.util.ArrayList;
import java.util.List;

public class SpitterService {

	SpitterDao spitterDao = new SpitterDao();
	SpittleDao spittleDao = new SpittleDao();
	

	//---------------------spitter-----------------------
	
	
	//create Spitter
	public void addSpitter(Spitter spitter) {
		spitterDao.insertSpitter(spitter);
	}
	
	
	
	//view Spitter account
	public List<Spitter> viewSpitter(Spitter spitter) {
		return spitterDao.getSpitter(spitter);	
	}
	
	//get all Spitters
	public List<Spitter> viewAllSpitters() {

	return spitterDao.getAllSpitters();}

	
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
	public void createSpittle(Spittle spittle ) {
		
		spittleDao.insertSpittle(spittle);
			
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
