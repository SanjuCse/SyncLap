package com.programming.competitive;

import java.util.Iterator;
import java.util.Scanner;

public class arrSum {
	public static void main(String[] args) {
		arrSum AS = new arrSum();
	
	}
	public arrSum() {
		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		for (int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
//		for (int i = 0; i <= n; i++) {
//			System.out.println(arr[i]);
//		}
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
