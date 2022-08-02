package com.sapient.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	private int acId; 
	private double balance; 
	private String name; 
	private String gender; 
}
