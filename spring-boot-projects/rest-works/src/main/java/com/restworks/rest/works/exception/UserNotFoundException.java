package com.restworks.rest.works.exception;

public class UserNotFoundException  extends Exception{

	private static final long serialVersionUID = 1L;
	private String msg; 
	
	public UserNotFoundException() {
		this.msg = "Sorry User Not Found"; 
	}
	
	public UserNotFoundException(String msg) {
		this.msg = msg; 
	}

	@Override
	public String toString() {
		return "UserNotFoundException [msg=" + msg + "]";
	}
	
	
}
