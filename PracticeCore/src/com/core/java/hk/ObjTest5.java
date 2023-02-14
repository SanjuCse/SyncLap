package com.core.java.hk;

public class ObjTest5 {
	int a = 50;

//	void change(ObjTest5 test5) {
//		test5.a = test5.a + 100;
//	}
	void change(ObjTest5 test5) {
		test5.a = test5.a + 100;
	}

	public static void main(String[] args) {
		ObjTest5 test5 = new ObjTest5();
		System.out.println("Before changing " + test5.a);
		test5.change(test5);
		System.out.println("After changing " + test5.a);
		ObjTest5 test6 = new ObjTest5();
		System.out.println(test6.a);
	}
}
