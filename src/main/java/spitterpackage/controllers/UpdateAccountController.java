package spitterpackage.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spitterpackage.Spitter;
import spitterpackage.dao.SpitterService;

@Controller("updateAccount")
@RequestMapping({"/spitter"})
public class UpdateAccountController {
	
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	//Spitter spitter;
	
	public UpdateAccountController(SpitterService service) {
		this.service = service;		
	}
	
	@RequestMapping(value="/updateAccount",method=GET)
	public String showUpdateForm(Model model) {	
		model.addAttribute("spitter" , new Spitter());
		return "updateForm";	
	}
	
	@RequestMapping(value="/updateAccount",method=POST)
	public String processingAccountUpdate(Spitter spitter , Errors errors) {
		if (errors.hasErrors()) {
			return "updateForm";
			}
		service.updateSpitter(spitter);
		//redirect
		return "redirect:/spitter/"+ spitter.getUsername();
	}
	
	@RequestMapping(value="/{username}")
	public String viewProgile(@PathVariable String username , Model m) {
		//List<Spitter> list =service.viewSpitter(username);
		m.addAttribute("spitter", service.viewSpitter(username));
		return "profile";
	}
	

	
	public void destroy() {}
}
