package com.comparable;

public class Stuudent implements Comparable<Stuudent>{
	 private int id;
	private String name;
	private long number;
	private String address;
public Stuudent() {
		
	}
	public Stuudent(int id, String name, long number, String address) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Stuudent [id=" + id + ", name=" + name + ", number=" + number + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Stuudent o) {
		
		return this.id - o.id;
	}
	
	

}
