package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMarket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Stock> s = new ArrayList<>();

		int choice;

		do {
			System.out.println("1 : Add stock....");
			System.out.println("2 : Remove stock....");
			System.out.println("3 : View stock....");
			System.out.println("4 : Exit....");
			System.out.println("Enter your choice....");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter your stock name....");
				String name = sc.next();
				System.out.println("Enter your stock quantity....");
				int quentity = sc.nextInt();
				System.out.println("Enter the stock price....");
				double price = sc.nextDouble();

				Stock stock = new Stock(name, quentity, price);
				s.add(stock);
				System.out.println("Stock added successfully....");
				break;
			case 2:
				System.out.println("Enter the stock name....");
				String stockname = sc.next();
				System.out.println("Enter the quantity to remove....");
				int removequantity = sc.nextInt();

				boolean stockFound = false;
				for (Stock stock2 : s) {
					if (stock2.getName().equals(stockname)) {

						stockFound = true;
						stock2.removequantity(removequantity);
						System.out.println("Stock Remove successfully....");
						break;

					}

				}
				if (!stockFound) {
					System.out.println("Stock not found....");

				}
				break;
			case 3:
				System.out.println("Current stock....");
				for (Stock stock2 : s) {
					System.out.println(stock2.toString());
				}
				break;
			case 4:
				System.out.println("Existing the program....");
				break;
			default:
				System.out.println("Invalid choice , try again....");
				break;
			}

		} while (choice != 4);
		sc.close();

	}

}

class Stock {
	private String name;
	private int quantity;
	private double price;

	public Stock(String name, int quantity, double price) {

		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void removequantity(int quantityToRemove) {
		if (quantityToRemove <= quantity) {
			quantity -= quantityToRemove;

		} else {
			System.out.println("Not enough quantity to remove....");
		}

	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
