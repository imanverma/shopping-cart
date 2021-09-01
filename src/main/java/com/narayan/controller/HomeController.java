package com.narayan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String greet() {
		return "<h2>Hello, Welcome to the Shopping Cart of desire.</h2>";
	}
}
