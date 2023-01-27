package com.java.string;

import java.util.Iterator;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		String string;
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		System.out.println(isPanagram(string.toLowerCase()));

	}

	private static boolean isPanagram(String string) {
		if (string.length() < 0) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (string.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true;

	}
}
