package com.jm2006.learn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class Filter2 implements Filter {

	public Filter2() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// pre-processing
		System.out.println(">> Filter2 started");
		String userName = request.getParameter("un");

		// actual-processing
		if (!userName.equalsIgnoreCase("Hacker"))
			chain.doFilter(request, response);

		// post-processing
		System.out.println("<< Filter2 stoped ");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
