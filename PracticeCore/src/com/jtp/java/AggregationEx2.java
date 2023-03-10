package com.jtp.java;

class Address {
	String city;
	String state;
	String country;
	int zipCode;

	public Address(String city, String state, String country, int zipCode) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
}

class Employee {
	int id;
	String Name;
	Address address;

	public Employee(int id, String Name, Address address) {
		this.id = id;
		this.Name = Name;
		this.address = address;
	}

	void display() {
		System.out.println(id + "-" + Name);
		System.out.println(address.city + ", " + address.state + ", " + address.country + ", " + address.zipCode);
	}

}

public class AggregationEx2 {
	public static void main(String[] args) {
		Address address = new Address("Bampur", "Odisha", "India", 700001);
		Address address1 = new Address("Bhubaneswar", "Odisha", "India", 700002);

		Employee employee = new Employee(1001, "sanjaya", address);
		Employee employee1 = new Employee(1002, "kanhu", address1);
		employee.display();
		employee1.display();
	}
}
