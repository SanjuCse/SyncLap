package co.newtonschool;

class A {
	private String name = "sanjaya";
	protected String surName = "sahu";

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
}

class B extends A {
	int b = 5;

	B(int a) {
		b = a;
	}

}

class C {
	public static void main(String[] args) {
		B objB = new B(50);
		System.out.println(objB.surName);
		System.out.println(objB.getName());
		objB.setName("Dipu");
		System.out.println(objB.getName());
		System.out.println(objB.b);
	}
}