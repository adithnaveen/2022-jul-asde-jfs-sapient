package com.sapient.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Component
public class Camera {
	@Value("${mobile.camera.type}")
	private String type;
	
	
	public Camera() {
		log.info("Camera Created...");
	}
}
