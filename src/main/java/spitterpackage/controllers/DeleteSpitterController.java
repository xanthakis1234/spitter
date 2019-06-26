package spitterpackage.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spitterpackage.Spitter;
import spitterpackage.dao.SpitterService;

@Controller("DeleteAccount")
@RequestMapping({"/spitter"})
public class DeleteSpitterController {
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	
	public DeleteSpitterController(SpitterService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/deleteAccount", method=GET)
	public String showDelete(Model model) {
		model.addAttribute("spitter" , new Spitter());
		return "Delete";
	}

}
