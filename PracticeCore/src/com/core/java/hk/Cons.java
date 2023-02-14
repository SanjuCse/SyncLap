package com.core.java.hk;

public class Cons {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.x);
		System.out.println(test.s);
		System.out.println();
		test.Show();
	}
}

class Test {
	int x;
	String s;

	public Test() {
		x = 10;
		s = "sanju";
		
	}

	void Show() {
		x = 11;
		s = "sanjua";
		System.out.println(x + " " + s);
	}
}
