package edu.ssafy.project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("AppDispatcher")
@PropertySource("edu/ssafy/project/name.property")
public class AppDispatcher extends Dispatcher {

	@Value(value = "${phone}")
	String phone;
	
	public AppDispatcher(BeanFactory factory) {
		super(factory);
	}
	
	public void go() {
		System.out.println(phone);
		Phone p = getBean(phone);
		p.takePicture();
//		Phone p = getBean("samsung");
//		p.takePicture();
//		
//		Phone p1 = getBean("apple");
//		p1.takePicture();
	}
}
