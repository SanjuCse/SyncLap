package com.programming.competitive;

public class VowelCount {

	public static void main(String[] args) {
//		String name = "the quick brown fox jumps over the lazy dog";
		String name = "This is a really simple sentence";
		int vowelCount = 0;
		int constCount = 0;

		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vowelCount++;

			}

			else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
				constCount++;
			}
		}
		System.out.println("Vowel in the String is " + vowelCount);
		System.out.println("Const in the String is " + constCount);
	}

}
