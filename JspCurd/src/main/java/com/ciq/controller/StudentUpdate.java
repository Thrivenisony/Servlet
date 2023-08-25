package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ciq.model.Student;

import com.ciq.service.StudentServiceImp;

/**
 * Servlet implementation class StudentSave
 */
public class StudentUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		StudentServiceImp ssi=new StudentServiceImp();
		int id=Integer.parseInt(req.getParameter("id"));
		Student student=ssi.findById(id);
		req.setAttribute("studentupdate", student);
		req.getRequestDispatcher("update.jsp").forward(req, resp);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentServiceImp si=new StudentServiceImp();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String course=request.getParameter("course");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		Student student=new Student(id, name, course, email, address);
		
		si.update(student);
		request.setAttribute("msg", "record update successfully");
		request.getRequestDispatcher("list").forward(request, response);
	}

}
