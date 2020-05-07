package com.B12ReadingFromPropertiesFIle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B12ReadingFromPropertiesFile.xml");
		System.out.println(context.getMessage("message", null, "Default Message", null));
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
