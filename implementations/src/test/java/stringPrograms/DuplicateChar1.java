package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar1 {

	public static void main(String[] args) {
		int count = 1;
		String s = "Sagar";
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}

		}
		System.out.println(map);

		for (Map.Entry<Character, Integer> a : map.entrySet()) {
			if (a.getValue() > 1) {
				System.out.println("Character repeated more than 1 is : " + a.getKey());
			}
		}
		for (Map.Entry<Character, Integer> b : map.entrySet()) {
			if (b.getValue() > count) {
				count = b.getValue();
				System.out.println("Max repeated character is : " + b.getKey());
			}

			if (b.getValue() < count) {
				System.out.println("new count is :" + count);
				count = b.getValue();
				System.out.println("Min repeated charcter is : " + b.getKey());
			}

		}

	}

}
