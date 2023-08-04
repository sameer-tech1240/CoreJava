package com.collection;

import java.util.ArrayList;
import java.util.List;

public class FindElementLength {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sameer");
		list.add("Aadil noor");
		list.add("Sumaiya");
		for (String string : list) {
			if (string.length() > 6) {
				System.out.println(string);

			}

		}
	}

}
