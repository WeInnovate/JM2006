package com.jm2006.learn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class AFilter implements Filter {

	public AFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// pre-processing
		System.out.println(">> Main Filter started");

		// actual-processing
		chain.doFilter(request, response);
		
		// post-processing
		System.out.println("<< Main Filter stoped");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
