package com.samrat.landing;

public class BeanOne {

	private String beanName;
	public BeanOne() {
		setBeanName("Bean One");
		System.out.println("-------------->>>>>>>>>>>>Bean One");
	}
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
