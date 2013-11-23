package com.samrat.wsserver.webservices;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.samrat.wsserver.webservices.SimpleWSInterface", serviceName="SimpleWS" )
public class SimpleWSImpl implements SimpleWSInterface {

	public String getTimeAsString() {
		return new Date().toString();
	}

	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
