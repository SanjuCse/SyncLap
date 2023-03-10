package JavaDSA;

public class Binary {
	public static void main(String[] args) {
		int[] arr = { -12, -9, -6, -1, 0, 2, 6, 9, 10, 12, 23, 45, 67 };
		int target = 67;

		int index = binary(arr, target);
		System.out.println(index);
	}

	static int binary(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
