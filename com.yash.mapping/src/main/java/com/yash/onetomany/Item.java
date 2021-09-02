package com.yash.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @JoinColumn(name="ITEM_ID")
	private int id;
	
	private String iName;
	private double iprice;
	private int quntity;
	
	public Item() {
		super();
	}

	public Item(int id, String iName, double iprice, int quntity) {
		super();
		this.id = id;
		this.iName = iName;
		this.iprice = iprice;
		this.quntity = quntity;
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getiName() {
		return iName;
	}






	public void setiName(String iName) {
		this.iName = iName;
	}






	public double getIprice() {
		return iprice;
	}






	public void setIprice(double iprice) {
		this.iprice = iprice;
	}






	public int getQuntity() {
		return quntity;
	}

	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}






	@Override
	public String toString() {
		return "Item [id=" + id + ", iName=" + iName + ", iprice=" + iprice + ", quntity=" + quntity + "]";
	}

	
	
	

	 
}
