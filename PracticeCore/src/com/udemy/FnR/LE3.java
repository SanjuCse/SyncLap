package com.udemy.FnR;

public class LE3 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Thread Executed - LE3"));
		thread.start();
	}
}
