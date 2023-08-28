package collectionsPrograms1;

import java.util.Map;
import java.util.TreeMap;

public class SortingByKeys {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new TreeMap<>();
		map1.put(22, "ABC");
		map1.put(11, "dahf");
		map1.put(23, "dfr");
		for(Map.Entry<Integer, String> entry:map1.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		

	}

}
