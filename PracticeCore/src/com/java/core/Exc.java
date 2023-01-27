package com.java.core;

public class Exc {
	public static void main(String[] args) {

		try {
			System.out.println("Program Started");
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			int result = x / y;
			System.out.println("Result" + result);
			System.out.println("Program Terminated");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}finally {
			System.out.println("Resource Released");
		}
	}
}
