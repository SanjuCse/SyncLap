 package com.core.hk.proj;

public class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws IllegalArgumentException {
		if (balance == 0) {
			throw new IllegalArgumentException("entered amount cannot be zero");
		} else if (balance < 0) {
			throw new IllegalArgumentException("entered amount cannot be negetive");
		} else {
			this.balance = balance;
		}
	}

}
