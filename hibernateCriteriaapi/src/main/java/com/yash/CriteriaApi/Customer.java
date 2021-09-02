package com.yash.CriteriaApi;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer
{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String name;
     
     @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
     @JoinColumn(name="ITEM_ID")
     private List<Item> item;
     
     

	public Customer() {
		super();
	}

	public Customer(int id, String name, List<Item> item) {
		super();
		this.id = id;
		this.name = name;
		this.item = item;
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

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", item=" + item + "]";
	}

    
     
     
}
 