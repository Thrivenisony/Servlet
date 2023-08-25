package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.model.Employee;
import com.ciq.service.EmpServiceImp;

/**
 * Servlet implementation class EmployeeFindAllController
 */
public class EmployeeFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			doGet(req, resp);
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 EmpServiceImp service=new EmpServiceImp();
		 List<Employee> employee=service.getAll();
		 response.setContentType("text/html");
		 PrintWriter writer=response.getWriter();
		 writer.print("<html>");
		 writer.print("<body>");
	     writer.println("<table border='1px'>");
		 writer.print("<tr><th>Id</th><th>Name</th><th>Salary</th><th>Address</th></tr>");
		 for (Employee emp : employee) {
			 writer.print("<tr>");
			 writer.print("<td>" + emp.getId() + "</td>");
			 writer.print("<td>" + emp.getName() + "</td>");
			 writer.print("<td>" + emp.getSalary() + "</td>");
			 writer.print("<td>" + emp.getAddress() + "</td>");
		}
		 
		writer.println("</table>");
		writer.print("<br><a href='save.html'><button>Add Employee</button></a>");
		writer.print("<br><a href='details.html'><button>Back</button></a>");
		writer.print("</body>");
		writer.print("</html>");
		
		writer.close();
	}

}
