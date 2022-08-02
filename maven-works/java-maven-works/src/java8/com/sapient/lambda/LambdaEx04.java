package com.sapient.lambda;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class LambdaEx04 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
		
				for(int i=0; i<500; i++) {
					System.out.println("value of i is  " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
			}
		}).start(); 
		

		new Thread( () ->  {
//			IntStream.range(0, 500).forEach(i -> System.out.println(i)); 
			
			IntStream.range(0, 500).forEach(new IntConsumer() {
				@Override
				public void accept(int value) {
					System.out.println(value);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			});
		}).start(); 
		

		
	}
}
