package stringPrograms;

public class CharactersInAString {

	public static void main(String[] args) {
		String s = "SagarSureshNaik";
		numOfChar(s);
		numOfCharAlt(s);
	}

	public static void numOfChar(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void numOfCharAlt(String s) {
		System.out.println(s.length());
	}

}
