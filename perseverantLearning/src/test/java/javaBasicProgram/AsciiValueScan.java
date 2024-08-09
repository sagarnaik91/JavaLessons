package javaBasicProgram;

import java.util.Scanner;

public class AsciiValueScan {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int c = ch;
		System.out.println(c);

	}

}
