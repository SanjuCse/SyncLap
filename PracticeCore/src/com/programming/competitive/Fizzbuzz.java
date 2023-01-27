package com.programming.competitive;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
//			System.out.print(i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz");
			}
			if (i % 3 == 0) {
				System.out.print("Fizz");
			} else if (i % 5 == 0) {
				System.out.print("Buzz");
			} else {
				System.out.print(i);
			}
			System.out.print("," + " ");

		}
		sc.close();
	}
}
