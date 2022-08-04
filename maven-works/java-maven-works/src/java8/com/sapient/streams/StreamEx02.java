package com.sapient.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx02 {
	public static void main(String[] args) {
		List<Office> offices = new ArrayList<Office>(); 
		
		offices.add(new Office("sapient", "india")); 
		offices.add(new Office("sapient", "france"));
		offices.add(new Office("infosys", "india"));		
		offices.add(new Office("infosys", "usa"));
		offices.add(new Office("apple", "india"));
		offices.add(new Office("apple", "france"));		
		offices.add(new Office("apple", "usa"));
		
		
		Map<String, Long> countingOffices = offices
			.stream()
			.collect(Collectors.groupingBy(Office :: getOfficeName, Collectors.counting())); 
		
		
		System.out.println(countingOffices);
		
		System.out.println("----------------------------------");

		Map<String, Long> countingCountries = offices
			.stream()
			.collect(Collectors.groupingBy(Office :: getOfficeLocation, Collectors.counting())); 
		
		
		System.out.println(countingCountries);
		
	}
}
