package com.B03DIUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B03DIUsingConstructor.xml");
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
	}

}
