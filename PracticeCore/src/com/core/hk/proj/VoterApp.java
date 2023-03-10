package com.core.hk.proj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterApp {
	public static void main(String[] args) {
		Voter voter = new Voter();
		Scanner scanner = new Scanner(System.in);
		try {
			String name = "";
			System.out.println("Enter age: ");
			int age = scanner.nextInt();
			voter.setAge(age);
			if (age >= 18) {
				System.out.println("Enter name: ");
				scanner.nextLine();
				name = scanner.nextLine();
				voter.setName(name);
			}
			if ((age != 0) && (name != "")) {
				voter.getStatus();
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("age only in number");
			scanner.nextLine();
		}
	}
}
