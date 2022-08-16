package com.user.details.user.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class UserDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsApplication.class, args);
	}

	// http://localhost:9100/user-details/harry
	@GetMapping("/user-details/{name}")
	public String getUseAddress( @PathVariable("name") String name) {
		return "User Address for the name "+ name +" is being fetched from DB";
	}
	
	
}
