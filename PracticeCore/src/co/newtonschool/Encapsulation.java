package co.newtonschool;

class Encapsulation {
	private int a = 5;

	public int getA() {
		return a;
	}

	public void setA(int val) {
		this.a = val;
	}
}

class EncapsulationChild {
	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		System.out.println(enc.getA());
		enc.setA(10);
		System.out.println(enc.getA());
	}
}