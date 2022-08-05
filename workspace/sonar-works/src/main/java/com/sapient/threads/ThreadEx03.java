package com.sapient.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyBusiness implements Executor {

	@Override
	public void execute(Runnable command) {
		System.out.println("i'm before run ");
		command.run();
	}
	
}
class MyRunner implements Runnable {

	@Override
	public void run() {
		System.out.println("i'm invoked by executor");
	}
	
}
public class ThreadEx03 {
	public static void main(String[] args) {
		Executor executor = new MyBusiness(); 
		executor.execute(new MyRunner());
		
		
		ExecutorService exeService = Executors.newFixedThreadPool(5);
		exeService.submit(new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println("you logic goes here... ");
				return null; 
			}
			
		});
		
	}
}










