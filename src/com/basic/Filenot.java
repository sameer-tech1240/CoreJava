package com.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenot {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("C:\\Program Files (x86)");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("handle");
		}
	}

}
