package com.core.java.hk;

class Room {
	private double length, bredth;

	public Room(double length, double bredth) {
		this.length = length;
		this.bredth = bredth;
	}

	void area() {
		System.out.println("Area of Room is: " + (length * bredth));
	}

	void perimeter() {
		System.out.println("Area of Room is: " + (2 * (length + bredth)));
	}

	void display() {
		System.out.println("Length is: " + length + " Bredth is: " + bredth);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBredth() {
		return bredth;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}
}

public class Building {
	public static void main(String[] args) {
		Room room = new Room(10, 20);
		room.area();
		room.display();
		room.perimeter();
		room.setLength(15);
		room.setBredth(20);
		room.area();
		room.display();
		room.perimeter();

	}
}