package com.programming.competitive;

import java.util.Scanner;

public class weirdNotWeird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String ans;
		if (N % 2 == 1 || (N >= 6 && N <= 20)) {
			ans = "Weird";
		} else {
			ans = "Not Weird";
		}
		System.out.println(ans);

		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();
	}

}
