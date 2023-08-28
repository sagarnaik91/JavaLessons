package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		String s = "i.am.an.automation.engineer engineer";
		String[] s1 = s.split("\\W+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length; i++) {
			if (map.containsKey(s1[i])) {
				map.put(s1[i], map.get(s1[i]) + 1);
			} else {
				map.put(s1[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
