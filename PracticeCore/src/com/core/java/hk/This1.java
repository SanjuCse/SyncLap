package com.core.java.hk;

public class This1 {
	String name;
	int age;

	public This1(String name, int age) {//
		this.name = name;
		this.age = age;
		System.out.println("I'm " + name + ", my age is " + age);
	}

	void display() {
		String name = "manda";
		int age = 24;
		System.out.println("I'm " + name + ", my age is " + age);
		System.out.println("I'm " + this.name + ", my age is " + this.age);
	}

	public static void main(String[] args) {
//		This1.display();
		new This1("sanju",23);

	}

}
