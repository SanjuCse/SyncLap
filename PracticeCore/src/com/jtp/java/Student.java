package com.jtp.java;

class Student {
	int stID;
	String sName;

	static String collegeName = "GIET";

	public Student(int stID, String sName, String collegeName) {
		this.stID = stID;
		this.sName = sName;
		this.collegeName = collegeName;

	}

	static void changeClg() {
		collegeName = "SMIT";
	}

	void display() {
		System.out.println(stID + ", " + sName + ", " + collegeName);
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student.changeClg();
		Student student = new Student(1, "sanju", "SMIT");
		Student student2 = new Student(2, "kanhu", "SMIT");
//		Student.collegeName = "RIT";
		student.display();
		student2.display();
	}
}