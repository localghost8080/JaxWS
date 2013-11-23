package com.samrat.springws.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samrat.common.SpringBeanFactoryUtil;
import com.samrat.springws.service.WsInvoker;

@Controller
public class MainMenuController {
	
	
	@RequestMapping("/simpleWS" )
	public String invokeSimpleWs(Map<String, Object> model){
		
		WsInvoker wsInvoker = (WsInvoker)SpringBeanFactoryUtil.getBean("wsInvoker");
		model.put("currentWSTime",wsInvoker.getWSTimeAsString());
		return "simpleWebService";
	}
}
