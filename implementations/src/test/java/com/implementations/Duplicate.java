package com.implementations;

import java.util.HashMap;
import java.util.Map;
//print duplicate then print char as string
public class Duplicate {

	public static void main(String[] args) {
		String s1 = "Wordd";
		char[] ch = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		System.out.println("Occurence " + map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate value is " + entry.getKey().toString());
			}
		}

	}

}
