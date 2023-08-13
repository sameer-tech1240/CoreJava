package com.collection;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveWhileIteratingUsingForEachLoop {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Melons");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("cherry");
		fruits.add("Grapes");

		System.out.println("Original Fruit list :- \n " + fruits + "\n");
		for (String fruit : fruits) {
			fruits.remove(fruit);

		}
		System.out.println("\nAfter removal of Melons & addition of Banana :- \n" + fruits);
	}

}
