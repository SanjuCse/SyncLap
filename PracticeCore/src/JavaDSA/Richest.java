package JavaDSA;

public class Richest {
	public static int maximumWealth(int[][] accounts) {

		int ans = Integer.MIN_VALUE;
		for (int person = 0; person < accounts.length; person++) {
			int sum = 0;

			for (int account = 0; account < accounts[person].length; account++) {
				sum += accounts[person][account];
			}
			if (sum > ans) {
				ans = sum;
//				return sum;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		System.out.println(maximumWealth(a));
//		System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
//		foundRichest(a);
	}
}
