package com.naveen.util;

import java.util.Map;

import com.naveen.beans.Trainer;
 
public class Util {
	public static  int getCountIdPlusOne(Map  trainerMap) {
		return trainerMap.size() +1; 
	}
	
	public static  Trainer validateTrainer(Trainer trainer) {
		// conditions go  here 
		if(trainer.getTrainerName().length()<4) {
			return null; 
		}
		
		if(trainer.getTrainerEmail().length() < 5) {
			return null; 
		}
		
		return trainer; 
	}
	
	public static Trainer createTrainerBean(String name, String email, String password) {
		return new Trainer(name, email, password);
	}
	
	public static void showTrainer(Trainer trainer) {
		System.out.println(trainer);
	}
}
