package stringPrograms;

public class DivideStringByNParts {

	public static void main(String[] args) {
		String s = "Manyatha";
		int n = 2;
		int x = s.length() / n;
		if (s.length() % n != 0) {
			System.out.println("String cannot be divided");
		} else {
			for (int i = 0; i < s.length(); i = i + x) {
				System.out.println(s.substring(i, i + x));
			}
		}
	}

}
