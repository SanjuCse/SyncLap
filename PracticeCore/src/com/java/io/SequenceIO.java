package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceIO {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream1 = new FileInputStream("D:\\\\j\\\\a.txt");
		FileInputStream fileInputStream2 = new FileInputStream("D:\\\\j\\\\b.txt");
		FileInputStream fileInputStream3 = new FileInputStream("D:\\\\j\\\\a.txt");
		FileInputStream fileInputStream4 = new FileInputStream("D:\\\\j\\\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\j\\Enum.txt");
		
		Vector v  = new Vector();
		v.addElement(fileInputStream1);
		v.addElement(fileInputStream2);
		v.addElement(fileInputStream3);
		v.addElement(fileInputStream4);
		
		Enumeration<FileInputStream> enumeration = v.elements();
		
		SequenceInputStream inputStream = new SequenceInputStream(enumeration);
		while (true) {
			int i = inputStream.read();
			if (i == -1)
				break;
			System.out.print((char) i);
			fileOutputStream.write(i);
		}
		System.out.println("write done!");
		fileInputStream1.close();
		fileInputStream2.close();
		inputStream.close();
	}

}
