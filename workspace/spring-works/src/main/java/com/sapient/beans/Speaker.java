package com.sapient.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Component
public class Speaker {

	@Value("${mobile.speaker.type}")
	private String type; 
	
	@Value("${mobile.speaker.volLevels}")
	private int volLevels;
	
	
	public Speaker() {
		log.info("Creating Speaker...");
	}
}
