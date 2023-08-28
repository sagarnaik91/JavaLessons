package com.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alternate5 {

	public static void main(String[] args) {
		String s = "ABabCbc";
		char[] ch = s.toCharArray();
		Arrays.sort(ch, 0, s.length() - 1);
		List<Character> uc = new ArrayList<>();
		List<Character> lc = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			//char c = s.charAt(i);
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				uc.add(s.charAt(i));
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lc.add(s.charAt(i));
			}
		}

		StringBuilder sb1 = new StringBuilder();
		for (char c1 : uc) {
			sb1.append(c1);
		}
		String capsStr = sb1.toString();
		StringBuilder sb2 = new StringBuilder();
		for (char c2 : lc) {
			sb2.append(c2);
		}
		String lowerStr = sb2.toString();
		char[] a = capsStr.toCharArray();
		char[] b = lowerStr.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i]);
			for (int j = 1; j < b.length - 1; j++) {

				System.out.print(b[i]);
			}

		}

	}

}
