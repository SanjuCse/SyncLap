package com.core.java.hk;

public class M1Test {

	private static void m1() {

		System.out.println("m1");
	}

	static void m2() {

		System.out.println("m2");

	}

	public static void main(String[] args) {

		m1();
		m2();

	}

	static void m3() {

		System.out.println("m3");

		m1();
	}
}
