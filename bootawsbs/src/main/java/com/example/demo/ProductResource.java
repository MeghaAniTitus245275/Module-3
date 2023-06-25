package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ProductResource {
	
	@GetMapping("/test")
	//@RequestMapping("/test")
	public String message() {
		
		return "Success";
		
	}

}
