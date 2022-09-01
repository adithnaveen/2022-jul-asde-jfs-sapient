package com.sapient.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

	@Autowired
	private KafkaService service; 
	
	@PostMapping("/kafka")
	public String  postMessage( @RequestBody  String message) {
		service.sendMessage(message);
		return "Delivered: " +message;
	}
}
