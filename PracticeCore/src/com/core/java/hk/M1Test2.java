package com.core.java.hk;

public class M1Test2 {

	static int a = 10;
	int x = 20;

	void m2() {
		int a = 70;
		int x = 80;
		System.out.println(a);
		System.out.println(M1Test2.a);
		System.out.println(this.a);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(new M1Test2().x);
	}

	public static void main(String[] args) {
		M1Test2 a1 = new M1Test2();
		a1.x = 35;
		a1.m2();
	}
}
//70, 10, 10, 80, 20, 20