package com.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BankOperaotr {

	ArrayList<Accounter> al = new ArrayList<Accounter>();

	public void addNewRecord() {
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter name of Account Holder: ");
		String n = input.nextLine();
		System.out.print("Enter an 8 digit Account Number (contact manager for its allocation): ");
		int a = input.nextInt();
		System.out.print("Enter PIN for Account Holder: ");
		String p = input.next();
		System.out.print(
				"Default amount of 1000 is already added  account,  add more money, write  amount else enter zero: ");
		double am = input.nextDouble();

		Accounter ac = new Accounter(n, a, p, am);
		al.add(ac);
		return;
	}

	public void transfer() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter sender's 8 digit account number: ");
		int s_acc = input.nextInt();
		System.out.print("Enter Sender's pin code: ");
		String s_pin = input.next();
		
		int sender_index = -1;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getAccountNumber() == s_acc && al.get(i).getPIN().equals(s_pin))
				sender_index = i;
		}

		if (sender_index == -1) {
			System.out.println("\n Account not Found");
			return;
		}

		System.out.print("\nEnter receiver's 8 digit account number: ");
		int r_acc = input.nextInt();

		int receiver_index = -1;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getAccountNumber() == r_acc)
				receiver_index = i;
		}

		if (receiver_index == -1) {
			System.out.println("\n Receiver's account not Found");
			return;
		}

		System.out.print("\nAmount to be transferred: ");
		double amount = input.nextDouble();
		if (al.get(sender_index).getAmount() >= amount) {
			al.get(receiver_index).setAmount(al.get(receiver_index).getAmount() + amount);
			al.get(sender_index).setAmount(al.get(sender_index).getAmount() - amount);
			return;
		} else {
			System.out.println("\nSender doesnot have this much balance in his account");
			return;
		}
	}

	public void withdraw() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter User's 8 digit account number: ");
		int p_acc = input.nextInt();
		System.out.print("Enter User's pin code: ");
		String p_pin = input.next();

		int person_index = -1;
		for (int i = 0; i < al.size(); i++) {

			if ((al.get(i).getAccountNumber() == p_acc) && (al.get(i).getPIN().equals(p_pin))) {
				person_index = i;
			}
		}

		if (person_index == -1) {
			System.out.println("\n Account not Found");
			return;
		}

		System.out.print("\nAmount to be Withdrawn: ");
		double amount = input.nextDouble();
		if (al.get(person_index).getAmount() >= amount) {
			al.get(person_index).setAmount(al.get(person_index).getAmount() - amount);
			return;
		} else {
			System.out.println("\nThis person doesnot have this much balance in his account");
			return;
		}
	}

	public void print() {
		for (int i = 0; i < al.size(); i++) {
			System.out.println("\nName: " + al.get(i).getName());
			System.out.println("Account Number: " + al.get(i).getAccountNumber());
			System.out.println("Balance: " + al.get(i).getAmount() + "\n");
		}
	}

	public void load() {
		try {
			FileInputStream fis = new FileInputStream("BankRecord.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			while (true) {
				Accounter temp = (Accounter) in.readObject();
				if (temp == null)
					break;
				al.add(temp);
			}
			fis.close();
		} catch (Exception e) {
		}
	}

	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("BankRecord.txt");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			for (int i = 0; i < al.size(); i++)
				out.writeObject(al.get(i));
			fos.close();
		} catch (Exception e) {
			System.out.println("\nError Saving Data to File");
		}
	}
}
