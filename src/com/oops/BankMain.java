package com.oops;

import java.util.Scanner;
public class BankMain {

	
	           
		public static void main(String args[])
		{
		 
			BankOperaotr obj = new BankOperaotr();
			obj.load();
		try{	Scanner input = new Scanner(System.in);
			System.out.println("\n**********************Welcome to our Bank*************************");
			int choice = 0;
			while(choice != 5)
			{
				System.out.println("\n1 - Create new Account");
				System.out.println("2 - Transfer money from an existing account to another existing account");
				System.out.println("3 - Withdraw money from existing account");
				System.out.println("4 - Print all exisitng accounts");
				System.out.println("5 - Exit");
				System.out.print("Enter your choice: ");
				choice = input.nextInt();

				if(choice == 1)
				{
					obj.addNewRecord();
					System.out.println("\nAccount Created Successfully");
				}
				else if(choice == 2)
				{
					obj.transfer();
				}
				else if(choice == 3)
				{
					obj.withdraw();
				}
				else if(choice == 4)
					obj.print();
				else if(choice == 5)
				{
					obj.save();
					System.out.println("\nData saved to File \"BankRecord .txt\"");
					System.exit(1);
				}
				else
					System.out.println("\nWrong Input");
			}
		       }
		catch(Exception e)
		{
			System.out.println("\n Error");
		}
		
		finally
		{
			obj.save();
		}
	       }
		
	}


