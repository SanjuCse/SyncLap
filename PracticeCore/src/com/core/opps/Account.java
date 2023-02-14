package com.core.opps;

public class Account {
	int accoNo;
	String name;
	float amount;

	void insert(int accNo, String name, float amount) {
		this.accoNo = accNo;
		this.name = name;
		this.amount = amount;
	}

	void deposit(float amount) {
		this.amount = this.amount + amount;
		System.out.println(amount + " has been deposited");
	}

	void withdraw(float amount) {
		if (this.amount < amount) {
			System.out.println("Insufficient Balance, can't withdraw " + amount);
		} else {
			this.amount = this.amount - amount;
			System.out.println(amount + " has been withdwawn");
		}
		
	}
	
	void checkBalance() {
		System.out.println("your balance is " +amount );
	}
	void display() {
		System.out.println(name+" - "+accoNo +" - "+ amount);
	}
}
