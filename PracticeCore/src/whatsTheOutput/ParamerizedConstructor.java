package whatsTheOutput;

public class ParamerizedConstructor {
	public ParamerizedConstructor(int a, float b) {
		System.out.println("Paramerized Constructor 2");
	}

	public ParamerizedConstructor(int a, int b) {
		System.out.println("Paramerized Constructor 1");
	}

	public static void main(String[] args) {
		byte a = 10;
		byte b = 15;
		ParamerizedConstructor constructor = new ParamerizedConstructor(a, b);
	}
}
