package com.jtp.java.inherit;

class Animal2 {
	void eat() {
		System.out.println("Eats");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("Barks");
	}
}

public class Inherit3 {
	public static void main(String[] args) {
		Dog2 dog2 = new Dog2();
		dog2.bark();
		dog2.eat();
	}
}
