package com.grewal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grewal.entity.User;

@Controller
public class FrontController {

	com.grewal.dao.Dao dao = new com.grewal.dao.Dao();
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpSession session;

	@GetMapping("/")
	public String toIndex(){
		return"index";
	}
	@GetMapping("/index")
	public String gotoIndex(){
		return"index";
	}
	
	@GetMapping("/picoftheday")
	public String goToPicOfTheDay(){
		return"picoftheday";	
	}
	
	@GetMapping("/login")
	public String goTologinPage(){
		return"login";	
	}
	
	@PostMapping("/connect")
	public String checkLogin(@RequestParam("email") String email, @RequestParam("password") String password){
		dao.login(email, password);
		return"index";	
	}
	
	@GetMapping("/registration")
	public String goToRegister(){
		return"register";	
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestParam("register-name") String name, @RequestParam("register-email") String email, @RequestParam("register-password") String password){
		User user = new User(name, email, password);
		dao.addUser(user);
		return"success";	
	}
	
}
