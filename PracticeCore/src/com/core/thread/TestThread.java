package com.core.thread;

import com.core.java.hk.Static;

public class TestThread {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		MyThread2 thread2 = new MyThread2();
		thread2.start();
		thread.start();
		

//		String[] names = { "a", "b", "c", "d", "e" };//
//		String[] contactNum = { "1", "2", "3", "4", "5" };//
//		String[] email = { "a@gmail.com", "b@gmail.com", "c@gmail.com", "d@gmail.com", "e@gmail.com" };//
////		int totalCount = names.length;
////		for (int i = 0, j = 0, k = 0; i < names.length && j < contactNum.length && k < email.length; i++, j++, k++) {
////			System.out.println((i + 1) + "/" + names.length + "\t" + names[i] + "\t" + contactNum[i] + "\t" + email[i]);
////		}
////		for (int i = 0; i < 10; i++) {
////			System.out.println(i);
////		}
//
//		System.out.println("name count is: " + names.length);
//		System.out.println("contactNum count is: " + contactNum.length);
//		System.out.println("email count is: " + email.length);
//		if (names.length == contactNum.length) {
//			if (contactNum.length == email.length) {
//				System.out.println("names=contactNum=email");
//			} else {
//				System.out.println("names=contactNum!=email");
//			}
//
//		} else {
//			System.out.println("names!=contactNum");
//		}

	}

}

class MyThread extends Thread {
	public void run() {

		String[] names = { "a", "b", "c", "d", "e" };//
		String[] contactNum = { "1", "2", "3", "4", "5" };//
		String[] email = { "a@gmail.com", "b@gmail.com", "c@gmail.com", "d@gmail.com", "e@gmail.com" };
		for (int i = 0, j = 0, k = 0; i < names.length && j < contactNum.length && k < email.length; i++, j++, k++) {
			System.out.println((i + 1) + "/" + names.length + "(1)\t" + names[i] + "\t" + contactNum[i] + "\t" + email[i]);
		}

//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
	}
}

class MyThread2 extends Thread {
	public void run() {
		String[] names = { "f", "g", "h", "i", "j" };//
		String[] contactNum = { "6", "7", "8", "9", "10" };//
		String[] email = { "f@gmail.com", "g@gmail.com", "h@gmail.com", "i@gmail.com", "j@gmail.com" };
		for (int i = 0, j = 0, k = 0; i < names.length && j < contactNum.length && k < email.length; i++, j++, k++) {
			System.out.println((i + 1) + "/" + names.length + "(2)\t" + names[i] + "\t" + contactNum[i] + "\t" + email[i]);
		}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
	}
}