package com.core.string;

public class CharCount {
	public static void main(String[] args) {
		String string = "sanju this side, this is testing for character count";
		int len = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				len++;
			}

		}
		System.out.println("total character len of your string is: " + len);

	}
}
