package com.core.java.hk;

public class ReturnTest {
	static int retutn() {
		int a = 3;
		if (a<2) {
			return 10;
		} else {
			return 9;
		}
		
	}
public static void main(String[] args) {
	int i = retutn();
	System.out.println(i);
	System.out.println(retutn());
}
}
