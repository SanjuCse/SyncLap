package com.core.java.hk;

public class This3 {

	static int a = 10;
	int b = 20;

	void m1() {
		System.out.println("test");
		This3 this3 = new This3();
		this3.thisTest("Test");
	}

	void thisTest(final String string) {
		System.out.println("String value is passed from main method: " + string);
//		m1();
	}

	public static void main(String[] args) {
		This3 this3 = new This3();
		this3.m1();
//		System.out.println(a);
//		This3.thisTest("Test2");
	}
}
