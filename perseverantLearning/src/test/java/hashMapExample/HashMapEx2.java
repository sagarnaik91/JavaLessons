package hashMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Apartment", "SMR Vinay Gateway");
		map.put("flat", "706");
		map.put("area", "Subsnagar");

		System.out.println("Size of the map is ---" + map.size());
		System.out.println("Key value is----" + map.get("Apartment"));
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("Key is--" + key + " and value is " + map.get(key));
		}

	}

}
