package stringPrograms;

public class LowerUpperCaseViceversa {

	public static void main(String[] args) {
		String s = "Great Power";
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			} else if (Character.isLowerCase(s.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println(sb);

	}

}
