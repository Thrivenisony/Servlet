package com.ciq.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.model.Student;
import com.ciq.service.StudentServiceImp;

/**
 * Servlet implementation class StudentGetAll
 */
public class StudentGetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentServiceImp ssi=new StudentServiceImp();
		List<Student> student=ssi.getAll();
		request.setAttribute("student", student);
		request.getRequestDispatcher("list-student.jsp").forward(request, response);
		
		
	}

}
