package spitterpackage;


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
public class ViewServlet extends HttpServlet {
	
	
	@Autowired
	@Qualifier("SpitterService")
	private SpitterService service;
	
	
	public ViewServlet(SpitterService service) {
		this.service = service;
	}
	@RequestMapping(method=GET)
	public String getSpitters(Model model) {
		model.addAllAttributes(service.viewAllSpitters());
		
	return "spitters";
	}

	/*public void init() throws ServletException {
	}
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// String operation = request.getParameter("operation");

		// Setting up the content type of webpage
		response.setContentType("text/plain");
		// Writing message to the web page
		PrintWriter out = response.getWriter();
		out.println(service.viewAllSpitters());
	}

	  
	public void destroy() {
	      /* leaving empty for now this can be
	       * used when we want to do something at the end
	       * of Servlet life cycle
	       */
	}
	

	