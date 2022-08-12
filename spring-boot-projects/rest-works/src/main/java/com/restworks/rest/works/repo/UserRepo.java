package com.restworks.rest.works.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.restworks.rest.works.beans.User;

public interface UserRepo extends MongoRepository<User, Integer>{

	// you can write customized query here 
	public List<User> findByName(String name); 
	
	// find users who's income > Integer 
	@Query("{'income' : {$gt:?0}}")
	public List<User> findByIncomeGreaterThan(double income);
}
