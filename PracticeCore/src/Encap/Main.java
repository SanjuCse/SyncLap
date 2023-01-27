package Encap;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("SANJAYA", 7, 40000);
		System.out.println("Name: " + e.getName() + " ID :" + e.getID() + " Salary :" + e.getSalary());
		e.setID(6);
		e.setName("Sanju");
		e.setSalary(30000);
		System.out.println("Name: " + e.getName() + " ID :" + e.getID() + " Salary :" + e.getSalary());
	}
}
