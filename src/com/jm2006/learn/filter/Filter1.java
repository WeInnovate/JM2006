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
public class Filter1 implements Filter {

	public Filter1() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// pre-processing
		System.out.println(">> Filter1 started");

		// actual-processing
		chain.doFilter(request, response);
		
		// post-processing
		System.out.println("<< Filter1 stoped");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
