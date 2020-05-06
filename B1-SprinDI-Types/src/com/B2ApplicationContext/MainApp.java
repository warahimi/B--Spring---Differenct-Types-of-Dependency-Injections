package com.B2ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B2ApplicationContext.xml");
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
		
		
	}

}
