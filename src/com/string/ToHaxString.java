package com.string;

public class ToHaxString {
	public static void main(String[] args) {
		ToHaxString br = new ToHaxString();
		System.out.println(br);
		int br2 = br.hashCode();
		System.out.println(br2);
		String string = Integer.toHexString(br2);
		System.out.println(br.getClass().getName());
		System.out.println(string);
		System.out.println(br.getClass().getName() + "@" + string);
	}

}
