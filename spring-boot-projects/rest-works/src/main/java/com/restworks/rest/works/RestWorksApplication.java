package com.restworks.rest.works;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


// to invoke swagger 

//http://localhost:9090/swagger-ui/index.html



@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class RestWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWorksApplication.class, args);
	}

}
