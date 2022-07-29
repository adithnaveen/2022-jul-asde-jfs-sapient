package com.naveen.service;

import com.naveen.beans.Trainer;
import com.naveen.dao.TrainerDAO;
import com.naveen.interfaces.ITrainerDAO;
import com.naveen.interfaces.ITrainerService;
import com.naveen.util.Util;

public class TrainerService implements ITrainerService {

	private ITrainerDAO dao; 
	
	public TrainerService() {
		this.dao = new TrainerDAO(); 
	}
	
	@Override
	public Trainer saveTrainer(Trainer trainer) {
		
		// validate
		if(Util.validateTrainer(trainer)==null) {
			return null;
		} 
		// call dao + return 
		return dao.insertTrainer(trainer);
	}

	@Override
	public Trainer getTrainer(int trainerId) {
		return dao.getTrainer(trainerId);
	}
}
