package com.samrat.springws.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.samrat.wsserver.webservices.SimpleWSInterface;

public class WsInvoker {
	SimpleWSInterface simpleWs;

	public WsInvoker() {

		try {
			URL url = new URL("http://localhost:8080/SpringJAXWS/simplews?wsdl");
			QName qname = new QName("http://webservices.wsserver.samrat.com/", "SimpleWS");
			Service service = Service.create(url, qname);
			simpleWs = service.getPort(SimpleWSInterface.class);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public String getWSTimeAsString(){
		if(simpleWs==null){
			return null;
		}
		return simpleWs.getTimeAsString();
	}
	
	public Long getWSTimeElapsed(){
		if(simpleWs==null){
			return null;
		}
		return simpleWs.getTimeAsElapsed();
	}
}
