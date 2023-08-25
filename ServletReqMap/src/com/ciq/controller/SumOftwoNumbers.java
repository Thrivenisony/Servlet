package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SumOftwoNumbers extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int number1=Integer.parseInt(req.getParameter("num1"));
		int number2=Integer.parseInt(req.getParameter("num2"));
		PrintWriter writer=resp.getWriter();
		writer.println("Sum of two numbers:"+(number1+number2));
		
	}
}