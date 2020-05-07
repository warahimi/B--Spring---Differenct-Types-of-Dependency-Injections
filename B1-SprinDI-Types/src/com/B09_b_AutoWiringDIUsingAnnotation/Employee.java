package com.B09_b_AutoWiringDIUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

//@Autowiring can be placed before property name of setter name: in this case autowiring by name takes place. means the property name and the bean id must be the same
//@utowired can take place byType as well

public class Employee {
	private int id;
	private String name;
	
	@Autowired // so we dont have to explicitely create the bean for this in the xml file and inject it to the employee
	//@Autowired can be either written befor the property of befor the setter method. if wirtten befor property then we dont need setter method to inject as well
	private Address address; // the property name and the bean id for this should be the same because autowiring by name is taken place in this case
	
	
	//Setter
	public void setId(int id) {
		this.id = id;
		System.out.println("\nSetter Method Called. Injecting Objective Type using Autowiring Annotation method\n\n");
	}
	public void setName(String name) {
		this.name = name;
	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\naddress=" + "Address:\nStreet: "+ address.getStreet()+ "\nCity:"+address.getCity()+"\nState: "+address.getState();
	}
	
	
	
	

}
