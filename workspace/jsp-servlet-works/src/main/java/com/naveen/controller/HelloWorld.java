package com.naveen.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	public void init() throws ServletException {
	 System.out.println("in init>");
	}
 
	public void destroy() {
		 	System.out.println("in destory<<<< ");
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 


		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Welcome to servlet "+new Date().toString()+" </h1>");
		out.println("</body>");
		out.println("</html>"); 
	}

}
