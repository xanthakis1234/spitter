package spitterpackage.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spitterpackage.Spitter;
import spitterpackage.Spittle;

@Component(value="SpitterService")
@Qualifier("SpitterService")
public class SpitterService {
	
	private SpittleDao spittleDao;
	//private SpitterDao spitterDao;
	//SpitterDao spitterDao = new SpitterDao();
	//SpittleDao spittleDao = new SpittleDao();
	
	@Autowired
	@Qualifier("SpitterDao")
	private DAO<Spitter> dao;
	
	SpitterService(DAO<Spitter> dao){
		this.dao = dao;
		//this.spittleDao = spittleDao;
		
	}
	
	

	//---------------------spitter-----------------------
	
	
	//create Spitter
	public void addSpitter(Spitter spitter) {
		dao.insert(spitter);
	}
	
	
	
	//view Spitter account
	public List<Spitter> viewSpitter(Spitter spitter) {
		return dao.get(spitter);	
	}
	
	//get all Spitters
	public List<Spitter> viewAllSpitters() {

	return dao.getAll();}

	
	//update Spitter account
	public void updateSpitter(Spitter spitter) {
		
		dao.update(spitter);
	
	}
	
	
	//delete Spitter account
	public void deleteSpitter(Spitter spitter) {
		
		dao.delete(spitter);
		
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
