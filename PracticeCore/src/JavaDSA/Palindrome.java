package JavaDSA;

public class Palindrome {

	public static boolean isPalindrome(int n) {
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			// getting remainder
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int x = 1221;
		System.out.println(isPalindrome(x));
	}
}
