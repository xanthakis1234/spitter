package spitterpackage.controllers;


import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spitterpackage.dao.SpitterService;




@Controller
@RequestMapping({"/AllSpitters"})
public class ViewAllSpittersController{
	
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	
	
	public ViewAllSpittersController(SpitterService service) {
		this.service = service;
	}
	
	@RequestMapping(method=GET)
	public String getSpitters(Model model) {
		model.addAttribute("spitterList", service.viewAllSpitters());
		
	return "spitters";
	}
	

	public void destroy() {}
   
	}
	

	