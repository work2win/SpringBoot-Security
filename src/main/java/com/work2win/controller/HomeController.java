package com.work2win.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "This is home page";		
	}
	
	@GetMapping("/user")
	public String user() {
		return "This is user page";		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";		
	}

}
