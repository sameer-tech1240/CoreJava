package com.assosiation;

public class AggrigationMain {
	public static void main(String[] args) {
		Aggrigation ob = new Aggrigation("Sameer", "London", 901);
		Aggrigation2 obj = new Aggrigation2(ob, "sameer @87654");
		obj.print();
	}

}
