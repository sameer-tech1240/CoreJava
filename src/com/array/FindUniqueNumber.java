package com.array;
import java.util.HashSet;
public class FindUniqueNumber {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 4, 3, 2 };
		Object unique = unique(a);
		System.out.println(unique);
	}
	static Object unique(int ar[]) {

		HashSet<Object> hashSet = new HashSet<>();
		for (int num : ar) {
			if (hashSet.contains(num)) {
				hashSet.remove(num);
			} else {
				hashSet.add(num);
			}
		}
		return hashSet.iterator().next();
	}
}
