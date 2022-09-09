package com.naveen.sonarspringworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
 
	@Autowired
	private MessageService service; 
	
	
	@GetMapping("/{message}")
	public String getMessage( @PathVariable String message) {
		return service.sayHi(service.sayHi(message));
	}
	
	

	@GetMapping("/add/{num1}/{num2}")
	public int getAddNumbers( @PathVariable int num1, @PathVariable int num2) {
		return service.add(num1, num2);
	}
}