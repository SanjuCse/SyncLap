package com.core.java.hk;

public class FindEvenNos {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(nums));
	}

	public static boolean even(int num) {
		if (digits(num) % 2 == 0) {
			return true;

		}
		return false;
	}

	public static int digits(int num) {
		int digits = 0;
		while (num > 0) {
			digits++;
			num = num / 10;
		}
		return digits;
	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}

		return count;
	}
}
