package com.jtp.java;

abstract public class abstractClass {
	abstract void m1();

	static void m2() {
		System.out.println("static m2 method of abstractClass Class");
	}

	void m3() {
		System.out.println("non-static m3 method of abstractClass Class");
	}

	public static void main(String[] args) {
		m2();
		
	}
}
