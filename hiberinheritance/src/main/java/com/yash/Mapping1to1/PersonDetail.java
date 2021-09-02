package com.yash.Mapping1to1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class PersonDetail 

{
	private int personDetailID;
	private String zipcode;
	private String job;
	private double income;
	
	@Id
    @GeneratedValue
    @JoinColumn(name="pDetail_pk") 
	public int getPersonDetailID() {
		return personDetailID;
	}
	public void setPersonDetailID(int personDetailID) {
		this.personDetailID = personDetailID;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	

}
