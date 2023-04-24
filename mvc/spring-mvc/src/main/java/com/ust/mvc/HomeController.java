package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	@GetMapping
	public String respond(Model model)
	{
		model.addAttribute("myTech","Java Full Stack Taining");
		model.addAttribute("location","kerala");
		
		return "register"; //view
	}


	
}
