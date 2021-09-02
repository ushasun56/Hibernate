package com.yash.testGeneratedvalue;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
      private int personID;
      private String personName;
	  
      private PersonDetail pDetail; 
      
      @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
      @JoinColumn(name="pDetail_pk")
      public PersonDetail getpDetail() {
		return pDetail;
	}
	public void setpDetail(PersonDetail pDetail) { 
		this.pDetail = pDetail;
	}
	@Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
      public int getPersonID() { 
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
      
      
}
