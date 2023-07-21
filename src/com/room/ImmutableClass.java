package com.room;

final class ImmutableClass {
	private final String name;
	private final int id;

	public ImmutableClass(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	

	public static void main(String[] args) {
		ImmutableClass p = new ImmutableClass("Sameer", 101);

		System.out.println("Name : " + p.getName() + "\nId : " + p.getId());
	}

}
