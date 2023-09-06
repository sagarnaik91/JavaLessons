package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String rev = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
		reverse1(s);

	}

	public static void reverse1(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i >=0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}

}
