package Encap;

public class Employee {
	private String name;
	private int ID;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int ID, int salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}
}
