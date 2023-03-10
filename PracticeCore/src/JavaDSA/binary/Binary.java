package JavaDSA.binary;

public class Binary {
	public static void main(String[] args) {
//		int[] arr2 = { -12, -6, -4, 0, 12, 23, 34, 56, 77 };
		int[] arr2 = { 56, 45, 23, 12, 8, 3, 0, -2, -5, -9 };
		System.out.println(binarySearch(arr2, 12));
	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];
//		if (arr[start] < arr[end]) {
//			isAsc = true;
//
//		} else {
//			isAsc = false;
//		}
		
		while (start <= end) {
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		}

		if (isAsc) {
			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		} else {
			if (target > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		}
//		while (start <= end) {
//		int mid = start + (end - start) / 2;
//			if (target < arr[mid]) {
//				end = mid - 1;
//			} else if (target > arr[mid]) {
//				start = mid + 1;
//			} else {
//				return mid;
//			}
//		}

		return -1;
	}
}
