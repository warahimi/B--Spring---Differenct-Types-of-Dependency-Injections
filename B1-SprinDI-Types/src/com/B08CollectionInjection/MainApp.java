package com.B08CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B08CollectionInjection.xml");
		Triangle triangle = context.getBean("triangle", Triangle.class);
		triangle.show();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
