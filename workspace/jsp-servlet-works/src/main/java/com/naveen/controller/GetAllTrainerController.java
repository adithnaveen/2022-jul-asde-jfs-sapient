package com.naveen.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Trainer1;
import com.naveen.contract.ITrainerContract;
import com.naveen.dao.Trainer1Dao;
 
@WebServlet("/get-trainers")
public class GetAllTrainerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ITrainerContract trainerDao = new Trainer1Dao(); 
		
		List<Trainer1> trainers = trainerDao.getAllTrainers();
		
		System.out.println(trainers);
	}

}
