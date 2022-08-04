package com.sapient.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx03 {
	public static void main(String[] args) {
		
		List<String> electronicList =
					Arrays.asList("mobile", "mouse", "keyboard", "monitor", "mobile", "keyboard");
		
		
			Map<String, Long> result = electronicList
				.stream()
				.map(name -> name.toUpperCase())
				.collect(
						Collectors.groupingBy(Function.identity(), Collectors.counting())
						); 
			
			
			System.out.println(result);
				
		
	}
}
