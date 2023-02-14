package com.java.string;

public class SBuffer {
	public static void main(String[] args) {
		String string = "String Object";
		System.out.println(string.hashCode());
		string = "String Modified Object";
		System.out.println(string.hashCode());

		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.toString());
	}
}