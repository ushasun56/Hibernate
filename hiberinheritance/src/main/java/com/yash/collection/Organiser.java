package com.yash.collection;

import java.util.List;

public class Organiser 
{
    int id;
    String name;
    String MobileNo;
   String Address;
    
   public List<String> Wedding;

public Organiser() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobileNo() {
	return MobileNo;
}

public void setMobileNo(String mobileNo) {
	MobileNo = mobileNo;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public List<String> getWedding() {
	return Wedding;
}

public void setWedding(List<String> wedding) {
	Wedding = wedding;
}
   
   
}
