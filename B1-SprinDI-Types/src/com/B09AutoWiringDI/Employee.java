package com.B09AutoWiringDI;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	//Setter
	public void setId(int id) {
		this.id = id;
		System.out.println("\nSetter Method Called. Injecting Objective Type using Autowiring method\n\n");
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
