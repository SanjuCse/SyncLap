package JavaDSA.linearSearchAlgorithm;

public class FindAElement {
	public static void main(String[] args) {
		int arr[] = { 12, 25, -23, 12, 34, 56 };
		int target = 25;
//		int res = linearSearch(arr, target);
		boolean res = linearSearch3(arr, target);
		System.out.println(res);
	}

	// Return If Exists
	static int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

// Using Foreach Loop
	static int linearSearch2(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}

		return -1;
	}

	// return true or False
	static boolean linearSearch3(int[] arr, int target) {

		if (arr.length == 0) {
			return false;
		}

		for (int element : arr) {
			if (element == target) {
				return true;
			}
		}

		return false;
	}

}
