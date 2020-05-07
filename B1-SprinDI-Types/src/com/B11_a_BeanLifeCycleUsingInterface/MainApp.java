package com.B11_a_BeanLifeCycleUsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B11_a_BeanLifeCycleUsingInterface.xml");
		Employee emp = context.getBean("emp", Employee.class);
		
		System.out.println(emp);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
