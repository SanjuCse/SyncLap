package com.core.lamda;

public class LamdaExample1 {
	public static void main(String[] args) {
//	MyRunnableClass runnableClass = new MyRunnableClass();
		Thread thread = new Thread(() -> System.out.println("Thread Executed in inner class!"));
		thread.start();
	} 
}
