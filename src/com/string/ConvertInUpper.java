package com.string;

public class ConvertInUpper {
	public static void main(String[] args) {
		String string = "sameer";
		char[] charArray = string.toCharArray();
		charArray[1] = Character.toUpperCase(charArray[1]);
		charArray[3] = Character.toUpperCase(charArray[3]);
		charArray[5] = Character.toUpperCase(charArray[5]);
		String s = new String(charArray);
		System.out.println(s);

		// Only even letter to upper this logic
		String s1 = "yasirk";
		char[] charArray2 = s1.toCharArray();
		for (int i = 1; i < charArray2.length; i += 2) {
			charArray2[i] = Character.toUpperCase(charArray2[i]);
		}
		String str = new String(charArray2);
		System.out.println(str);

	}

}
