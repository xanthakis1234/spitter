package spitterpackage.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spitterpackage.model.Spitter;

@Component(value="SpitterService")
public class SpitterService {
	
	@Autowired
	@Qualifier("SpitterDao")
	private DAO<Spitter> dao;
	
	SpitterService(DAO<Spitter> dao){
		this.dao = dao;
	}
	
	

	//---------------------spitter-----------------------
	
	
	//create Spitter
	public void addSpitter(Spitter spitter) {
		dao.insert(spitter);
	}
	
	
	
	//view Spitter account
	public List<Spitter> viewSpitter(String username) {
		return dao.get(username);	
	}
	
	//get all Spitters
	public List<Spitter> viewAllSpitters() {

	return dao.getAll();
	}

	//update Spitter account
	public void updateSpitter(Spitter sp) {
		
		dao.update(sp);
	
	}
	
	
	//delete Spitter account
	public void deleteSpitter(Spitter spitter) {
		
		dao.delete(spitter);
		
	}
}
	
