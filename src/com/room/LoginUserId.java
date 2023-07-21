package com.room;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LoginUserId {
	public void emp() {
		String name = "sameer";
		String password = "sameer@1240";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name...");
		String fname = sc.nextLine();
		System.out.println("enter your pass...");
		String lname = sc.nextLine();
		if (name.equals(fname) && password.equals(lname)) {
			
			System.out.println("login successfully...");
			//JOptionPane.showMessageDialog(null, "sale login ho gya");
			
		    		}
		else
			//System.out.println("invalid " + "\nName :" + fname + " " + "\npassword :" + lname + "\nuser not found....");
	System.out.println("invalid User : " +"\nName : "+fname.concat("\nPassword : "+lname));
	    sc.close();
	    
	}
public static void main(String[] args) {
	LoginUserId l = new LoginUserId();
	l.emp();
}

}
