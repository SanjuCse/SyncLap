package com.core.java.hk;

public class ObjTest8 {
	int x = 10, y = 20;

	void m1(ObjTest8 test) {
		System.out.println("Before test Value is: " + test);
		test = new ObjTest8();
		System.out.println("After test Value is: " + test);
	}

	public static void main(String[] args) {
		ObjTest8 test8 = new ObjTest8();
		System.out.println("main test Value is: " + test8);
		test8.m1(test8);
	}
}
