package com.java.string;

public class DivideString {

	public static void main(String[] args) {
		String name = "aabbbbccc";

		int len = name.length();
		int n = 3, temp = 0, chars = len / n;

		String equalString[] = new String[n];

		if (len % n != 0) {
			System.out.println("This String Can't be devided in to" + n + " equal parts");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				String part = name.substring(i, i + chars);
				equalString[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are :");
			for (int i = 0; i < equalString.length; i++) {
				System.out.println(equalString[i]);
			}
		}
	}

}
