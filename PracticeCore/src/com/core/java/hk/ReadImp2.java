package com.core.java.hk;

import java.io.IOException;

public class ReadImp2 {
	public static void main(String[] args)throws IOException {
		String string = "";
		System.out.println("Enter Number");

		int i = 0;
		while ((i = System.in.read())!='\n'){
			string = string +(char)i;
		}
		System.out.println("Your Provided Number is: ");
		System.out.println(string);
	}
}
