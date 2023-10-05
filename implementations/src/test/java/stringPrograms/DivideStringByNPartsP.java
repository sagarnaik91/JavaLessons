package stringPrograms;

public class DivideStringByNPartsP {

	public static void main(String[] args) {
		String s = "Manyatha";
		int n = 4;
		int y = s.length() / n;
		if (s.length() % n != 0) {
			System.out.println("String cannot be divided into equal parts");
		} else

			for (int i = 0; i < s.length(); i = i + y) {
				System.out.println(s.substring(i, i + y));

			}

	}

}
