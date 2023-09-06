package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LeastRepeatedMaxRepeated {

	public static void main(String[] args) {
		String str = "grass is greener on the other side";
		char maxChar = ' ';
		int max = 0;
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i]) + 1);
			} else {
				m.put(ch[i], 1);
			}
		}
		System.out.println(m);
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println("Character available only once is " + entry.getKey());
			} else if (max <= entry.getValue()) {
				max = entry.getValue();
				maxChar = entry.getKey();
			}

		}

		System.out.println("Max repeated char is " + maxChar);

	}

}
