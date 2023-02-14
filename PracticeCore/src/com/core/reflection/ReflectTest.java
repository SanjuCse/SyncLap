package com.core.reflection;

public class ReflectTest {
	public static void main(String[] args) {
		/*
		 * // ReflectTest test = new ReflectTest(); // Class class1 = test.getClass();
		 * // System.out.println(class1); System.out.println("main method"); int i =
		 * 254; // byte b1 = (short)i; long l1= 10; // int i2 = L1;
		 * 
		 * float f1 = l1; short s1 = (byte)(short)i; float f2 = 10; long l2 = (long)f2;
		 * System.out.println(l2); System.out.println(s1); float f3 = 254.32f; byte b3 =
		 * (byte)f3; System.out.println(b3);
		 */
		char ch1 = 97;
		System.out.println(ch1);
//		int i1 = 10L;
//		float f1 = 10.0f;
		double d1 = 10.0;
		double d2 = 10L;
		System.out.println();
		int age = 17;
		boolean isOld = age >= 18;
		System.out.println(isOld);
		byte b1 = (int) 30L;
		System.out.println(b1);
		System.out.println("" + (10 + 20));
		byte b2 = (int) 10.0 + 25;
		System.out.println(b2);
		System.out.println(0.0 / 0);
		Byte b3 = (int) 10.5D;
		System.out.println(b3);

	}

}