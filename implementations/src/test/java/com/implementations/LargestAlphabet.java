package com.implementations;

import java.util.Arrays;

public class LargestAlphabet {

	public static void main(String[] args) {
		String s = "AcCabB";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.println("index " + i + " is having value " + ch[i]);
		}

	}

}
