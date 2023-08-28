package collectionsPrograms1;

import java.util.HashMap;
import java.util.Map;

public class IterateHashmap {

	public static void main(String[] args) {
		Map<String, String> set = new HashMap<>();
		set.put("India", "Delhi");
		set.put("America", "WashingtonDC");
		set.put("Australia", "Canberra");
		
		for(String key:set.keySet())
		{
			System.out.println(key+" "+set.get(key));
		}

	}

}
