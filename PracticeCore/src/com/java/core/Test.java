package com.java.core;

class Point {
	int x, y;

	Point() {
		x = 1;
		y = 1;
	}
}

class ColoredPoint extends Point {
	int color = 0xFF00FF;
}

public class Test {
	int color = 0xFF00FF;

//	void m1() {
//		return this;
//	}

	Test Test() {
		System.out.println(this);
		return this;
	}

	public static void main(String[] args) {
		ColoredPoint cp = new ColoredPoint();
		System.out.println(cp.color);
		Test test = new Test();
		Test test2 = test.Test();
		System.out.println(test.color);
		System.out.println(test + "\n" + test2);
		System.out.println(new Test());
	}
}