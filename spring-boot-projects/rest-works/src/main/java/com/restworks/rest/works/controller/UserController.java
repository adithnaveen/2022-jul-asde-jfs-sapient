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
import com.restworks.rest.works.service.UserService;

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
	public User updateUser( @RequestBody User user) {
		return service.update(user); 
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		service.delete(id);
	}
}
















