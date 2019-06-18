package main.java.spitterpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewSpecificServlet extends HttpServlet{
	
	private SpitterService service = new SpitterService();
	Spitter kate = new Spitter("Kate","Barry", "KB","12345",6);
	public void init() throws ServletException {
	}
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Setting up the content type of webpage
		response.setContentType("text/plain");
		// Writing message to the web page
		PrintWriter out = response.getWriter();
		out.println(service.viewSpitter(kate));
	}

	  
	public void destroy() {
	      /* leaving empty for now this can be
	       * used when we want to do something at the end
	       * of Servlet life cycle
	       */
	   }

}
