package stringPrograms;

public class CountOfPunctuations {

	public static void main(String[] args) {
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
		count(str);
	}

	public static void count(String s)

	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.'
					|| s.charAt(i) == '?' || s.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println(count);
	}

}
