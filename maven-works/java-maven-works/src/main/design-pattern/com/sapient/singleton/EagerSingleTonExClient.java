package com.sapient.singleton;

public class EagerSingleTonExClient {
	public static void main(String[] args) {
		// this will not work
		// EagerSingleTonEx ex = new EagerSingleTonEx();

		EagerSingleTonEx ex = EagerSingleTonEx.getInstance();
		System.out.println("Loaded At " + ex.hashCode());

		ex = EagerSingleTonEx.getInstance(); 
		System.out.println("Loaded At " + ex.hashCode());

		ex = EagerSingleTonEx.getInstance();
		System.out.println("Loaded At " + ex.hashCode());

	}
}
