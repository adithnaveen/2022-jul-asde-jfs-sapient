package com.sapient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TraineeClient {
	public static void main(String[] args) {
		List<Trainee> list = new ArrayList<Trainee>(); 

		list.add(new Trainee(101, "Alok"));
		list.add(new Trainee(102, "Harry"));
		list.add(new Trainee(45, "Siddharth"));
		list.add(new Trainee(78, "Rohan"));
		list.add(new Trainee(9, "Satya"));
		
		
		Comparator<Trainee> sortOnName = new Comparator<Trainee>() {

			@Override
			public int compare(Trainee o1, Trainee o2) {
				return o1.getTName().compareTo(o2.getTName()); 
						
			}
			
		};
		
		Collections.sort(list, sortOnName);
		
		
		
		
	}
}
