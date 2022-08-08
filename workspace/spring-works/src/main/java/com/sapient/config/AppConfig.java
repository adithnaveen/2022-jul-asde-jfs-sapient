package com.sapient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.sapient.beans.Camera;
import com.sapient.beans.Mobile;
import com.sapient.beans.Screen;
import com.sapient.beans.Speaker;
import com.sapient.dao.DummyEmployeeDAO;
import com.sapient.dao.JDBCEmployeeDAO;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
@PropertySource("classpath:mobile-application.properties")
public class AppConfig {

	public AppConfig() {
		log.info("******* Hey i'm inside AppConfig() *******");
	}
	
	@Bean(initMethod = "init", destroyMethod = "destroy", name = "my-funny-dummy" )
	@Scope  // either u can pass singleton (default) or prototype
	public DummyEmployeeDAO dummyDao() {
		log.info("Creating DummyDAO");
		return new DummyEmployeeDAO(); 
	}
	
	 
	@Bean
	public JDBCEmployeeDAO jdbcDao() {
		log.info("Creating JDBC Dao");
		return new JDBCEmployeeDAO(); 
	}
	
	/// building mobile 
	
	@Bean
	public Mobile getMobile() {
		return new Mobile();
	}
	@Bean
	public Speaker getSpeaker() {
		return new Speaker();
	}
	
	@Bean
	public Screen getScreen() {
		return new Screen(); 
	}
	@Bean
	public Camera getCamera() {
		return new Camera();
	}
	
}
