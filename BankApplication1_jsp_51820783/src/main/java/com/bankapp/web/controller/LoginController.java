package com.bankapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@GetMapping(path="/login")
	public String login(){
		return "mylogin";
		
	}
	

	@GetMapping(path="/home")
	public String home(){
		return "home";
		
	}


}
