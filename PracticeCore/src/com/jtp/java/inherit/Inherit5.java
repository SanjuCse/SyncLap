package com.jtp.java.inherit;

class Animal4 {
	void eat() {
		System.out.println("eating");

	}
}

class Dog4 extends Animal4 {
	void bark() {
		System.out.println("Barking");

	}
}

class Cat2 extends Animal4 {
	void Meow() {
		System.out.println("Meowing");

	}
}

public class Inherit5 {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.eat();
		cat2.Meow();

	}
}
