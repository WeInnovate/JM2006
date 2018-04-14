package com.jm2006.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("msg", "I have replaced you.");
		String msg = (String) request.getAttribute("msg");
		request.setAttribute("abc", "ABC");
		request.removeAttribute("abc");
		response.setContentType("text/html");
		String tbl = "<table border=\"1px\">\r\n" + 
				"\r\n" + 
				"<tr>\r\n" + 
				"<th>Head 1</th>\r\n" + 
				"<th>Head 1</th>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"<tr>\r\n" + 
				"<td>Row 1 Col 1</td>\r\n" + 
				"<td>Row 1 Col 2</td>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"<tr>\r\n" + 
				"<td>Row 2 Col 1</td>\r\n" + 
				"<td>"+msg+"</td>\r\n" + 
				"</tr>\r\n" + 
				"\r\n" + 
				"</table>\r\n" + 
				"";
		
		PrintWriter pw = response.getWriter();
		pw.println(request.getParameter("un") + " your login is successful!!!! "+msg);
		pw.println(" <br />");
		pw.println(tbl);
	}

}
