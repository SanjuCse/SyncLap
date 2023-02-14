package com.core.java.hk;

public class Demo {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		m1(i);
		System.out.println(i);
	}

	static void m1(int i) {
		i = i + 10;
	}
}
