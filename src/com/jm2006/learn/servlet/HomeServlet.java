package com.jm2006.learn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rdHeader = request.getRequestDispatcher("header.html");
		RequestDispatcher rdIndex = request.getRequestDispatcher("index.html");
		RequestDispatcher rdFooter = request.getRequestDispatcher("footer.html");

		rdHeader.include(request, response);
		rdIndex.include(request, response);
		rdFooter.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
