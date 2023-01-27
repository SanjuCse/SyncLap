package com.java.io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayRnW {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("D:\\fileWriter.txt");
		FileWriter fileWriter1 = new FileWriter("D:\\fileWriter1.txt");
		FileWriter fileWriter2 = new FileWriter("D:\\fileWriter2.txt");
		FileWriter fileWriter3 = new FileWriter("D:\\fileWriter3.txt");
		CharArrayWriter arrayWriter = new CharArrayWriter();

		String s = "CharArrayWriter and Reader class";
		arrayWriter.write(s);
		arrayWriter.writeTo(fileWriter);
		arrayWriter.writeTo(fileWriter1);
		arrayWriter.writeTo(fileWriter2);
		arrayWriter.writeTo(fileWriter3);

		fileWriter.close();
		fileWriter1.close();
		fileWriter2.close();
		fileWriter3.close();

		System.out.println("write done!");

		FileReader fileReader = new FileReader("d:\\fileWriter.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while (true) {
			int i = bufferedReader.read();
			if (i == -1)
				break;
			System.out.print((char) i);
		}
		bufferedReader.close();

	}
}
