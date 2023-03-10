package JavaDSA;


public class FindAElement {
	public static void main(String[] args) {
		int arr[] = { 12, 25, -23, 12, 34, 56 };
		int target = 27;
		int res = linearSearch(arr, target);
		System.out.println(res);
	}

	static int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
//		System.out.println("Not Found");

		return -1;
	}
}
