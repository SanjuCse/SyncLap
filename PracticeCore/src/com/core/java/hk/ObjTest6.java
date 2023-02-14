package com.core.java.hk;

public class ObjTest6 {
	int x = 10;
	int y = 20;

	void change(ObjTest6 test6) {
		System.out.println(test6.x + " " + test6.y);
		test6.x = 30;
		test6.y = 40;
		System.out.println(test6.x + " " + test6.y);
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		ObjTest6 test6 = new ObjTest6();
		test6.change(test6);

		ObjTest6 test7 = new ObjTest6();
		System.out.println(test7.x + " " + test7.y);

	}
}
