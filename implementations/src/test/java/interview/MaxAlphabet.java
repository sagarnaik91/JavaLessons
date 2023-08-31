package interview;

import java.util.HashMap;
import java.util.Map;

public class MaxAlphabet {

	public static void main(String[] args) {
		String s = "IBMerr";
		int max = 0;
		char key = ' ';
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i]) + 1);
			} else {
				m.put(ch[i], 1);
			}
		}
		System.out.println(m);
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				key = entry.getKey();

			}

		}
		System.out.println("max key is " + key + " is repeated for " + max);

	}

}
