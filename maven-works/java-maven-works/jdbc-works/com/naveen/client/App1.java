package com.naveen.client;

import com.naveen.beans.Trainer1;
import com.naveen.contract.ITrainerContract;
import com.naveen.dao.Trainer1Dao;
import com.naveen.exception.IncomeTooLessException;
import com.naveen.exception.NameTooSmallException;

public class App1 {
	public static void main(String[] args) throws IncomeTooLessException, NameTooSmallException {
		ITrainerContract trainerDao = new Trainer1Dao();

		// Trainer1 trainer = new Trainer1(103, "Satya", "stya@ps.in", 6000.0);
//		System.out.println(trainerDao.insertTrainer(trainer));

//		System.out.println(trainerDao.deleteTrainer(101));
//		System.out.println(trainerDao.updateIncome(102, 7000));
		
		
//		System.out.println(trainerDao.getTrainer(103));
		
		
		for(Trainer1 t: trainerDao.getAllTrainers()) {
			System.out.println(t);
		}
			

	}
}
