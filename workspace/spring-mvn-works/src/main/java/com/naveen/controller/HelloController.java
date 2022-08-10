package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("i'm inside HelloController");
		return "hello"; 
	}
}
