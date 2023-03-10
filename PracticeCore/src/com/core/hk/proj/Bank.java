package com.core.hk.proj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount account1 = new BankAccount();
		double balance = 0;
		while (true) {
			try {
				System.out.println("Enter Balance ");
				balance = scanner.nextDouble();
				account1.setBalance(balance);
				System.out.println("Balance is: " + account1.getBalance());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Enter only number");
				scanner.nextLine();
			}
		}
	}
}
