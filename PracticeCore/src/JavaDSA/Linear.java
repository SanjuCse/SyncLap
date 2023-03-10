package JavaDSA;

public class Linear {
	public static void main(String[] args) {
		int[] arr = { -12, -9, -6, -1, 0, 2, 6, 9, 10, 12, 23, 45, 67 };
		int target = 67;

		int index = linear(arr, target);
		System.out.println(index);
	}

	static int linear(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			if (target == arr[index]) {
				return index;
			}
		}

		return -1;
	}
}
