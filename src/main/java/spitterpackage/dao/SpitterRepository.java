package spitterpackage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import spitterpackage.model.Spitter;

public interface SpitterRepository
			extends JpaRepository<Spitter, Long>{
	 List<Spitter> findByUserName(String userName); 
}
