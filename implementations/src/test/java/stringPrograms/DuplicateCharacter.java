package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String s = "Great responsibility";
		duplicateCheck1(s);
		System.out.println("");
		duplicateCheck2(s);

	}

	public static void duplicateCheck1(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = 0;
				}
			}
			if (count > 1 && ch[i] != 0) {
				System.out.print(ch[i]+" ");
			}
		}
	}

	public static void duplicateCheck2(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
