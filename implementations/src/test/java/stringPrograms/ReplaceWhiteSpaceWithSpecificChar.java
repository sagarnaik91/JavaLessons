package stringPrograms;

public class ReplaceWhiteSpaceWithSpecificChar {

	public static void main(String[] args) {
		String s = "Great Power";
		System.out.println(s.replaceAll("\\s+", "-"));

	}

}
