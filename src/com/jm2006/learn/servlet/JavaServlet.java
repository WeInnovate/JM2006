package com.jm2006.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaServlet
 */
@WebServlet(
		urlPatterns = { "/java" }, 
		initParams = { 
				@WebInitParam(name = "trainerName", value = "Atul"), 
				@WebInitParam(name = "trainerMob", value = "123"), 
				@WebInitParam(name = "followUpEmail", value = "a@a.com")
		})
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JavaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nm");
		
		ServletConfig cfg = getServletConfig();
		ServletContext ctx = cfg.getServletContext();
		String trnName = cfg.getInitParameter("trainerName");
		String trnMob = cfg.getInitParameter("trainerMob");
		String followUpEmail= cfg.getInitParameter("followUpEmail");
		String institute = ctx.getInitParameter("institute");
		
		
		//write code to send mail to: followUpEmail for following up with the candidate
		
		PrintWriter out = response.getWriter();
		out.println("Hello, "+name);
		out.println("Your trainer is "+trnName+" adn his mobile number is "+trnMob+" in "+institute);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
