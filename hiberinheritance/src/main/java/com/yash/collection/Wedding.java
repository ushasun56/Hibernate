package com.yash.collection;


public class Wedding 
{
     int id;
     String weddinginfo;
     double package1;
	public Wedding() {
		super();
	}
	public Wedding(int id, String weddinginfo, double package1) {
		super();
		this.id = id;
		this.weddinginfo = weddinginfo;
		this.package1 = package1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeddinginfo() {
		return weddinginfo;
	}
	public void setWeddinginfo(String weddinginfo) {
		this.weddinginfo = weddinginfo;
	}
	public double getPackage1() {
		return package1;
	}
	public void setPackage1(double package1) {
		this.package1 = package1;
	}
	@Override
	public String toString() {
		return "Wedding [id=" + id + ", weddinginfo=" + weddinginfo + ", package1=" + package1 + "]";
	}
     
     
}
