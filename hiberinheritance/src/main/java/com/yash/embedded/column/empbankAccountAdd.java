package com.yash.embedded.column;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class empbankAccountAdd 
{
	public String street;
	public String city;
	public String state;
	public String zipcode;
	public String IFSC_CODE;
	
	
     public empbankAccountAdd() {
		super();
	}


	public empbankAccountAdd(String street, String city, String state, String zipcode, String iFSC_CODE) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		IFSC_CODE = iFSC_CODE;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getIFSC_CODE() {
		return IFSC_CODE;
	}


	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}
	
	
	
}
