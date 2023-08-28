package collectionsPrograms1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddElementToArrayBasedOnIndex {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('C', 1);
		map.put('F', 4);

		map.putIfAbsent('D', 1);
		System.out.println(map);

		List<String> list = new ArrayList<>();
		list.add("asvd");
		list.add("dfe");
		list.add("few");
		list.add(0, "qwerty");
		System.out.println(list);

	}

}
