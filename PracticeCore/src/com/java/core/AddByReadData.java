package com.java.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddByReadData {
	public static void main(String[] args) throws IOException {
		DataReader reader = new DataReader(System.in);
		System.out.println("Enter Fno");
		int num1 = Integer.parseInt(reader.DataReader());
		System.out.println("Enter SNO: ");
		int num2 = Integer.parseInt(reader.DataReader());

		System.out.println("Sum is: " + (num1 + num2));
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		reader2.readLine();

	}
}
