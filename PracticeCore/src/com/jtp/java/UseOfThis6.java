package com.jtp.java;

public class UseOfThis6 {
	UseOfThis7 this7;

	public UseOfThis6(UseOfThis7 this7) {
		this.this7 = this7;
	}

	void m2() {
		System.out.println(this7.a);
	}
}

class UseOfThis7 {
	int a = 10;

	public UseOfThis7() {
		UseOfThis6 this6 = new UseOfThis6(this);
		this6.m2();
	}

	public static void main(String[] args) {
		UseOfThis7 this7 = new UseOfThis7();
	}
}