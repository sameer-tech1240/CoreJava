package com.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack sc = new Stack<>();
		sc.push("sameer");
		sc.push("khan");
		sc.push(101);
		sc.push("aadil");
		sc.push(200);
		System.out.println(sc);
		sc.pop();
		System.out.println(sc);   //remove 200
		System.out.println(sc.peek());  //aadil
		System.out.println(sc.empty());
		System.out.println(sc.search("Sameer"));
	}

}
