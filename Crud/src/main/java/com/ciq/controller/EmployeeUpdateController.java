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
 * Servlet implementation class EmployeeUpdateController
 */
public class EmployeeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			doPost(req, resp);
		}
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		
		EmpServiceImp service=new EmpServiceImp();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String address=request.getParameter("address");
		Employee emp=new Employee(id, name, salary, address);
		service.update(emp);
		writer.print("update successfully"+"<br>");
		
		request.getRequestDispatcher("findall").include(request, response);
		writer.print("<a href='index.jsp'>Logout</a>");
		writer.close();
		
		
	}

}
