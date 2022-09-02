package com.sapient.kafka;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String, String> template; 
	
	// spel 
	@Value("${sapient-kafka-topic}")
	private String kafkaTopic; 
	
	public void sendMessage(String message) {
		ListenableFuture<SendResult<String, String>>
			send = template.send(kafkaTopic, message);
		try {
			SendResult<String, String> sendResult = send.get();
			
			System.out.println(send.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
