package com.sapient.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx02 {
	public static void main(String[] args) {
		Predicate<Integer> positive = i -> i>0; 
		List<Integer> list = Arrays.asList( 87,65,89,-78,77,-101,-922,12);
		
		list.stream().filter(positive).forEach(System.out :: println);
		
		// one lines 
		Arrays.asList( 87,65,89,-78,77,-101,-922,12)
			.stream()
			.filter(i -> i>0)
			.forEach(System.out :: println);
	}
}
