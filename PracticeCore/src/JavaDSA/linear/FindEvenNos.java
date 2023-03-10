package JavaDSA.linear;

public class FindEvenNos {

	public static void main(String[] args) {
//		int nums[] = { 23, 5, 234, 4356, 2398, 90238 };
//		int nums[] = { 0 };
		System.out.println(digits2(0));

	}

	static boolean even(int num) {
		int numberOfDigits = digits(num);
		while (numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	static int digits(int num) {
		if (num == 0) {
			return 1;
		}
		if (num < 0) {
			num = num * -1;
		}
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	static int digits2(int num) {
		if (num == 0) {
			return 1;
		}
		if (num < 0) {
			num = num * -1;
		}
		return (int) Math.log10(num) + 1;
	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int i : nums) {
			if (even(i)) {
				count++;
			}
		}
		return count;
	}
}
