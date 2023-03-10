package JavaDSA.linear;

import java.util.Arrays;

public class SearchInString {

	static int search(String string, char target) {
		if (string.length() == 0) {
			return -1;
		}
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == target) {
				return i;
			}
		}
		return -1;
	}

	// Same Search Method in User Friendly Code and String type return code
	static String search2(String string, char target) {
		if (string.length() == 0) {
			return "String is Empty";
		}
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == target) {
				return "Character is at index no: " + i;
			}
		}
		return "Target not match";
	}

	// If found True else false returns in for each loop
	static boolean search3(String string, char target) {
		if (string.length() == 0) {
			return false;
		}

		for (char ch : string.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String string = "sanju";
		char target = 'a';
//		int res = search(string, target);
//		System.out.println(res);
//		System.out.println(search2(string, target));
		System.out.println(search3(string, target));
		System.out.println(Arrays.toString(string.toCharArray()));
	}
}
