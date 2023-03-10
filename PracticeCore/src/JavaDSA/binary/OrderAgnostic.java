package JavaDSA.binary;

public class OrderAgnostic {
	public static void main(String[] args) {
//		int[] arr = { -12, -9, -6, -1, 0, 2, 6, 9, 10, 12, 23, 45, 67 };
		int[] arr = { 67, 45, 23, 12, 10, 9, 6, 2, 0, -1, -6, -9, -12 };
		int target = 10;
		int index = orderAgnostic(arr, target);

		System.out.println(index);
	}

	static int orderAgnostic(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}

		return -1;
	}
}
