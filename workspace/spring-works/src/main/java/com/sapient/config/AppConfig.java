package com.sapient.config;

import org.springframework.context.annotation.Configuration;

import com.sapient.dao.DummyEmployeeDAO;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class AppConfig {

	
	public DummyEmployeeDAO dummyDao() {
		
		return new DummyEmployeeDAO(); 
	}
	
}
