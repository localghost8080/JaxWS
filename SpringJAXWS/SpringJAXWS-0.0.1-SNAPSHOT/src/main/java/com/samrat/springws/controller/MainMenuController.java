package com.samrat.springws.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samrat.common.SpringBeanFactoryUtil;
import com.samrat.springws.service.SimpleWsInvoker;

@Controller
public class MainMenuController {
	
	@RequestMapping("/simpleWS" )
	public String invokeSimpleWs(Map<String, Object> model){
		
		SimpleWsInvoker wsInvoker = (SimpleWsInvoker)SpringBeanFactoryUtil.getBean("wsInvoker");
		model.put("currentWSTime",wsInvoker.getWSTimeAsString());
		return "simpleWebService";
	}
	
	@RequestMapping("/richParamWS" )
	public String richParamWS(Map<String, Object> model){
		
		SimpleWsInvoker wsInvoker = (SimpleWsInvoker)SpringBeanFactoryUtil.getBean("wsInvoker");
		model.put("currentWSTime",wsInvoker.getWSTimeAsString());
		return "simpleWebService";
	}
}
