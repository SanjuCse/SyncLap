package JavaDSA;

import java.util.Arrays;

public class CheckIsNumPresent {
//	char[] chars;

	static boolean isNameContainsNumber(String name) {

		char[] chars = name.toCharArray();
		boolean status = false;
		if (name.length() == 0) {
			return false;
		}
		while (chars.length > 0) {
			for (int index = 0; index < chars.length; index++) {
				int c = chars[index];
				if ((c >= 48) && (c <= 57)) {
					return true;
				}
			}
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isNameContainsNumber("a1"));

	}
}
