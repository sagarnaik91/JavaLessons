package com.implementations;

public class LargestAlphabet1 {

	public static void main(String[] args) {
		String str = "AcCabB";
		char[] charArray = str.toCharArray();
		int max = 0;
		for (char c : charArray) {
			max = Math.max(max, (int) c);
		}
		System.out.println("Value: " + max);
		System.out.println(Character.toString((char) max));
	}
}
