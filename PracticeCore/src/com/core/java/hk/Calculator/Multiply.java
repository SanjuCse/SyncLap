package com.core.java.hk.Calculator;

import java.io.IOException;

public class Multiply {
	void mul() throws IOException {
		// creating object of CommonMethods
		DataReader dr = new DataReader(System.in);

		// asking user to enter numbers of values
		System.out.println("How many numbers you want to Multiply: ");
		int count = Integer.parseInt(dr.ReadLine());

		// asking user to enter numbers
		System.out.println("Enter " + count + " Numbers");

		// creating array of specified user numbers
		int numArray[] = new int[count];

		int mul = 1;
		// storing numbers into array and calculating sum
		for (int i = 0; i < numArray.length; i++) {
			int num = Integer.parseInt(dr.ReadLine());
			numArray[i] = num;
			mul = mul * num;
		}

		System.out.println("Multiplied value is: " + mul);

	}
}
