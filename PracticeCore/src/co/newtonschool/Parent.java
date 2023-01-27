package co.newtonschool;

class Parent {
	int a = 5;

	Parent(int x) {
		a = x;
	}

	public void setA(int y) {
		a = y;
	}
}

class Child{
	public static void main(String[] args) {
		Parent objP = new Parent(10);
//		Parent objP1 = new Parent(0);
		objP.setA(100);
		System.out.println(objP.a);
		System.out.println(objP.a);
	}
}
 