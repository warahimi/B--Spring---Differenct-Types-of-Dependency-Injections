package com.B13JDBCTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("B13JDBCTemplate.xml");
		EmployeeDAO empDao = context.getBean("edao", EmployeeDAO.class);
		
//		Employee employee = new Employee(); // create / instantiate an Employee to pass the object to the saveEmployee
//		employee.setId(103);
//		employee.setName("Abdullah Rahimi");
//		employee.setSalary(500);
//		
//		int countRowInserted = empDao.saveEmployee(employee);
//		System.out.println(countRowInserted + " Row(s) inserted....");
		
//		int countDeleted = empDao.deleteEmployee(103);
//		System.out.println(countDeleted + " Row deleted........");
		
		int countUpdated = empDao.updateEmployee(102, "Hosna Jan", 45000);
		System.out.println(countUpdated +" Rows Updated...........");
		
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
