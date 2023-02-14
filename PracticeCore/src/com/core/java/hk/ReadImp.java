package com.core.java.hk;

import java.io.IOException;

public class ReadImp {
public static void main(String[] args)throws IOException {
	String string = "";
	System.out.println("Enter Number");

	int i = System.in.read();
	do {
		string = string +(char)i;
	}while ((i = System.in.read())!='\n');
	System.out.println("Your Provided Number is: ");
	System.out.println(string);
	
	
}
}
