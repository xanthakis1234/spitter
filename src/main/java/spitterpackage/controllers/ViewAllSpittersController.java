package spitterpackage.controllers;


import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spitterpackage.dao.SpitterService;




@Controller
@RequestMapping({"/AllSpitters"})
public class ViewAllSpittersController{
	
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	

	@RequestMapping(method=GET)
	public String getSpitters(Model model) {
		model.addAttribute("spitterList", service.viewAllSpitters());
		
	return "spitters";
	}
	

	public void destroy() {}
   
	}
	

	