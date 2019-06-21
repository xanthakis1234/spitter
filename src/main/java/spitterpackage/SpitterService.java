package spitterpackage;

import java.util.ArrayList;
import java.util.List;

public class SpitterService {

	SpitterDao spitterDao = new SpitterDao();
	SpittleDao spittleDao = new SpittleDao();
	private DAO dao;
	
	

	//---------------------spitter-----------------------
	
	
	//create Spitter
	public void addSpitter(Spitter spitter) {
		spitterDao.insert(spitter);
	}
	
	
	
	//view Spitter account
	public List<Spitter> viewSpitter(Spitter spitter) {
		return spitterDao.get(spitter);	
	}
	
	//get all Spitters
	public List<Spitter> viewAllSpitters() {

	return spitterDao.getAll();}

	
	//update Spitter account
	public void updateSpitter(Spitter spitter) {
		
		spitterDao.update(spitter);
	
	}
	
	
	//delete Spitter account
	public void deleteSpitter(Spitter spitter) {
		
		spitterDao.delete(spitter);
		
	}
	

	
	
	//-------------------------spittle---------------------------
	
	
	
	//create Spittle
	public void createSpittle(Spittle spittle ) {
		
		spittleDao.insert(spittle);
			
	}
	
	
	//view Spittle
	public void viewMySpittles(Spitter spitter) {
		
		spittleDao.get(spitter);
		
	}
	
	//view all spittles
	public void viewAllSpittles() {
		
		spittleDao.getAll();
		
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
