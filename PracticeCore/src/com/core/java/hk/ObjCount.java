package com.core.java.hk;

public class ObjCount {
	private static int count;

	{
		count++;
	}

	public ObjCount() {
		System.out.println("No-arg Constructor");
	}

	public ObjCount(int i) {
		System.out.println("IPC Constructor");
	}

	public ObjCount(String s) {
		System.out.println("SPC Constructor");
	}

	void display() {
		System.out.println("Object Created: " + count + " times");
	}

}

class CountImpl {
	public static void main(String[] args) {
		ObjCount count = new ObjCount();
		new ObjCount(5);
		new ObjCount("abc");
		new ObjCount(15);
		count.display();
	}
}