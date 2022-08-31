package practice;

public class PalindromTest {

	static boolean palindromTest(String str) {

		boolean result = false;

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (rev.equals(str)) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		boolean r = palindromTest("abbaa");
		System.out.println(r);

	}
}
