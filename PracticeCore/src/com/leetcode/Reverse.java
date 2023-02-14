package com.leetcode;

public class Reverse {
	public static void main(String[] args) {
		String string = "Hello";
		StringBuilder builder = new StringBuilder();
		for (int i = string.length() - 1; i >= 0; i--) {
			builder.append(string.charAt(i));
		}
		System.out.println(builder.toString());
	}
}
