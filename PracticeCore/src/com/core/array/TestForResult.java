package com.core.array;

public class TestForResult {
	public static void main(String[] args) {
		for (int i = 0, j = 0; i < 1 || j < 5; i++, j++) {
			System.out.println(i + " " + j);
		}
	}
}
