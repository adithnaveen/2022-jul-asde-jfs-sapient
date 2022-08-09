package com.sapient.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableAspectJAutoProxy
@Aspect
@Component
@Slf4j
public class LoggingBefore {
	@Before("execution(* com.sapient.beans.Mobile.getCamera(..))")
	public void logBefore(JoinPoint joinPoint) {
		log.info("---- before getCamera() ---- ");
	}

}
