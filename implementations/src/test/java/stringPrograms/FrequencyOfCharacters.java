package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String s = "picture perfect";
		frequency1(s);
		System.out.println("==========================================");
		frequency2(s);

	}

	public static void frequency1(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (ch[i] != '0' && ch[i] != ' ') {
				System.out.println(ch[i] + " is repeated for " + count);
			}
		}
	}

	public static void frequency2(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])&&ch[i]!=' ') {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else if(ch[i]!=' ') {
				map.put(ch[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " is repeated for " + entry.getValue() + " times");
		}
	}

}
