package com.core.java.hk;

public class IntegTest {
	public static void main(String[] args) {
		Integer integer = 1000;
		Integer integer2 = 1000;
		System.out.println(integer + " " + integer2);
		System.out.println(integer.hashCode() == integer2.hashCode());
//		System.out.println(integer.hashCode());
//		System.out.println(integer2.hashCode());
		IntegTest test = new IntegTest();
		System.out.println(test + " - " + test.toString() + " - " + test.hashCode());
	}
}
