package com.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\j\\b.txt");
		String s = JOptionPane.showInputDialog("Enter your Text");
		byte b[] = s.getBytes();
		Timer.startTime();
		fileOutputStream.write(b);
		Timer.endTime();

		System.out.println("File Write Done");

		FileInputStream fileInputStream = new FileInputStream("D:\\j\\b.txt");
		while (true) {
			int i = fileInputStream.read();
			if (i == -1)
				break;
			System.out.print((char) i);
		}
	}

}
