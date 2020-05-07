package com.B09_a_AutoWiringDIUsingXmlFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B09_a_AutoWiringDIUsingXMLfile.xml");
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);

	}

}
