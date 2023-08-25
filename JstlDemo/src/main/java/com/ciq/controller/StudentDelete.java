package com.ciq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ciq.service.StudentServiceImp;

/**
 * Servlet implementation class StudentDelete
 */
public class StudentDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	StudentServiceImp ssi=new StudentServiceImp();
	int id=Integer.parseInt(request.getParameter("id"));
	ssi.delete(id);
	request.setAttribute("delete", "record deleted successfully");
	request.getRequestDispatcher("list").forward(request, response);
	}

	

}
