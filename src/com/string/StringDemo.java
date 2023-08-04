package com.string;

public class StringDemo {
	public static void main(String[] args) {
		String str = "I am working right now";
		String s[]=str.split(" ");
		String reverseString="";
		for(int i=0;i<s.length;i++) {
			if(i==s.length-1) {
				reverseString=s[i]+reverseString;
			}
			else {
				reverseString=" "+s[i]+reverseString;
			}
		
		}
		System.out.print(reverseString);
	}

}
