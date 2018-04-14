package com.jm2006.learn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	public MyListener() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Servlet Context is destroyed");
	}

	public void contextInitialized(ServletContextEvent sce) {
		String instituteName = sce.getServletContext().getInitParameter("institute");
		System.out.println(">> Servlet Context is initialized with values "+instituteName);
		
	}

}
