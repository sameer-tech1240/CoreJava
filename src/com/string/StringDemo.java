package com.string;

public class StringDemo {
	public static void main(String[] args) {
		String str = "I am working right now";
		String s[]=str.split(" ");
		String reverse="";
		for(int i=0;i<s.length;i++) {
			if(i==s.length-1) {
				reverse=s[i]+reverse;
			}
			else {
				reverse=" "+s[i]+reverse;
			}
		
		}
		System.out.print(reverse);
	}

}
