package JavaDSA.Array;

import java.util.Arrays;

public class TwoDim {
	public static void main(String[] args) {
//		int[] arr = { 12, 234, 346, -12, -21, -345 };
		int[][] arr = { { 12, 234 }, { 346, -12 }, { -21, -345 } };

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}

	}
}
