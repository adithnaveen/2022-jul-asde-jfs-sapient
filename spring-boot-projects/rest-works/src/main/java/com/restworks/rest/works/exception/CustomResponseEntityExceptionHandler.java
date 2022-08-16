package com.restworks.rest.works.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(Exception exception, WebRequest request) {
		exception.printStackTrace(); 
		
		var exceptionResponse = new ExceptionResponse(); 
		exceptionResponse.setDate(new Date());
		exceptionResponse.setMessage(exception.toString());
		exceptionResponse.setDetails(request.getDescription(false));
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND); 
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception exception, WebRequest request) {
		exception.printStackTrace(); 
		
		var exceptionResponse = new ExceptionResponse(); 
		exceptionResponse.setDate(new Date());
		exceptionResponse.setMessage(exception.getMessage());
		exceptionResponse.setDetails(request.getDescription(false));
		
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
	

}
