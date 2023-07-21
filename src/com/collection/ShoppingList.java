package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
	private ArrayList<String> items;

	public ShoppingList() {
		items = new ArrayList<String>();

	}

	public void addItem(String item) {
		items.add(item);

	}

	public void removeItem(String item) {
		items.remove(item);
	}

	public void printList() {
		System.out.println("Shopping List.....");
		for (String item : items) {
			System.out.println(" " + item);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingList list = new ShoppingList();
		String input = "";
		while (!input.contains("exit")) {
			System.out.println("Enter item to add list : (type 'exit' to stop....)");
			input = sc.nextLine();
			if (!input.contains("exit")) {
				list.addItem(input);

			}

		}
		list.printList();
	}

}
