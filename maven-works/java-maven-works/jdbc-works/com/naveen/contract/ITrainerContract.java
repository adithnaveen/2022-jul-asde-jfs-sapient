package com.naveen.contract;

import java.util.List;

import com.naveen.beans.Trainer1;
import com.naveen.exception.IncomeTooLessException;
import com.naveen.exception.NameTooSmallException;

public interface ITrainer {

	public Trainer1 insertTrainer(Trainer1 trainer) throws  IncomeTooLessException, NameTooSmallException; 
	
	public boolean deleteTrainer(int trainerId); 
	
	public boolean updateIncome(int trainerId, double newIncome); 
	
	public Trainer1 getTrainer(int trainerId); 
	public List<Trainer1> getAllTrainers(); 
}
