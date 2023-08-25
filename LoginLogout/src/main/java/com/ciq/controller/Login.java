package com.ciq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pd=request.getParameter("pwd");
		if(user.equalsIgnoreCase("admin")&&pd.equals("admin")) {
			request.getRequestDispatcher("list").forward(request, response);
			
		}else {
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
	}

}
