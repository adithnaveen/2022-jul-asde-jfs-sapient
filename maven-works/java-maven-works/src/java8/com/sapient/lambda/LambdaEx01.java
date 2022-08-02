package com.sapient.lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4,5,7,12,88,33,99);
		
		// loop 
		System.out.println("Using for loop");
		for(int i=0; i<numbers.size(); i++) {
			System.out.print(numbers.get(i)+"\t");
		}
		System.out.println();
		// enhanced for loop 1.5 jdk , behind the screen uses iterators 
		System.out.println("With Enhance for loop ");
		for(Integer val : numbers) {
			System.out.print(val +"\t");
		}
		
		// using iterators 
		System.out.println();
		System.out.println("Using iterators ");
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		System.out.println("with java 8 lambda");
		// jdk 1.8 with lambda 
		numbers.forEach((val) ->   System.out.print(val +"\t"));
		
		System.out.println();
		System.out.println("with consumer, in inturn can qualify for lambda ");
		Consumer<Integer> printer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		
		numbers.forEach(printer);
		
	}
}
