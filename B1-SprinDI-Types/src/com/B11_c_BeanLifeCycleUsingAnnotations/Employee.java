package com.B11_c_BeanLifeCycleUsingAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Employee{
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
	
	@Required // this is used with setter and makes it mandatory for user to ineter a values for this dependency, else it will throw and exception
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	void init()
	{
		System.out.println("init() method called using Annotaion file");
	}
	@PreDestroy
	void destroy()
	{
		System.out.println("destroy() method called using Annotation file");
	}
	
}
