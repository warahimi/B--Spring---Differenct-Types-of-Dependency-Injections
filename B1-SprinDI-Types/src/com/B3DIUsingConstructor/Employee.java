package com.B3DIUsingConstructor;

public class Employee {
	private int id;
	private String name;
	
	//Constructor
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("The constructor is called.\nDI using Constructor\n");
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\nName: " + name;
	}

	
	
	

}
