package com.java.string;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {
		String name1 = "ABCD";
		String name2 = "DCBA";

		name1.toLowerCase();
		name2.toLowerCase();

		if (name1.length() != name2.length()) {
			System.out.println("Both Strings are not Anagram");
		} else {
			char nameString1[] = name1.toCharArray();
			char nameString2[] = name2.toCharArray();

			Arrays.sort(nameString1);
			Arrays.sort(nameString2);

			if (Arrays.equals(nameString1, nameString2) == true) {
				System.out.println("Both the strings are Anagram");
			} else {
				System.out.println("Both Strings are not Anagram");
			}
		}

//		for (int i = 0; i < name1.length(); i++) {
//			for (int j = 0; j < name2.length(); j++) {
//				if (name1.charAt(i) == name2.charAt(j)) {
//					System.out.println("String is Anagram");
//				}
//
//			}
//		}

//		System.out.println("String is not Anagram");

	}

}
