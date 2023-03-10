package JavaDSA.linear;

public class SearchInARange {
	// This Program shows Search in a Range of index values - String
	static int search(String string, int target, int startingIndex, int endingIndex) {
		if (string.length() == 0) {
			return -1;
		}
		for (int i = startingIndex; i <= endingIndex; i++) {
			if (string.charAt(i) == target) {
				return i;
			}
		}

		return -1;
	}

//	This Program shows Search in a Range of index values - int Array
	static int search2(int[] arr, int target, int startingIndex, int endingIndex) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = startingIndex; i <= endingIndex; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
//		String string = "sanju";
//		char target = 'a';
//		System.out.println(search(string, target, 2, 4));

		int arr[] = { 10, 15, -32, -25, 18, 20 };
		int target = -32;
		System.out.println(search2(arr, target, 2, 4));

	}
}
