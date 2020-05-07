package com.B11_a_BeanLifeCycleUsingInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception { //this method will be executed implicitly at the time of initialization of the bean
		System.out.println("init() method called while initializing bean.....");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method is called automatically......");
		
	}
	
	
	
}
