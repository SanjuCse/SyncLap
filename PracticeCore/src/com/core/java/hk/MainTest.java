package com.core.java.hk;

import java.io.Console;

public class MainTest {
	void main2(String args[]) {

	}
//	void main2(String ...args) {
//
//	}
}

class MainTest2 extends MainTest {
	@Override
	void main2(String... args) {
		System.out.println("Overridden main method of MainTest2");
		super.main2(args);
	}

	public static void main(String[] args) {
		MainTest test = new MainTest();
		MainTest2 test2 = new MainTest2();
//		test.main2("1", "2", "3");
		test2.main2("1", "2", "3");

	}
}
