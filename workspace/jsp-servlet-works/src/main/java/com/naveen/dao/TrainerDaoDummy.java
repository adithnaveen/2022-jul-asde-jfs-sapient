package com.naveen.dao;

import java.util.List;

import com.naveen.beans.Trainer1;
import com.naveen.contract.ITrainerContract;
import com.naveen.exception.IncomeTooLessException;
import com.naveen.exception.NameTooSmallException;

public class TrainerDaoDummy implements ITrainerContract {

	@Override
	public Trainer1 insertTrainer(Trainer1 trainer) throws IncomeTooLessException, NameTooSmallException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTrainer(int trainerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateIncome(int trainerId, double newIncome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainer1 getTrainer(int trainerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainer1> getAllTrainers() {
		

		return List.of(
				new Trainer1(101, "harry1", "harry", 1234),
				new Trainer1(102, "harry2", "harry", 1234), 
				new Trainer1(103, "harry3", "harry", 1234), 
				new Trainer1(104, "harry4", "harry", 1234), 
				new Trainer1(105, "harry5", "harry", 1234)
				);
	}

}
