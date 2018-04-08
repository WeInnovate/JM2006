package com.jm2006.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public RegistrationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("un"); 
		String email = request.getParameter("email");
		String mobile = request.getParameter("mob");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("course");
		String country = request.getParameter("country");
		String comment = request.getParameter("comment");
		
		PrintWriter out = response.getWriter();
		out.println(userName);
		out.println(email);
		
	}

}
