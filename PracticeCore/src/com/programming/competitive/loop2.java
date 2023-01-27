package com.programming.competitive;

import java.util.Scanner;

public class loop2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = a; j < n; j++) {
				a+=(a+(2^0*b));
				System.out.printf("%d ", a);
			}
		}
		in.close();
	}
}
