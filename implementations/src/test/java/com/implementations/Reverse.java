package com.implementations;

import java.security.PKCS12Attribute;

public class Reverse {

	public static void checkReverse(String str) {
		String reversed = "";
		String[] s1 = str.split("\\W+");
		for (int i = s1.length - 1; i >= 0; i--) {

			if (i == 0) {
				reversed = reversed + s1[i];
			} else {
				reversed = reversed + s1[i] + ".";
			}
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		String s1 = "i.am.an.automation.engineer";
		// engineer.automation.an.am.i
		checkReverse(s1);
	}

}
