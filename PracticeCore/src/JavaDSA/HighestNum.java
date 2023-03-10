package JavaDSA;

public class HighestNum {
	static int highestNo(int a[]) {
		int high = 0;

		for (int i = 0; i < a.length; i++) {
			while (a[i] > high) {
				high = a[i];
			}
		}
		return high;
	}

	public static void main(String[] args) {
		int a[] = { 10, 15, 20, 25, 12, 24 };
		int foundHighest = highestNo(a);
		System.out.println(foundHighest);
	}
}
