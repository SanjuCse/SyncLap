package com.core.lamda;

public class LambdaPractice2 {
	public static void main(String[] args) {
		MathOperation add = (a, b) -> System.out.println("addition is: " + (a + b));
		add.operation(2, 4);
		MathOperation mul = (a, b) -> System.out.println("multification is: " + (a * b));
		mul.operation(2, 6);
	}
}
