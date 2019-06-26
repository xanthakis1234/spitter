package spitterpackage.controllers;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import spitterpackage.Spitter;
import spitterpackage.dao.SpitterService;

@Controller("register")
@RequestMapping({"/Spitter"})
public class RegisterController{
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;

	public RegisterController (SpitterService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/register",method=GET)
	public String showRegistrationForm(Model model) {
		model.addAttribute("spitter" , new Spitter());
		return "registerForm";
	}
	
	@RequestMapping(value="/register",method=POST)
	public String processRegistration(@Valid Spitter spitter , Errors errors) {
		if (errors.hasErrors()) {
			return "registerForm";
			}
		service.addSpitter(spitter);
		//redirect
		return "redirect:/spitter/" + spitter.getUsername();
	}
	
	@RequestMapping(value="/{username}", method=GET)
	public String showSpitterProfile(@PathVariable String username, Model model) {
		//String us = spitter.getUsername(); 
		model.addAttribute("spitter", service.viewSpitter(username));
		return "profile";
	}
	
	public void destroy() {}

}
