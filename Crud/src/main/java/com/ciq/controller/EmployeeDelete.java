package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.model.Employee;
import com.ciq.service.EmpServiceImp;

/**
 * Servlet implementation class EmployeeDelete
 */
public class EmployeeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		EmpServiceImp service=new EmpServiceImp();
		int id=Integer.parseInt(request.getParameter("id"));
		service.delete(id);
		writer.print("delete succesfully");
		
		request.getRequestDispatcher("findall").include(request, response);
		
				
		
	}

}
