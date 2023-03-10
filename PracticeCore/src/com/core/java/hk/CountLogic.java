package com.core.java.hk;

public class CountLogic {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 200 };
		System.out.println(count(arr));
		System.out.println(arr.length);
	}

	public static int count(int[] arr) {
		int count = 0;
		for (int i : arr) {
			count++;
		}

		return count;
	}
}
