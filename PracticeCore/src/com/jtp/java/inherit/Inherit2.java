package com.jtp.java.inherit;

class Employee {
	float salary;
	int bonus;
}

class Programmer extends Employee {
	float salary = 50000;
	int bonus = 10000;

}
class Clerk extends Employee{
	
}

public class Inherit2 {
	public static void main(String[] args) {
		Employee programmer = new Programmer();
		Employee clerk =new Clerk();
		System.out.println("Salary of Programmer is: " + programmer.salary);
		System.out.println("Bonus of Programmer is: " + programmer.bonus);
		System.out.println();
		System.out.println("Salary of Programmer is: " + clerk.salary);
		System.out.println("Bonus of Programmer is: " + clerk.bonus);
	}

}