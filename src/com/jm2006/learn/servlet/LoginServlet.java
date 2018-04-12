package com.jm2006.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("un");
		String password = request.getParameter("pass");

		if (userName.equals(password)) {
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			request.setAttribute("msg", "This is msg from LoginServlet.");
			rd.forward(request, response);
		} else {
//			response.sendRedirect("login.html");
			response.sendRedirect("http://www.google.com");
		}

	}

}
