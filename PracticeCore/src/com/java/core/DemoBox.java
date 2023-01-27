package com.java.core;

class Box {
	double width;
	double hight;
	double depth;
}

public class DemoBox {

	public static void main(String[] args) {
		Box myBox = new Box();
		Box myBox2 = new Box();

		int volume;

		myBox.hight = 10;
		myBox.width = 15;
		myBox.depth = 20;

		volume = (int) (myBox.hight * myBox.width * myBox.depth);
		System.out.println("Volume of the 1st Box is: "+volume);

		myBox2.hight = 20;
		myBox2.width = 25;
		myBox2.depth = 30;

		volume = (int) (myBox2.hight * myBox2.width * myBox2.depth);
		System.out.println("Volume of the 2nd Box is: "+volume);
	}

}
