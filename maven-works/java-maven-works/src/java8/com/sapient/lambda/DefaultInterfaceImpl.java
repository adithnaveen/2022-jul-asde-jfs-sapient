package com.sapient.lambda;

@FunctionalInterface
interface MyInterface {
	void hi(); 
	default void bye() {
		System.out.println("hey i'm from bye ");
	}
}

public class DefaultInterfaceImpl {
	public static void main(String[] args) {
		MyInterface m = new MyInterface() {
			
			@Override
			public void hi() {
				// TODO Auto-generated method stub
				
			}
		};
		
		m.bye();
	}
}
