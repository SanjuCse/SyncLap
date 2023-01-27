package co.newtonschool;

import java.util.Iterator;
import java.util.Scanner;

public class donation {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//			System.out.println("How many people will donate?");
//			int people = sc.nextInt();
//			int Collect[];
//			
//			for (int i : Collect.length) {
//				i = sc.nextInt();
//				System.out.println(i);
		Scanner sc = new Scanner(System.in);
		int A[] = new int[10];
		System.out.println("Enter the number of elements you want to store");
		int n = sc.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 1; i <= n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println("Elements in the arrar are");
		for (int i = 1; i <= A.length; i++) {
			System.out.println(A[i]);
		}	
		int sum =0;
		for (int i = 1; i <= A.length; i++) {
			sum=sum+A[i];
		}
		System.out.println(sum);
	}
}
