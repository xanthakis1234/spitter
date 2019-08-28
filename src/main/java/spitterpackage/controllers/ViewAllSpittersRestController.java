package spitterpackage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spitterpackage.dao.SpitterService;
import spitterpackage.model.Spitter;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ViewAllSpittersRestController {

	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	
	@GetMapping(path="Spitter/hello-world")
	public String helloWorld() {
		return "GEIA";
	}
	@GetMapping(path="all-spitters")
	public List<Spitter> getAllSpitters(){
		return service.viewAllSpitters();	
	}	
}
