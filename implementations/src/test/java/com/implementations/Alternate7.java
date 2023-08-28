package com.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Alternate7 {

	public static void main(String[] args) {
		String s = "AYDRCaBbcde";
		List<Character> ulist = new ArrayList<>();
		List<Character> llist = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ulist.add(s.charAt(i));
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				llist.add(s.charAt(i));
			}
		}

		Collections.sort(ulist);
		Collections.sort(llist);
		System.out.println(ulist);
		System.out.println(llist);

		for (int i = 0; i < ulist.size(); i++) {

			System.out.print(ulist.get(i));

			for (int j = i; j < llist.size(); j++) {
				System.out.print(llist.get(j));
				break;
			}
		}

	}

}
