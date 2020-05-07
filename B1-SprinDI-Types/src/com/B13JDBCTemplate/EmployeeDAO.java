package com.B13JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDAO {
	//here we provide different APIs/methods by which we perform different database operations
	
	//Using JDBC Template
	
	//Create a reference variable for JDBC Template
	private JdbcTemplate jdbcTemplate; // using this reference variable we can call the methods to perform operations

	//Setter for jdbctemplate
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	//Method to save employee. retuns int the number of row got effected
	int saveEmployee(Employee e) //take an object to be saved to database. the object is taken from user
	{
		//write and fire the query
		String query = "insert into employee values ("+ e.getId()+ ",'" +e.getName()+ "'," +e.getSalary() + ")";
		int result = jdbcTemplate.update(query);
		return result;
	}
	
	//Method to delete employee
	int deleteEmployee(int id)
	{
		String query ="delete from employee where id =?"; //? is place holder
		int result = jdbcTemplate.update(query, new Object[] {id});
		return result;
		
	}
	
	//Update Employee
	int updateEmployee(int id, String newName, double newSalary)
	{
		String query = "update employee set name=?, salary=? where id=?";
		int result = jdbcTemplate.update(query, new Object[] {newName,newSalary,id});
		return result;
	}
	
	
	
	

}
