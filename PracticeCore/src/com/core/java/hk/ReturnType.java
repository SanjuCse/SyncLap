package com.core.java.hk;

public class ReturnType {
	static int m1() {
		return 12;
	};

	static int m2() {
		return m1();
	}

	public static void main(String[] args) {
		System.out.println();
		int a = m1();
		int b = 12 + m1();
		System.out.println(a);
		System.out.println(b);
		System.out.println(m2());

	}
}
