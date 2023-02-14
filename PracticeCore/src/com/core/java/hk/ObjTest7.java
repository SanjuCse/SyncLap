package com.core.java.hk;

public class ObjTest7 {
	int x;
	int y;

	void m1(ObjTest7 test7) {
		x = x + 1;
		y = y + 1;
	}

	public static void main(String[] args) {
		ObjTest7 test7 = new ObjTest7();
		ObjTest7 test8 = new ObjTest7();
		test7.m1(test8);
		System.out.println(test7.x + " " + test7.y);
		System.out.println(test8.x + " " + test8.y);
		
		test8.m1(test7);
		System.out.println(test7.x + " " + test7.y);
		System.out.println(test8.x + " " + test8.y);
		
		test7.m1(test7);
		System.out.println(test7.x + " " + test7.y);
		System.out.println(test8.x + " " + test8.y);
	}
}
