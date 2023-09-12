package practice;

public class ReplaceCharacterOfAString {

	public static void main(String[] args) {
		String s1 = "Life-is-beautiful";
		String s2 = "Life.is.beautiful";
		String s3 = "Life/is/beautiful";
		replace(s3);
		split(s3);
		replaceUsing3rdvar(s3);
	}

	public static void replace(String s) {
		if (s.contains("-")) {
			System.out.println(s.replace("-", " "));
		} else if (s.contains(".")) {
			System.out.println(s.replace(".", " "));
		} else if (s.contains("/")) {
			System.out.println(s.replace("/", " "));
		}
	}

	public static void split(String s) {
		String[] str = s.split("\\W+");
		for (String a : str) {
			System.out.print(a + " ");
		}
	}

	public static void replaceUsing3rdvar(String s) {
		System.out.println("");
		if (s.contains("-")) {
			s = s.replace("-", " ");
			System.out.println(s);
		} else if (s.contains(".")) {
			s = s.replace(".", " ");
			System.out.println(s);
		} else if (s.contains("/")) {
			s = s.replace("/", " ");
			System.out.println(s);
		}
	}

}
