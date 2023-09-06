package stringPrograms;

import java.util.Scanner;

public class ReverseStringAndCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		//String s = "I am going to market";
		reverseWord(s);
	}

	public static void reverseWord(String s) {
		String rev = "";
		String[] str = s.split("\\W+");
		for (int i = str.length - 1; i >= 0; i--) {
			rev = rev + reverseChar(str[i]) + " ";
		}
		System.out.println(rev);
	}

	public static String reverseChar(String s) {
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			s1 = s1 + ch[i];
		}
		return s1;

	}

}
