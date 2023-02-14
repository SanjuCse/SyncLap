package com.core.java.hk;

public class This2 {
	int rollno;
	String name;
	float fee;

	public This2(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;

	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		This2 this2 = new This2(101, "sanju", 2000);
		this2.display();
	}
}
