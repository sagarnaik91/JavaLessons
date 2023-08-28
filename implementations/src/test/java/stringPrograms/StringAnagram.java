package stringPrograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "Army";
		String s2 = "Mary";
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));

	}

}
