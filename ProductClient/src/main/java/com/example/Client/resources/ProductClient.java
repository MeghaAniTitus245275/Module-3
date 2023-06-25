package com.example.Client.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/client")
public class ProductClient {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping
	public String testMethod()
	{
//		String url="http://localhost:8090/product/api.2.0/retrieve/1";
//		
//		String result = template.getForObject(url, String.class);
//		return "working..." +result;
String url="http://localhost:8090/product/api.2.0/retrieve/all";
		
		Object result = template.getForObject(url, Object.class);
		return "working..." +result;
	}



}
