package com.naveen.sonarspringworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 
 *  to execute 
 *  1. $ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install 
	2. mvn clean verify sonar:sonar \                                 
  -Dsonar.projectKey=spring-test \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=sqp_7c993f38200d3154945c2f96e647fc3272ce20c2
 * 
 */
@SpringBootApplication
public class SonarSpringWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarSpringWorksApplication.class, args);
	}

}
