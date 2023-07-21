package com.constructor;

class Client {

	public Client() {
		System.out.println("Client class default constructor...");
	}

	Client(int a) {
		System.out.println("Client class param constructor...");
	}

}

public class ConsChaining extends Client {
	public ConsChaining() {
		this("sameer");
		System.out.println("ConsChaining default constructor...");
	}

	ConsChaining(String name) {
		super();
		System.out.println("ConsChaining class param constructor...");
	}
	public static void main(String[] args) {
		ConsChaining c = new ConsChaining();
	}

}
