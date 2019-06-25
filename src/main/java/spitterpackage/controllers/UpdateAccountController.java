package spitterpackage.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import spitterpackage.Spitter;
import spitterpackage.dao.SpitterService;

@Controller("updateAcount")
@RequestMapping({"/spitter"})
public class UpdateAccountController {
	
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	
	public UpdateAccountController(SpitterService service) {
		this.service = service;		
	}
	
	@RequestMapping(value="/updateAccount",method=GET)
	public String showUpdateForm(Model model) {	
		model.addAttribute("spitter" , new Spitter());
		return "updateForm";	
	}
	
	@RequestMapping(value="/updateAccount",method=POST)
	public String processingAccountUpdate(@Valid Spitter spitter , Errors errors) {
		if (errors.hasErrors()) {
			return "updateForm";
			}
		service.updateSpitter(spitter);
		//redirect
		return "home";
	}
	
	public void destroy() {}
}
