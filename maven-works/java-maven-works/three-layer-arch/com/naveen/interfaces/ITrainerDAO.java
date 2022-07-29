package com.naveen.interfaces;

import java.util.List;

import com.naveen.beans.Trainer;

public interface ITrainerDAO {
	
	// method signatures go here 
	// all methods in the interface are abstract
	
	public Trainer insertTrainer(Trainer trainer); 
	public Trainer getTrainer(int trainerId); 
	public List<Trainer> getAllTrainers(); 
}
