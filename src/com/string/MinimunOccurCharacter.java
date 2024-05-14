package com.string;

public class MinimunOccurCharacter {
	public static void main(String[] args) {
		String str = "sameer";
		for(char i : str.toCharArray()) {
			if(str.indexOf(i) == str.lastIndexOf(i)) {
				System.out.println(i);
			}
		}
	}

}

