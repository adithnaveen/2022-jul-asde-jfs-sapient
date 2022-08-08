package com.sapient.junit.works;

/**
 * 
 * @author naveenkumar
 * @see throwing runtime exception from user, for linting
 */
public class CustomRuntimeException extends RuntimeException{
	@Override
	public String toString() {
		return "CustomRuntimeException [msg=" + msg + "]";
	}

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public CustomRuntimeException() {
		this.msg ="Some Exception"; 
	}
	
	public CustomRuntimeException (final String msg) {
		this.msg = msg; 
	}
	
	
}
