package com.collection;

import java.util.Hashtable;
import java.util.Map;

class Book {
	int id;
	String name;
	String auther;
	String publisher;
	int quantity;

	public Book(int id, String name, String auther, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
		this.quantity = quantity;
	}

}

public class HashTableBook {
	public static void main(String[] args) {
		Map<Integer, Book> map = new Hashtable<Integer, Book>();
		Book book = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book book2 = new Book(102, "Let us JAVA", "James Goslin", "CPC", 1001);
		

	}
}