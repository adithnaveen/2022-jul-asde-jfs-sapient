package com.naveen.controller;

import com.naveen.beans.Trainer;
import com.naveen.interfaces.ITrainerService;
import com.naveen.service.TrainerService;

public class TrainerController {
	private ITrainerService service; 
	
	public TrainerController() {
		this.service  = new TrainerService(); 
	}
	
	public Trainer saveTrainer(Trainer trainer) {
		return service.saveTrainer(trainer);
	}
	
}
