package com.udemy.FnR;

public class LE2 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread Executed - LE2");
			}
		});
		thread.start();
	}
}
