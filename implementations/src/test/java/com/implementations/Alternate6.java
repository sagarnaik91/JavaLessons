package com.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alternate6 {

	public static void main(String[] args) {
		String s = "ACaBbcde";
		List<Character> ulist = new ArrayList<>();
		List<Character> llist = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ulist.add(s.charAt(i));
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				llist.add(s.charAt(i));
			}

		}
		Character[] ch1 = new Character[ulist.size()];
		Character[] ch2 = new Character[llist.size()];
		ulist.toArray(ch1);
		llist.toArray(ch2);
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (char c1 : ch1) {
			System.out.print(c1);
		}
		System.out.println("");
		for (char c2 : ch2) {
			System.out.print(c2);
		}
		System.out.println("");
		for (int i = 0; i < ch1.length; i++) {

			System.out.print(ch1[i]);
			for (int j = i; j < ch2.length; j++) {
				System.out.print(ch2[j]);
				break;
			}
		}

	}

}
