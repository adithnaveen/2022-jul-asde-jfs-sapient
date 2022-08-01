package com.naveen.exception;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class NameTooSmallException extends Exception {

	private String msg; 
	
	public NameTooSmallException() {
		this.msg = "Name too small"; 
	}
}
