package com.collection;

import java.util.ArrayList;
import java.util.List;

class CenterBook {
	String author;
	String bookName;
	String subject;
	int id;
	int quantity;

	public CenterBook(String author, String bookName, String subject, int id, int quantity) {
		super();
		this.author = author;
		this.bookName = bookName;
		this.subject = subject;
		this.id = id;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CenterBook [author=" + author + ", bookName=" + bookName + ", Subject=" + subject + ", id=" + id
				+ ", quantity=" + quantity + "]";
	}

}

public class BookMain {
	public static void main(String[] args) {
		List<CenterBook> arrayList = new ArrayList<>();
		CenterBook book = new CenterBook("Sameer", "java", "new", 101, 1000);
		CenterBook book1 = new CenterBook("Aadil", "python", "new", 102, 10000);
		arrayList.add(book);
		arrayList.add(book1);

		for (CenterBook centerBook : arrayList) {
			System.out.println(centerBook);
		}
	}

}
