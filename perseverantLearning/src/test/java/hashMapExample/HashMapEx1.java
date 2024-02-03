package hashMapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("firstname", "Sagar");
		map.put("lastname", "naik");
		map.put("place", "Gateway");
		System.out.println(map.size());
		System.out.println(map.get("firstname"));
		Set<String> keys=map.keySet();
		for(String key:keys)
		{
			System.out.println(key+" value is--- "+map.get(key));
		}

	}

}
