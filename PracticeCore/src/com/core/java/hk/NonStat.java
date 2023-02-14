package com.core.java.hk;

public class NonStat {
	int x = m1();

	int m1() {
		System.out.println("NSV x");
		return 10;
	}

	{
		System.out.println("NSB1");
	}

	public NonStat() {
		System.out.println("No-Arg Constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		NonStat stat = new NonStat();
	}

	{
		System.out.println("NSB2");
	}
	int y = m2();

	int m2() {
		System.out.println("NSV y");
		return 20;
	}
}
