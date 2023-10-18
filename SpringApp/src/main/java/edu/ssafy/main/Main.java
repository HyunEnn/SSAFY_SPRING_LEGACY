package edu.ssafy.main;

import java.text.Annotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//springFramework 실행
//		BeanFactory cxt=new ClassPathXmlApplicationContext("/applicationContext.xml");
		BeanFactory cxt = new AnnotationConfigApplicationContext(Config.class);
		
		Person p = (Person)cxt.getBean("person");
		System.out.println(p.toString());
		
		Person p1= (Person) cxt.getBean("person");
		
		if(p==p1) {
			System.out.println("p == p1");
		} else {
			System.out.println("p != p1 ");
		}
		
		Student std= cxt.getBean(Student.class);
		System.out.println(std);
	}

}
