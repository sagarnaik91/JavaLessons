package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose";
		duplicateWord1(s);
		System.out.println(" ");
		duplicateWord2(s);

	}

	public static void duplicateWord1(String s) {
		String[] str = s.split("\\W+");
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = "0";
				}
			}
			if (count > 1 && str[i] != "0") {
				System.out.print(str[i] + " ");
			}
		}
	}

	public static void duplicateWord2(String s) {
		String[] str = s.split("\\W+");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey()+" ");

			}
		}
	}

}
