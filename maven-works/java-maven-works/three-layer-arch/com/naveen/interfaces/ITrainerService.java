package com.naveen.interfaces;

import com.naveen.beans.Trainer;

public interface ITrainerService {
	public Trainer saveTrainer(Trainer trainer); 
	public Trainer getTrainer(int trainerId); 
}
