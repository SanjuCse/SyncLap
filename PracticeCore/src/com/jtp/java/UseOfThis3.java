package com.jtp.java;

public class UseOfThis3 {
	public UseOfThis3() {
		this(5);
		System.out.println("default constuctor");
	}

	public UseOfThis3(int x) {
		System.out.println("value of x: " + x);
	}

	public static void main(String[] args) {
		UseOfThis3 this3 = new UseOfThis3();
	}
}
