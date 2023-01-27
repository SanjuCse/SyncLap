package com.java.string;

//import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("enrer a sting");
		
		String string = scanner.nextLine();
		String revString = "";
		
		for (int i = string.length()-1; i >= 0; i--) {
			revString = revString + string.charAt(i);
		}
		
		System.out.println("String before reverse : " + string);
		System.out.println("String after reverse : " + revString);
		scanner.close();
	}
}
