package com.core.java.hk;

public class ObjTest {
	int i = 10;
	int j = 20;
	static int k = 30;
	String firstName = "sanju";
	String deptName = "IT";
	String studing = "B.Tech";

//	ObjTest test6 = new ObjTest();
//	void change() {
//
//		ObjTest test3 = new ObjTest();
//		ObjTest test4 = test3;
//		test4.i = 50;
//		test4.j = 60;
//		System.out.println(test4.i + " " + test4.j);
//	}
	@Override
	public String toString() {

		return "I'm " + firstName + " currenty styding in " + studing + " In " + deptName;
	}

	public static void main(String[] args) {
		ObjTest test = new ObjTest();
//		ObjTest test;
		System.out.println(test.k);
// ObjTest test1 = new ObjTest();
//
//		test.i = 30;
//		test.j = 40;
//		System.out.println(test.i + " " + test.j);
//		System.out.println(test1.i + " " + test1.j);
//
//		ObjTest test3 = null;
//		test3 = new ObjTest();
//		test3.i = 70;
//		test3.j = 80;
//		System.out.println(test3.i + " " + test3.j);
//
//		test.change();

	}
}
