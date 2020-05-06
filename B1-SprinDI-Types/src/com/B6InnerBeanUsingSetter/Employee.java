package com.B6InnerBeanUsingSetter;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	//Setter
	public void setId(int id) {
		this.id = id;
		System.out.println("\nInner Bean Using Setter\n\n");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\naddress=" + "Address:\nStreet: "+ address.getStreet()+ "\nCity:"+address.getCity()+"\nState: "+address.getState();
	}
	
	
	
	

}
