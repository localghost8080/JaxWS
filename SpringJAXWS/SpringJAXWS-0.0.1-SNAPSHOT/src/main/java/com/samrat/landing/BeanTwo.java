package com.samrat.landing;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanTwo {
	@Autowired
	private
	BeanOne beanOne;
	private String beanName;
	public BeanTwo() {
		setBeanName("BeanTwo");
		System.out.println("-------------->>>>>>>>>>>>BeanTwo");
	}
	public BeanOne getBeanOne() {
		return beanOne;
	}
	public void setBeanOne(BeanOne beanOne) {
		this.beanOne = beanOne;
	}
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
