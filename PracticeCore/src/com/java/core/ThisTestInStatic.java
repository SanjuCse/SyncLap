package com.java.core;

public class ThisTestInStatic {
	int a = 10;

	static void aTest(int a) {
		ThisTestInStatic static1 = new ThisTestInStatic();
		static1.a = a;
		System.out.println(static1.a + " : " + a);
	}

	public static void main(String[] args) {
		ThisTestInStatic static1 = new ThisTestInStatic();
		static1.aTest(15);
	}
}
