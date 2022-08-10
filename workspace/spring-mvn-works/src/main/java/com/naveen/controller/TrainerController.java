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
		System.out.println(trainers);
		model.addAttribute("TRAINERS", trainers); 
		model.addAttribute("TITLE", "Trainers List Goes Here"); 
		
		return "show-trainers";
	}
	
	// show the form
	@RequestMapping(method =RequestMethod.GET, path = "/add-trainer")
	public String addTrainer(Model model) {
		Trainer trainer = new Trainer(); 
		model.addAttribute("trainer", trainer); 
		return "trainer-form";
	}
}
