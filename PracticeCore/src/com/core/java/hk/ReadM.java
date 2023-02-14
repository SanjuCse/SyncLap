package com.core.java.hk;

import java.io.IOException;

public class ReadM {
	public static void main(String[] args) throws IOException {
		String data = "";
		int temp;
		int count;

		System.out.println("How many numbers do you want to add");
		while ((temp = System.in.read()) != 13) {
			data = data + (char) temp;
		}
		System.in.read();

		count = Integer.parseInt(data);
		data = "";

		int numArray[] = new int[count];
		System.out.println("You need to Enter " + count + " number of digits");

		for (int i = 0; i < count; i++) {
			System.out.println("Enter value for " + i + " index");
			while ((temp = System.in.read()) != 13) {
				data = data + (char) temp;
			}
			System.in.read();
			numArray[i] = Integer.parseInt(data);
			data = "";
		}
		temp = 0;
		for (int i = 0; i < numArray.length; i++) {
			temp = temp + numArray[i];
		}
		System.out.println("Sum of " + count + " digit is: " + temp);
//		Using While Loop
//		int i =0;
//		while (i < count) {
//			System.out.println("Enter value for " + i + " index");
//			while ((temp = System.in.read()) != 13) {
//				data = data + (char) temp;
//			}
//			System.in.read();
//			numArray[i] = Integer.parseInt(data);
//			data = "";
//			i++;
//		}
//		System.out.println(numArray[0] + " " + numArray[1]);

//
//		System.out.println("Enter SNO: ");
//		while ((temp = System.in.read()) != 13) {
//			data = data + (char) temp;
//		}
//		System.in.read();
//		int num2 = Integer.parseInt(data);
//
//		System.out.println("Sum is: " + (num1 + num2));
	}
}
