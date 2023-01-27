package com.java.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayIO {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\j\\b.txt");
		FileOutputStream fileOutputStream1 = new FileOutputStream("D:\\j\\b1.txt");
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		String s = "Sanjay this side";
		byte b[] = s.getBytes();
		Timer.startTime();
		byteArrayOutputStream.write(b);
		byteArrayOutputStream.writeTo(fileOutputStream);
		byteArrayOutputStream.writeTo(fileOutputStream1);
		Timer.endTime();
		System.out.println("write done!:");

//		byte ba[] = byteArrayOutputStream.toByteArray();
		ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(b);

		while (true) {
			int i = arrayInputStream.read();
			if (i == -1)
				break;
			System.out.print((char) i);
		}

	}

}
