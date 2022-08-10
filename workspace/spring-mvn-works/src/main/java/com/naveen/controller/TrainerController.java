package com.naveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.beans.Trainer;
import com.naveen.dao.TrainerDAO;

@Controller
public class TrainerController {
	@Autowired
	private TrainerDAO dao;
	
	@RequestMapping(method = RequestMethod.GET, path = "/all-trainer")
	public String getAllTrainers(Model model) {
		
		List<Trainer> trainers = dao.getTrainers();
		
		model.addAttribute("TRAINERS", trainers); 
		
		return "show-trainers";
	}
	
}
