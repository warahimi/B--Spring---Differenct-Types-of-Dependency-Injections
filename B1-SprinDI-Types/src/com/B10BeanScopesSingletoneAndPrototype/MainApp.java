package com.B10BeanScopesSingletoneAndPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B10BeanScopeSingletoneAndPrototype.xml");
		Employee emp = context.getBean("emp", Employee.class);
		
		emp.setId(101);
		emp.setName("Wahidullah");
		
		System.out.println("ID: "+emp.getId()+"\nName: "+emp.getName());
		
		//Singletone
//		Employee emp2 = context.getBean("emp", Employee.class); // the values returned are same for both emp1 and emp2
//		//because the scope is singleton. only one instance of Employee will be created per container. howmuch time we call the getBean of 
//		//same container we will get the same instance
//		System.out.println("\n---------------Singleton-----------------------");
//		System.out.println("Fetching data using emp2");
//		System.out.println("ID: "+emp2.getId()+"\nName: "+emp2.getName()); //even we have not set values using emp2 it will fetch mp1 values
		
		//Prototype
		System.out.println("\n---------------Prototype-----------------------");
		System.out.println("Fetching data using emp3");
		Employee emp3 = context.getBean("emp", Employee.class); // a new instance of bean is created and returend by getBean()
		System.out.println("ID: "+emp3.getId()+"\nName: "+emp3.getName()); // this will return null becaue we have not set values for emp3. it wont fetch emp1 values like singleton scope
		((ClassPathXmlApplicationContext)context).close();


	}

}
