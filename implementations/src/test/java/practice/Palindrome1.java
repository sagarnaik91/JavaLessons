package practice;

public class Palindrome1 {

	public static void main(String[] args) {
		String s = "Gadag";
		String s1 = s.toLowerCase();
		System.out.println("s1 is "+s1);
		String rev = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		if (s1.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
