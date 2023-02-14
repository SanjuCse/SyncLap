package com.core.java.hk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadDemo {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream stream = new FileInputStream("C:\\eclipse-workspace\\com.core.java\\src\\com\\core\\java\\hk\\test.txt");
		ReadFile file = new ReadFile(stream);
//		System.out.println("Enter a number");
//		System.out.println("reading started");
		String string = file.ReadLine();
		String string2 = file.ReadLine();
		
		System.out.println(string);
		System.out.println(string2);
	}
}
