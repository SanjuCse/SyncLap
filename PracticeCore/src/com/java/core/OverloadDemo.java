package com.java.core;

public class OverloadDemo {
	void test() {
		System.out.println("No parameter");
	}

	void test(int a) {
		System.out.println("a is " + a);
	}

	void test(int a, int b) {
		System.out.println("a and b is: " + a + " " + b);
	}

	double test(double a) {
		System.out.println("a is: " + a);
		return a * a;
	}
}

class overflow {
	public static void main(String[] args) {
		OverloadDemo demo = new OverloadDemo();
		demo.test();
		System.out.println(demo.test(12.432));
		demo.test(123);
		demo.test(43, 65);
	}
}
