package com.core.lamda;

public class LambdaPractice3 {
	public static void main(String[] args) {
		LambdaReturn len = (str) -> {
			int length = str.length();
			System.out.println("The length of the given string is: " + length);
			return length;
		};
		int length = len.length("BasicsStrong");
		System.out.println(length);

	}
}
