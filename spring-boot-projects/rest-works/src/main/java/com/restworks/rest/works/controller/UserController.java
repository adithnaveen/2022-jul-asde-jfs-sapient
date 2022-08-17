package com.restworks.rest.works.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restworks.rest.works.beans.User;
import com.restworks.rest.works.exception.UserNotFoundException;
import com.restworks.rest.works.proxy.UserDetailsProxy;
import com.restworks.rest.works.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

/**
 * 
 * @author naveenkumar
 * @see when invoking http://localhost:9090/ - health 
 * 					  http://localhost:9090/user - POST 
 * 
 * @implSpec this is sample spec
 */

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private UserDetailsProxy userDetailsProxy; 
	
	
	@GetMapping("/")
	public String health() {
		return "application running";
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> saveUser( @RequestBody User user) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(user)); 
	}
	
	@GetMapping("/user")
	public List<User> getAllUsers() {
		return service.getAll(); 
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return service.getUserByIdAsObject(id); 
	}
	
	@GetMapping("/user/name/{name}")
	public List<User> getUsersByName( @PathVariable("name") String name) {
		return service.getUserByName(name); 
	}
	
	@PutMapping("/user")
	public ResponseEntity<User> updateUser( @RequestBody User user)  throws UserNotFoundException{
		
		
		if(service.getUserByIdA(user.getId()).isPresent()) {
			User updatedUser = service.update(user); 
			
			return ResponseEntity.status(HttpStatus.OK).body(updatedUser); 
		}else {
			throw new UserNotFoundException("Sorry User Not Found with Id" + user.getId());
		}
		
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id) throws UserNotFoundException {
		if(service.getUserByIdA(id).isPresent()) {
			service.delete(id);
			return ResponseEntity.status(HttpStatus.OK).body("User Delete" + id); 
		}else {
			throw new UserNotFoundException("Sorry User Not Found with Id" + id);
		}
	}
	
	final String USER_DETAILS_SERVICE="USER_DETAILS_SERVICE";
	
	// making open feign request 
	@GetMapping("/user-details/{name}")
	@CircuitBreaker(name = USER_DETAILS_SERVICE, fallbackMethod = "userDetailsAddressFallBack")
	
//	@RateLimiter()
//	@Retry()
	public String getUserAddress( @PathVariable String name) {
		return userDetailsProxy.getUseAddress(name);
	}
	
	// fallback method when user address is not found 
	public String userDetailsAddressFallBack(Exception e) {
		return "Sorry User Details Service Is Down";
	}
}
















