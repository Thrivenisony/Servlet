package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericDemo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("generic method invoked");
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.println("<h1>Welcome to generic methods");
		
	}

}
