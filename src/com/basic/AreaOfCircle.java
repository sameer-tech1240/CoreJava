package com.basic;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		double pi=3.14;
	double	area;
		int r;
	Scanner src =new Scanner(System.in);
	System.out.println("enter the area");
	r=src.nextInt();
	area=pi*r*r;
	System.out.println(area);
		

	}

}
