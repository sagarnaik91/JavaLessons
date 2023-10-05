package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		String s = "aab";
		char[] a = s.toCharArray();
		int count = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			/*
			 * if (m.getValue() > 1) { System.out.println("Max repeated is " + m.getKey());
			 * }
			 */

			if (m.getValue() > count) {
				count = m.getValue();
				System.out.println(m.getKey());
			}

		}
		
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			/*
			 * if (m.getValue() > 1) { System.out.println("Max repeated is " + m.getKey());
			 * }
			 */

			if (m.getValue() < count) {
				count = m.getValue();
				System.out.println(m.getKey());
			}

		}

	}

}
