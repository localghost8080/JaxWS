package com.samrat.springws.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//TODO CREATE A LOGGER with AOP
	//TODO create webservices
	
	@RequestMapping("/home")
	public String showHomePage(Map<String, Object> model){
		return "home";
	}
}
