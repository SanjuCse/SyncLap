package com.java.core;

public class Balance {
	String name;
	Double balance;

	public Balance(String n, Double b) {
		name = n;
		balance = b;
	}

	public void show() {
		if (balance < 0)
			System.out.print("--> ");
		System.out.println(name + ": $" + balance);

	}
}
