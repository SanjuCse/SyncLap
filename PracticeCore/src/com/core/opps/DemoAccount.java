package com.core.opps;

public class DemoAccount {
	public static void main(String[] args) {
		Account account = new Account();
		account.insert(1, "sanju", 10);
		account.display();
		account.checkBalance();
		account.deposit(10);
		account.checkBalance();
		account.withdraw(30);
		account.checkBalance();
		

	}
}
