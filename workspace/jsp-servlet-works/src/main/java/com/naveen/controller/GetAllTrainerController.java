package com.naveen.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.dao.Trainer1Dao;
 
 
public class GetAllTrainerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
 
		String path ="/WEB-INF/views/show-trainers.jsp"; 
		request.setAttribute("TRAINERS", new Trainer1Dao().getAllTrainers());
		request.getRequestDispatcher(path).forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// you can do some checks here ... 
		doPost(req, resp);
	}

	
	
	
	
}
