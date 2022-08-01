package com.naveen.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class IncomeTooLessException extends Exception{
	private String msg; 
	
	public IncomeTooLessException() {
		this.msg = "Income Salary Is Less"; 
	}
	
}
