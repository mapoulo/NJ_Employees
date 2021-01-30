package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/employee")
	public String EmployeesFallback() {
		return "The employee service is currently not available please try again later";
	}
	
	@GetMapping("/department")
	public String DepartFallback() {
		return "The department service is currently not available please try again later";
	}

}
