package com.core.java.hk;

public class Bank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(5000);
		account.currentBalance();
		Boolean.parseBoolean(null);

	}
}

class BankAccount {
	double balance;

	void deposit(double amount) {
		BankAccount account = new BankAccount();
		account.balance = account.balance + amount;
	}

	void currentBalance() {
		System.out.println(balance);
	}
}