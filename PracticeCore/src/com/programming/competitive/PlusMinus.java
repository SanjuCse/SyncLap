package com.programming.competitive;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
//		List<Integer> arrayList = new ArrayList<Integer>();
		int arr[] = new int[n];
		System.out.println("Enter input Values");
		for (int i = 0; i <= arr.length; i++) {
			i = sc.nextInt();
			double  x,y,z;	
			if (i>0) {
				 x = (i/arr.length)*100;
				 System.out.println(x);	 
			}
			
			else if (i<0) {
				 y = (i/arr.length)*100;
				 System.out.println(y);
			}
			else if (i == 0) {
				 z = (i/arr.length)*100;
				 System.out.println(z);
			}

			
		}
		sc.close();
	}

}
