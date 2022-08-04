package com.sapient.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sapient.Trainee;

public class LambdaEx03 {
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
		System.out.println("in asc order... ");
		list.forEach(t -> System.out.println(t));
		
		
		// lambda way 
		System.out.println("in lambda way in descending order ");
		
		Collections.sort(list,  (Trainee o1, Trainee o2) ->  
		o2.getTName().compareTo(o1.getTName()));
		
		list.forEach(t -> System.out.println(t));
		
		// working with trainee id 
		System.out.println("Ascending order of trainee ---- ");
		Comparator<Trainee> ascOnTid = (t1, t2) -> t1.getTId() - t2.getTId(); 
		  
		
		list.sort(ascOnTid);
		list.forEach(t -> System.out.println(t));
	
		System.out.println("Ascending (reversed) order of trainee ---- ");
		
		list.sort(ascOnTid.reversed());
		list.forEach(t -> System.out.println(t));
	}
}

 