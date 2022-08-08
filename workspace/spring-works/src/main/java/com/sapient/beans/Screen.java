package com.sapient.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Component
public class Screen {
	
	public Screen() {
		log.info("Creating Screen Object...");
	}
	 
	
	@Value("${mobile.screen.len}")
	private int len; 
	
	@Value("${mobile.screen.bre}")
	private int bre; 
	
	@Value("${mobile.screen.screenType}")
	private String screenType; 
}
