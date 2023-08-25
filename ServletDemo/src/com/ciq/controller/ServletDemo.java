package com.ciq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo implements Servlet {
	public ServletDemo() {
		System.out.println("Servlet is loaded");
	}

	@Override
	public void destroy() {
		System.out.println("servlet is destroy");

	}

	@Override
	public ServletConfig getServletConfig() {

		return null;
	}

	@Override
	public String getServletInfo() {

		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method is invoked");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is invoked");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1> Welcome to servlet life cycle method</h1>");
		writer.println("<h1> welcome to servlet<h1>");
		writer.close();
	}

}
