package foundationPrograms1;

public class PalindromeAlternateApproach {
	static String s1;

	public static void main(String[] args) {
		String s = "121";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (s.equals(rev)) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}

}
