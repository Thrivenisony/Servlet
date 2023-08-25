package com.ciq.controlleremp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeFindAll extends HttpServlet{
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			doGet(req, resp);
		}
	

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter writer=resp.getWriter();
	List<Employee> emp=new ArrayList<>();
	emp.add(new Employee(1, "adhithya", 30000, "adi@gmail.com"));
	emp.add(new Employee(2,"Thriveni",50000,"thriveni@gmail.com"));
	emp.add(new Employee(3, "Naresh", 30000, "naresh@gmail.com"));
	emp.add(new Employee(4,"shekhar",50000,"shekhar@gmail.com"));
	emp.add(new Employee(5, "sahithi", 30000, "sahithi@gmail.com"));
	emp.add(new Employee(6,"priya",50000,"priya@gmail.com"));
	//writer.print("<h4 align='left'> "+" <a href='logout.html'>logout</a> "+" </h4>");
	writer.println("<table border='1px'>");
	writer.print("<tr><th>EmpId</th><th>EmpName</th><th>EmpSalray</th><th>EmpEmail</th></tr>");
	for (Employee employee : emp) {
		writer.print("<tr>");
		writer.print("<td>"+ employee.getId()+"</td>");
		writer.print("<td>"+employee.getName()+"</td>");
		writer.print("<td>"+employee.getSalary()+"</td>");
		writer.print("<td>"+employee.getEmail()+"</td>");
		writer.print("</tr>");
	}
	writer.println("</table>");
	writer.print("<a href='home.html'>back</a>");
	writer.close();

	
}
}
