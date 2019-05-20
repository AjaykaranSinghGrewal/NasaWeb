package com.grewal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

	@GetMapping("/")
	public String toIndex(){
		return"index";	
	}
	
	@GetMapping("/picoftheday")
	public String goToPicOfTheDay(){
		return"picoftheday";	
	}
}
