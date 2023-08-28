package stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String rev = "";
		String s = "gadag";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		if(rev.equals(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
