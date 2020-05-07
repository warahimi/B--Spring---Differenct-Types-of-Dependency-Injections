package com.B09_b_AutoWiringDIUsingAnnotationUsingConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;

	private Address address;

	// Constructor
	@Autowired
	public Employee(int id, String name, Address address) {
		this.id = id; // NOte: autowiring can be don only with objective type. for paramitive types we
		this.name = name; // inject the values manually in xml file or...
		this.address = address;
		System.out.println("Constructor is called. Autowiring by Constructor\n");
	}

	
	



	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\naddress=" + "Address:\nStreet: " + address.getStreet() + "\nCity:"
				+ address.getCity() + "\nState: " + address.getState();
	}

}
