package edu.ssafy.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cxt 
		= new ClassPathXmlApplicationContext("edu/ssafy/project/applicationContext.xml");
	
//		Phone phone = (Phone) cxt.getBean("apple");
//		
//		phone.powerOn();
//		phone.powerOff();
//		phone.takePicture();
//		phone.call();
		
//		new AppDispatcher(cxt).go();
		((AppDispatcher) cxt.getBean("AppDispatcher")).go();
	}

}
