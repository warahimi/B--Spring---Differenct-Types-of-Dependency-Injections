package com.B05ObjectInjectionUsingConstructorInjection;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	//Constructor
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\naddress=" + "Address:\nStreet: "+ address.getStreet()+ "\nCity:"+address.getCity()+"\nState: "+address.getState();
	}

	
	
	
	
	

}
