package com.leetcode;

import java.util.Scanner;

public class RomantoInteger {
	int I = 1;
	int V = 5;
	int X = 10;
	int L = 50;
	int C = 100;
	int D = 500;
	int M = 1000;
	int result = 0;

	public int romantoInteger(String roman) {
		System.out.println(roman.toCharArray());
//		result = 
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RomantoInteger integer = new RomantoInteger();
		integer.romantoInteger(scanner.nextLine());
		
		scanner.close();
	}
}
