package arrayPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 4, 5,5,4 };
		removeDup(arr);
	}

	public static void removeDup(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))

			{
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			list.add(entry.getKey());
		}
		Integer[] arr2 = new Integer[map.size()];
		list.toArray(arr2);
		for (int x : arr2) {
			System.out.println(x);
		}
	}

}
