package com.java.core;

import java.io.IOException;
import java.io.InputStream;

public class DataReader {
	private InputStream stream;

	DataReader(InputStream stream) {
		this.stream = stream;
	}

	String DataReader() throws IOException {
		int data;
		StringBuilder builder = new StringBuilder();
		while ((data = stream.read()) != 13) {
			builder.append((char) data);
		}
		stream.read();

		return builder.toString();
	}

}
