package com.jtp.java;

public class Counter {
	static int count = 0;
//	int a = 10;

	public Counter() {
		count++;
		System.out.println(count);
//		System.out.println("No need to call this method");
	}

//	static {
//		System.out.println("No need to call this method");
//	}
	public static void main(String[] args) {
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
//		System.out.println(a);
	}
}
