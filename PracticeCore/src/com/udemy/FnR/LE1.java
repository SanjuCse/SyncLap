package com.udemy.FnR;

public class LE1 {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
