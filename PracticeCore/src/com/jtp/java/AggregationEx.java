package com.jtp.java;

class Operation {
	int square(int n) {
		return n * n;
	}
}

class Circle {
	double pi = 3.14;
	Operation operation;

	double area(int radius) {
		operation = new Operation();
		int rSquare = operation.square(radius);
		return pi * rSquare;
	}
}

public class AggregationEx {
	public static void main(String[] args) {
		Circle circle = new Circle();
		double areaOfCircle = circle.area(5);
		System.out.println(areaOfCircle);
	}

}
