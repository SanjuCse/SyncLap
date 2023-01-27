package com.java.io;

public class Timer {
	static long start, end;

	public static void startTime() {
		start = System.nanoTime();
	}

	public static void endTime() {
		end = System.nanoTime();

		System.out.println("Total Time:" + (end - start));
	}

}
