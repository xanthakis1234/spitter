package spitterpackage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spitterpackage.Spitter;
import spitterpackage.Spittle;

@Component(value="SpittleService")
public class SpittleService {
	
	//private SpittleDao spittleDao;
	
	@Autowired
	@Qualifier("SpittleDao")
	private DAO<Spittle> dao;
	
	SpittleService(DAO<Spittle> dao){
		
		this.dao = dao;
	}
	
	//create Spittle
	public void createSpittle(Spittle spittle ) {
		
		dao.insert(spittle);
			
	}
	
	
	//view Spittle
	public void viewMySpittles(Spitter spitter) {
		
		//dao.get(spitter);
		
	}
	
	//view all spittles
	public void viewAllSpittles() {
		
		dao.getAll();
		
	}
	
	
	//update Spittle
	public void updateSpittle(Spittle spittle){
		
		dao.update(spittle);
	
	}
	
	
	//delete Spittle
	public void deleteSpittle(Spittle spittle) {
		
		dao.delete(spittle);
			
	}

}
