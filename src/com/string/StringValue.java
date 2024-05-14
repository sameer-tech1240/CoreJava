package com.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value...");
		String value = scanner.nextLine();
		char[] a = value.toCharArray();
		Map<Object, Object> map = new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);

			} else {
				int flag = (int) map.get(a[i]);
				map.put(a[i], ++flag);
			}
		}
		System.out.println(map);
		scanner.close();
	}

}
