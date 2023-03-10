package JavaDSA.binary;

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

public class FirstAndLastPositionOfElement {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		int[] res = searchRange(nums, target);
		System.out.println(res);
	}

	static int[] searchRange(int[] nums, int target) {
		int[] res = { -1, -1 };
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else if (nums[mid] == target) {
				res[0] = mid;
			}

		}

		return res;
	}
}
