package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Manager", "Karen");
		map.put("DeliveryManager", "Angela");
		map.put("Lead", "Pradeep");
		map.put("ScrumMaster", null);
		map.put("Sprint", null);
		map.put(null, null);
		System.out.println(map);
		for (Map.Entry<String, String> m : map.entrySet()) {
			if (m.getValue() == "Karen") {
				System.out.println(m.getKey());
			}
		}

	}

}
