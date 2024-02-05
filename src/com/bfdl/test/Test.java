package com.bfdl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import stf.Student;


public class Test {

	public static void main(String[] args) {
	

		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Student std = (Student) context.getBean("hello");
		
		std.getStudentDetails();
		System.out.println("===============");
	}

}
