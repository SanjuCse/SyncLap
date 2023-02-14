package com.core.java.hk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
	InputStream inputStream;
//	StringBuilder builder = new StringBuilder();

	public ReadFile(InputStream inputStream) {
		this.inputStream = inputStream;
	}

//	String ReadLine() throws IOException {
//		int data;
//		while ((data = inputStream.read()) != 13) {
//			builder = builder.append((char) data);
//		}
//		inputStream.read();
//		return builder.toString();
//	}

	String ReadLine() throws IOException {
		int data;
		StringBuilder builder = new StringBuilder();
		while (true) {
			data = inputStream.read();
			if ((data == 13) || (data == -1))
				break;
			builder = builder.append((char) data);

			if (data == 13)
				System.in.read();

		}

		return builder.toString();
	}
}
