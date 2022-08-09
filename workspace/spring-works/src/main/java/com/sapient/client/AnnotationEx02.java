package com.sapient.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sapient.aop.LoggingBefore;
import com.sapient.beans.Mobile;
import com.sapient.config.AppConfig;
import com.sapient.postprocessor.SamplePostProcessor;

import lombok.extern.slf4j.Slf4j;

// building mobile + autowiring + load data from external file 
@Slf4j
public class AnnotationEx02 {
	public static void main(String[] args) {
		ApplicationContext context = new
				AnnotationConfigApplicationContext(AppConfig.class,
						SamplePostProcessor.class, LoggingBefore.class);
		
		Mobile mobile = context.getBean("getMobile", Mobile.class);
		mobile.getCamera(); 
		log.info("Mobile is : {}", mobile);
	
	}
}
