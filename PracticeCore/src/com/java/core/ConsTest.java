package com.java.core;

public class ConsTest {
	int x = 5;
	int y = 10;

//	void finalV(){
//		ConsTest test = new ConsTest();
//		this = test;
//	}
	
	void change(ConsTest test) {
		System.out.println("Original x and y values: ");
		System.out.println(x + " " + y);
		test.y = 20;
		test.x = 15;

//		x = 15; //this.x = 15;
//		y = 20;//this.y = 20;
		System.out.println("After Changes x and y values: ");
		System.out.println(x + " " + y);

	}

	public static void main(String[] args) {
		ConsTest test = new ConsTest();
		ConsTest test2 = new ConsTest();
		System.out.println("test object values before changes: " + test.x + " " + test.y);
		System.out.println("test object values before changes: " + test2.x + " " + test2.y);
		test.change(test2);
		System.out.println("test object values after changes: " + test.x + " " + test.y);
		System.out.println("test object values after changes: " + test2.x + " " + test2.y);

	}
}
