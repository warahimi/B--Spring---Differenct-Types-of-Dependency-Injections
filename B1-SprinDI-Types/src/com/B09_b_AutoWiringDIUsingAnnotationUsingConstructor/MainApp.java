package com.B09_b_AutoWiringDIUsingAnnotationUsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B09_b_AutoWiringDIUsingAnnotationUsingConstructor.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		
		((ClassPathXmlApplicationContext)context).close();


	}

}
