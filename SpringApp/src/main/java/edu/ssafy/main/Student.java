package edu.ssafy.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	private Person p;
	private String number="11";
	
	public Student() {
		
	}
	
	public Student(Person p, String number) {
		super();
		this.p = p;
		this.number = number;
	}
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [p=" + p + ", number=" + number + "]";
	}
	
}
