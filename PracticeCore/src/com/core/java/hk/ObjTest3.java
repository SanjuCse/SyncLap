package com.core.java.hk;

public class ObjTest3 {
	int x = 10;
	int y = 20;

	void test() {
		System.out.println("x is: " + x);
		System.out.println("y is: " + y);
	}

	public static void main(String[] args) {
		ObjTest3 test3 = new ObjTest3();
		ObjTest3 test4 = new ObjTest3();
		
		test3.test();
		test4.test();
	}
}
