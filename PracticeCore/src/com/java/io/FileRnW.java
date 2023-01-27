package com.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRnW {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("D:\\fileWriter.txt");
		String string = "Khan is here";
		char[] ch = string.toCharArray();

		fileWriter.write(ch);
		fileWriter.flush();
		fileWriter.close();
		System.out.println("write done!");

		FileReader fileReader = new FileReader("D:\\fileWriter.txt");

//		int i;
//		while ((i = fileReader.read()) != -1)
//			System.out.print((char) i);
//		fileReader.close();
		while (true) {
			int i = fileReader.read();
			if (i == -1)
				break;
			System.out.print((char) i);
		}
	}
}