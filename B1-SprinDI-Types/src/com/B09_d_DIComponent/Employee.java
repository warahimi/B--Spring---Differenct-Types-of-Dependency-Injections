package com.B09_d_DIComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//so far we learned how to inject a bean inside another bean using the @Autowire implicitly rather than configuring in xml file
// only activate scanning package: 	<context:component-scan base-package="com.B09_d_DIComponent"></context:component-scan>	
//@Component is used to inject a bean automatically inside other bean
//in that case we dont need to register beans inside the xml file

//@Component // to make beans for this class implicitly // if we dont spcify the bean name then the bean name will be same as class name with small first letter
@Component("emp")
public class Employee {
	@Value("102")
	private int id; 
	@Value("Wahid Rahimi")
	private String name;
	@Autowired
	private Address address; 
	
	
	//Setter
	public void setId(int id) {
		this.id = id;
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
