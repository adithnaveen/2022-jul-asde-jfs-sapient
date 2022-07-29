package com.sapient.threads;

class MyBuiessLogic1 implements Runnable {

	private Thread t; 
	public MyBuiessLogic1() {}
	public MyBuiessLogic1(String name, int priority) {
			t = new Thread(this); 
			t.setName(name);
			t.setPriority(priority);
			t.start(); 
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println("Value of i in Thread " + Thread.currentThread().getName() +" is " + i);
		}
		
		System.out.println("Exiting  " + Thread.currentThread());		
	}
} 

public class ThreadEx02 {
	public static void main(String[] args) {
		MyBuiessLogic1 m1 = new MyBuiessLogic1(); 
		Thread t1 = new Thread(m1); 
		t1.start(); 
		
		MyBuiessLogic1 m2 = new MyBuiessLogic1("Pranshu", 6); 
		MyBuiessLogic1 m3 = new MyBuiessLogic1("Alok", 7); 
		
	}
}
