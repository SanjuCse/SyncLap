package com.core.java.hk;

public class IncrQwiz {

	public static void main(String[] args) {
		char ch = "123".charAt(1);
		
		System.out.println(ch++); // b
		System.out.println(++ch); // d
		
		System.out.println((int) ch++); // 98 (ASCII value of b)
//		System.out.println((int) ++ch); //100 (ASCII value of d)
		System.out.println(ch++ + ++ch); // 198
	}

}
