package com.yash.hiber.student;
/**
 * 
 * create simple persistent class which is don't have 
 * 1.no_arg constructor
 * 2.provider identifier property
 * 3.getter&setter
 * 4.non-final class
 * 
 * @author usha.more
 *
 */

public class StudentApp 
{
	private int id;
	private String name;
	private String lastname;
	private float mark;
	
	
	
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	
	

}
