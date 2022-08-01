package com.sapient.threads;

class MyBusinesslogic extends Thread {
	
	
	@Override
	public void run() {
		
		
		for(int i=0; i<500; i++) {
			System.out.println("Value of i in Thread " + Thread.currentThread().getName() +" is " + i);
		}
		
		
		System.out.println("Exiting  " + Thread.currentThread());
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	

		MyBusinesslogic mbl1= new MyBusinesslogic(); 
		mbl1.start(); // ths will create os level thread and invoke run method 
		
		MyBusinesslogic mbl2= new MyBusinesslogic(); 
		mbl2.start(); // ths will create os level thread and invoke run method 
		
		
		for(int i=0; i<500; i++) {
			System.out.println("Value of i in Thread " + Thread.currentThread().getName() +" is " + i);
		}
		
		try {
			mbl1.join();
			mbl2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Exiting main ... ");
	}
}
