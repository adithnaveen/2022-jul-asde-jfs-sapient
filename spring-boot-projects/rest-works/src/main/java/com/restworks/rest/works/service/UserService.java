package com.restworks.rest.works.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restworks.rest.works.beans.User;
import com.restworks.rest.works.repo.UserRepo;

/**
 * 
 * @author naveenkumar
 * @see the service layer invokes Repo layer for operations
 */

@Service
public class UserService {
	@Autowired
	private UserRepo repo; 
	
	public User save(User user) {
		return repo.insert(user);
	}
	
	public User update(User user) {
		return repo.save(user); 
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	public List<User> getAll() {
		return repo.findAll(); 
	}
	
	public User getUserByIdAsObject(Integer id) {
		Optional<User> byId = repo.findById(id);
		return byId.isPresent()?byId.get():null;
	}
	
	public Optional<User> getUserByIdA(Integer id) {
		return repo.findById(id);
	}
	

	public List<User> getUserByName(String name) {
		return repo.findByName(name);
	}
	
	public List<User> getUserByIncomeGreaterThan(double income) {
		return repo.findByIncomeGreaterThan(income);
	}
}
