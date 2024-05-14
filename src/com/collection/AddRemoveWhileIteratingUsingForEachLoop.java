package com.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddRemoveWhileIteratingUsingForEachLoop {
	public static void main(String[] args) {
		List<String> fruits = new CopyOnWriteArrayList<>();
		fruits.add("Melons");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("cherry");
		fruits.add("Grapes");

		System.out.println("Original Fruit list :- \n " + fruits + "\n");
		for (String fruit : fruits) {
			if (fruit == "Apple") {
				fruits.remove(2);
			}

		}
		System.out.println("\nAfter removal of Melons & addition of Banana :- \n" + fruits);
	}

}
