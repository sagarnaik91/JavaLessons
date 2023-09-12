package practice;

public class SeparateAChar {

	public static void main(String[] args) {
		String s = "String";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			s1 = s1 + s.charAt(i) + " ";

		}
		System.out.println(s1);

	}

}
