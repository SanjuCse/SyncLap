package com.core.java.hk.Calculator;

import java.io.IOException;
import java.io.InputStream;

public class DataReader {
	InputStream is;

	public DataReader(InputStream is) {
		this.is = is;
	}

	String ReadLine() throws IOException {
		String data = "";
		int input;
		while ((input = is.read()) != 13) {
			data = data + (char) input;
		}
		System.in.read();
		return data;
	}
}
