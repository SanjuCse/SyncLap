package com.jtp.java.inherit;

public class Inherit {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		animal.bark();
		animal.eat();
		cat.bark();
		cat.eat();
		dog.bark();
		dog.eat();
	}
}

class Animal {
	void eat() {
		System.out.println("Animal Eats");
	}

	void bark() {
		System.out.println("Animal Barks");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("Dog Eats Chicken, Rise");
	}

	@Override
	void bark() {
		System.out.println("Bho Bho");
	}

}

class Cat extends Animal {
	@Override
	void eat() {
		System.out.println("Cat Eats Milk, Fish");
	}

	@Override
	void bark() {
		System.out.println("Mew Mew");
	}
}