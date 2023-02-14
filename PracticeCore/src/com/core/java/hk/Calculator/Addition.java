package com.core.java.hk.Calculator;

import java.io.IOException;

public class Addition {
	void add() throws IOException {
		// creating object of CommonMethods
		DataReader dr = new DataReader(System.in);

		// asking user to enter numbers of values
		System.out.println("How any numbers you want to add: ");
		int count = Integer.parseInt(dr.ReadLine());

		// asking user to enter numbers
		System.out.println("Enter " + count + " Numbers");

		// creating array of specified user numbers
		int numArray[] = new int[count];

		int sum = 0;
		// storing numbers into array and calculating sum
		for (int i = 0; i < numArray.length; i++) {
			int num = Integer.parseInt(dr.ReadLine());
			numArray[i] = num;
			sum = sum + num;
		}
		System.out.println("Sum is: " + sum);

	}
}
