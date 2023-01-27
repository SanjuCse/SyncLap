package com.java.string;

import java.util.Iterator;
import java.util.Scanner;

public class CharCount {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String name = scanner.nextLine();
		int count = 0;
		System.out.println("Total Characher of name String is " + count);
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ')
				count++;

		}
		System.out.println("Total Characher of name String is " + count);
	}
}
