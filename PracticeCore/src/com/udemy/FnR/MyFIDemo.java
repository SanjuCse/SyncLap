package com.udemy.FnR;

public class MyFIDemo {
	public static void main(String[] args) {
//		MyFI fi = () -> System.out.println("This is Body of MyFI interface");
//		fi.MyMethod();
		onTheFly(() -> System.out.println("This is Body of MyFI interface"));
	}

	public static void onTheFly(MyFI fi) {
		fi.MyMethod();
	}
}
