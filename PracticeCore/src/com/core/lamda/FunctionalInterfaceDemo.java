package com.core.lamda;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
//		MyFunInterface funInterface = () -> System.out.println("Hello");
//		funInterface.myMethod();
		onTheFly(() -> System.out.println("Hello from onTheFly"));
	}
	public static void onTheFly(MyFunInterface funInterface) {
	funInterface.myMethod();	
	}
}
