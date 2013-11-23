package com.samrat.springws.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samrat.common.SpringBeanFactoryUtil;
import com.samrat.springws.service.WsInvoker;

@Controller
public class MainMenuController {
	
	@Autowired
	SpringBeanFactoryUtil springBeanFactoryUtil;
	
	@RequestMapping("/simpleWS" )
	public String invokeSimpleWs(Map<String, Object> model){
		
		WsInvoker wsInvoker = (WsInvoker)springBeanFactoryUtil.getBean("wsInvoker");
		model.put("currentWSTime",wsInvoker.getWSTimeAsString());
		return "simpleWebService";
	}
}
