package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String user=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		
		if(user.equalsIgnoreCase("admin")&&pwd.equals("admin")) {
			request.getRequestDispatcher("details.html").forward(request, response);
			
		}else {
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		
	}

}
