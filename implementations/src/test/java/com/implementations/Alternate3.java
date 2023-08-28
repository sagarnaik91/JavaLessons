package com.implementations;

import java.util.Scanner;
//AcBabC
public class Alternate3 {

	public static void main(String args[]) {
		//Scanner in = new Scanner(System.in);
		//System.out.print("Enter string: ");
		//String str = in.nextLine();
		String str="AcBabC";
		int len = str.length();
		StringBuffer sbLowerCase = new StringBuffer();
		StringBuffer sbUpperCase = new StringBuffer();

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch))
				sbLowerCase.append(ch);
			else if (Character.isUpperCase(ch))
				sbUpperCase.append(ch);
		}

		System.out.println("Input String:");
		System.out.println(str);
		String newStr = sbUpperCase.append(sbLowerCase).toString();
		//String newStr = sbLowerCase.append(sbUpperCase).toString();
		System.out.println("Changed String:");
		System.out.print(newStr);
	}
}
