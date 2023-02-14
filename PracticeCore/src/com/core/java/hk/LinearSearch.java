package com.core.java.hk;

public class LinearSearch {
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 25, 30, 35 };
		System.out.println(linearSearch(arr, 35));
	}

}
