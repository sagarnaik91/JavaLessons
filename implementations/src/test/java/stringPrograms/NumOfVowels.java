package stringPrograms;

public class NumOfVowels {

	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		int count = 0;
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println(count);

	}

}
