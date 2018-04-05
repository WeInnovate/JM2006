package com.jm2006.learn.servlet;

import java.io.IOException;

import javax.security.sasl.SaslException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws SaslException, IOException {
		String name = req.getParameter("name");
		res.getWriter().print("Hello " + name);
	}

}
