package com.naveen.sonarspringworks;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String sayHi(String message) {
		return "Received: " + message; 
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
