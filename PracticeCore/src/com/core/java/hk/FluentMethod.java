package com.core.java.hk;

import java.util.stream.Stream;

import javax.management.loading.PrivateClassLoader;


public class FluentMethod {
	
	static FluentMethod dustBin;
	public static void main(String[] args) {
	System.out.println("println out method");
	System.err.println("println err method");
	System.out.printf("printf 1").printf("\nprintf 2").printf("\nprintf 3").printf("\nprintf 4");
	FluentMethod bin = new FluentMethod();
	System.out.println(bin.bin().bin().bin());
	
	
}
FluentMethod bin() {
	return this;
}
}
