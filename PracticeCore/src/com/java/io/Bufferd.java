package com.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferd {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\j\\buff.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

		String s = "sanju this side";
		byte b[] = s.getBytes();

		Timer.startTime();
		bufferedOutputStream.write(b);
		Timer.endTime();
		System.out.println("write done!");

		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		fileOutputStream.flush();
		fileOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("D:\\j\\buff.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

		while (true) {
			int i = bufferedInputStream.read();
			if (i == -1)
				break;
			System.out.print((char) i);
		}
	}

}
