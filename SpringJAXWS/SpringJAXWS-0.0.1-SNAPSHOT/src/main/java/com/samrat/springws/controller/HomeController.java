package com.samrat.springws.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samrat.landing.BeanTwo;

@Controller
public class HomeController {
	
	@Autowired
	BeanTwo beanTwo;
	//TODO CREATE A LOGGER
	//TODO message-en.properties
	//TODO create webservices
	
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model){
		System.out.println("--------------->> HomeController");
		System.out.println("AutoWired beanTwo "+ beanTwo.getBeanName());
		System.out.println("AutoWired beanOne inside beanTwo "+ beanTwo.getBeanOne().getBeanName());
		return "home";
	}
}
