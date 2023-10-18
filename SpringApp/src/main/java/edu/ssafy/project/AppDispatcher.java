package edu.ssafy.project;

import org.springframework.beans.factory.BeanFactory;

public class AppDispatcher extends Dispatcher {

	public AppDispatcher(BeanFactory factory) {
		super(factory);
	}
	
	public void go() {
		Phone p = getBean("samsung");
		p.takePicture();
		
		Phone p1 = getBean("apple");
		p1.takePicture();
	}
}
