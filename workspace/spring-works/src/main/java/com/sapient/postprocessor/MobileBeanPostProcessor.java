package com.sapient.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

import com.sapient.beans.Mobile;


@Configuration
public class MobileBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 
		System.out.println("You are trying to created bean Name " + beanName);
		System.out.println("You Bean Content is " + bean);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("You are trying to created bean Name " + beanName);
		System.out.println("You Bean Content is " + bean);		
		
		if(bean instanceof Mobile) {
			Mobile proxyMobile = (Mobile) bean; 
			if(proxyMobile.getSpeaker().getType().equals("blah")) {
				proxyMobile.getSpeaker().setType("mono");
			}
			System.out.println("Speaker Type is ::::: " + proxyMobile.getSpeaker().getType());
			BeanPostProcessor.super.postProcessAfterInitialization(proxyMobile, beanName);
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
}







