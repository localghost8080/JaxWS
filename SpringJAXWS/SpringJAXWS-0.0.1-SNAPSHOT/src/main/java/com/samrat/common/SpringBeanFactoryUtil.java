package com.samrat.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanFactoryUtil implements ApplicationContextAware
{    
    static ApplicationContext context;
    
    public static Object getBean (String beanID)
    {
    	return context.getBean(beanID);
    }
    public static String[] getBeanNames ()
    {
    	return context.getBeanDefinitionNames();
    }
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
}

