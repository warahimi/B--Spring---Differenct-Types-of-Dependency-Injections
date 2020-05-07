package com.B09_c_AutoWiringAndQualifierDIUsingAnnotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Employee {
	private int id;
	private String name;
	
	private Address address; 
	
	
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	@Autowired
//	@Qualifier("address3") // used with @Autowired. to speify which bean should be injected if we have mulple beans of the same type address
	
//	@Resource(name = "address2") // this one annotation can be an alternative to @Atowired and @Qualifier
	@Resource  //if we do not specify the bean name then it will select the bean which has the same name as field
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\naddress=" + "Address:\nStreet: "+ address.getStreet()+ "\nCity:"+address.getCity()+"\nState: "+address.getState();
	}
	
	
	
	

}
