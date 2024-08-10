package com.basic;

public class GenericType<T> {
	@SuppressWarnings("unchecked")
	T add(String s) {

		return (T) s;
	}

	public static void main(String[] args) {
		GenericType<?> genericType = new GenericType<>();
		String ad = (String) genericType.add("Focus on being productive instead of busy");
		System.out.println(ad);
	}

}
