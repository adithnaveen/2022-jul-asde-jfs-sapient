package com.restworks.rest.works.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.restworks.rest.works.beans.User;
import com.restworks.rest.works.repo.UserRepo;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepo.class)
public class MongoConfig {

	
	@Bean
	public CommandLineRunner commandLineRunner(UserRepo repo) {
//		return  args -> repo.insert(new User(101, "Kumar", 1234.5, "kumar@gmail.com"));
		return null;
	}  
	
}
