package com.naveen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/login-validate")
public class LoginValidateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, 
					IOException {

		response.setContentType("text/html");
		
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		
		if(userName.equals("sapient") && password.equals("india")) {
			// success - call another servlet 
			//  + pass all the parameters which you have received to another servlet 
			
			request.getRequestDispatcher("success").forward(request, response);
		}else {
//			failure
			
			request.getRequestDispatcher("failure").include(request, response);
			
			request.getRequestDispatcher("/login-page.html").include(request, response); 
		}
		
	}

}
