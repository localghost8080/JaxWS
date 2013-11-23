package com.samrat.common;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanThree {
	
	@Autowired
	private
	BeanOne beanOne;
	
	private String beanName ;
	
	public BeanThree() {
		setBeanName("Bean Three");
		System.out.println("-------------->>>>>>>>>>>>Bean Three");
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public BeanOne getBeanOne() {
		return beanOne;
	}

	public void setBeanOne(BeanOne beanOne) {
		this.beanOne = beanOne;
	}
}
