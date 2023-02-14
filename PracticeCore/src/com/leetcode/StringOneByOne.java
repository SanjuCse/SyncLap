package com.leetcode;

public class StringOneByOne {

	public StringOneByOne(final int a) {

	}

	public static void main(String[] args) {
		String string = "TRACXN";
		String string2 = "";

		for (int i = 0; i < string.length(); i++) {
			string2 = string2 + string.charAt(i);
			System.out.println(string2);

		}
	}

}
