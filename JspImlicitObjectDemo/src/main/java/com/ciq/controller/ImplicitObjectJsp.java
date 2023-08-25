package com.ciq.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImplicitObjectJsp
 */
public class ImplicitObjectJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=request.getServletContext();
		context.setAttribute("appscope", "application context");
		
		ServletConfig config=getServletConfig();
		request.setAttribute("servlet_config", "servlet mapping config");
		System.out.println(config.getInitParameter("user"));
		
		HttpSession session=request.getSession();
		session.setAttribute("sessions", "application session");
		session.setMaxInactiveInterval(30);
		
		request.getRequestDispatcher("Implicitobject.jsp").forward(request, response);
	}

}
