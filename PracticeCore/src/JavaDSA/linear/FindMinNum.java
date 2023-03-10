package JavaDSA.linear;

public class FindMinNum {
	static int min(int[] arr) {
		int min = arr[0];
//		if (arr.length == 0) {
//			return -1;
//		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 25, 15, 28, 26, 5, 18, 3, 29 };
		System.out.println(min(arr));
	}
}
