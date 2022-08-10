package com.naveen.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.naveen.beans.Trainer;

@Component
public class TrainerDAO {
	static List<Trainer> trainers ; 

	static {
		trainers = new ArrayList();  
		trainers.add(new Trainer(101, "Naveen", "naveen@probis.in", 1234));
		trainers.add(new Trainer(102, "Vinod", "vinod@probis.in", 2112));
		trainers.add(new Trainer(103, "Shankar", "shankar@probis.in", 2234));
		trainers.add(new Trainer(104, "Venkat", "venkat@probis.in", 6234));
		trainers.add(new Trainer(105, "Tim", "tim@probis.in", 7234));
		
		 
	}

	public List<Trainer> getTrainers() {
		return trainers;
	}
	
	public Trainer addTrainer(Trainer trainer) {
		trainers.add(trainer); 
		return trainer; 
	}
}
