package com.core.java.hk.Calculator;

import java.io.IOException;

public class Operation {
	void doOperation() throws IOException {

		DataReader dr = new DataReader(System.in);
		char ask = ' ';

		do {
			System.out.println("Bellow are the Operations provided");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			int input = Integer.parseInt(dr.ReadLine());
			switch (input) {
			case 1:
				System.out.println("You Choosed Option 1 - Addition");
				Addition addition = new Addition();
				addition.add();
				break;
			case 2:
				System.out.println("You Choosed Option 2 - Substraction");
				Subtraction subtraction = new Subtraction();
				subtraction.sub();
				break;
			case 3:
				System.out.println("You Choosed Option 3 - Multiplication");
				Multiply multiply = new Multiply();
				multiply.mul();
				break;

			default:
				System.out.println("You Provided Wrong Input, Choose One of above Options");
				break;
			}

			System.out.println("Do you want to Continue, If yes press Y or No for N");
			ask = dr.ReadLine().charAt(0);
		} while (ask == 'Y' || ask == 'y');
		System.out.println("Thanks for Using My application! Visit Again");

	}
}
