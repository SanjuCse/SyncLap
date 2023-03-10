package JavaDSA.binary;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
//		char[] letters = { 'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n' };
		char target = 'b';// output will be c

		char res = nextGreatestLetter(letters, target);
		System.out.println(res);
	}

//	static int nextGreatestLetter(char[] letters, char target) {
//		int start = 0;
//		int end = letters.length - 1;
//
//		if (target >= letters[end]) {
//			return 0;
//		}
//
//		while (start <= end) {
//			int mid = start + (end - start) / 2;
//
//			if (letters[mid] == target) {
//				while (letters[mid] == target) {
//					mid = mid + 1;
//				}
//				return mid;
//
//			}
//
//			if (letters[mid] < target) {
//				start = mid + 1;
//			} else if (letters[mid] > target) {
//				end = mid - 1;
//			} else {
//				return mid;
//			}
//		}
//		return start;
//	}

	static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		if (target >= letters[end]) {
			return (char) letters[0];
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (letters[mid] == target) {
				while (letters[mid] == target) {
					mid = mid + 1;
				}
				return (char) letters[mid];
			}

			if (letters[mid] < target) {
				start = mid + 1;
			} else if (letters[mid] > target) {
				end = mid - 1;
			} else {
				return (char) letters[mid];
			}
		}
		return (char) letters[start];
	}
}
