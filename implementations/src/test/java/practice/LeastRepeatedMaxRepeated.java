package practice;

import java.util.HashMap;
import java.util.Map;

public class LeastRepeatedMaxRepeated {

	public static void main(String[] args) {
		String s = "the the the the the grass grass grass";
		logic(s);
		altLogic(s);
	}

	public static void logic(String s) {
		String[] str = s.split("\\W+");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}
		System.out.println(map);
		int max = 0;
		String maxWord = "";
		int min = 1;
		String minword = "";
		int temp = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				maxWord = entry.getKey();
				temp = max;
			} else if (temp > entry.getValue()) {
				temp = entry.getValue();
				minword = entry.getKey();
			}
		}
		System.out.println("max repeated word is " + "--" + maxWord + "--" + " repeared for " + max + " times");
		System.out.println("min repeated word is " + "--" + minword + "--" + "repeared for " + temp + " times");
	}

	public static void altLogic(String s) {

		String[] str = s.split("\\W+");
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					str[j] = "0";
				}
			}
			if (count > 1 & str[i] != "0") {
				System.out.println(str[i]);
			}
		}

	}

}
