package edu.ssafy.project;

import org.springframework.beans.factory.BeanFactory;

public class Dispatcher {

	private BeanFactory factory;
	public Dispatcher(BeanFactory factory) {
		this.factory = factory;
	}
	
	public Phone getBean(String name) {
		if(name.equals("samsung")) {
			return (Phone) factory.getBean("samsung");
		} else {
			return (Phone) factory.getBean("apple");
		}
	}
} 
