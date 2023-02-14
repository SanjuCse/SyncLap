package com.udemy.FnR;

public class LC1 {
	public static void main(String[] args) {
//		MyFI fi1 = new MyFI() {
//
//			@Override
//			public void MyMethod() {
//				System.out.println("Implementation 1");
//			}
//		};
//
//		MyFI fi2 = new MyFI() {
//
//			@Override
//			public void MyMethod() {
//				System.out.println("Implementation 2");
//			}
//		};

		MyFI fi1 = () -> System.out.println("Implementation 1");
		MyFI fi2 = () -> System.out.println("Implementation 2");

		fi1.MyMethod();
		fi2.MyMethod();
	}
}
