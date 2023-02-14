package com.udemy.FnR;

import java.util.Scanner;
import java.util.stream.IntStream;

import com.core.java.hk.SumReturn;

public class IvD {
	public static void main(String[] args) {

		// imperative way of Programming
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0) {
//				sum = sum + i;
//				System.out.println(i);
//			}
//		}
//		System.out.println(sum);

		// Functional or Declarative Way of Programming
		sum = IntStream.rangeClosed(0, num).filter(i -> i % 2 == 0).reduce((x, y) -> x + y).getAsInt();
		System.out.println(sum);

	}
}
