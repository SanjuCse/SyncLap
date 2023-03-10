package JavaDSA.binary;

public class Floor {
	public static void main(String[] args) {
		int[] arr = { -12, -9, -6, -1, 0, 2, 6, 9, 10, 12, 23, 45, 67 };
		int target = 13;

		int result = floor(arr, target);
		System.out.println(result);
	}

	static int floor(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return start;

	}
}
