package com.core.opps;

public class Employee {
	int ID;
	String name;
	float salary;

//	void insert(int ID, String name, float salary) {
//		this.ID = ID;
//		this.name = name;
//		this.salary = salary;
//	}

	void display() {
		System.out.println(ID + " - " + name + " - " + salary);
	}
	public Employee(int ID, String name, float salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}
}