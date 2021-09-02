package com.yash.Mappingmanyto1;

import javax.persistence.*;  

@Entity  
@Table(name="manyemp")  
public class Employee 
{
	  @Id  
	 @GeneratedValue(strategy=GenerationType.AUTO)    
	private int employeeId;    
	private String name,email;    
	@ManyToOne(cascade=CascadeType.ALL)  
	private Bankaddress address;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Bankaddress getAddress() {
		return address;
	}
	public void setAddress(Bankaddress address) {
		this.address = address;
	}
	
	

}
