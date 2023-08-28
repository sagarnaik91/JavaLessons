package com.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternteCopy {

	public static void main(String[] args) {
		String s = "ACaBbcCdEeD";
		// char[] ch = s.toCharArray();
		// Arrays.sort(ch, 0, ch.length - 1);
		List<Character> ulist = new ArrayList<>();
		List<Character> llist = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ulist.add(s.charAt(i));
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				llist.add(s.charAt(i));
			}
		}
		Character[] ch3=new Character[ulist.size()];
		ulist.toArray(ch3);
		
		Character[] ch4=new Character[llist.size()];
		llist.toArray(ch4);
		

		StringBuilder sb1 = new StringBuilder();
		for (char c1 : ulist) {
			sb1.append(c1);
		}
		StringBuilder sb2 = new StringBuilder();
		for (char c2 : llist) {
			sb2.append(c2);
		}
		String cap = sb1.toString();
		String low = sb2.toString();

		char[] ch1 = cap.toCharArray();
		char[] ch2 = low.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

		for (int i = 0; i < ch3.length - 1; i++) {
			System.out.print(ch3[i]);
			for (int j = 1; j < ch4.length - 1; j++) {
				System.out.print(ch4[i]);
			}
		}

	}

}
