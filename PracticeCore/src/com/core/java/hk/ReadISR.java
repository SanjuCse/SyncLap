package com.core.java.hk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadISR {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		System.out.println("Result is: " + (a + b));
	}
}
