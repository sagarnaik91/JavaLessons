package practice;

public class DivideSTringByNParts {

	public static void main(String[] args) {
		String s = "Manyatha";
		int n = 4;
		int len = s.length() / n;
		if (s.length() % 2 != 0) {
			System.out.println("String cannot be split to n parts");
		} else {
			for (int i = 0; i < s.length(); i = i + len) {
				System.out.println(s.substring(i, i + len));
			}
		}
	}

}
