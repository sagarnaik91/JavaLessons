package com.implementations;

import java.util.Arrays;

public class LargestAlphabet {

	public static void main(String[] args) {
		String s="AaBbe";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);

	}

}
