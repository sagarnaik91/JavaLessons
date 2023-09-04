package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class RepeatingOccurence {

	public static void main(String[] args) {
		int max = 0;
		int maxNum=0;
		int[] arr = { 1, 3, 4, 3, 4, 5,5,5 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
			}

			if (max < m.getValue()) {
				max = m.getValue();
				 maxNum=m.getKey();

			}
			

		}
		System.out.println("Max is "+maxNum);

	}

}
