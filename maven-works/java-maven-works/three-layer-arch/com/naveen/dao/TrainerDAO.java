package com.naveen.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.naveen.beans.Trainer;
import com.naveen.interfaces.ITrainerDAO;
import com.naveen.util.Util;

public class TrainerDAO implements ITrainerDAO{

	// we dont have the DB 
	// we persist in local (Map, [List, Set, Map]) 
	
	public static Map<Integer, Trainer> trainerMap = new HashMap<Integer, Trainer>(); 
	
	@Override
	public Trainer insertTrainer(Trainer trainer) {
		trainer.setTrainerId(Util.getCountIdPlusOne(trainerMap)); 
		trainerMap.put(Util.getCountIdPlusOne(trainerMap), trainer); 
		return trainer;
	}

	@Override
	public Trainer getTrainer(int trainerId) {
		return trainerMap.get(trainerId); 
	}

	@Override
	public List<Trainer> getAllTrainers() {
		return (List<Trainer>) trainerMap.values();
	}

}
