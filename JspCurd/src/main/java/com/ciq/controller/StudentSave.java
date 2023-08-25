package com.ciq.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ciq.model.Student;
import com.ciq.service.StudentServiceImp;

/**
 * Servlet implementation class StudentSave
 */
public class StudentSave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentServiceImp ssi=new StudentServiceImp();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String course=req.getParameter("course");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		Student student=new Student(id, name, course, email, address);
		ssi.save(student);
		req.setAttribute("Inserted", "record insert successfully");
		req.getRequestDispatcher("list").forward(req, resp);
	}
		

}
