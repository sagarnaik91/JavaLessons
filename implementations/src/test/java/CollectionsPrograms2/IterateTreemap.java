package CollectionsPrograms2;

import java.util.Map;
import java.util.TreeMap;

public class IterateTreemap {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<>();
		map.put("qwe", 2);
		map.put("asd", 4);
		map.put("wre", 1);
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(String key:map.keySet())
		{
			System.out.println(key+" "+map.get(key));
		}

	}

}
