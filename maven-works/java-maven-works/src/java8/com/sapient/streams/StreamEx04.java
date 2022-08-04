package com.sapient.streams;

import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamEx04 {
	public static void main(String[] args) {
		List<Order> orders = List.of(
				new Order(1000), 
				new Order(456), 
				new Order(789), 
				new Order(500), 
				new Order(365), 
				new Order(56), 
				new Order(1000)
				); 
		
		
		IntSummaryStatistics statistics = orders
			.stream()
			.mapToInt((x) -> x.getOrderAmount())
			.summaryStatistics(); 

		 System.out.println("Average " + statistics.getAverage());
		 System.out.println("Min " + statistics.getMin());
		 System.out.println("Max " + statistics.getMax());
		 System.out.println("Count " + statistics.getCount());
		 System.out.println("Sum " + statistics.getSum());
	}
}
