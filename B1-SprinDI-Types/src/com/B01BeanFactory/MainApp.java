package com.B01BeanFactory;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class MainApp {

	public static void main(String[] args) {
		// Instantiating our bean
		Resource resource = new ClassPathResource("B01BeanFactory.xml"); // we need to pass a Resource reference to the BeanFacotry
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//obtain the bean
		Employee employee = beanFactory.getBean("emp", Employee.class);
		System.out.println(employee);
	
		
	}

}
