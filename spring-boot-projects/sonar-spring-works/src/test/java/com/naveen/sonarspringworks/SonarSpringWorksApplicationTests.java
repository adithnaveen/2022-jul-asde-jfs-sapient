package com.naveen.sonarspringworks;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarSpringWorksApplicationTests {

	@Autowired
	private MessageController msgCtrl; 
	
	
	@Test
	void hellloWorldTest() {
		String message = msgCtrl.getMessage("Hello"); 
		
		assertThat(message.length()>0).isTrue(); 
	}

	
	@Test
	void addTest() {
		int num1 = 10; 
		int num2 = 20; 
		int result = msgCtrl.getAddNumbers(num1, num2);
		
		assertThat(result==(num1 + num2)).isTrue();
	}
}
