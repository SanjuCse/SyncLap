package JavaDSA.linear;

public class SearchAItemIn2DArray {
	static int[] search(int[][] arr, int target) {
//		if (arr[][]==0) {
//
//		}
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				if (arr[row][column] == target) {
					return new int[] { row, column };
				}
			}

		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int arr[][] = { { 10, 12, 15, 18 }, { 5, 8, 10, 12 }, { 23, 42, 12, 22, 23 } };
		int target = 8;
		int[] ans = search(arr, target);
		System.out.println(ans);
	}

}
