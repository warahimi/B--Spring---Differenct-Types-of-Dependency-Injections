package com.B5ObjectInjectionUsingConstructorInjection;

public class Address {
	private String street,city,state;
	
	
	//Constructor
	public Address(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}

	
	
	
	
	
	

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	
	
}
