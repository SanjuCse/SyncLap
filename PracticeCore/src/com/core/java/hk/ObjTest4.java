package com.core.java.hk;

public class ObjTest4 {
	static int a = 50;

	void test(int a) {
		a = a + 100;
	}

	public static void main(String[] args) {
		ObjTest4 test4 = new ObjTest4();
		System.out.println("Before changing "+test4.a);
		test4.test(150);
		System.out.println(test4.a);
		System.out.println("After changing "+test4.a);
		ObjTest4 test5 = new ObjTest4();
		test5.test(50);
	}
}
