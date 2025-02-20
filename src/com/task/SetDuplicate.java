package com.task;

import java.util.HashSet;
import java.util.Set;

class Workers {
	private int id;

	private String name;

	private String address;

	public Workers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Workers(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Workers [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	/*
	 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
	 * == null || getClass() != o.getClass()) return false; Workers worker =
	 * (Workers) o; return id == worker.id && name.equals(worker.name) &&
	 * address.equals(worker.address); }
	 * 
	 * @Override public int hashCode() { return Objects.hash(id, name, address); }
	 */
	

}

public class SetDuplicate {

	public static void main(String[] args) {

		Set<Workers> of = new HashSet<>();
		of.add(new Workers(1, "sameer", "sakinaka"));
		of.add(new Workers(1, "sameer", "sakinaka"));
		of.add(new Workers(1, "sameer", "sakinaka"));
		of.add(new Workers(1, "sameer", "sakinaka"));

		of.forEach(workers -> System.out.println(workers));

	}

}
